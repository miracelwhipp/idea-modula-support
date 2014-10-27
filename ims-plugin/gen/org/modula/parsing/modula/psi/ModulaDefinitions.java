// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaDefinitions extends PsiElement {

  @NotNull
  List<ModulaConstantDeclaration> getConstantDeclarationList();

  @Nullable
  ModulaProcedureHeading getProcedureHeading();

  @NotNull
  List<ModulaVariableDeclaration> getVariableDeclarationList();

  @NotNull
  List<ModulaTypeDefinition> getTypeDefinitionList();

}
