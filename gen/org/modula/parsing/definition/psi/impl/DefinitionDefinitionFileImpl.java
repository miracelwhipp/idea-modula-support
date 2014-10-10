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

public class DefinitionDefinitionFileImpl extends ASTWrapperPsiElement implements DefinitionDefinitionFile {

  public DefinitionDefinitionFileImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DefinitionDefinitionClause> getDefinitionClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionDefinitionClause.class);
  }

  @Override
  @NotNull
  public DefinitionFooter getFooter() {
    return findNotNullChildByClass(DefinitionFooter.class);
  }

  @Override
  @NotNull
  public DefinitionHeader getHeader() {
    return findNotNullChildByClass(DefinitionHeader.class);
  }

  @Override
  @NotNull
  public List<DefinitionImportClause> getImportClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionImportClause.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitDefinitionFile(this);
    else super.accept(visitor);
  }

}
