// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionDefinitionModule extends PsiElement {

  @NotNull
  List<DefinitionDefinitions> getDefinitionsList();

  @NotNull
  DefinitionIdent getIdent();

  @NotNull
  List<DefinitionImportClause> getImportClauseList();

  @NotNull
  DefinitionModuleHeader getModuleHeader();

}
