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

public class CompileTimeConditionDisjunctionImpl extends ASTWrapperPsiElement implements CompileTimeConditionDisjunction {

  public CompileTimeConditionDisjunctionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public CompileTimeConditionConjunction getConjunction() {
    return findNotNullChildByClass(CompileTimeConditionConjunction.class);
  }

  @Override
  @Nullable
  public CompileTimeConditionDisjunction getDisjunction() {
    return findChildByClass(CompileTimeConditionDisjunction.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CompileTimeConditionVisitor) ((CompileTimeConditionVisitor)visitor).visitDisjunction(this);
    else super.accept(visitor);
  }

}
