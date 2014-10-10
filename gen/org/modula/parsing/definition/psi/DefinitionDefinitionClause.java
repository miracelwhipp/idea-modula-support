// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionDefinitionClause extends PsiElement {

  @Nullable
  DefinitionConstantDefinitions getConstantDefinitions();

  @Nullable
  DefinitionProcedureDefinition getProcedureDefinition();

  @Nullable
  DefinitionTypeDefinitions getTypeDefinitions();

  @Nullable
  DefinitionVariableDefinitions getVariableDefinitions();

}
