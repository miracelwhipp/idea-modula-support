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

public class DefinitionProcedureHeadingImpl extends ProcedureStubBasedPsiElement implements DefinitionProcedureHeading {

  public DefinitionProcedureHeadingImpl(ASTNode node) {
    super(node);
  }

  public DefinitionProcedureHeadingImpl(org.modula.helpers.index.stubs.ProcedureStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitProcedureHeading(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DefinitionFormalParameters getFormalParameters() {
    return findChildByClass(DefinitionFormalParameters.class);
  }

  @Override
  @Nullable
  public DefinitionExportNameDeclaration getExportNameDeclaration() {
    return findChildByClass(DefinitionExportNameDeclaration.class);
  }

  @Override
  @NotNull
  public DefinitionIdent getIdent() {
    return findNotNullChildByClass(DefinitionIdent.class);
  }

  @Override
  @Nullable
  public DefinitionMacroDeclaration getMacroDeclaration() {
    return findChildByClass(DefinitionMacroDeclaration.class);
  }

  @Override
  @Nullable
  public DefinitionProcedureAttributes getProcedureAttributes() {
    return findChildByClass(DefinitionProcedureAttributes.class);
  }

}
