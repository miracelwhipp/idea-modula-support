package org.modula.helpers.index.stub.delegators;

import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.IStubElementType;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.EnumerationMember;
import org.modula.helpers.index.stubs.EnumerationMemberStub;
import org.modula.helpers.index.stubs.Procedure;
import org.modula.helpers.index.stubs.ProcedureStub;
import org.modula.parsing.modula.psi.ModulaEnumerationMemberDefinition;
import org.modula.parsing.modula.psi.ModulaProcedureHeading;

/**
 * Abstract superclass for generated {@link org.modula.parsing.modula.psi.impl.ModulaEnumerationDefinitionImpl}
 * knowing how to obtain {@link org.modula.helpers.index.stubs.EnumerationMember}s members from PSI
 *
 * @author miracelwhipp
 */
public abstract class EnumerationMemberStubBasedPsiElement extends SymbolStubBasedPsiElement<EnumerationMemberStub> implements EnumerationMember, ModulaEnumerationMemberDefinition {

	public EnumerationMemberStubBasedPsiElement(@NotNull EnumerationMemberStub stub, @NotNull IStubElementType nodeType) {
		super(stub, nodeType);
	}

	public EnumerationMemberStubBasedPsiElement(@NotNull ASTNode node) {
		super(node);
	}

	@Override
	public String getStubName() {
		EnumerationMemberStub stub = getStub();
		if (null != stub) {
			return stub.getStubName();
		}
		return getIdent().getText();
	}


}
