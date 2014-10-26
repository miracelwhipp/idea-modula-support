// This is a generated file. Not intended for manual editing.
package org.modula.parsing.compile.time.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.modula.parsing.psi.CompileTimeElementType;
import org.modula.parsing.psi.CompileTimeTokenType;
import org.modula.parsing.compile.time.psi.impl.*;

public interface CompileTimeConditionTypes {

  IElementType CONJUNCTION = new CompileTimeElementType("CONJUNCTION");
  IElementType DISJUNCTION = new CompileTimeElementType("DISJUNCTION");
  IElementType NEGATION = new CompileTimeElementType("NEGATION");
  IElementType TERM = new CompileTimeElementType("TERM");

  IElementType AND = new CompileTimeTokenType("AND");
  IElementType CLOSE_BRACKET = new CompileTimeTokenType("CLOSE_BRACKET");
  IElementType FALSE = new CompileTimeTokenType("FALSE");
  IElementType NOT = new CompileTimeTokenType("NOT");
  IElementType OPEN_BRACKET = new CompileTimeTokenType("OPEN_BRACKET");
  IElementType OR = new CompileTimeTokenType("OR");
  IElementType TAG = new CompileTimeTokenType("TAG");
  IElementType TRUE = new CompileTimeTokenType("TRUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == CONJUNCTION) {
        return new CompileTimeConditionConjunctionImpl(node);
      }
      else if (type == DISJUNCTION) {
        return new CompileTimeConditionDisjunctionImpl(node);
      }
      else if (type == NEGATION) {
        return new CompileTimeConditionNegationImpl(node);
      }
      else if (type == TERM) {
        return new CompileTimeConditionTermImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
