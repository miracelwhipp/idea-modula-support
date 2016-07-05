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

public class ModulaDesignatorImpl extends ASTWrapperPsiElement implements ModulaDesignator {

  public ModulaDesignatorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitDesignator(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ModulaArraySelection> getArraySelectionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaArraySelection.class);
  }

  @Override
  @NotNull
  public List<ModulaCoercionQualifier> getCoercionQualifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaCoercionQualifier.class);
  }

  @Override
  @NotNull
  public ModulaIdent getIdent() {
    return findNotNullChildByClass(ModulaIdent.class);
  }

  @Override
  @NotNull
  public List<ModulaRecordSelection> getRecordSelectionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaRecordSelection.class);
  }

}
