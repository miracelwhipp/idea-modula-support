package org.modula.helpers.index.stubs;

import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.*;

import java.io.IOException;

/**
 * Default implementation for {@link NamedStub}
 */
public abstract class AbstractNamedStub<T extends PsiElement> extends StubBase<T> implements
	NamedStub,
	FileContainableStub,
	SerializableStub
{

	private final String name;
	private final String filename;

	protected AbstractNamedStub(
		final StubElement parent,
		final IStubElementType elementType,
		final String name,
		final String filename
	) {
		super(parent, elementType);
		this.name = name;
		this.filename = filename;
	}

	protected AbstractNamedStub(
		final StubElement parent,
		final IStubElementType elementType,
		StubInputStream dataStream
	) throws IOException {
		super(parent, elementType);
		name = dataStream.readName().toString();
		filename = dataStream.readName().toString();
	}

	@Override
	public String getStubName() {
		return name;
	}

	@Override
	public String getFileName() {
		return filename;
	}

	public void serialize(StubOutputStream dataStream) throws IOException {
		dataStream.writeName(name);
		dataStream.writeName(filename);
	}

}
