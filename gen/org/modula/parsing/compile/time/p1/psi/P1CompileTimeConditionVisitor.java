// This is a generated file. Not intended for manual editing.
package org.modula.parsing.compile.time.p1.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class P1CompileTimeConditionVisitor extends PsiElementVisitor {

  public void visitConjunction(@NotNull P1CompileTimeConditionConjunction o) {
    visitPsiElement(o);
  }

  public void visitDisjunction(@NotNull P1CompileTimeConditionDisjunction o) {
    visitPsiElement(o);
  }

  public void visitNegation(@NotNull P1CompileTimeConditionNegation o) {
    visitPsiElement(o);
  }

  public void visitTerm(@NotNull P1CompileTimeConditionTerm o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
