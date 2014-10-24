// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionDeclaration extends PsiElement {

  @NotNull
  List<DefinitionConstantDeclaration> getConstantDeclarationList();

  @Nullable
  DefinitionModuleDeclaration getModuleDeclaration();

  @Nullable
  DefinitionProcedureDeclaration getProcedureDeclaration();

  @NotNull
  List<DefinitionTypeDeclaration> getTypeDeclarationList();

  @NotNull
  List<DefinitionVariableDeclaration> getVariableDeclarationList();

}
