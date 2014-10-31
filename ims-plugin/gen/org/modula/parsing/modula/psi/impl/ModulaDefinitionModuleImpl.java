// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import org.modula.parsing.psi.context.AbstractDefinitionModule;
import org.modula.parsing.modula.psi.*;

public class ModulaDefinitionModuleImpl extends AbstractDefinitionModule implements ModulaDefinitionModule {

  public ModulaDefinitionModuleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitDefinitionModule(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ModulaDefinitions> getDefinitionsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaDefinitions.class);
  }

  @Override
  @NotNull
  public ModulaIdent getIdent() {
    return findNotNullChildByClass(ModulaIdent.class);
  }

  @Override
  @NotNull
  public List<ModulaImportClause> getImportClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaImportClause.class);
  }

  @Override
  @NotNull
  public ModulaModuleHeader getModuleHeader() {
    return findNotNullChildByClass(ModulaModuleHeader.class);
  }

}
