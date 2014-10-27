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

public class ModulaModuleDeclarationImpl extends ASTWrapperPsiElement implements ModulaModuleDeclaration {

  public ModulaModuleDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitModuleDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModulaBlock getBlock() {
    return findNotNullChildByClass(ModulaBlock.class);
  }

  @Override
  @Nullable
  public ModulaExportClause getExportClause() {
    return findChildByClass(ModulaExportClause.class);
  }

  @Override
  @NotNull
  public List<ModulaIdent> getIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaIdent.class);
  }

  @Override
  @NotNull
  public List<ModulaImportClause> getImportClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModulaImportClause.class);
  }

}
