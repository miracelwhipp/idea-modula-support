package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.definition.psi.DefinitionConstantDeclaration;

/**
 * Holds the constant definitions for every module
 */
public class ConstantByModule extends StringStubIndexExtension<DefinitionConstantDeclaration> {

	public static final StubIndexKey<String, DefinitionConstantDeclaration> KEY =
			StubIndexKey.createIndexKey("modula.constant.by.module.index");

	public static final ConstantByModule INSTANCE = new ConstantByModule();

	@NotNull
	@Override
	public StubIndexKey<String, DefinitionConstantDeclaration> getKey() {
		return KEY;
	}
}
