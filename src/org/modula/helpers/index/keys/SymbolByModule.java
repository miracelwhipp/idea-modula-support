package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.SymbolStubPsiElement;

/**
 * An index that holds every modules imported symbols
 */
public class SymbolByModule extends StringStubIndexExtension<SymbolStubPsiElement> {

	public static final StubIndexKey<String, SymbolStubPsiElement> KEY =
			StubIndexKey.createIndexKey("modula.symbol.by.module.index");

	public static final SymbolByModule INSTANCE = new SymbolByModule();

	@NotNull
	@Override
	public StubIndexKey<String, SymbolStubPsiElement> getKey() {
		return KEY;
	}
}

