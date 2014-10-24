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

public class DefinitionDeclarationImpl extends ASTWrapperPsiElement implements DefinitionDeclaration {

  public DefinitionDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DefinitionConstantDeclaration> getConstantDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionConstantDeclaration.class);
  }

  @Override
  @Nullable
  public DefinitionModuleDeclaration getModuleDeclaration() {
    return findChildByClass(DefinitionModuleDeclaration.class);
  }

  @Override
  @Nullable
  public DefinitionProcedureDeclaration getProcedureDeclaration() {
    return findChildByClass(DefinitionProcedureDeclaration.class);
  }

  @Override
  @NotNull
  public List<DefinitionTypeDeclaration> getTypeDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionTypeDeclaration.class);
  }

  @Override
  @NotNull
  public List<DefinitionVariableDeclaration> getVariableDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionVariableDeclaration.class);
  }

}
