// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.definition.psi.ModulaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.modula.parsing.definition.psi.*;

public class DefinitionFPSectionImpl extends ASTWrapperPsiElement implements DefinitionFPSection {

  public DefinitionFPSectionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitFPSection(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DefinitionFormalType getFormalType() {
    return findNotNullChildByClass(DefinitionFormalType.class);
  }

  @Override
  @NotNull
  public DefinitionIdentList getIdentList() {
    return findNotNullChildByClass(DefinitionIdentList.class);
  }

  @Override
  @Nullable
  public DefinitionParameterModifier getParameterModifier() {
    return findChildByClass(DefinitionParameterModifier.class);
  }

  @Override
  @Nullable
  public DefinitionParameterValueModifier getParameterValueModifier() {
    return findChildByClass(DefinitionParameterValueModifier.class);
  }

}
