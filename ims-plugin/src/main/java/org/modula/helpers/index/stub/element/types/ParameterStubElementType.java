package org.modula.helpers.index.stub.element.types;

import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.keys.SymbolByModule;
import org.modula.helpers.index.keys.SymbolIndex;
import org.modula.helpers.index.stubs.ParameterStub;
import org.modula.helpers.index.stubs.ParameterStubImpl;
import org.modula.helpers.index.stubs.ProcedureStub;
import org.modula.parsing.modula.psi.ModulaParameterName;
import org.modula.parsing.modula.psi.ModulaProcedureHeading;
import org.modula.parsing.modula.psi.impl.ModulaParameterNameImpl;

import java.io.IOException;

/**
 * Implementation of {@link com.intellij.psi.stubs.IStubElementType} for generating {@link org.modula.helpers.index.stubs.ParameterStub}s from
 * {@link org.modula.parsing.modula.psi.ModulaParameterName}s and vice versa
 *
 * @author miracelwhipp
 */
public class ParameterStubElementType extends AbstractDefinitionStubElementType<ParameterStub, ModulaParameterName> {

	public ParameterStubElementType(@NotNull @NonNls String debugName) {
		super(debugName);
	}

	@Override
	public ModulaParameterName createPsi(@NotNull ParameterStub stub) {
		return new ModulaParameterNameImpl(stub, this);
	}

	@Override
	public ParameterStub createStub(@NotNull ModulaParameterName psi, StubElement parentStub) {
		return new ParameterStubImpl(parentStub, this, psi.getStubName(), psi.getFileName(), psi.getModule());
	}

	@NotNull
	@Override
	public String getExternalId() {
		return "modula.procedure.parameter";
	}

	@Override
	public void serialize(@NotNull ParameterStub stub, @NotNull StubOutputStream dataStream) throws IOException {
		stub.serialize(dataStream);
	}

	@NotNull
	@Override
	public ParameterStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
		return new ParameterStubImpl(parentStub, this, dataStream);
	}

	@Override
	public void indexStub(@NotNull ParameterStub stub, @NotNull IndexSink sink) {
		//TODO: make symbol index aware of cascading contexts
		sink.occurrence(SymbolByModule.KEY, stub.getModule());
		sink.occurrence(SymbolIndex.KEY, stub.getStubName());
	}
}
