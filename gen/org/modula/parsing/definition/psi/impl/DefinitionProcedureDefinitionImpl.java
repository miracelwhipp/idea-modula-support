// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.definition.psi.ModulaTypes.*;
import org.modula.helpers.index.stub.delegators.ProcedureStubBasedPsiElement;
import org.modula.parsing.definition.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class DefinitionProcedureDefinitionImpl extends ProcedureStubBasedPsiElement implements DefinitionProcedureDefinition {

  public DefinitionProcedureDefinitionImpl(ASTNode node) {
    super(node);
  }

  public DefinitionProcedureDefinitionImpl(org.modula.helpers.index.stubs.ProcedureStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitProcedureDefinition(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DefinitionExportNameDeclaration getExportNameDeclaration() {
    return findChildByClass(DefinitionExportNameDeclaration.class);
  }

  @Override
  @Nullable
  public DefinitionParameters getParameters() {
    return findChildByClass(DefinitionParameters.class);
  }

  @Override
  @Nullable
  public DefinitionProcedureAttributes getProcedureAttributes() {
    return findChildByClass(DefinitionProcedureAttributes.class);
  }

  @Override
  @Nullable
  public DefinitionProcedureModifiers getProcedureModifiers() {
    return findChildByClass(DefinitionProcedureModifiers.class);
  }

  @Override
  @NotNull
  public DefinitionProcedureName getProcedureName() {
    return findNotNullChildByClass(DefinitionProcedureName.class);
  }

  @Override
  @Nullable
  public DefinitionTypeSpecification getTypeSpecification() {
    return findChildByClass(DefinitionTypeSpecification.class);
  }

}
