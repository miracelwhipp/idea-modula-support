package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.definition.psi.DefinitionProcedureHeading;

/**
 * An index that holds the procedure definitions for every module
 */
public class ProcedureByModule extends StringStubIndexExtension<DefinitionProcedureHeading> {

	public static final StubIndexKey<String, DefinitionProcedureHeading> KEY = StubIndexKey.createIndexKey("modula.procedure.by.module.index");

	public static final ProcedureByDefinitionFile INSTANCE = new ProcedureByDefinitionFile();

	@NotNull
	@Override
	public StubIndexKey<String, DefinitionProcedureHeading> getKey() {
		return KEY;
	}
}
