// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionStatement extends PsiElement {

  @Nullable
  DefinitionCaseStatement getCaseStatement();

  @Nullable
  DefinitionForStatement getForStatement();

  @Nullable
  DefinitionIfStatement getIfStatement();

  @Nullable
  DefinitionLoopStatement getLoopStatement();

  @Nullable
  DefinitionProcedureCall getProcedureCall();

  @Nullable
  DefinitionRepeatStatement getRepeatStatement();

  @Nullable
  DefinitionWhileStatement getWhileStatement();

  @Nullable
  DefinitionWithStatement getWithStatement();

  @Nullable
  DefinitionAssignment getAssignment();

  @Nullable
  DefinitionExpression getExpression();

}
