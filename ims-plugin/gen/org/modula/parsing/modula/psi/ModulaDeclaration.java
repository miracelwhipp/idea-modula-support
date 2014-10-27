// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaDeclaration extends PsiElement {

  @NotNull
  List<ModulaConstantDeclaration> getConstantDeclarationList();

  @Nullable
  ModulaModuleDeclaration getModuleDeclaration();

  @Nullable
  ModulaProcedureDeclaration getProcedureDeclaration();

  @NotNull
  List<ModulaTypeDeclaration> getTypeDeclarationList();

  @NotNull
  List<ModulaVariableDeclaration> getVariableDeclarationList();

}
