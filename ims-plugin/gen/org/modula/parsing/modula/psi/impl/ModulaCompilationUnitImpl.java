// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import org.modula.parsing.psi.context.AbstractCompilationUnit;
import org.modula.parsing.modula.psi.*;

public class ModulaCompilationUnitImpl extends AbstractCompilationUnit implements ModulaCompilationUnit {

  public ModulaCompilationUnitImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitCompilationUnit(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModulaDefinitionModule getDefinitionModule() {
    return findChildByClass(ModulaDefinitionModule.class);
  }

  @Override
  @Nullable
  public ModulaProgramModule getProgramModule() {
    return findChildByClass(ModulaProgramModule.class);
  }

}
