// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.definition.psi.ModulaTypes.*;
import org.modula.helpers.index.stub.delegators.TypeStubBasedPsiElement;
import org.modula.parsing.definition.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class DefinitionTypeDefinitionImpl extends TypeStubBasedPsiElement implements DefinitionTypeDefinition {

  public DefinitionTypeDefinitionImpl(ASTNode node) {
    super(node);
  }

  public DefinitionTypeDefinitionImpl(org.modula.helpers.index.stubs.TypeStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitTypeDefinition(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DefinitionOpaqueTypeDefinition getOpaqueTypeDefinition() {
    return findChildByClass(DefinitionOpaqueTypeDefinition.class);
  }

  @Override
  @Nullable
  public DefinitionTypeAliasDefinition getTypeAliasDefinition() {
    return findChildByClass(DefinitionTypeAliasDefinition.class);
  }

}
