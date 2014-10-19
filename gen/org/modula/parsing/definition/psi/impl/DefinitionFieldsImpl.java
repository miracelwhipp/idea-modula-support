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

public class DefinitionFieldsImpl extends ASTWrapperPsiElement implements DefinitionFields {

  public DefinitionFieldsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitFields(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DefinitionField> getFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionField.class);
  }

}
