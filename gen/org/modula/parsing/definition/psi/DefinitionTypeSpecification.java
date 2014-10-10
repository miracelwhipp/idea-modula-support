// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionTypeSpecification extends PsiElement {

  @Nullable
  DefinitionArrayDefinition getArrayDefinition();

  @Nullable
  DefinitionEnumerationDefinition getEnumerationDefinition();

  @Nullable
  DefinitionPointerDefinition getPointerDefinition();

  @Nullable
  DefinitionPredefinedType getPredefinedType();

  @Nullable
  DefinitionProcedureTypeDefinition getProcedureTypeDefinition();

  @Nullable
  DefinitionRange getRange();

  @Nullable
  DefinitionRecordDefinition getRecordDefinition();

  @Nullable
  DefinitionSetDefinition getSetDefinition();

  @Nullable
  DefinitionTypeDesignator getTypeDesignator();

}
