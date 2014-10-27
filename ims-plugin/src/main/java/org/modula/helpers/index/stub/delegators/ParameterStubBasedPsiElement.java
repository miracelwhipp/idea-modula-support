package org.modula.helpers.index.stub.delegators;

import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.IStubElementType;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.Parameter;
import org.modula.helpers.index.stubs.ParameterStub;
import org.modula.helpers.index.stubs.Procedure;
import org.modula.helpers.index.stubs.ProcedureStub;
import org.modula.parsing.modula.psi.ModulaParameterName;
import org.modula.parsing.modula.psi.ModulaProcedureHeading;

/**
 * Abstract superclass for generated {@link org.modula.parsing.modula.psi.impl.ModulaParameterNameImpl}
 * knowing how to obtain {@link org.modula.helpers.index.stubs.Parameter}s members from PSI
 *
 * @author miracelwhipp
 */
public abstract class ParameterStubBasedPsiElement extends SymbolStubBasedPsiElement<ParameterStub> implements Parameter, ModulaParameterName {

	public ParameterStubBasedPsiElement(@NotNull ParameterStub stub, @NotNull IStubElementType nodeType) {
		super(stub, nodeType);
	}

	public ParameterStubBasedPsiElement(@NotNull ASTNode node) {
		super(node);
	}

	@Override
	public String getStubName() {
		ParameterStub stub = getStub();
		if (null != stub) {
			return stub.getStubName();
		}
		return getIdent().getText();
	}


}
