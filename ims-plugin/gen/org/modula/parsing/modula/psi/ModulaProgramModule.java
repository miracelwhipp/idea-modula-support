// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaProgramModule extends PsiElement {

  @NotNull
  ModulaBlock getBlock();

  @NotNull
  ModulaIdent getIdent();

  @NotNull
  ModulaImportClause getImportClause();

  @NotNull
  ModulaProgramHeader getProgramHeader();

}
