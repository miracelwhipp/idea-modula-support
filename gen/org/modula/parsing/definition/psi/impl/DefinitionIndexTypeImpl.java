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

public class DefinitionIndexTypeImpl extends ASTWrapperPsiElement implements DefinitionIndexType {

  public DefinitionIndexTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitIndexType(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DefinitionRange getRange() {
    return findChildByClass(DefinitionRange.class);
  }

  @Override
  @Nullable
  public DefinitionTypeDesignator getTypeDesignator() {
    return findChildByClass(DefinitionTypeDesignator.class);
  }

}
