package org.modula.helpers.index.stub.element.types;

import com.intellij.psi.stubs.*;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.ModuleStub;
import org.modula.helpers.index.stubs.ModuleStubImpl;
import org.modula.helpers.index.keys.ModuleDefinitionFileIndex;
import org.modula.helpers.index.keys.ModuleIndex;
import org.modula.parsing.definition.psi.DefinitionModuleHeader;
import org.modula.parsing.definition.psi.impl.DefinitionModuleHeaderImpl;

import java.io.IOException;

/**
 * Implementation of {@link IStubElementType} for generating {@link org.modula.helpers.index.stubs.ModuleStub}s from {@link DefinitionModuleHeader}s
 */
public class ModuleStubElementType extends AbstractDefinitionStubElementType<ModuleStub, DefinitionModuleHeader> {

	public ModuleStubElementType(@NotNull @NonNls final String debugName) {
		super(debugName);
	}

	@Override
	public DefinitionModuleHeader createPsi(@NotNull ModuleStub stub) {
		return new DefinitionModuleHeaderImpl(stub, this);
	}

	@Override
	public ModuleStub createStub(@NotNull DefinitionModuleHeader psi, StubElement parentStub) {
		return new ModuleStubImpl(parentStub, this, psi.getIdent().getText(), ModuleDefinitionFileIndex.getContainingFile(psi));
	}

	@Override
	@NotNull
	@NonNls
	public String getExternalId() {
		return "modula.module";
	}

	@Override
	public void serialize(@NotNull ModuleStub stub, @NotNull StubOutputStream dataStream) throws IOException {
		stub.serialize(dataStream);
	}

	@Override
	@NotNull
	public ModuleStub deserialize(@NotNull StubInputStream dataStream, final StubElement parentStub) throws IOException {
		return new ModuleStubImpl(parentStub, this, dataStream);
	}

	@Override
	public void indexStub(@NotNull ModuleStub stub, @NotNull IndexSink sink) {
		sink.occurrence(ModuleIndex.KEY, stub.getStubName());
		sink.occurrence(ModuleDefinitionFileIndex.KEY, stub.getFileName());
	}
}
