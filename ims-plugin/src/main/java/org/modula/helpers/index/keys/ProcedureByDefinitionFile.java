package org.modula.helpers.index.keys;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.modula.psi.ModulaProcedureHeading;

/**
 * An index that holds the procedure definitions for every modula .def file. It uses
 * ModuleDefinitionFileIndex.getContainingFile(stub.getPsi()) as key
 */
public class ProcedureByDefinitionFile extends StringStubIndexExtension<ModulaProcedureHeading> {

	public static final StubIndexKey<String, ModulaProcedureHeading> KEY = StubIndexKey.createIndexKey("modula.procedure.by.modula.file.index");

	public static final ProcedureByDefinitionFile INSTANCE = new ProcedureByDefinitionFile();

	@NotNull
	@Override
	public StubIndexKey<String, ModulaProcedureHeading> getKey() {
		return KEY;
	}
}