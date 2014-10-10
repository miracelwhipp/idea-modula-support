package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.definition.psi.DefinitionProcedureDefinition;

/**
 * An index that holds the procedure definitions for every module
 */
public class ProcedureByModule extends StringStubIndexExtension<DefinitionProcedureDefinition> {

	public static final StubIndexKey<String, DefinitionProcedureDefinition> KEY = StubIndexKey.createIndexKey("modula.procedure.by.module.index");

	public static final ProcedureByDefinitionFile INSTANCE = new ProcedureByDefinitionFile();

	@NotNull
	@Override
	public StubIndexKey<String, DefinitionProcedureDefinition> getKey() {
		return KEY;
	}
}