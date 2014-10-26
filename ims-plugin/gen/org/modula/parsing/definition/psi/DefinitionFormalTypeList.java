// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionFormalTypeList extends PsiElement {

  @NotNull
  List<DefinitionFormalType> getFormalTypeList();

  @NotNull
  List<DefinitionParameterModifier> getParameterModifierList();

  @NotNull
  List<DefinitionParameterValueModifier> getParameterValueModifierList();

  @Nullable
  DefinitionQualident getQualident();

}
