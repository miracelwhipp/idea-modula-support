package org.modula.parsing.psi.context;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.ContextDefinition;
import org.modula.parsing.modula.psi.ModulaCompilationUnit;

/**
 * Superclass for {@link org.modula.parsing.modula.psi.ModulaCompilationUnit} to obtain context name
 *
 * @author miracelwhipp
 */
public abstract class AbstractCompilationUnit extends ASTWrapperPsiElement implements ContextDefinition, ModulaCompilationUnit {

	public AbstractCompilationUnit(@NotNull ASTNode node) {
		super(node);
	}

	@Override
	public String getContextName() {

		if (getDefinitionModule() != null) {
			return getDefinitionModule().getIdent().getText();
		}

		if (getProgramModule() != null) {
			return getProgramModule().getIdent().getText();
		}

		return null;
	}
}
