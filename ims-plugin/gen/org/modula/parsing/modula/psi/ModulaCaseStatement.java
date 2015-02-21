// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaCaseStatement extends PsiElement {

  @NotNull
  List<ModulaCaseStatements> getCaseStatementsList();

  @NotNull
  ModulaExpression getExpression();

  @NotNull
  List<ModulaStatement> getStatementList();

}