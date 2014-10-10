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

public class DefinitionFunctionCallImpl extends ASTWrapperPsiElement implements DefinitionFunctionCall {

  public DefinitionFunctionCallImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DefinitionCallParameter> getCallParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionCallParameter.class);
  }

  @Override
  @Nullable
  public DefinitionExpressionValue getExpressionValue() {
    return findChildByClass(DefinitionExpressionValue.class);
  }

  @Override
  @Nullable
  public DefinitionFunctionDesignator getFunctionDesignator() {
    return findChildByClass(DefinitionFunctionDesignator.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitFunctionCall(this);
    else super.accept(visitor);
  }

}
