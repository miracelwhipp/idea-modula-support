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

public class DefinitionStatementImpl extends ASTWrapperPsiElement implements DefinitionStatement {

  public DefinitionStatementImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DefinitionCaseStatement getCaseStatement() {
    return findChildByClass(DefinitionCaseStatement.class);
  }

  @Override
  @Nullable
  public DefinitionDoStatement getDoStatement() {
    return findChildByClass(DefinitionDoStatement.class);
  }

  @Override
  @Nullable
  public DefinitionIfStatement getIfStatement() {
    return findChildByClass(DefinitionIfStatement.class);
  }

  @Override
  @Nullable
  public DefinitionLoopStatement getLoopStatement() {
    return findChildByClass(DefinitionLoopStatement.class);
  }

  @Override
  @Nullable
  public DefinitionWhatever getWhatever() {
    return findChildByClass(DefinitionWhatever.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitStatement(this);
    else super.accept(visitor);
  }

}
