// This is a generated file. Not intended for manual editing.
package org.modula.parsing.compile.time.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class CompileTimeConditionVisitor extends PsiElementVisitor {

  public void visitConjunction(@NotNull CompileTimeConditionConjunction o) {
    visitPsiElement(o);
  }

  public void visitDisjunction(@NotNull CompileTimeConditionDisjunction o) {
    visitPsiElement(o);
  }

  public void visitNegation(@NotNull CompileTimeConditionNegation o) {
    visitPsiElement(o);
  }

  public void visitTerm(@NotNull CompileTimeConditionTerm o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
