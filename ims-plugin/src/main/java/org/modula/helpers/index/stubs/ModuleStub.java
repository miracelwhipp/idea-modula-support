package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.StubElement;
import org.modula.parsing.modula.psi.ModulaModuleHeader;

/**
 * Aggregates the interfaces for module stubs
 */
public interface ModuleStub extends StubElement<ModulaModuleHeader>, Module, SerializableStub {

}
