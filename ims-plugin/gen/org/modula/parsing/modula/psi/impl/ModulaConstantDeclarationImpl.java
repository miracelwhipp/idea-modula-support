// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import org.modula.helpers.index.stub.delegators.ConstantStubBasedPsiElement;
import org.modula.parsing.modula.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class ModulaConstantDeclarationImpl extends ConstantStubBasedPsiElement implements ModulaConstantDeclaration {

  public ModulaConstantDeclarationImpl(ASTNode node) {
    super(node);
  }

  public ModulaConstantDeclarationImpl(org.modula.helpers.index.stubs.ConstantStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitConstantDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModulaAnonymousArrayConstant getAnonymousArrayConstant() {
    return findChildByClass(ModulaAnonymousArrayConstant.class);
  }

  @Override
  @NotNull
  public ModulaIdent getIdent() {
    return findNotNullChildByClass(ModulaIdent.class);
  }

  @Override
  @Nullable
  public ModulaRecoveringExpression getRecoveringExpression() {
    return findChildByClass(ModulaRecoveringExpression.class);
  }

  @Override
  @Nullable
  public ModulaTypes getTypes() {
    return findChildByClass(ModulaTypes.class);
  }

}
