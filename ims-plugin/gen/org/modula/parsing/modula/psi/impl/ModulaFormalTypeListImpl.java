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

public class ModulaFormalTypeListImpl extends ASTWrapperPsiElement implements ModulaFormalTypeList {

  public ModulaFormalTypeListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitFormalTypeList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ModulaFormalType> getFormalTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaFormalType.class);
  }

  @Override
  @NotNull
  public List<ModulaParameterModifier> getParameterModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaParameterModifier.class);
  }

  @Override
  @NotNull
  public List<ModulaParameterValueModifier> getParameterValueModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaParameterValueModifier.class);
  }

  @Override
  @Nullable
  public ModulaQualident getQualident() {
    return findChildByClass(ModulaQualident.class);
  }

}
