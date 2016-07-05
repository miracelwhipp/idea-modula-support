// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaDeclaration extends PsiElement {

  @Nullable
  ModulaClassDeclaration getClassDeclaration();

  @Nullable
  ModulaConstantDeclarations getConstantDeclarations();

  @Nullable
  ModulaModuleDeclaration getModuleDeclaration();

  @Nullable
  ModulaProcedureDeclaration getProcedureDeclaration();

  @Nullable
  ModulaTypeDeclarations getTypeDeclarations();

  @Nullable
  ModulaVariableDeclarations getVariableDeclarations();

}
