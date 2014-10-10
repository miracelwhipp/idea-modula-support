package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.StubElement;
import org.modula.parsing.definition.psi.DefinitionTypeDefinition;

/**
 * Aggregates the interfaces for a type stub
 */
public interface TypeStub extends StubElement<DefinitionTypeDefinition>, Type, SerializableStub {


}
