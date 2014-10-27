// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.modula.helpers.index.stubs.Procedure;
import org.modula.helpers.index.stubs.SymbolStubPsiElement;
import com.intellij.psi.StubBasedPsiElement;
import org.modula.helpers.index.stubs.ProcedureStub;

public interface ModulaProcedureHeading extends PsiElement, Procedure, SymbolStubPsiElement, StubBasedPsiElement<ProcedureStub> {

  @Nullable
  ModulaFormalParameters getFormalParameters();

  @Nullable
  ModulaExportNameDeclaration getExportNameDeclaration();

  @NotNull
  ModulaIdent getIdent();

  @Nullable
  ModulaMacroDeclaration getMacroDeclaration();

  @Nullable
  ModulaProcedureAttributes getProcedureAttributes();

}
