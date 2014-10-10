// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.modula.parsing.definition.psi.ModulaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.modula.parsing.definition.psi.*;

public class DefinitionEnumerationMemberDefinitionImpl extends ASTWrapperPsiElement implements DefinitionEnumerationMemberDefinition {

  public DefinitionEnumerationMemberDefinitionImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public DefinitionEnumerationMemberName getEnumerationMemberName() {
    return findNotNullChildByClass(DefinitionEnumerationMemberName.class);
  }

  @Override
  @Nullable
  public DefinitionIntegerLiteral getIntegerLiteral() {
    return findChildByClass(DefinitionIntegerLiteral.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DefinitionVisitor) ((DefinitionVisitor)visitor).visitEnumerationMemberDefinition(this);
    else super.accept(visitor);
  }

}
