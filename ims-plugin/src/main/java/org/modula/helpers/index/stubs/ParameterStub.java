package org.modula.helpers.index.stubs;


import com.intellij.psi.stubs.StubElement;
import org.modula.parsing.modula.psi.ModulaParameterName;

/**
 * Aggregates the interfaces for parameter stub
 *
 * @author miracelwhipp
 */
public interface ParameterStub extends StubElement<ModulaParameterName>, Type, SerializableStub {
}
