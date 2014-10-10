// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionVariableDefinition extends PsiElement {

  @Nullable
  DefinitionConstantValue getConstantValue();

  @NotNull
  List<DefinitionExportNameDeclaration> getExportNameDeclarationList();

  @Nullable
  DefinitionTypeSpecification getTypeSpecification();

  @Nullable
  DefinitionVariableModifiers getVariableModifiers();

  @NotNull
  List<DefinitionVariableNameDefinition> getVariableNameDefinitionList();

}
