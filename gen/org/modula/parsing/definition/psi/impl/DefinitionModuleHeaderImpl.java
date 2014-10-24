// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.definition.psi.ModulaTypes.*;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import org.modula.helpers.index.stubs.ModuleStub;
import org.modula.parsing.definition.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class DefinitionModuleHeaderImpl extends StubBasedPsiElementBase<ModuleStub> implements DefinitionModuleHeader {

  public DefinitionModuleHeaderImpl(ASTNode node) {
    super(node);
  }

  public DefinitionModuleHeaderImpl(ModuleStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitModuleHeader(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DefinitionIdent getIdent() {
    return findNotNullChildByClass(DefinitionIdent.class);
  }

}
