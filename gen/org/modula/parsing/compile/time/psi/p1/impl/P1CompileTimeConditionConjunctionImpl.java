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

public class P1CompileTimeConditionConjunctionImpl extends ASTWrapperPsiElement implements P1CompileTimeConditionConjunction {

  public P1CompileTimeConditionConjunctionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public P1CompileTimeConditionConjunction getConjunction() {
    return findChildByClass(P1CompileTimeConditionConjunction.class);
  }

  @Override
  @NotNull
  public P1CompileTimeConditionNegation getNegation() {
    return findNotNullChildByClass(P1CompileTimeConditionNegation.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof P1CompileTimeConditionVisitor) ((P1CompileTimeConditionVisitor)visitor).visitConjunction(this);
    else super.accept(visitor);
  }

}
