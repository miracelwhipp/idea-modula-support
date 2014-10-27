// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import org.modula.helpers.index.stub.delegators.ProcedureStubBasedPsiElement;
import org.modula.parsing.modula.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class ModulaProcedureHeadingImpl extends ProcedureStubBasedPsiElement implements ModulaProcedureHeading {

  public ModulaProcedureHeadingImpl(ASTNode node) {
    super(node);
  }

  public ModulaProcedureHeadingImpl(org.modula.helpers.index.stubs.ProcedureStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitProcedureHeading(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModulaFormalParameters getFormalParameters() {
    return findChildByClass(ModulaFormalParameters.class);
  }

  @Override
  @Nullable
  public ModulaExportNameDeclaration getExportNameDeclaration() {
    return findChildByClass(ModulaExportNameDeclaration.class);
  }

  @Override
  @NotNull
  public ModulaIdent getIdent() {
    return findNotNullChildByClass(ModulaIdent.class);
  }

  @Override
  @Nullable
  public ModulaMacroDeclaration getMacroDeclaration() {
    return findChildByClass(ModulaMacroDeclaration.class);
  }

  @Override
  @Nullable
  public ModulaProcedureAttributes getProcedureAttributes() {
    return findChildByClass(ModulaProcedureAttributes.class);
  }

}
