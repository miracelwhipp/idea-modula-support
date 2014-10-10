package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.definition.psi.DefinitionTypeDefinition;

/**
 * An index that holds the type definitions for every module
 */
public class TypeByModule extends StringStubIndexExtension<DefinitionTypeDefinition> {

	public static final StubIndexKey<String, DefinitionTypeDefinition> KEY = StubIndexKey.createIndexKey("modula.type.by.module.index");

	public static final TypeByModule INSTANCE = new TypeByModule();

	@NotNull
	@Override
	public StubIndexKey<String, DefinitionTypeDefinition> getKey() {
		return KEY;
	}
}
