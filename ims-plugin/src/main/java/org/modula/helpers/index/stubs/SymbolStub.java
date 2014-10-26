package org.modula.helpers.index.stubs;

import com.intellij.psi.PsiElement;

/**
 * A super interface for symbols defined in modules
 */
public interface SymbolStub extends NamedStub, FileContainableStub {

	String getModule();

}
