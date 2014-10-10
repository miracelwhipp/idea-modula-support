// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionFunctionCall extends PsiElement {

  @NotNull
  List<DefinitionCallParameter> getCallParameterList();

  @Nullable
  DefinitionExpressionValue getExpressionValue();

  @Nullable
  DefinitionFunctionDesignator getFunctionDesignator();

}
