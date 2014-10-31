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
import org.modula.parsing.modula.psi.ModulaProcedureHeading;
import org.modula.parsing.modula.psi.impl.ModulaProcedureHeadingImpl;

import java.io.IOException;

/**
 * Implementation of {@link com.intellij.psi.stubs.IStubElementType} for generating {@link ProcedureStub}s from
 * {@link org.modula.parsing.modula.psi.ModulaProcedureHeading}s and vice versa
 */
public class ProcedureStubElementType extends AbstractDefinitionStubElementType<ProcedureStub, ModulaProcedureHeading> {

	public ProcedureStubElementType(@NotNull @NonNls String debugName) {
		super(debugName);
	}

	@Override
	public ModulaProcedureHeading createPsi(@NotNull ProcedureStub stub) {
		return new ModulaProcedureHeadingImpl(stub, this);
	}

	@Override
	public ProcedureStub createStub(@NotNull ModulaProcedureHeading psi, StubElement parentStub) {
		return new ProcedureStubImpl(parentStub, this, psi.getStubName(), psi.getFileName(), psi.getModule());
	}

	@Override
	@NotNull
	@NonNls
	public String getExternalId() {
		return "modula.procedure";
	}

	@Override
	public void serialize(@NotNull ProcedureStub stub, @NotNull StubOutputStream dataStream) throws IOException {
		stub.serialize(dataStream);
	}

	@Override
	@NotNull
	public ProcedureStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
		return new ProcedureStubImpl(parentStub, this, dataStream);
	}

	@Override
	public void indexStub(@NotNull ProcedureStub stub, @NotNull IndexSink sink) {
		SymbolByModule.INSTANCE.occurrence(stub, sink);
		sink.occurrence(SymbolIndex.KEY, stub.getStubName());
		sink.occurrence(ProcedureByDefinitionFile.INSTANCE.getKey(), stub.getFileName());
		sink.occurrence(ProcedureByModule.INSTANCE.getKey(), stub.getModule());
	}
}
