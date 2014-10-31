// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import org.modula.parsing.psi.context.AbstractProcedureDeclaration;
import org.modula.parsing.modula.psi.*;

public class ModulaProcedureDeclarationImpl extends AbstractProcedureDeclaration implements ModulaProcedureDeclaration {

  public ModulaProcedureDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitProcedureDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModulaProcedureHeading getProcedureHeading() {
    return findNotNullChildByClass(ModulaProcedureHeading.class);
  }

  @Override
  @NotNull
  public ModulaBlock getBlock() {
    return findNotNullChildByClass(ModulaBlock.class);
  }

  @Override
  @NotNull
  public ModulaIdent getIdent() {
    return findNotNullChildByClass(ModulaIdent.class);
  }

}
