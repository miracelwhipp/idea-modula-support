// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import org.modula.helpers.index.stub.delegators.VariableStubBasedPsiElement;
import org.modula.parsing.modula.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class ModulaVariableNameDefinitionImpl extends VariableStubBasedPsiElement implements ModulaVariableNameDefinition {

  public ModulaVariableNameDefinitionImpl(ASTNode node) {
    super(node);
  }

  public ModulaVariableNameDefinitionImpl(org.modula.helpers.index.stubs.VariableStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitVariableNameDefinition(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModulaIdent getIdent() {
    return findNotNullChildByClass(ModulaIdent.class);
  }

}
