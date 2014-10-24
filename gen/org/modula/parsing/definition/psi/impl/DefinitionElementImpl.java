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

public class DefinitionElementImpl extends ASTWrapperPsiElement implements DefinitionElement {

  public DefinitionElementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitElement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DefinitionExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionExpression.class);
  }

}
