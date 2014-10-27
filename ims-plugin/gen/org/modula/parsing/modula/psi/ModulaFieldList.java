// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModulaFieldList extends PsiElement {

  @Nullable
  ModulaFieldListSequence getFieldListSequence();

  @Nullable
  ModulaIdentList getIdentList();

  @Nullable
  ModulaIdent getIdent();

  @Nullable
  ModulaQualident getQualident();

  @Nullable
  ModulaTypes getTypes();

  @NotNull
  List<ModulaVariant> getVariantList();

}
