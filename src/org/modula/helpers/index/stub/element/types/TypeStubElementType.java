package org.modula.helpers.index.stub.element.types;

import com.intellij.psi.stubs.*;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.keys.SymbolByModule;
import org.modula.helpers.index.keys.SymbolIndex;
import org.modula.helpers.index.keys.TypeByDefinitionFile;
import org.modula.helpers.index.keys.TypeByModule;
import org.modula.helpers.index.stubs.TypeStub;
import org.modula.helpers.index.stubs.TypeStubImpl;
import org.modula.parsing.definition.psi.DefinitionTypeDefinition;
import org.modula.parsing.definition.psi.impl.DefinitionTypeDefinitionImpl;

import java.io.IOException;

/**
 * Implementation of {@link IStubElementType} for generating {@link org.modula.helpers.index.stubs.TypeStub}s from
 * {@link DefinitionTypeDefinition}s and vice versa
 */
public class TypeStubElementType extends AbstractDefinitionStubElementType<TypeStub, DefinitionTypeDefinition> {

	public TypeStubElementType(@NotNull @NonNls String debugName) {
		super(debugName);
	}

	@Override
	public DefinitionTypeDefinition createPsi(@NotNull TypeStub stub) {
		return new DefinitionTypeDefinitionImpl(stub, this);
	}

	@Override
	public TypeStub createStub(@NotNull DefinitionTypeDefinition psi, StubElement parentStub) {

		String typeName = psi.getStubName();
		String module = psi.getModule();
		return new TypeStubImpl(parentStub, this, typeName, psi.getFileName(), module);

	}

	@Override
	public String getExternalId() {
		return "modula.type";
	}

	@Override
	public void serialize(TypeStub stub, StubOutputStream dataStream) throws IOException {
		stub.serialize(dataStream);
	}

	@Override
	public TypeStub deserialize(StubInputStream dataStream, StubElement parentStub) throws IOException {
		return new TypeStubImpl(parentStub, this, dataStream);
	}

	@Override
	public void indexStub(TypeStub stub, IndexSink sink) {
		sink.occurrence(SymbolByModule.KEY, stub.getModule());
		sink.occurrence(SymbolIndex.KEY, stub.getStubName());
		sink.occurrence(TypeByDefinitionFile.KEY, stub.getFileName());
		sink.occurrence(TypeByModule.KEY, stub.getModule());
	}
}
