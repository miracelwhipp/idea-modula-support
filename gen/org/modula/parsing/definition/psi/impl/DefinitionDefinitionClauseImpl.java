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

public class DefinitionDefinitionClauseImpl extends ASTWrapperPsiElement implements DefinitionDefinitionClause {

  public DefinitionDefinitionClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public DefinitionConstantDefinitions getConstantDefinitions() {
    return findChildByClass(DefinitionConstantDefinitions.class);
  }

  @Override
  @Nullable
  public DefinitionProcedureDefinition getProcedureDefinition() {
    return findChildByClass(DefinitionProcedureDefinition.class);
  }

  @Override
  @Nullable
  public DefinitionTypeDefinitions getTypeDefinitions() {
    return findChildByClass(DefinitionTypeDefinitions.class);
  }

  @Override
  @Nullable
  public DefinitionVariableDefinitions getVariableDefinitions() {
    return findChildByClass(DefinitionVariableDefinitions.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitDefinitionClause(this);
    else super.accept(visitor);
  }

}
