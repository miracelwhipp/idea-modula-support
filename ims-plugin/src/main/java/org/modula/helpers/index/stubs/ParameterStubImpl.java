package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import org.modula.parsing.modula.psi.ModulaParameterName;

import java.io.IOException;

/**
 * Default implementation for {@link org.modula.helpers.index.stubs.ParameterStub}
 *
 * @author miracelwhipp
 */
public class ParameterStubImpl extends AbstractSymbolStub<ModulaParameterName> implements ParameterStub {

	public ParameterStubImpl(StubElement parent, IStubElementType elementType, String name, String filename, String module) {
		super(parent, elementType, name, filename, module);
	}

	public ParameterStubImpl(StubElement parent, IStubElementType elementType, StubInputStream dataStream) throws IOException {
		super(parent, elementType, dataStream);
	}
}
