// This is a generated file. Not intended for manual editing.
package org.modula.parsing.compile.time.p1.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.modula.parsing.psi.P1CompileTimeElementType;
import org.modula.parsing.psi.P1CompileTimeTokenType;
import org.modula.parsing.compile.time.psi.p1.impl.*;

public interface CompileTimeConditionTypes {

  IElementType CONJUNCTION = new P1CompileTimeElementType("CONJUNCTION");
  IElementType DISJUNCTION = new P1CompileTimeElementType("DISJUNCTION");
  IElementType NEGATION = new P1CompileTimeElementType("NEGATION");
  IElementType TERM = new P1CompileTimeElementType("TERM");

  IElementType AND = new P1CompileTimeTokenType("AND");
  IElementType CLOSE_BRACKET = new P1CompileTimeTokenType("CLOSE_BRACKET");
  IElementType FALSE = new P1CompileTimeTokenType("FALSE");
  IElementType NOT = new P1CompileTimeTokenType("NOT");
  IElementType OPEN_BRACKET = new P1CompileTimeTokenType("OPEN_BRACKET");
  IElementType OR = new P1CompileTimeTokenType("OR");
  IElementType TAG = new P1CompileTimeTokenType("TAG");
  IElementType TRUE = new P1CompileTimeTokenType("TRUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == CONJUNCTION) {
        return new P1CompileTimeConditionConjunctionImpl(node);
      }
      else if (type == DISJUNCTION) {
        return new P1CompileTimeConditionDisjunctionImpl(node);
      }
      else if (type == NEGATION) {
        return new P1CompileTimeConditionNegationImpl(node);
      }
      else if (type == TERM) {
        return new P1CompileTimeConditionTermImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
