// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaFPSection extends PsiElement {

  @NotNull
  ModulaFormalType getFormalType();

  @NotNull
  ModulaParameterIdentList getParameterIdentList();

  @Nullable
  ModulaParameterModifier getParameterModifier();

  @Nullable
  ModulaParameterValueModifier getParameterValueModifier();

}
