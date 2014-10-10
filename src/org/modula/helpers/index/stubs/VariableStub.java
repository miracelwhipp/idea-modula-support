package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.StubElement;
import org.modula.parsing.definition.psi.DefinitionVariableNameDefinition;

/**
 * Aggregates the interfaces for variable stub
 */
public interface VariableStub extends StubElement<DefinitionVariableNameDefinition>, Variable, SerializableStub {
}
