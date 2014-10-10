// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.definition.psi.ModulaTypes.*;
import org.modula.parsing.psi.ModuleImportStore;
import org.modula.parsing.definition.psi.*;

public class DefinitionModuleImportImpl extends ModuleImportStore implements DefinitionModuleImport {

  public DefinitionModuleImportImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public DefinitionModuleName getModuleName() {
    return findNotNullChildByClass(DefinitionModuleName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitModuleImport(this);
    else super.accept(visitor);
  }

}
