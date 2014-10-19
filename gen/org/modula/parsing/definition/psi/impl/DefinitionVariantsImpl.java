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

public class DefinitionVariantsImpl extends ASTWrapperPsiElement implements DefinitionVariants {

  public DefinitionVariantsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitVariants(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DefinitionFields getFields() {
    return findChildByClass(DefinitionFields.class);
  }

  @Override
  @NotNull
  public List<DefinitionVariant> getVariantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionVariant.class);
  }

}
