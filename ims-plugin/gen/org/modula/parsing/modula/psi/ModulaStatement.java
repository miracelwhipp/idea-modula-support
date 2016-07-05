// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaStatement extends PsiElement {

  @Nullable
  ModulaAsmStatement getAsmStatement();

  @Nullable
  ModulaCaseStatement getCaseStatement();

  @Nullable
  ModulaForStatement getForStatement();

  @Nullable
  ModulaFuncStatement getFuncStatement();

  @Nullable
  ModulaIfStatement getIfStatement();

  @Nullable
  ModulaLoopStatement getLoopStatement();

  @Nullable
  ModulaProcedureCall getProcedureCall();

  @Nullable
  ModulaRepeatStatement getRepeatStatement();

  @Nullable
  ModulaWhileStatement getWhileStatement();

  @Nullable
  ModulaWithStatement getWithStatement();

  @Nullable
  ModulaAssignment getAssignment();

  @Nullable
  ModulaRecoveringExpression getRecoveringExpression();

}
