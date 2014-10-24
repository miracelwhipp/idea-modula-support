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

public class DefinitionProcedureDeclarationImpl extends ASTWrapperPsiElement implements DefinitionProcedureDeclaration {

  public DefinitionProcedureDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitProcedureDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DefinitionProcedureHeading getProcedureHeading() {
    return findNotNullChildByClass(DefinitionProcedureHeading.class);
  }

  @Override
  @NotNull
  public DefinitionBlock getBlock() {
    return findNotNullChildByClass(DefinitionBlock.class);
  }

  @Override
  @NotNull
  public DefinitionIdent getIdent() {
    return findNotNullChildByClass(DefinitionIdent.class);
  }

}
