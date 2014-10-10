// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.definition.psi.ModulaTypes.*;
import org.modula.helpers.index.stub.delegators.ConstantStubBasedPsiElement;
import org.modula.parsing.definition.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class DefinitionConstantDefinitionImpl extends ConstantStubBasedPsiElement implements DefinitionConstantDefinition {

  public DefinitionConstantDefinitionImpl(ASTNode node) {
    super(node);
  }

  public DefinitionConstantDefinitionImpl(org.modula.helpers.index.stubs.ConstantStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  @Override
  @NotNull
  public DefinitionConstantName getConstantName() {
    return findNotNullChildByClass(DefinitionConstantName.class);
  }

  @Override
  @NotNull
  public DefinitionConstantValue getConstantValue() {
    return findNotNullChildByClass(DefinitionConstantValue.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitConstantDefinition(this);
    else super.accept(visitor);
  }

}
