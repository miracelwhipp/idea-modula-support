package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.StubElement;
import org.modula.parsing.modula.psi.ModulaVariableNameDefinition;

/**
 * Aggregates the interfaces for variable stub
 */
public interface VariableStub extends StubElement<ModulaVariableNameDefinition>, Variable, SerializableStub {
}
