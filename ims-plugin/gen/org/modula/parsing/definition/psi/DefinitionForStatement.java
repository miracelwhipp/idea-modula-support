// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionForStatement extends PsiElement {

  @NotNull
  DefinitionStatementSequence getStatementSequence();

  @NotNull
  List<DefinitionExpression> getExpressionList();

  @NotNull
  DefinitionIdent getIdent();

}
