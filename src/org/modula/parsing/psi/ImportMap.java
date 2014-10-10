package org.modula.parsing.psi;

import org.jetbrains.annotations.NotNull;

import java.lang.ref.WeakReference;
import java.util.*;

/**
 * A class that holds weak references to given imports.
 */
public class ImportMap<T> implements Map<String, T> {


	private final ConsistencyRepairer<T> repairer;
	private final Map<String, WeakReference<T>> imports = new HashMap<String, WeakReference<T>>();

	public ImportMap() {
		repairer = new NullConsistencyRepairer<T>();
	}

	public ImportMap(ConsistencyRepairer<T> repairer) {
		if (null == repairer) {
			throw new IllegalArgumentException("repairer is null");
		}
		this.repairer = repairer;
	}


	public Set<String> cleanup() {
		synchronized (imports) {
			Set<String> validKeys = new HashSet<String>();
			for (String key : imports.keySet()) {
				if (null != checkKey(key)) {
					validKeys.add(key);
				}
			}
			return validKeys;
		}
	}

	private T checkKey(String key) {
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

			return checkKey(key);
		}
	}

	@Override
	public int size() {
		cleanup();
		return imports.size();
	}

	@Override
	public boolean isEmpty() {
		cleanup();
		return imports.isEmpty();
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
			T old = get(text);

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
		synchronized (imports) {
			return cleanup();
		}
	}

	@NotNull
	@Override
	public Collection<T> values() {
		synchronized (imports) {

			Set<String> keys = imports.keySet();
			Collection<T> ret = new ArrayList<T>();

			for (String key : keys) {
				T t = checkKey(key);
				if (null == t) {
					continue;
				}
				ret.add(t);
			}


			return ret;
		}
	}

	@NotNull
	@Override
	public Set<Entry<String, T>> entrySet() {
		synchronized (imports) {

			Set<String> keys = imports.keySet();
			Set<Entry<String, T>> ret = new HashSet<Entry<String, T>>();

			for (String key : keys) {
				T t = checkKey(key);
				if (null == t) {
					continue;
				}
				ret.add(new AbstractMap.SimpleEntry<String, T>(key, t));
			}

			return ret;
		}
	}

	public interface ConsistencyRepairer<T> {
		/**
		 * defines a check for consistency as well as how to repair it if possible
		 *
		 * @param imports
		 * @param key the key of the value to check
		 * @param value the value to check
		 * @return true if the value and key are consistent, false otherwise. In the second case the ConsistencyRepairer
		 * has to change the map so that the value is either consistent i.e. this method will return true on a successive
		 * call or - if this is not possible - at least remove the inconsistent entry.
		 */
		boolean check(@NotNull ImportMap<T> imports, @NotNull String key, @NotNull T value);
	}

	public class NullConsistencyRepairer<T> implements ConsistencyRepairer<T> {

		@Override
		public boolean check(@NotNull ImportMap<T> imports, @NotNull String key, T value) {
			return true;
		}
	}
}
