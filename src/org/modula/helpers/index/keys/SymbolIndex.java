package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.SymbolStubPsiElement;

/**
 * An index that holds all symbols defined in the project
 */
public class SymbolIndex extends StringStubIndexExtension<SymbolStubPsiElement> {

	public static final StubIndexKey<String, SymbolStubPsiElement> KEY =
			StubIndexKey.createIndexKey("modula.symbol.index");

	public static final SymbolIndex INSTANCE = new SymbolIndex();

	@NotNull
	@Override
	public StubIndexKey<String, SymbolStubPsiElement> getKey() {
		return KEY;
	}


}
