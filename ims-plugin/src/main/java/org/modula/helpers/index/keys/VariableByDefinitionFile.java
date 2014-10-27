package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.modula.psi.ModulaVariableNameDefinition;

/**
 * An index that holds the variables for every modula .def file. It uses
 * ModuleDefinitionFileIndex.getContainingFile(stub.getPsi()) as key
 */
public class VariableByDefinitionFile extends StringStubIndexExtension<ModulaVariableNameDefinition> {

	public static final StubIndexKey<String, ModulaVariableNameDefinition> KEY =
			StubIndexKey.createIndexKey("modula.variable.by.modula.file.index");

	public static final VariableByDefinitionFile INSTANCE = new VariableByDefinitionFile();

	@NotNull
	@Override
	public StubIndexKey<String, ModulaVariableNameDefinition> getKey() {
		return KEY;
	}
}
