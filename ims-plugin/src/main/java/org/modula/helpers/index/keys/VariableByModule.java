package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.modula.psi.ModulaVariableNameDefinition;

/**
 * An index that holds Variable information for every module
 */
public class VariableByModule extends StringStubIndexExtension<ModulaVariableNameDefinition> {

	public static final StubIndexKey<String, ModulaVariableNameDefinition> KEY =
			StubIndexKey.createIndexKey("modula.variable.by.module.index");

	public static final VariableByModule INSTANCE = new VariableByModule();

	@NotNull
	@Override
	public StubIndexKey<String, ModulaVariableNameDefinition> getKey() {
		return KEY;
	}
}

