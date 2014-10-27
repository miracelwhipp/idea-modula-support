package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.StubElement;
import org.modula.parsing.modula.psi.ModulaConstantDeclaration;

/**
 * Aggregates the interfaces for a constant stub
 */
public interface ConstantStub extends StubElement<ModulaConstantDeclaration>, Constant, SerializableStub {

}
