// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.modula.parsing.modula.psi.*;

public class ModulaVariableDeclarationImpl extends ASTWrapperPsiElement implements ModulaVariableDeclaration {

  public ModulaVariableDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitVariableDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ModulaExportNameDeclaration> getExportNameDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaExportNameDeclaration.class);
  }

  @Override
  @Nullable
  public ModulaExpression getExpression() {
    return findChildByClass(ModulaExpression.class);
  }

  @Override
  @NotNull
  public ModulaTypes getTypes() {
    return findNotNullChildByClass(ModulaTypes.class);
  }

  @Override
  @NotNull
  public ModulaVariableModifiers getVariableModifiers() {
    return findNotNullChildByClass(ModulaVariableModifiers.class);
  }

  @Override
  @NotNull
  public List<ModulaVariableNameDefinition> getVariableNameDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaVariableNameDefinition.class);
  }

}
