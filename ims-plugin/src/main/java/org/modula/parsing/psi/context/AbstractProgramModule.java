package org.modula.parsing.psi.context;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.ContextDefinition;
import org.modula.parsing.modula.psi.ModulaProgramModule;

/**
 * Superclass for {@link org.modula.parsing.modula.psi.ModulaProgramModule} to obtain context name
 *
 * @author miracelwhipp
 */
public abstract class AbstractProgramModule extends ASTWrapperPsiElement implements ContextDefinition, ModulaProgramModule {

	public AbstractProgramModule(@NotNull ASTNode node) {
		super(node);
	}

	@Override
	public String getContextName() {
		return "mod";
	}
}
