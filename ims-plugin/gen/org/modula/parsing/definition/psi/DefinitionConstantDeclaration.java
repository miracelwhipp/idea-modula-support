// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.modula.helpers.index.stubs.Constant;
import org.modula.helpers.index.stubs.SymbolStubPsiElement;
import com.intellij.psi.StubBasedPsiElement;
import org.modula.helpers.index.stubs.ConstantStub;

public interface DefinitionConstantDeclaration extends PsiElement, Constant, SymbolStubPsiElement, StubBasedPsiElement<ConstantStub> {

  @NotNull
  DefinitionExpression getExpression();

  @NotNull
  DefinitionIdent getIdent();

}
