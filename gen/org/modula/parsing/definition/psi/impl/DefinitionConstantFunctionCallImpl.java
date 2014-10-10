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

public class DefinitionConstantFunctionCallImpl extends ASTWrapperPsiElement implements DefinitionConstantFunctionCall {

  public DefinitionConstantFunctionCallImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DefinitionConstantExpressionValue getConstantExpressionValue() {
    return findChildByClass(DefinitionConstantExpressionValue.class);
  }

  @Override
  @NotNull
  public List<DefinitionConstantParameter> getConstantParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionConstantParameter.class);
  }

  @Override
  @Nullable
  public DefinitionFunctionDesignator getFunctionDesignator() {
    return findChildByClass(DefinitionFunctionDesignator.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitConstantFunctionCall(this);
    else super.accept(visitor);
  }

}
