package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.definition.psi.DefinitionConstantDeclaration;

/**
 * Holds the constant definitions for every modula .def file. It uses
 * ModuleDefinitionFileIndex.getContainingFile(stub.getPsi()) as key
 */
public class ConstantByDefinitionFile extends StringStubIndexExtension<DefinitionConstantDeclaration> {

	public static final StubIndexKey<String, DefinitionConstantDeclaration> KEY =
			StubIndexKey.createIndexKey("modula.constant.by.definition.file.index");

	public static final ConstantByDefinitionFile INSTANCE = new ConstantByDefinitionFile();

	@NotNull
	@Override
	public StubIndexKey<String, DefinitionConstantDeclaration> getKey() {
		return KEY;
	}
}
