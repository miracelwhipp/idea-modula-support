package org.modula.helpers.index.stub.delegators;

import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.IStubElementType;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.stubs.Type;
import org.modula.helpers.index.stubs.TypeStub;
import org.modula.parsing.modula.psi.ModulaTypeDefinition;
import org.modula.parsing.utility.ModulaPsiTraversingUtility;

/**
 * Abstract superclass for generated {@link org.modula.parsing.modula.psi.impl.DefinitionTypeDefinitionImpl}
 * knowing how to obtain {@link Type}s members from PSI
 */
public abstract class TypeStubBasedPsiElement extends SymbolStubBasedPsiElement<TypeStub> implements Type, ModulaTypeDefinition {

	public TypeStubBasedPsiElement(@NotNull TypeStub stub, @NotNull IStubElementType nodeType) {
		super(stub, nodeType);
	}

	public TypeStubBasedPsiElement(@NotNull ASTNode node) {
		super(node);
	}

	@Override
	public String getStubName() {
		TypeStub stub = getStub();
		if (null != stub) {
			return stub.getStubName();
		}
		return ModulaPsiTraversingUtility.getTypeName(this);
	}
}
