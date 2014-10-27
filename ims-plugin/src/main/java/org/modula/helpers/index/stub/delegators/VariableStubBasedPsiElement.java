package org.modula.helpers.index.stub.delegators;

import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.IStubElementType;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.Variable;
import org.modula.helpers.index.stubs.VariableStub;
import org.modula.parsing.modula.psi.ModulaVariableNameDefinition;

/**
 * Abstract superclass for generated {@link org.modula.parsing.modula.psi.impl.ModulaVariableNameDefinitionImpl}
 * knowing how to obtain {@link org.modula.helpers.index.stubs.Constant} from PSI
 */
public abstract class VariableStubBasedPsiElement extends SymbolStubBasedPsiElement<VariableStub> implements Variable, ModulaVariableNameDefinition {

	public VariableStubBasedPsiElement(@NotNull VariableStub stub, @NotNull IStubElementType nodeType) {
		super(stub, nodeType);
	}

	public VariableStubBasedPsiElement(@NotNull ASTNode node) {
		super(node);
	}

	@Override
	public String getStubName() {
		VariableStub stub = getStub();
		if (null != stub) {
			return stub.getStubName();
		}
		return getIdent().getText();
	}
}
