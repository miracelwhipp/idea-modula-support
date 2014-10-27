package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import org.modula.helpers.index.stub.element.types.TypeStubElementType;
import org.modula.parsing.modula.psi.ModulaTypeDefinition;

import java.io.IOException;

/**
 * Default implementation for {@link TypeStub}
 */
public class TypeStubImpl extends AbstractSymbolStub<ModulaTypeDefinition> implements TypeStub {


	public TypeStubImpl(
		StubElement parent,
		IStubElementType elementType,
		String typeName, String filename,
		String module
	) {
		super(parent, elementType, typeName, filename, module);
	}

	public TypeStubImpl(
		StubElement parentStub,
		TypeStubElementType typeStubElementType,
		StubInputStream dataStream
	) throws IOException {
		super(parentStub, typeStubElementType, dataStream);
	}


}
