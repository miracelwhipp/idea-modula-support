package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.StubElement;
import org.modula.parsing.modula.psi.ModulaEnumerationMemberDefinition;

/**
 * Aggregates the interfaces for a enumeration member stub
 *
 * @author miracelwhipp
 */
public interface EnumerationMemberStub extends StubElement<ModulaEnumerationMemberDefinition>, Type, SerializableStub {
}
