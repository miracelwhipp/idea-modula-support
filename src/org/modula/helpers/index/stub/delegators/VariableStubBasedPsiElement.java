package org.modula.helpers.index.stub.delegators;

import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.IStubElementType;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.keys.ModuleDefinitionFileIndex;
import org.modula.helpers.index.stubs.Constant;
import org.modula.helpers.index.stubs.ConstantStub;
import org.modula.helpers.index.stubs.Variable;
import org.modula.helpers.index.stubs.VariableStub;
import org.modula.parsing.definition.psi.DefinitionConstantDeclaration;
import org.modula.parsing.definition.psi.DefinitionVariableNameDefinition;
import org.modula.parsing.utility.ModulaPsiTraversingUtility;

/**
 * Abstract superclass for generated {@link org.modula.parsing.definition.psi.impl.DefinitionConstantDeclarationImpl}
 * knowing how to obtain {@link org.modula.helpers.index.stubs.Constant} from PSI
 */
public abstract class VariableStubBasedPsiElement extends SymbolStubBasedPsiElement<VariableStub> implements Variable, DefinitionVariableNameDefinition {

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
