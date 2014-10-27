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

public class ModulaTypesImpl extends ASTWrapperPsiElement implements ModulaTypes {

  public ModulaTypesImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModulaVisitor) ((ModulaVisitor)visitor).visitTypes(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModulaArrayType getArrayType() {
    return findChildByClass(ModulaArrayType.class);
  }

  @Override
  @Nullable
  public ModulaPointerType getPointerType() {
    return findChildByClass(ModulaPointerType.class);
  }

  @Override
  @Nullable
  public ModulaProcedureType getProcedureType() {
    return findChildByClass(ModulaProcedureType.class);
  }

  @Override
  @Nullable
  public ModulaRecordType getRecordType() {
    return findChildByClass(ModulaRecordType.class);
  }

  @Override
  @Nullable
  public ModulaSetType getSetType() {
    return findChildByClass(ModulaSetType.class);
  }

  @Override
  @Nullable
  public ModulaSimpleType getSimpleType() {
    return findChildByClass(ModulaSimpleType.class);
  }

}
