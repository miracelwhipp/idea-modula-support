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

public class CompileTimeConditionConjunctionImpl extends ASTWrapperPsiElement implements CompileTimeConditionConjunction {

  public CompileTimeConditionConjunctionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public CompileTimeConditionConjunction getConjunction() {
    return findChildByClass(CompileTimeConditionConjunction.class);
  }

  @Override
  @NotNull
  public CompileTimeConditionNegation getNegation() {
    return findNotNullChildByClass(CompileTimeConditionNegation.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CompileTimeConditionVisitor) ((CompileTimeConditionVisitor)visitor).visitConjunction(this);
    else super.accept(visitor);
  }

}
