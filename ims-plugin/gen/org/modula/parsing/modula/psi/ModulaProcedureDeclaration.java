// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaProcedureDeclaration extends PsiElement {

  @NotNull
  ModulaProcedureHeading getProcedureHeading();

  @Nullable
  ModulaAssemblyBlock getAssemblyBlock();

  @NotNull
  ModulaIdent getIdent();

  @Nullable
  ModulaProcedureBlock getProcedureBlock();

}
