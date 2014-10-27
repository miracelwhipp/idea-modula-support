package org.modula.helpers.index.stub.delegators;

import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.IStubElementType;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.Constant;
import org.modula.helpers.index.stubs.ConstantStub;
import org.modula.parsing.modula.psi.ModulaConstantDeclaration;

/**
 * Abstract superclass for generated {@link org.modula.parsing.modula.psi.impl.ModulaConstantDeclarationImpl}
 * knowing how to obtain {@link Constant} from PSI
 */
public abstract class ConstantStubBasedPsiElement extends SymbolStubBasedPsiElement<ConstantStub> implements Constant, ModulaConstantDeclaration {

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
