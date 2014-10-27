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

public class ModulaCaseStatementsImpl extends ASTWrapperPsiElement implements ModulaCaseStatements {

  public ModulaCaseStatementsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitCaseStatements(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModulaCaseLabelList getCaseLabelList() {
    return findNotNullChildByClass(ModulaCaseLabelList.class);
  }

  @Override
  @NotNull
  public ModulaStatementSequence getStatementSequence() {
    return findNotNullChildByClass(ModulaStatementSequence.class);
  }

}
