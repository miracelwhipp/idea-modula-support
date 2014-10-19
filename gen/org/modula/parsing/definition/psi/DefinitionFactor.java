// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionFactor extends PsiElement {

  @Nullable
  DefinitionDesignator getDesignator();

  @NotNull
  List<DefinitionExpression> getExpressionList();

  @Nullable
  DefinitionFactor getFactor();

  @Nullable
  DefinitionNumber getNumber();

  @Nullable
  DefinitionSetExpression getSetExpression();

  @Nullable
  DefinitionString getString();

}
