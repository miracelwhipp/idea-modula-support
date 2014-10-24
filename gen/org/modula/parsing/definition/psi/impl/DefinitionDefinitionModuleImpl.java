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

public class DefinitionDefinitionModuleImpl extends ASTWrapperPsiElement implements DefinitionDefinitionModule {

  public DefinitionDefinitionModuleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitDefinitionModule(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DefinitionDefinitions> getDefinitionsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionDefinitions.class);
  }

  @Override
  @NotNull
  public DefinitionIdent getIdent() {
    return findNotNullChildByClass(DefinitionIdent.class);
  }

  @Override
  @NotNull
  public List<DefinitionImportClause> getImportClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionImportClause.class);
  }

  @Override
  @NotNull
  public DefinitionModuleHeader getModuleHeader() {
    return findNotNullChildByClass(DefinitionModuleHeader.class);
  }

}
