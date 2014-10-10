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

public class DefinitionLiteralImpl extends ASTWrapperPsiElement implements DefinitionLiteral {

  public DefinitionLiteralImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DefinitionComplexLiteral getComplexLiteral() {
    return findChildByClass(DefinitionComplexLiteral.class);
  }

  @Override
  @Nullable
  public DefinitionEnumerationMemberDesignator getEnumerationMemberDesignator() {
    return findChildByClass(DefinitionEnumerationMemberDesignator.class);
  }

  @Override
  @Nullable
  public DefinitionIntegerLiteral getIntegerLiteral() {
    return findChildByClass(DefinitionIntegerLiteral.class);
  }

  @Override
  @Nullable
  public DefinitionRealLiteral getRealLiteral() {
    return findChildByClass(DefinitionRealLiteral.class);
  }

  @Override
  @Nullable
  public DefinitionSetLiteral getSetLiteral() {
    return findChildByClass(DefinitionSetLiteral.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitLiteral(this);
    else super.accept(visitor);
  }

}
