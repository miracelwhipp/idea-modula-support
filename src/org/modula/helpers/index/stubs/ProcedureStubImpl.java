package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import org.modula.parsing.definition.psi.DefinitionProcedureDefinition;

import java.io.IOException;

/**
 * Default implementation for {@link ProcedureStub}
 */
public class ProcedureStubImpl extends AbstractSymbolStub<DefinitionProcedureDefinition> implements ProcedureStub {

	public ProcedureStubImpl(StubElement parent, IStubElementType elementType, String name, String filename, String module) {
		super(parent, elementType, name, filename, module);
	}

	public ProcedureStubImpl(StubElement parent, IStubElementType elementType, StubInputStream dataStream) throws IOException {
		super(parent, elementType, dataStream);
	}
}
