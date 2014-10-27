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

public class ModulaNumberImpl extends ASTWrapperPsiElement implements ModulaNumber {

  public ModulaNumberImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitNumber(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModulaComplexLiteral getComplexLiteral() {
    return findChildByClass(ModulaComplexLiteral.class);
  }

  @Override
  @Nullable
  public ModulaIntegerLiteral getIntegerLiteral() {
    return findChildByClass(ModulaIntegerLiteral.class);
  }

  @Override
  @Nullable
  public ModulaRealLiteral getRealLiteral() {
    return findChildByClass(ModulaRealLiteral.class);
  }

}
