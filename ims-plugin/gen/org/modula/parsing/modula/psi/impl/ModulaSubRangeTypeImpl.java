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

public class ModulaSubRangeTypeImpl extends ASTWrapperPsiElement implements ModulaSubRangeType {

  public ModulaSubRangeTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitSubRangeType(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ModulaExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaExpression.class);
  }

  @Override
  @Nullable
  public ModulaQualident getQualident() {
    return findChildByClass(ModulaQualident.class);
  }

}
