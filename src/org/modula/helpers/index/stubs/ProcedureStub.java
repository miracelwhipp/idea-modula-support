package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.StubElement;
import org.modula.parsing.definition.psi.DefinitionProcedureDefinition;

/**
 * Aggregates the interfaces for a procedure stub
 */
public interface ProcedureStub extends StubElement<DefinitionProcedureDefinition>, Type, SerializableStub {
}
