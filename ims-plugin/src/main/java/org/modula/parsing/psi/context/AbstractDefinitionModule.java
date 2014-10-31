package org.modula.parsing.psi.context;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.ContextDefinition;
import org.modula.parsing.modula.psi.ModulaDefinitionModule;

/**
 * Superclass for {@link org.modula.parsing.modula.psi.ModulaDefinitionModule} to obtain context name
 *
 * @author miracelwhipp
 */
public abstract class AbstractDefinitionModule extends ASTWrapperPsiElement implements ContextDefinition, ModulaDefinitionModule {

	public AbstractDefinitionModule(@NotNull ASTNode node) {
		super(node);
	}

	@Override
	public String getContextName() {
		return "def";
	}
}
