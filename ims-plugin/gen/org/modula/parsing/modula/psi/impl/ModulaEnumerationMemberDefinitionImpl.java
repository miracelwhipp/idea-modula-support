// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.modula.parsing.modula.psi.*;

public class ModulaEnumerationMemberDefinitionImpl extends ASTWrapperPsiElement implements ModulaEnumerationMemberDefinition {

  public ModulaEnumerationMemberDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitEnumerationMemberDefinition(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModulaEnumerationMemberName getEnumerationMemberName() {
    return findNotNullChildByClass(ModulaEnumerationMemberName.class);
  }

  @Override
  @Nullable
  public ModulaIntegerLiteral getIntegerLiteral() {
    return findChildByClass(ModulaIntegerLiteral.class);
  }

}
