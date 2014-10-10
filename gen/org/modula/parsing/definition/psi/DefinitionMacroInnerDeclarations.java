// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionMacroInnerDeclarations extends PsiElement {

  @NotNull
  List<DefinitionMacroConstantDefinitions> getMacroConstantDefinitionsList();

  @NotNull
  List<DefinitionMacroTypeDefinitions> getMacroTypeDefinitionsList();

  @NotNull
  List<DefinitionMacroVariableDefinitions> getMacroVariableDefinitionsList();

}
