// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaBlock extends PsiElement {

  @NotNull
  List<ModulaDeclaration> getDeclarationList();

  @NotNull
  List<ModulaStatement> getStatementList();

}
