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

public class ModulaStatementImpl extends ASTWrapperPsiElement implements ModulaStatement {

  public ModulaStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModulaAsmStatement getAsmStatement() {
    return findChildByClass(ModulaAsmStatement.class);
  }

  @Override
  @Nullable
  public ModulaCaseStatement getCaseStatement() {
    return findChildByClass(ModulaCaseStatement.class);
  }

  @Override
  @Nullable
  public ModulaForStatement getForStatement() {
    return findChildByClass(ModulaForStatement.class);
  }

  @Override
  @Nullable
  public ModulaFuncStatement getFuncStatement() {
    return findChildByClass(ModulaFuncStatement.class);
  }

  @Override
  @Nullable
  public ModulaIfStatement getIfStatement() {
    return findChildByClass(ModulaIfStatement.class);
  }

  @Override
  @Nullable
  public ModulaLoopStatement getLoopStatement() {
    return findChildByClass(ModulaLoopStatement.class);
  }

  @Override
  @Nullable
  public ModulaProcedureCall getProcedureCall() {
    return findChildByClass(ModulaProcedureCall.class);
  }

  @Override
  @Nullable
  public ModulaRepeatStatement getRepeatStatement() {
    return findChildByClass(ModulaRepeatStatement.class);
  }

  @Override
  @Nullable
  public ModulaWhileStatement getWhileStatement() {
    return findChildByClass(ModulaWhileStatement.class);
  }

  @Override
  @Nullable
  public ModulaWithStatement getWithStatement() {
    return findChildByClass(ModulaWithStatement.class);
  }

  @Override
  @Nullable
  public ModulaAssignment getAssignment() {
    return findChildByClass(ModulaAssignment.class);
  }

  @Override
  @Nullable
  public ModulaRecoveringExpression getRecoveringExpression() {
    return findChildByClass(ModulaRecoveringExpression.class);
  }

}
