// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaCaseStatement extends PsiElement {

  @Nullable
  ModulaStatementSequence getStatementSequence();

  @NotNull
  List<ModulaCaseStatements> getCaseStatementsList();

  @NotNull
  ModulaExpression getExpression();

}
