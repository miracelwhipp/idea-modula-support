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

public class DefinitionRecordConstantImpl extends ASTWrapperPsiElement implements DefinitionRecordConstant {

  public DefinitionRecordConstantImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public DefinitionConstantType getConstantType() {
    return findNotNullChildByClass(DefinitionConstantType.class);
  }

  @Override
  @NotNull
  public List<DefinitionConstantValue> getConstantValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionConstantValue.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitRecordConstant(this);
    else super.accept(visitor);
  }

}
