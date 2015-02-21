// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.modula.helpers.index.stubs.EnumerationMember;
import org.modula.helpers.index.stubs.SymbolStubPsiElement;
import com.intellij.psi.StubBasedPsiElement;
import org.modula.helpers.index.stubs.EnumerationMemberStub;

public interface ModulaEnumerationMemberDefinition extends PsiElement, EnumerationMember, SymbolStubPsiElement, StubBasedPsiElement<EnumerationMemberStub> {

  @NotNull
  ModulaIdent getIdent();

  @Nullable
  ModulaIntegerLiteral getIntegerLiteral();

}