package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.StubOutputStream;

import java.io.IOException;

/**
 * An interface for stubs that may be serialized. By convention an implementation should have a constructor taking at least a
 * {@link com.intellij.psi.stubs.StubInputStream} and initializing the instance from the stream
 */
public interface SerializableStub {

	void serialize(StubOutputStream dataStream) throws IOException;
}
