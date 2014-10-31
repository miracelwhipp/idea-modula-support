package org.modula.parsing.psi.context;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.ContextDefinition;
import org.modula.parsing.modula.psi.ModulaProcedureDeclaration;

/**
 * Superclass for {@link org.modula.parsing.modula.psi.ModulaProcedureDeclaration} to obtain context name
 *
 * @author miracelwhipp
 */
public abstract class AbstractProcedureDeclaration extends ASTWrapperPsiElement implements ContextDefinition, ModulaProcedureDeclaration {

	public AbstractProcedureDeclaration(@NotNull ASTNode node) {
		super(node);
	}

	@Override
	public String getContextName() {
		return getIdent().getText();
	}
}
