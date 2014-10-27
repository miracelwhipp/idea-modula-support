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

public class ModulaProcedureTypeImpl extends ASTWrapperPsiElement implements ModulaProcedureType {

  public ModulaProcedureTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitProcedureType(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModulaFormalTypeList getFormalTypeList() {
    return findChildByClass(ModulaFormalTypeList.class);
  }

  @Override
  @Nullable
  public ModulaProcedureAttributes getProcedureAttributes() {
    return findChildByClass(ModulaProcedureAttributes.class);
  }

}
