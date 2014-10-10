package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.StubElement;
import org.modula.parsing.definition.psi.DefinitionConstantDefinition;

/**
 * Aggregates the interfaces for a constant stub
 */
public interface ConstantStub extends StubElement<DefinitionConstantDefinition>, Constant, SerializableStub {

}
