package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.StubElement;
import org.modula.parsing.modula.psi.ModulaProcedureHeading;

/**
 * Aggregates the interfaces for a procedure stub
 */
public interface ProcedureStub extends StubElement<ModulaProcedureHeading>, Type, SerializableStub {
}
