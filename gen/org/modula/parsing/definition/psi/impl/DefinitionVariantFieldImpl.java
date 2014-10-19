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

public class DefinitionVariantFieldImpl extends ASTWrapperPsiElement implements DefinitionVariantField {

  public DefinitionVariantFieldImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitVariantField(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DefinitionFieldName getFieldName() {
    return findChildByClass(DefinitionFieldName.class);
  }

  @Override
  @NotNull
  public DefinitionTypeSpecification getTypeSpecification() {
    return findNotNullChildByClass(DefinitionTypeSpecification.class);
  }

  @Override
  @NotNull
  public DefinitionVariants getVariants() {
    return findNotNullChildByClass(DefinitionVariants.class);
  }

}
