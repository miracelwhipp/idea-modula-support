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
import org.modula.parsing.modula.psi.ModulaTypeDefinition;
import org.modula.parsing.modula.psi.impl.ModulaTypeDefinitionImpl;

import java.io.IOException;

/**
 * Implementation of {@link IStubElementType} for generating {@link org.modula.helpers.index.stubs.TypeStub}s from
 * {@link ModulaTypeDefinition}s and vice versa
 */
public class TypeStubElementType extends AbstractDefinitionStubElementType<TypeStub, ModulaTypeDefinition> {

	public TypeStubElementType(@NotNull @NonNls String debugName) {
		super(debugName);
	}

	@Override
	public ModulaTypeDefinition createPsi(@NotNull TypeStub stub) {
		return new ModulaTypeDefinitionImpl(stub, this);
	}

	@Override
	public TypeStub createStub(@NotNull ModulaTypeDefinition psi, StubElement parentStub) {

		String typeName = psi.getStubName();
		String module = psi.getModule();
		return new TypeStubImpl(parentStub, this, typeName, psi.getFileName(), module);

	}

	@Override
	@NotNull
	@NonNls
	public String getExternalId() {
		return "modula.type";
	}

	@Override
	public void serialize(@NotNull TypeStub stub, @NotNull StubOutputStream dataStream) throws IOException {
		stub.serialize(dataStream);
	}

	@Override
	@NotNull
	public TypeStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
		return new TypeStubImpl(parentStub, this, dataStream);
	}

	@Override
	public void indexStub(@NotNull TypeStub stub, @NotNull IndexSink sink) {
		sink.occurrence(SymbolByModule.KEY, stub.getModule());
		sink.occurrence(SymbolIndex.KEY, stub.getStubName());
		sink.occurrence(TypeByDefinitionFile.KEY, stub.getFileName());
		sink.occurrence(TypeByModule.KEY, stub.getModule());
	}
}
