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

public class ModulaFactorImpl extends ASTWrapperPsiElement implements ModulaFactor {

  public ModulaFactorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitFactor(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModulaActualParameters getActualParameters() {
    return findChildByClass(ModulaActualParameters.class);
  }

  @Override
  @Nullable
  public ModulaDesignator getDesignator() {
    return findChildByClass(ModulaDesignator.class);
  }

  @Override
  @Nullable
  public ModulaExpression getExpression() {
    return findChildByClass(ModulaExpression.class);
  }

  @Override
  @Nullable
  public ModulaFactor getFactor() {
    return findChildByClass(ModulaFactor.class);
  }

  @Override
  @Nullable
  public ModulaNumber getNumber() {
    return findChildByClass(ModulaNumber.class);
  }

  @Override
  @Nullable
  public ModulaSetExpression getSetExpression() {
    return findChildByClass(ModulaSetExpression.class);
  }

  @Override
  @Nullable
  public ModulaString getString() {
    return findChildByClass(ModulaString.class);
  }

}
