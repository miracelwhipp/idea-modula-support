package org.modula.helpers.index.stub.element.types;

import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.keys.SymbolByModule;
import org.modula.helpers.index.keys.SymbolIndex;
import org.modula.helpers.index.keys.VariableByDefinitionFile;
import org.modula.helpers.index.keys.VariableByModule;
import org.modula.helpers.index.stubs.VariableStub;
import org.modula.helpers.index.stubs.VariableStubImpl;
import org.modula.parsing.modula.psi.ModulaVariableNameDefinition;
import org.modula.parsing.modula.psi.impl.ModulaVariableNameDefinitionImpl;

import java.io.IOException;

/**
 * Implementation of {@link com.intellij.psi.stubs.IStubElementType} for generating {@link org.modula.helpers.index.stubs.VariableStub}s from
 * {@link org.modula.parsing.modula.psi.ModulaVariableNameDefinition}s and vice versa
 */
public class VariableStubElementType extends AbstractDefinitionStubElementType<VariableStub, ModulaVariableNameDefinition> {

	public VariableStubElementType(@NotNull @NonNls String debugName) {
		super(debugName);
	}

	@Override
	public ModulaVariableNameDefinition createPsi(@NotNull VariableStub stub) {
		return new ModulaVariableNameDefinitionImpl(stub, this);
	}

	@Override
	public VariableStub createStub(@NotNull ModulaVariableNameDefinition psi, StubElement parentStub) {
		return new VariableStubImpl(
				parentStub,
				this,
				psi.getStubName(),
				psi.getFileName(),
				psi.getModule()
		);
	}

	@Override
	public String getExternalId() {
		return "modula.variable";
	}

	@Override
	public void serialize(VariableStub stub, StubOutputStream dataStream) throws IOException {
		stub.serialize(dataStream);
	}

	@Override
	public VariableStub deserialize(StubInputStream dataStream, StubElement parentStub) throws IOException {
		return new VariableStubImpl(parentStub, this, dataStream);
	}

	@Override
	public void indexStub(VariableStub stub, IndexSink sink) {
		sink.occurrence(SymbolByModule.KEY, stub.getModule());
		sink.occurrence(SymbolIndex.KEY, stub.getStubName());
		sink.occurrence(VariableByModule.KEY, stub.getModule());
		sink.occurrence(VariableByDefinitionFile.KEY, stub.getFileName());
	}
}
