package org.modula.helpers.index.stubs;

import com.intellij.psi.stubs.StubElement;
import org.modula.parsing.definition.psi.DefinitionModuleDefinition;

/**
 * Aggregates the interfaces for module stubs
 */
public interface ModuleStub extends StubElement<DefinitionModuleDefinition>, Module, SerializableStub {

}
