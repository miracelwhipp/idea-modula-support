// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionVariableDeclaration extends PsiElement {

  @NotNull
  List<DefinitionExportNameDeclaration> getExportNameDeclarationList();

  @Nullable
  DefinitionExpression getExpression();

  @NotNull
  DefinitionTypes getTypes();

  @NotNull
  DefinitionVariableModifiers getVariableModifiers();

  @NotNull
  List<DefinitionVariableNameDefinition> getVariableNameDefinitionList();

}
