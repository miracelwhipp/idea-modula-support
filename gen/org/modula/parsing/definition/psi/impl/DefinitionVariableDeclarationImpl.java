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

public class DefinitionVariableDeclarationImpl extends ASTWrapperPsiElement implements DefinitionVariableDeclaration {

  public DefinitionVariableDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitVariableDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DefinitionExportNameDeclaration> getExportNameDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionExportNameDeclaration.class);
  }

  @Override
  @Nullable
  public DefinitionExpression getExpression() {
    return findChildByClass(DefinitionExpression.class);
  }

  @Override
  @NotNull
  public DefinitionTypes getTypes() {
    return findNotNullChildByClass(DefinitionTypes.class);
  }

  @Override
  @NotNull
  public DefinitionVariableModifiers getVariableModifiers() {
    return findNotNullChildByClass(DefinitionVariableModifiers.class);
  }

  @Override
  @NotNull
  public List<DefinitionVariableNameDefinition> getVariableNameDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionVariableNameDefinition.class);
  }

}
