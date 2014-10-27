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

public class ModulaFieldListImpl extends ASTWrapperPsiElement implements ModulaFieldList {

  public ModulaFieldListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitFieldList(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModulaFieldListSequence getFieldListSequence() {
    return findChildByClass(ModulaFieldListSequence.class);
  }

  @Override
  @Nullable
  public ModulaIdentList getIdentList() {
    return findChildByClass(ModulaIdentList.class);
  }

  @Override
  @Nullable
  public ModulaIdent getIdent() {
    return findChildByClass(ModulaIdent.class);
  }

  @Override
  @Nullable
  public ModulaQualident getQualident() {
    return findChildByClass(ModulaQualident.class);
  }

  @Override
  @Nullable
  public ModulaTypes getTypes() {
    return findChildByClass(ModulaTypes.class);
  }

  @Override
  @NotNull
  public List<ModulaVariant> getVariantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaVariant.class);
  }

}
