package org.modula.parsing.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StringStubIndexExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.modula.parsing.utility.ModulaPsiTraversingUtility;

import java.lang.ref.WeakReference;
import java.util.*;

/**
 * A class that holds weak references to given imports.
 */
public class ImportMap<T extends PsiElement> implements Map<String, T> {


    private final ConsistencyRepairer<T> repairer;
    private final Map<String, WeakReference<T>> imports = new HashMap<String, WeakReference<T>>();

    @Nullable
    private final String moduleName;

    @Nullable
    private final StringStubIndexExtension<? extends T> implicitImportIndex;

    @Nullable
    private final Project project;

    public ImportMap() {
        this(new NullConsistencyRepairer<T>());
    }

    public ImportMap(ConsistencyRepairer<T> repairer, @Nullable String moduleName, @Nullable StringStubIndexExtension<? extends T> implicitImportIndex, @Nullable Project project) {
        this.moduleName = moduleName;
        this.implicitImportIndex = implicitImportIndex;
        this.project = project;
        if (null == repairer) {
            throw new IllegalArgumentException("repairer is null");
        }
        this.repairer = repairer;
    }

    public ImportMap(ConsistencyRepairer<T> consistencyRepairer) {
        this(consistencyRepairer, null, null, null);
    }


    public Set<String> cleanup() {
        synchronized (imports) {
            Set<String> validKeys = new HashSet<String>();
            for (String key : imports.keySet()) {
                if (null != checkKeyInExplicitImports(key)) {
                    validKeys.add(key);
                }
            }
            return validKeys;
        }
    }

    private T checkKey(String key) {
        T explicitMatch = checkKeyInExplicitImports(key);

        if (explicitMatch != null) {
            return explicitMatch;
        }

        Collection<? extends T> implicitImports = getImplicitImports();

        for (T implicitImport : implicitImports) {
	        String keyFromValue = getKeyFromValue(implicitImport);

	        if (keyFromValue == null) {
		        continue;
	        }

	        if (keyFromValue.equals(key)) {
                return implicitImport;
            }
        }

        return null;
    }

    private String getKeyFromValue(T implicitImport) {
        return ModulaPsiTraversingUtility.getFirstDefinedIdentifier(implicitImport);
    }

    private T checkKeyInExplicitImports(String key) {
        synchronized (imports) {
            WeakReference<T> reference = imports.get(key);
            if (null == reference) {
                return null;
            }

            T value = reference.get();
            if (null == value) {
                imports.remove(key);
                return null;
            }

            if (repairer.check(this, key, value)) {
                return value;
            }

            return checkKeyInExplicitImports(key);
        }
    }

    @Override
    public int size() {
        cleanup();
        return imports.size() + getImplicitImports().size();
    }

    @Override
    public boolean isEmpty() {
        cleanup();
        return imports.isEmpty() && getImplicitImports().isEmpty();
    }

    private Collection<? extends T> getImplicitImports() {
        if (implicitImportIndex == null) {
            return Collections.emptyList();
        }
        return implicitImportIndex.get(moduleName, project, GlobalSearchScope.allScope(project));
    }

    @Override
    public boolean containsKey(Object key) {
        if (!(key instanceof String)) {
            return false;
        }
        return null != checkKey((String) key);
    }

    @Override
    public boolean containsValue(Object value) {
        throw new UnsupportedOperationException(ImportMap.class.getCanonicalName() + " does not support containsValue");
    }

    @Override
    public T get(Object key) {
        if (!(key instanceof String)) {
            return null;
        }
        return checkKey((String) key);
    }

    @Override
    public T put(String text, T element) {
        synchronized (imports) {
            T old = checkKeyInExplicitImports(text);

            WeakReference<T> reference = new WeakReference<T>(element);
            imports.put(text, reference);

            return old;
        }
    }

    @Override
    public T remove(Object key) {
        synchronized (imports) {

            WeakReference<T> remove = imports.remove(key);
            if (null == remove) {
                return null;
            }

            return remove.get();
        }
    }

    @Override
    public void putAll(Map<? extends String, ? extends T> m) {
        for (Map.Entry<? extends String, ? extends T> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        synchronized (imports) {
            imports.clear();
        }
    }

    @NotNull
    @Override
    public Set<String> keySet() {
        Set<String> strings = cleanup();

        Collection<? extends T> implicitImports = getImplicitImports();

        for (T implicitImport : implicitImports) {
            strings.add(getKeyFromValue(implicitImport));
        }

        return strings;
    }

    @NotNull
    @Override
    public Collection<T> values() {
        synchronized (imports) {

            Set<String> keys = imports.keySet();
            Collection<T> result = new ArrayList<T>();

            for (String key : keys) {
                T t = checkKeyInExplicitImports(key);
                if (null == t) {
                    continue;
                }
                result.add(t);
            }

            Collection<? extends T> implicitImports = getImplicitImports();

            result.addAll(implicitImports);

            return result;
        }
    }

    @NotNull
    @Override
    public Set<Entry<String, T>> entrySet() {
        synchronized (imports) {

            Set<String> keys = imports.keySet();
            Set<Entry<String, T>> result = new HashSet<Entry<String, T>>();

            for (String key : keys) {
                T t = checkKeyInExplicitImports(key);
                if (null == t) {
                    continue;
                }
                result.add(new AbstractMap.SimpleEntry<String, T>(key, t));
            }

            Collection<? extends T> implicitImports = getImplicitImports();
            for (T implicitImport : implicitImports) {
                result.add(new AbstractMap.SimpleEntry<String, T>(getKeyFromValue(implicitImport), implicitImport));
            }

            return result;
        }
    }

    public interface ConsistencyRepairer<T extends PsiElement> {
        /**
         * defines a check for consistency as well as how to repair it if possible
         *
         * @param imports
         * @param key     the key of the value to check
         * @param value   the value to check
         * @return true if the value and key are consistent, false otherwise. In the second case the ConsistencyRepairer
         * has to change the map so that the value is either consistent i.e. this method will return true on a successive
         * call or - if this is not possible - at least remove the inconsistent entry.
         */
        boolean check(@NotNull ImportMap<T> imports, @NotNull String key, @NotNull T value);
    }

    public static class NullConsistencyRepairer<T extends PsiElement> implements ConsistencyRepairer<T> {

        @Override
        public boolean check(@NotNull ImportMap<T> imports, @NotNull String key, T value) {
            return true;
        }
    }
}
