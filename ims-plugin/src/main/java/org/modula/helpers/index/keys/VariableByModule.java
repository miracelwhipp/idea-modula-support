package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.definition.psi.DefinitionVariableNameDefinition;

/**
 * An index that holds Variable information for every module
 */
public class VariableByModule extends StringStubIndexExtension<DefinitionVariableNameDefinition> {

	public static final StubIndexKey<String, DefinitionVariableNameDefinition> KEY =
			StubIndexKey.createIndexKey("modula.variable.by.module.index");

	public static final VariableByModule INSTANCE = new VariableByModule();

	@NotNull
	@Override
	public StubIndexKey<String, DefinitionVariableNameDefinition> getKey() {
		return KEY;
	}
}

