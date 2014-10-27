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

public class ModulaQualidentImpl extends ASTWrapperPsiElement implements ModulaQualident {

  public ModulaQualidentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitQualident(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModulaBasicType getBasicType() {
    return findChildByClass(ModulaBasicType.class);
  }

  @Override
  @NotNull
  public List<ModulaIdent> getIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaIdent.class);
  }

  @Override
  @Nullable
  public ModulaStonyBrookType getStonyBrookType() {
    return findChildByClass(ModulaStonyBrookType.class);
  }

}
