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

public class DefinitionConstantArrayElementImpl extends ASTWrapperPsiElement implements DefinitionConstantArrayElement {

  public DefinitionConstantArrayElementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitConstantArrayElement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DefinitionConstantValue getConstantValue() {
    return findChildByClass(DefinitionConstantValue.class);
  }

  @Override
  @Nullable
  public DefinitionInnerRange getInnerRange() {
    return findChildByClass(DefinitionInnerRange.class);
  }

  @Override
  @NotNull
  public List<DefinitionIntegerLiteral> getIntegerLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionIntegerLiteral.class);
  }

}
