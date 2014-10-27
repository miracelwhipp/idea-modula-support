package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.modula.psi.ModulaDefinitionModule;

/**
 * An index modula holding every Module defined in the project.
 */
public class ModuleIndex extends StringStubIndexExtension<ModulaDefinitionModule> {

	public static final StubIndexKey<String, ModulaDefinitionModule> KEY = StubIndexKey.createIndexKey("modula.module.index");

	public static final ModuleIndex INSTANCE = new ModuleIndex();

	@NotNull
	@Override
	public StubIndexKey<String, ModulaDefinitionModule> getKey() {
		return KEY;
	}
}
