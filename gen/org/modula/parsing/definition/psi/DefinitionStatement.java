// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionStatement extends PsiElement {

  @Nullable
  DefinitionCaseStatement getCaseStatement();

  @Nullable
  DefinitionDoStatement getDoStatement();

  @Nullable
  DefinitionIfStatement getIfStatement();

  @Nullable
  DefinitionLoopStatement getLoopStatement();

  @Nullable
  DefinitionWhatever getWhatever();

}
