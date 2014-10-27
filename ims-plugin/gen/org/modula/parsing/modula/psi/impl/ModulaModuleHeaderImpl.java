// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import org.modula.helpers.index.stubs.ModuleStub;
import org.modula.parsing.modula.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class ModulaModuleHeaderImpl extends StubBasedPsiElementBase<ModuleStub> implements ModulaModuleHeader {

  public ModulaModuleHeaderImpl(ASTNode node) {
    super(node);
  }

  public ModulaModuleHeaderImpl(ModuleStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitModuleHeader(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModulaIdent getIdent() {
    return findNotNullChildByClass(ModulaIdent.class);
  }

}
