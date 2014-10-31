package org.modula.helpers.index.stub.element.types;

import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.keys.SymbolByModule;
import org.modula.helpers.index.keys.SymbolIndex;
import org.modula.helpers.index.stubs.EnumerationMemberStub;
import org.modula.helpers.index.stubs.EnumerationMemberStubImpl;
import org.modula.helpers.index.stubs.ProcedureStub;
import org.modula.parsing.modula.psi.ModulaEnumerationMemberDefinition;
import org.modula.parsing.modula.psi.ModulaProcedureHeading;
import org.modula.parsing.modula.psi.impl.ModulaEnumerationMemberDefinitionImpl;

import java.io.IOException;

/**
 * Implementation of {@link com.intellij.psi.stubs.IStubElementType} for generating {@link org.modula.helpers.index.stubs.EnumerationMemberStub}s from
 * {@link org.modula.parsing.modula.psi.ModulaEnumerationMemberDefinition}s and vice versa
 *
 * @author miracelwhipp
 */
public class EnumerationMemberStubElementType extends AbstractDefinitionStubElementType<EnumerationMemberStub, ModulaEnumerationMemberDefinition> {

	public EnumerationMemberStubElementType(@NotNull @NonNls String debugName) {
		super(debugName);
	}

	@Override
	public ModulaEnumerationMemberDefinition createPsi(@NotNull EnumerationMemberStub stub) {
		return new ModulaEnumerationMemberDefinitionImpl(stub, this);
	}

	@Override
	public EnumerationMemberStub createStub(@NotNull ModulaEnumerationMemberDefinition psi, StubElement parentStub) {
		return new EnumerationMemberStubImpl(parentStub, this, psi.getStubName(), psi.getFileName(), psi.getModule());
	}

	@NotNull
	@Override
	public String getExternalId() {
		return "modula.enumeration.member";
	}

	@Override
	public void serialize(@NotNull EnumerationMemberStub stub, @NotNull StubOutputStream dataStream) throws IOException {
		stub.serialize(dataStream);
	}

	@NotNull
	@Override
	public EnumerationMemberStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
		return new EnumerationMemberStubImpl(parentStub, this, dataStream);
	}

	@Override
	public void indexStub(@NotNull EnumerationMemberStub stub, @NotNull IndexSink sink) {
		SymbolByModule.INSTANCE.occurrence(stub, sink);
		sink.occurrence(SymbolIndex.KEY, stub.getStubName());
	}
}
