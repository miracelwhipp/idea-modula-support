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

public class DefinitionFieldListImpl extends ASTWrapperPsiElement implements DefinitionFieldList {

  public DefinitionFieldListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitFieldList(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DefinitionFieldListSequence getFieldListSequence() {
    return findChildByClass(DefinitionFieldListSequence.class);
  }

  @Override
  @Nullable
  public DefinitionIdentList getIdentList() {
    return findChildByClass(DefinitionIdentList.class);
  }

  @Override
  @Nullable
  public DefinitionIdent getIdent() {
    return findChildByClass(DefinitionIdent.class);
  }

  @Override
  @Nullable
  public DefinitionQualident getQualident() {
    return findChildByClass(DefinitionQualident.class);
  }

  @Override
  @Nullable
  public DefinitionTypes getTypes() {
    return findChildByClass(DefinitionTypes.class);
  }

  @Override
  @NotNull
  public List<DefinitionVariant> getVariantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionVariant.class);
  }

}
