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
  public List<ModulaAssertStatement> getAssertStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaAssertStatement.class);
  }

  @Override
  @Nullable
  public ModulaConstantDeclarations getConstantDeclarations() {
    return findChildByClass(ModulaConstantDeclarations.class);
  }

  @Override
  @Nullable
  public ModulaProcedureHeading getProcedureHeading() {
    return findChildByClass(ModulaProcedureHeading.class);
  }

  @Override
  @Nullable
  public ModulaVariableDeclarations getVariableDeclarations() {
    return findChildByClass(ModulaVariableDeclarations.class);
  }

  @Override
  @NotNull
  public List<ModulaTypeDefinition> getTypeDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaTypeDefinition.class);
  }

}
