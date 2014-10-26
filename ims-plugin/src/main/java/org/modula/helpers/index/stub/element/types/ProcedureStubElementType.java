package org.modula.helpers.index.stub.element.types;

import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.keys.ProcedureByDefinitionFile;
import org.modula.helpers.index.keys.ProcedureByModule;
import org.modula.helpers.index.keys.SymbolByModule;
import org.modula.helpers.index.keys.SymbolIndex;
import org.modula.helpers.index.stubs.ProcedureStub;
import org.modula.helpers.index.stubs.ProcedureStubImpl;
import org.modula.parsing.definition.psi.DefinitionProcedureHeading;
import org.modula.parsing.definition.psi.impl.DefinitionProcedureHeadingImpl;

import java.io.IOException;

/**
 * Implementation of {@link com.intellij.psi.stubs.IStubElementType} for generating {@link ProcedureStub}s from
 * {@link org.modula.parsing.definition.psi.DefinitionProcedureHeading}s and vice versa
 */
public class ProcedureStubElementType extends AbstractDefinitionStubElementType<ProcedureStub, DefinitionProcedureHeading> {

	public ProcedureStubElementType(@NotNull @NonNls String debugName) {
		super(debugName);
	}

	@Override
	public DefinitionProcedureHeading createPsi(@NotNull ProcedureStub stub) {
		return new DefinitionProcedureHeadingImpl(stub, this);
	}

	@Override
	public ProcedureStub createStub(@NotNull DefinitionProcedureHeading psi, StubElement parentStub) {
		return new ProcedureStubImpl(parentStub, this, psi.getStubName(), psi.getFileName(), psi.getModule());
	}

	@Override
	public String getExternalId() {
		return "modula.procedure";
	}

	@Override
	public void serialize(ProcedureStub stub, StubOutputStream dataStream) throws IOException {
		stub.serialize(dataStream);
	}

	@Override
	public ProcedureStub deserialize(StubInputStream dataStream, StubElement parentStub) throws IOException {
		return new ProcedureStubImpl(parentStub, this, dataStream);
	}

	@Override
	public void indexStub(ProcedureStub stub, IndexSink sink) {
		sink.occurrence(SymbolByModule.KEY, stub.getModule());
		sink.occurrence(SymbolIndex.KEY, stub.getStubName());
		sink.occurrence(ProcedureByDefinitionFile.INSTANCE.getKey(), stub.getFileName());
		sink.occurrence(ProcedureByModule.INSTANCE.getKey(), stub.getModule());
	}
}
