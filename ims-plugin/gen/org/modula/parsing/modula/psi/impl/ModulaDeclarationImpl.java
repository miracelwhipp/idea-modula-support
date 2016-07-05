// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.modula.parsing.modula.psi.*;

public class ModulaDeclarationImpl extends ASTWrapperPsiElement implements ModulaDeclaration {

  public ModulaDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModulaClassDeclaration getClassDeclaration() {
    return findChildByClass(ModulaClassDeclaration.class);
  }

  @Override
  @Nullable
  public ModulaConstantDeclarations getConstantDeclarations() {
    return findChildByClass(ModulaConstantDeclarations.class);
  }

  @Override
  @Nullable
  public ModulaModuleDeclaration getModuleDeclaration() {
    return findChildByClass(ModulaModuleDeclaration.class);
  }

  @Override
  @Nullable
  public ModulaProcedureDeclaration getProcedureDeclaration() {
    return findChildByClass(ModulaProcedureDeclaration.class);
  }

  @Override
  @Nullable
  public ModulaTypeDeclarations getTypeDeclarations() {
    return findChildByClass(ModulaTypeDeclarations.class);
  }

  @Override
  @Nullable
  public ModulaVariableDeclarations getVariableDeclarations() {
    return findChildByClass(ModulaVariableDeclarations.class);
  }

}
