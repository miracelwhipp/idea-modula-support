// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import org.modula.parsing.psi.ModuleImportStore;
import org.modula.parsing.modula.psi.*;

public class ModulaModuleImportImpl extends ModuleImportStore implements ModulaModuleImport {

  public ModulaModuleImportImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitModuleImport(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModulaModuleName getModuleName() {
    return findNotNullChildByClass(ModulaModuleName.class);
  }

}
