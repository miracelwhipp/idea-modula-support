package org.modula.helpers.index.stub.delegators;

import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.keys.ModuleDefinitionFileIndex;
import org.modula.helpers.index.stubs.SymbolStub;
import org.modula.helpers.index.stubs.VariableStub;
import org.modula.parsing.utility.ModulaPsiTraversingUtility;

/**
 * Abstract superclass knowing how to obtain the current filename and module.
 */
public abstract class SymbolStubBasedPsiElement<Stub extends SymbolStub & StubElement> extends StubBasedPsiElementBase<Stub> implements SymbolStub {

	public SymbolStubBasedPsiElement(@NotNull Stub stub, @NotNull IStubElementType nodeType) {
		super(stub, nodeType);
	}

	public SymbolStubBasedPsiElement(@NotNull ASTNode node) {
		super(node);
	}

	@Override
	public String getModule() {
		Stub stub = getStub();
		if (null != stub) {
			return stub.getModule();
		}
		return ModulaPsiTraversingUtility.getModuleName(this);
	}

	@Override
	public String getFileName() {
		Stub stub = getStub();
		if (null != stub) {
			return stub.getFileName();
		}
		return ModuleDefinitionFileIndex.getContainingFile(this);
	}



}
