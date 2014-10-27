// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaFormalTypeList extends PsiElement {

  @NotNull
  List<ModulaFormalType> getFormalTypeList();

  @NotNull
  List<ModulaParameterModifier> getParameterModifierList();

  @NotNull
  List<ModulaParameterValueModifier> getParameterValueModifierList();

  @Nullable
  ModulaQualident getQualident();

}
