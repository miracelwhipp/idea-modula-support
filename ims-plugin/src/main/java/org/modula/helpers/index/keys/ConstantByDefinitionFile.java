package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.modula.psi.ModulaConstantDeclaration;

/**
 * Holds the constant definitions for every modula .def file. It uses
 * ModuleDefinitionFileIndex.getContainingFile(stub.getPsi()) as key
 */
public class ConstantByDefinitionFile extends StringStubIndexExtension<ModulaConstantDeclaration> {

	public static final StubIndexKey<String, ModulaConstantDeclaration> KEY =
			StubIndexKey.createIndexKey("modula.constant.by.modula.file.index");

	public static final ConstantByDefinitionFile INSTANCE = new ConstantByDefinitionFile();

	@NotNull
	@Override
	public StubIndexKey<String, ModulaConstantDeclaration> getKey() {
		return KEY;
	}
}
