// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaDefinitionModule extends PsiElement {

  @NotNull
  List<ModulaDefinitions> getDefinitionsList();

  @NotNull
  ModulaIdent getIdent();

  @NotNull
  List<ModulaImportClause> getImportClauseList();

  @NotNull
  ModulaModuleHeader getModuleHeader();

}
