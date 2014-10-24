// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionFPSection extends PsiElement {

  @NotNull
  DefinitionFormalType getFormalType();

  @NotNull
  DefinitionIdentList getIdentList();

  @Nullable
  DefinitionParameterModifier getParameterModifier();

  @Nullable
  DefinitionParameterValueModifier getParameterValueModifier();

}
