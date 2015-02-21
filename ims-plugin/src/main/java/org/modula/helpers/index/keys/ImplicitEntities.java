package org.modula.helpers.index.keys;


import java.util.*;

/**
 * Static class holding implicitly defined modules, types, etc. of the modula 2 language
 */
public final class ImplicitEntities {

	private ImplicitEntities() {
	}

	public static final String SYSTEM_MODULE_NAME = "SYSTEM";


	public static final Set<String> IMPLICIT_MODULE_NAMES = Collections.unmodifiableSet(new HashSet<String>() {
		{
			add(SYSTEM_MODULE_NAME);
		}
	});

	public static final String CAST = "CAST";
	public static final String ADRCARD = "ADRCARD";
	public static final String LOC = "LOC";
	public static final String ADDRESS = "ADDRESS";
	public static final String MACHINEWORD = "MACHINEWORD";
	public static final String ADRINT = "ADRINT";

	public static final String DWORD = "DWORD";
	public static final String BIGENDIAN = "BIGENDIAN";
	public static final String SWAPENDIAN = "SWAPENDIAN";
	public static final String CARD_8 = "CARD8";
	public static final String BYTE = "BYTE";
	public static final String IS_THREAD = "IsThread";
	public static final Map<String, Set<String>> IMPLICIT_SYMBOLS_PER_MODULE = Collections.unmodifiableMap(new HashMap<String, Set<String>>() {
		{
			put(SYSTEM_MODULE_NAME, Collections.unmodifiableSet(new HashSet<String>() {
				{
					add(CAST);
					add(ADRCARD);
					add(LOC);
					add(ADDRESS);
					add(MACHINEWORD);
					add(ADRINT);
					add(DWORD);
					add(BIGENDIAN);
					add(SWAPENDIAN);
					add(CARD_8);
					add(BYTE);
					add(IS_THREAD);
				}
			}));
		}
	});

	public static final String SIZE = "SIZE";
	public static final String EXCL = "EXCL";
	public static final String INCL = "INCL";
	public static final String CHR = "CHR";
	public static final String VAL = "VAL";
	public static final String ABS = "ABS";
	public static final String LFLOAT = "LFLOAT";
	public static final String DEC = "DEC";
	public static final String INC = "INC";
	public static final String TRUE = "TRUE";
	public static final String FALSE = "FALSE";
	public static final String MAX = "MAX";
	public static final String ORD = "ORD";
	public static final String NIL = "NIL";
	public static final String LENGTH = "LENGTH";
	public static final Set<String> IMPLICIT_IMPORTS = Collections.unmodifiableSet(new HashSet<String>() {
		{
			add(SIZE);
			add(EXCL);
			add(INCL);
			add(CHR);
			add(VAL);
			add(ABS);
			add(LFLOAT);
			add(DEC);
			add(INC);
			add(TRUE);
			add(FALSE);
			add(MAX);
			add(ORD);
			add(NIL);
			add(LENGTH);
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
