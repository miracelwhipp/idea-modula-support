package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.definition.psi.DefinitionDefinitionModule;

/**
 * An index definition holding every Module defined in the project.
 */
public class ModuleIndex extends StringStubIndexExtension<DefinitionDefinitionModule> {

	public static final StubIndexKey<String, DefinitionDefinitionModule> KEY = StubIndexKey.createIndexKey("modula.module.index");

	public static final ModuleIndex INSTANCE = new ModuleIndex();

	@NotNull
	@Override
	public StubIndexKey<String, DefinitionDefinitionModule> getKey() {
		return KEY;
	}
}
