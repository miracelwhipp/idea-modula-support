package org.modula.helpers.index.keys;


import java.util.*;

/**
 * Static class holding implicitly defined modules, types, etc. of the modula 2 language
 */
public final class ImplicitEntities {

	private ImplicitEntities() {
	}

	public static final String SYSTEM_MODULE_NAME = "SYSTEM";

	public static final String CAST = "CAST";

	public static final Set<String> IMPLICIT_MODULE_NAMES = Collections.unmodifiableSet(new HashSet<String>() {
		{
			add(SYSTEM_MODULE_NAME);
		}
	});

	public static final String ADRCARD = "ADRCARD";
	public static final Map<String, Set<String>> IMPLICIT_SYMBOLS_PER_MODULE = Collections.unmodifiableMap(new HashMap<String, Set<String>>() {
		{
			put(SYSTEM_MODULE_NAME, Collections.unmodifiableSet(new HashSet<String>() {
				{
					add(CAST);
					add(ADRCARD);
				}
			}));
		}
	});

	public static final String SIZE = "SIZE";
	public static final String EXCL = "EXCL";
	public static final String INCL = "INCL";

	public static final Set<String> IMPLICIT_IMPORTS = Collections.unmodifiableSet(new HashSet<String>() {
		{
			add(SIZE);
			add(EXCL);
			add(INCL);
		}
	});

	public static boolean isImplicitModule(String name) {
		return IMPLICIT_MODULE_NAMES.contains(name);
	}

	public static boolean isImplicitSymbol(String moduleName, String symbolName) {
		Set<String> strings = IMPLICIT_SYMBOLS_PER_MODULE.get(moduleName);
		return strings != null && strings.contains(symbolName);
	}

	public static boolean isImplicitImport(String symbolName) {
		return IMPLICIT_IMPORTS.contains(symbolName);
	}
}
