package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.definition.psi.DefinitionTypeDefinition;

/**
 * An index that holds the type definitions for every modula .def file. It uses
 * ModuleDefinitionFileIndex.getContainingFile(stub.getPsi()) as key
 */
public class TypeByDefinitionFile extends StringStubIndexExtension<DefinitionTypeDefinition> {

	public static final StubIndexKey<String, DefinitionTypeDefinition> KEY = StubIndexKey.createIndexKey("modula.type.by.definition.file.index");

	public static final TypeByDefinitionFile INSTANCE = new TypeByDefinitionFile();

	@NotNull
	@Override
	public StubIndexKey<String, DefinitionTypeDefinition> getKey() {
		return KEY;
	}
}
