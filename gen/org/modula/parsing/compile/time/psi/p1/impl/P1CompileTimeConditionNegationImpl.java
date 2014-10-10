// This is a generated file. Not intended for manual editing.
package org.modula.parsing.compile.time.psi.p1.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.compile.time.p1.psi.CompileTimeConditionTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.modula.parsing.compile.time.p1.psi.*;

public class P1CompileTimeConditionNegationImpl extends ASTWrapperPsiElement implements P1CompileTimeConditionNegation {

  public P1CompileTimeConditionNegationImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public P1CompileTimeConditionNegation getNegation() {
    return findChildByClass(P1CompileTimeConditionNegation.class);
  }

  @Override
  @Nullable
  public P1CompileTimeConditionTerm getTerm() {
    return findChildByClass(P1CompileTimeConditionTerm.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof P1CompileTimeConditionVisitor) ((P1CompileTimeConditionVisitor)visitor).visitNegation(this);
    else super.accept(visitor);
  }

}
