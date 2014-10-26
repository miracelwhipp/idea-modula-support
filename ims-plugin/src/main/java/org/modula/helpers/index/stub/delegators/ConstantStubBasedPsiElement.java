package org.modula.helpers.index.stub.delegators;

import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.IStubElementType;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.keys.ModuleDefinitionFileIndex;
import org.modula.helpers.index.stubs.Constant;
import org.modula.helpers.index.stubs.ConstantStub;
import org.modula.parsing.definition.psi.DefinitionConstantDeclaration;
import org.modula.parsing.utility.ModulaPsiTraversingUtility;

/**
 * Abstract superclass for generated {@link org.modula.parsing.definition.psi.impl.DefinitionConstantDeclarationImpl}
 * knowing how to obtain {@link Constant} from PSI
 */
public abstract class ConstantStubBasedPsiElement extends SymbolStubBasedPsiElement<ConstantStub> implements Constant, DefinitionConstantDeclaration {

	public ConstantStubBasedPsiElement(@NotNull ConstantStub stub, @NotNull IStubElementType nodeType) {
		super(stub, nodeType);
	}

	public ConstantStubBasedPsiElement(@NotNull ASTNode node) {
		super(node);
	}


	@Override
	public String getStubName() {
		ConstantStub stub = getStub();
		if (null != stub) {
			return stub.getStubName();
		}
		return getIdent().getText();
	}
}
