package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.StubElement;
import org.modula.parsing.modula.psi.ModulaTypeDefinition;

/**
 * Aggregates the interfaces for a type stub
 */
public interface TypeStub extends StubElement<ModulaTypeDefinition>, Type, SerializableStub {


}
