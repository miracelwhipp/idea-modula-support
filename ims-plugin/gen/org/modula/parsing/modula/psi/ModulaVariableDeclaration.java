// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaVariableDeclaration extends PsiElement {

  @NotNull
  List<ModulaExportNameDeclaration> getExportNameDeclarationList();

  @Nullable
  ModulaExpression getExpression();

  @NotNull
  ModulaTypes getTypes();

  @NotNull
  ModulaVariableModifiers getVariableModifiers();

  @NotNull
  List<ModulaVariableNameDefinition> getVariableNameDefinitionList();

}
