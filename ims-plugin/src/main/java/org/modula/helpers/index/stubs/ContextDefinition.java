package org.modula.helpers.index.stubs;

/**
 * Marks a PsiElement as a modula keyword that defines a context of variables (increases the stack)
 *
 * @author miracelwhipp
 */
public interface ContextDefinition {

	String getContextName();

}
