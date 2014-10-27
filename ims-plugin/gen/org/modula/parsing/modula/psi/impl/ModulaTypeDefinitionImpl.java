// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import org.modula.helpers.index.stub.delegators.TypeStubBasedPsiElement;
import org.modula.parsing.modula.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class ModulaTypeDefinitionImpl extends TypeStubBasedPsiElement implements ModulaTypeDefinition {

  public ModulaTypeDefinitionImpl(ASTNode node) {
    super(node);
  }

  public ModulaTypeDefinitionImpl(org.modula.helpers.index.stubs.TypeStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitTypeDefinition(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModulaIdent getIdent() {
    return findNotNullChildByClass(ModulaIdent.class);
  }

  @Override
  @Nullable
  public ModulaTypes getTypes() {
    return findChildByClass(ModulaTypes.class);
  }

}
