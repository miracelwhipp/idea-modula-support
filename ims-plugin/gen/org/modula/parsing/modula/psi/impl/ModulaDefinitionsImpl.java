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

public class ModulaDefinitionsImpl extends ASTWrapperPsiElement implements ModulaDefinitions {

  public ModulaDefinitionsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitDefinitions(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ModulaConstantDeclaration> getConstantDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaConstantDeclaration.class);
  }

  @Override
  @Nullable
  public ModulaProcedureHeading getProcedureHeading() {
    return findChildByClass(ModulaProcedureHeading.class);
  }

  @Override
  @NotNull
  public List<ModulaVariableDeclaration> getVariableDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaVariableDeclaration.class);
  }

  @Override
  @NotNull
  public List<ModulaTypeDefinition> getTypeDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaTypeDefinition.class);
  }

}
