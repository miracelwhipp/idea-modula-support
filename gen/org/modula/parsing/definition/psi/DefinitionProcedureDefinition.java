// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.modula.helpers.index.stubs.Procedure;
import org.modula.helpers.index.stubs.SymbolStubPsiElement;
import com.intellij.psi.StubBasedPsiElement;
import org.modula.helpers.index.stubs.ProcedureStub;

public interface DefinitionProcedureDefinition extends PsiElement, Procedure, SymbolStubPsiElement, StubBasedPsiElement<ProcedureStub> {

  @Nullable
  DefinitionExportNameDeclaration getExportNameDeclaration();

  @Nullable
  DefinitionParameters getParameters();

  @Nullable
  DefinitionProcedureAttributes getProcedureAttributes();

  @Nullable
  DefinitionProcedureModifiers getProcedureModifiers();

  @NotNull
  DefinitionProcedureName getProcedureName();

  @Nullable
  DefinitionTypeSpecification getTypeSpecification();

}
