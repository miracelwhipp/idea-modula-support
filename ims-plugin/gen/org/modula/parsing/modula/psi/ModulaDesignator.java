// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaDesignator extends PsiElement {

  @NotNull
  List<ModulaArraySelection> getArraySelectionList();

  @NotNull
  List<ModulaCoercionQualifier> getCoercionQualifierList();

  @NotNull
  ModulaIdent getIdent();

  @NotNull
  List<ModulaRecordSelection> getRecordSelectionList();

}
