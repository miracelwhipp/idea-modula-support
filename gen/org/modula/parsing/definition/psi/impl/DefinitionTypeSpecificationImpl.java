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

public class DefinitionTypeSpecificationImpl extends ASTWrapperPsiElement implements DefinitionTypeSpecification {

  public DefinitionTypeSpecificationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitTypeSpecification(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DefinitionArrayDefinition getArrayDefinition() {
    return findChildByClass(DefinitionArrayDefinition.class);
  }

  @Override
  @Nullable
  public DefinitionEnumerationDefinition getEnumerationDefinition() {
    return findChildByClass(DefinitionEnumerationDefinition.class);
  }

  @Override
  @Nullable
  public DefinitionPointerDefinition getPointerDefinition() {
    return findChildByClass(DefinitionPointerDefinition.class);
  }

  @Override
  @Nullable
  public DefinitionPredefinedType getPredefinedType() {
    return findChildByClass(DefinitionPredefinedType.class);
  }

  @Override
  @Nullable
  public DefinitionProcedureTypeDefinition getProcedureTypeDefinition() {
    return findChildByClass(DefinitionProcedureTypeDefinition.class);
  }

  @Override
  @Nullable
  public DefinitionRange getRange() {
    return findChildByClass(DefinitionRange.class);
  }

  @Override
  @Nullable
  public DefinitionRecordDefinition getRecordDefinition() {
    return findChildByClass(DefinitionRecordDefinition.class);
  }

  @Override
  @Nullable
  public DefinitionSetDefinition getSetDefinition() {
    return findChildByClass(DefinitionSetDefinition.class);
  }

  @Override
  @Nullable
  public DefinitionTypeDesignator getTypeDesignator() {
    return findChildByClass(DefinitionTypeDesignator.class);
  }

}
