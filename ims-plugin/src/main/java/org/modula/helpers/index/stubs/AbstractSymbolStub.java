package org.modula.helpers.index.stubs;

import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;

import java.io.IOException;

/**
 * Default implementation for {@link SymbolStub}
 */
public abstract class AbstractSymbolStub<T extends PsiElement> extends AbstractNamedStub<T> implements SymbolStub {

	private final String module;

	protected AbstractSymbolStub(StubElement parent, IStubElementType elementType, String name, String filename, String module) {
		super(parent, elementType, name, filename);
		this.module = module;
	}

	protected AbstractSymbolStub(StubElement parent, IStubElementType elementType, StubInputStream dataStream) throws IOException {
		super(parent, elementType, dataStream);
		module = dataStream.readName().getString();
	}

	@Override
	public String getModule() {
		return module;
	}

	@Override
	public void serialize(StubOutputStream dataStream) throws IOException {
		super.serialize(dataStream);
		dataStream.writeName(module);
	}
}
