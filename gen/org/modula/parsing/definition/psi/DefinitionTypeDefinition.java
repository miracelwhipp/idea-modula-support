// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.modula.helpers.index.stubs.Type;
import org.modula.helpers.index.stubs.SymbolStubPsiElement;
import com.intellij.psi.StubBasedPsiElement;
import org.modula.helpers.index.stubs.TypeStub;

public interface DefinitionTypeDefinition extends PsiElement, Type, SymbolStubPsiElement, StubBasedPsiElement<TypeStub> {

  @Nullable
  DefinitionOpaqueTypeDefinition getOpaqueTypeDefinition();

  @Nullable
  DefinitionTypeAliasDefinition getTypeAliasDefinition();

}
