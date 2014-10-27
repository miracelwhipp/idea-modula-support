// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaQualident extends PsiElement {

  @Nullable
  ModulaBasicType getBasicType();

  @NotNull
  List<ModulaIdent> getIdentList();

  @Nullable
  ModulaStonyBrookType getStonyBrookType();

}
