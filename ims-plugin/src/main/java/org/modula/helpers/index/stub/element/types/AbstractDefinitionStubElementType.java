package org.modula.helpers.index.stub.element.types;

import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.modula.ModulaDefinitionModule;

/**
 * Abstract super class for modula definition {@link IStubElementType}s. Mainly it signals the language to be
 * modula definition module and adds a compile check for the generic parameters.
 */
public abstract class AbstractDefinitionStubElementType<
		Stub extends StubElement<Psi>,
		Psi extends PsiElement & StubBasedPsiElement<Stub>
> extends IStubElementType<Stub, Psi> {

	protected AbstractDefinitionStubElementType(@NotNull @NonNls String debugName) {
		super(debugName, ModulaDefinitionModule.INSTANCE);
	}
}
