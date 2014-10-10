// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DefinitionLiteral extends PsiElement {

  @Nullable
  DefinitionComplexLiteral getComplexLiteral();

  @Nullable
  DefinitionEnumerationMemberDesignator getEnumerationMemberDesignator();

  @Nullable
  DefinitionIntegerLiteral getIntegerLiteral();

  @Nullable
  DefinitionRealLiteral getRealLiteral();

  @Nullable
  DefinitionSetLiteral getSetLiteral();

}
