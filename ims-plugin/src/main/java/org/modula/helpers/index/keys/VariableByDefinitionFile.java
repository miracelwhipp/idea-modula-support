package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.definition.psi.DefinitionVariableNameDefinition;

/**
 * An index that holds the variables for every modula .def file. It uses
 * ModuleDefinitionFileIndex.getContainingFile(stub.getPsi()) as key
 */
public class VariableByDefinitionFile extends StringStubIndexExtension<DefinitionVariableNameDefinition> {

	public static final StubIndexKey<String, DefinitionVariableNameDefinition> KEY =
			StubIndexKey.createIndexKey("modula.variable.by.definition.file.index");

	public static final VariableByDefinitionFile INSTANCE = new VariableByDefinitionFile();

	@NotNull
	@Override
	public StubIndexKey<String, DefinitionVariableNameDefinition> getKey() {
		return KEY;
	}
}
