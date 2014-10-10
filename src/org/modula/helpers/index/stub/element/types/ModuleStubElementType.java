package org.modula.helpers.index.stub.element.types;

import com.intellij.psi.stubs.*;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.ModuleStub;
import org.modula.helpers.index.stubs.ModuleStubImpl;
import org.modula.helpers.index.keys.ModuleDefinitionFileIndex;
import org.modula.helpers.index.keys.ModuleIndex;
import org.modula.parsing.definition.psi.DefinitionModuleDefinition;
import org.modula.parsing.definition.psi.impl.DefinitionModuleDefinitionImpl;

import java.io.IOException;

/**
 * Implementation of {@link IStubElementType} for generating {@link org.modula.helpers.index.stubs.ModuleStub}s from {@link DefinitionModuleDefinition}s
 */
public class ModuleStubElementType extends AbstractDefinitionStubElementType<ModuleStub, DefinitionModuleDefinition> {

	public ModuleStubElementType(@NotNull @NonNls final String debugName) {
		super(debugName);
	}

	@Override
	public DefinitionModuleDefinition createPsi(@NotNull ModuleStub stub) {
		return new DefinitionModuleDefinitionImpl(stub, this);
	}

	@Override
	public ModuleStub createStub(@NotNull DefinitionModuleDefinition psi, StubElement parentStub) {
		return new ModuleStubImpl(parentStub, this, psi.getModuleName().getText(), ModuleDefinitionFileIndex.getContainingFile(psi));
	}

	@Override
	public String getExternalId() {
		return "modula.module";
	}

	@Override
	public void serialize(ModuleStub stub, StubOutputStream dataStream) throws IOException {
		stub.serialize(dataStream);
	}

	@Override
	public ModuleStub deserialize(StubInputStream dataStream, StubElement parentStub) throws IOException {
		return new ModuleStubImpl(parentStub, this, dataStream);
	}

	@Override
	public void indexStub(ModuleStub stub, IndexSink sink) {
		sink.occurrence(ModuleIndex.KEY, stub.getStubName());
		sink.occurrence(ModuleDefinitionFileIndex.KEY, stub.getFileName());
	}
}
