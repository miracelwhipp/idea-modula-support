// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.definition.psi.ModulaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.modula.parsing.definition.psi.*;

public class DefinitionTypesImpl extends ASTWrapperPsiElement implements DefinitionTypes {

  public DefinitionTypesImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitTypes(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DefinitionArrayType getArrayType() {
    return findChildByClass(DefinitionArrayType.class);
  }

  @Override
  @Nullable
  public DefinitionPointerType getPointerType() {
    return findChildByClass(DefinitionPointerType.class);
  }

  @Override
  @Nullable
  public DefinitionProcedureType getProcedureType() {
    return findChildByClass(DefinitionProcedureType.class);
  }

  @Override
  @Nullable
  public DefinitionRecordType getRecordType() {
    return findChildByClass(DefinitionRecordType.class);
  }

  @Override
  @Nullable
  public DefinitionSetType getSetType() {
    return findChildByClass(DefinitionSetType.class);
  }

  @Override
  @Nullable
  public DefinitionSimpleType getSimpleType() {
    return findChildByClass(DefinitionSimpleType.class);
  }

}
