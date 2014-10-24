package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.StubElement;
import org.modula.parsing.definition.psi.DefinitionProcedureHeading;

/**
 * Aggregates the interfaces for a procedure stub
 */
public interface ProcedureStub extends StubElement<DefinitionProcedureHeading>, Type, SerializableStub {
}
