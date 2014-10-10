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

public class DefinitionMacroInnerDeclarationsImpl extends ASTWrapperPsiElement implements DefinitionMacroInnerDeclarations {

  public DefinitionMacroInnerDeclarationsImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<DefinitionMacroConstantDefinitions> getMacroConstantDefinitionsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionMacroConstantDefinitions.class);
  }

  @Override
  @NotNull
  public List<DefinitionMacroTypeDefinitions> getMacroTypeDefinitionsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionMacroTypeDefinitions.class);
  }

  @Override
  @NotNull
  public List<DefinitionMacroVariableDefinitions> getMacroVariableDefinitionsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DefinitionMacroVariableDefinitions.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitMacroInnerDeclarations(this);
    else super.accept(visitor);
  }

}
