// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaFactor extends PsiElement {

  @Nullable
  ModulaActualParameters getActualParameters();

  @Nullable
  ModulaDesignator getDesignator();

  @Nullable
  ModulaExpression getExpression();

  @Nullable
  ModulaFactor getFactor();

  @Nullable
  ModulaNumber getNumber();

  @Nullable
  ModulaSetExpression getSetExpression();

  @Nullable
  ModulaString getString();

}
