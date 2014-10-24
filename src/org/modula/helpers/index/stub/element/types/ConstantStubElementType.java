package org.modula.helpers.index.stub.element.types;

import com.intellij.psi.stubs.*;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.keys.*;
import org.modula.helpers.index.stubs.ConstantStub;
import org.modula.helpers.index.stubs.ConstantStubImpl;
import org.modula.parsing.definition.psi.DefinitionConstantDeclaration;
import org.modula.parsing.definition.psi.impl.DefinitionConstantDeclarationImpl;
import org.modula.parsing.utility.ModulaPsiTraversingUtility;

import java.io.IOException;

/**
 * Implementation of {@link IStubElementType} for generating {@link org.modula.helpers.index.stubs.ConstantStub}s from
 * {@link DefinitionConstantDeclaration}s and vice versa
 */
public class ConstantStubElementType extends AbstractDefinitionStubElementType<ConstantStub, DefinitionConstantDeclaration> {

	public ConstantStubElementType(@NotNull @NonNls String debugName) {
		super(debugName);
	}

	@Override
	public DefinitionConstantDeclaration createPsi(@NotNull ConstantStub stub) {
		return new DefinitionConstantDeclarationImpl(stub, this);
	}

	@Override
	public ConstantStub createStub(@NotNull DefinitionConstantDeclaration psi, StubElement parentStub) {
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
		sink.occurrence(SymbolByModule.KEY, stub.getModule());
		sink.occurrence(SymbolIndex.KEY, stub.getStubName());
		sink.occurrence(ConstantByDefinitionFile.KEY, stub.getFileName());
		sink.occurrence(ConstantByModule.KEY, stub.getModule());
	}
}
