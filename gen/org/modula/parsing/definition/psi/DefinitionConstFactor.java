// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionConstFactor extends PsiElement {

  @Nullable
  DefinitionConstExpression getConstExpression();

  @Nullable
  DefinitionConstFactor getConstFactor();

  @Nullable
  DefinitionDesignator getDesignator();

  @Nullable
  DefinitionNumber getNumber();

  @Nullable
  DefinitionSetExpression getSetExpression();

  @Nullable
  DefinitionString getString();

}
