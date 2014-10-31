package org.modula.helpers.index.stub.element.types;

import com.intellij.psi.stubs.*;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.keys.*;
import org.modula.helpers.index.stubs.ConstantStub;
import org.modula.helpers.index.stubs.ConstantStubImpl;
import org.modula.parsing.modula.psi.ModulaConstantDeclaration;
import org.modula.parsing.modula.psi.impl.ModulaConstantDeclarationImpl;

import java.io.IOException;

/**
 * Implementation of {@link IStubElementType} for generating {@link org.modula.helpers.index.stubs.ConstantStub}s from
 * {@link ModulaConstantDeclaration}s and vice versa
 */
public class ConstantStubElementType extends AbstractDefinitionStubElementType<ConstantStub, ModulaConstantDeclaration> {

	public ConstantStubElementType(@NotNull @NonNls String debugName) {
		super(debugName);
	}

	@Override
	public ModulaConstantDeclaration createPsi(@NotNull ConstantStub stub) {
		return new ModulaConstantDeclarationImpl(stub, this);
	}

	@Override
	public ConstantStub createStub(@NotNull ModulaConstantDeclaration psi, StubElement parentStub) {
		String constant = psi.getStubName();
		String file = psi.getFileName();
		String module = psi.getModule();
		return new ConstantStubImpl(parentStub, this, constant, file, module);
	}

	@Override
	public String getExternalId() {
		return "modula.constant";
	}

	@Override
	public void serialize(ConstantStub stub, StubOutputStream dataStream) throws IOException {
		stub.serialize(dataStream);
	}

	@Override
	public ConstantStub deserialize(StubInputStream dataStream, StubElement parentStub) throws IOException {
		return new ConstantStubImpl(parentStub, this, dataStream);
	}

	@Override
	public void indexStub(ConstantStub stub, IndexSink sink) {
		SymbolByModule.INSTANCE.occurrence(stub, sink);
		sink.occurrence(SymbolIndex.KEY, stub.getStubName());
		sink.occurrence(ConstantByDefinitionFile.KEY, stub.getFileName());
		sink.occurrence(ConstantByModule.KEY, stub.getModule());
	}
}
