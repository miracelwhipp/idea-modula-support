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

public class ModulaFPSectionImpl extends ASTWrapperPsiElement implements ModulaFPSection {

  public ModulaFPSectionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitFPSection(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModulaFormalType getFormalType() {
    return findNotNullChildByClass(ModulaFormalType.class);
  }

  @Override
  @NotNull
  public ModulaParameterIdentList getParameterIdentList() {
    return findNotNullChildByClass(ModulaParameterIdentList.class);
  }

  @Override
  @Nullable
  public ModulaParameterModifier getParameterModifier() {
    return findChildByClass(ModulaParameterModifier.class);
  }

  @Override
  @Nullable
  public ModulaParameterValueModifier getParameterValueModifier() {
    return findChildByClass(ModulaParameterValueModifier.class);
  }

}
