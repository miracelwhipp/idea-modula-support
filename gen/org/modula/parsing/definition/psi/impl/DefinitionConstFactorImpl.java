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

public class DefinitionConstFactorImpl extends ASTWrapperPsiElement implements DefinitionConstFactor {

  public DefinitionConstFactorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitConstFactor(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DefinitionConstExpression getConstExpression() {
    return findChildByClass(DefinitionConstExpression.class);
  }

  @Override
  @Nullable
  public DefinitionConstFactor getConstFactor() {
    return findChildByClass(DefinitionConstFactor.class);
  }

  @Override
  @Nullable
  public DefinitionDesignator getDesignator() {
    return findChildByClass(DefinitionDesignator.class);
  }

  @Override
  @Nullable
  public DefinitionNumber getNumber() {
    return findChildByClass(DefinitionNumber.class);
  }

  @Override
  @Nullable
  public DefinitionSetExpression getSetExpression() {
    return findChildByClass(DefinitionSetExpression.class);
  }

  @Override
  @Nullable
  public DefinitionString getString() {
    return findChildByClass(DefinitionString.class);
  }

}
