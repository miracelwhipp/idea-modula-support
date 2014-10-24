package org.modula.helpers.index.stub.delegators;

import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.IStubElementType;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.Procedure;
import org.modula.helpers.index.stubs.ProcedureStub;
import org.modula.parsing.definition.psi.DefinitionProcedureHeading;

/**
 * Abstract superclass for generated {@link org.modula.parsing.definition.psi.impl.DefinitionProcedureHeadingImpl}
 * knowing how to obtain {@link Procedure}s members from PSI
 */
public abstract class ProcedureStubBasedPsiElement extends SymbolStubBasedPsiElement<ProcedureStub> implements Procedure, DefinitionProcedureHeading {

	public ProcedureStubBasedPsiElement(@NotNull ProcedureStub stub, @NotNull IStubElementType nodeType) {
		super(stub, nodeType);
	}

	public ProcedureStubBasedPsiElement(@NotNull ASTNode node) {
		super(node);
	}

	@Override
	public String getStubName() {
		ProcedureStub stub = getStub();
		if (null != stub) {
			return stub.getStubName();
		}
		return getIdent().getText();
	}
}
