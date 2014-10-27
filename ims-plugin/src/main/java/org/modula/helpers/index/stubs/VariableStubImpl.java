package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import org.modula.parsing.modula.psi.ModulaVariableNameDefinition;

import java.io.IOException;

/**
 * Default implementation of {@link VariableStub}
 */
public class VariableStubImpl extends AbstractSymbolStub<ModulaVariableNameDefinition> implements VariableStub {

	public VariableStubImpl(StubElement parent, IStubElementType elementType, String name, String filename, String module) {
		super(parent, elementType, name, filename, module);
	}

	public VariableStubImpl(StubElement parent, IStubElementType elementType, StubInputStream dataStream) throws IOException {
		super(parent, elementType, dataStream);
	}
}
