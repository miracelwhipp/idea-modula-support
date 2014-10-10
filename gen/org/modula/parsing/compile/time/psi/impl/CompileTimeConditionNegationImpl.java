// This is a generated file. Not intended for manual editing.
package org.modula.parsing.compile.time.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.compile.time.psi.CompileTimeConditionTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.modula.parsing.compile.time.psi.*;

public class CompileTimeConditionNegationImpl extends ASTWrapperPsiElement implements CompileTimeConditionNegation {

  public CompileTimeConditionNegationImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public CompileTimeConditionNegation getNegation() {
    return findChildByClass(CompileTimeConditionNegation.class);
  }

  @Override
  @Nullable
  public CompileTimeConditionTerm getTerm() {
    return findChildByClass(CompileTimeConditionTerm.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CompileTimeConditionVisitor) ((CompileTimeConditionVisitor)visitor).visitNegation(this);
    else super.accept(visitor);
  }

}
