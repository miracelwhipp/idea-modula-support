package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.modula.psi.ModulaConstantDeclaration;

/**
 * Holds the constant definitions for every module
 */
public class ConstantByModule extends StringStubIndexExtension<ModulaConstantDeclaration> {

	public static final StubIndexKey<String, ModulaConstantDeclaration> KEY =
			StubIndexKey.createIndexKey("modula.constant.by.module.index");

	public static final ConstantByModule INSTANCE = new ConstantByModule();

	@NotNull
	@Override
	public StubIndexKey<String, ModulaConstantDeclaration> getKey() {
		return KEY;
	}
}
