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

public class DefinitionConstantValueImpl extends ASTWrapperPsiElement implements DefinitionConstantValue {

  public DefinitionConstantValueImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DefinitionArrayConstant getArrayConstant() {
    return findChildByClass(DefinitionArrayConstant.class);
  }

  @Override
  @Nullable
  public DefinitionConstantExpression getConstantExpression() {
    return findChildByClass(DefinitionConstantExpression.class);
  }

  @Override
  @Nullable
  public DefinitionRecordConstant getRecordConstant() {
    return findChildByClass(DefinitionRecordConstant.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitConstantValue(this);
    else super.accept(visitor);
  }

}
