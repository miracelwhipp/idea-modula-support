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

public class DefinitionNegationImpl extends ASTWrapperPsiElement implements DefinitionNegation {

  public DefinitionNegationImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DefinitionFunctionCall getFunctionCall() {
    return findChildByClass(DefinitionFunctionCall.class);
  }

  @Override
  @Nullable
  public DefinitionNegation getNegation() {
    return findChildByClass(DefinitionNegation.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitNegation(this);
    else super.accept(visitor);
  }

}
