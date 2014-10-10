package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import org.modula.parsing.definition.psi.DefinitionModuleDefinition;

import java.io.IOException;

/**
 * Default implementation for {@link ModuleStub}
 */
public class ModuleStubImpl extends AbstractNamedStub<DefinitionModuleDefinition> implements ModuleStub {

	public ModuleStubImpl(StubElement parent, IStubElementType elementType, String moduleName, String filename) {
		super(parent, elementType, moduleName, filename);
	}

	public ModuleStubImpl(StubElement parentStub, IStubElementType elementType, StubInputStream dataStream) throws IOException {
		super(parentStub, elementType, dataStream);
	}
}
