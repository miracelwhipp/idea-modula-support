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

public class DefinitionForStatementImpl extends ASTWrapperPsiElement implements DefinitionForStatement {

  public DefinitionForStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitForStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DefinitionStatementSequence getStatementSequence() {
    return findNotNullChildByClass(DefinitionStatementSequence.class);
  }

  @Override
  @NotNull
  public List<DefinitionExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionExpression.class);
  }

  @Override
  @NotNull
  public DefinitionIdent getIdent() {
    return findNotNullChildByClass(DefinitionIdent.class);
  }

}
