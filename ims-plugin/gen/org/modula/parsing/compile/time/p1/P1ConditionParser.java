// This is a generated file. Not intended for manual editing.
package org.modula.parsing.compile.time.p1;

import org.jetbrains.annotations.*;
import com.intellij.lang.LighterASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static org.modula.parsing.compile.time.p1.psi.CompileTimeConditionTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class P1ConditionParser implements PsiParser {

  public static Logger LOG_ = Logger.getInstance("org.modula.parsing.compile.time.p1.P1ConditionParser");

  @NotNull
  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    int level_ = 0;
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this);
    if (root_ == CONJUNCTION) {
      result_ = conjunction(builder_, level_ + 1);
    }
    else if (root_ == DISJUNCTION) {
      result_ = disjunction(builder_, level_ + 1);
    }
    else if (root_ == NEGATION) {
      result_ = negation(builder_, level_ + 1);
    }
    else if (root_ == TERM) {
      result_ = term(builder_, level_ + 1);
    }
    else {
      Marker marker_ = builder_.mark();
      enterErrorRecordingSection(builder_, level_, _SECTION_RECOVER_, null);
      result_ = parse_root_(root_, builder_, level_);
      exitErrorRecordingSection(builder_, level_, result_, true, _SECTION_RECOVER_, TOKEN_ADVANCER);
      marker_.done(root_);
    }
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return condition(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // disjunction
  static boolean condition(PsiBuilder builder_, int level_) {
    return disjunction(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // negation AND conjunction | negation
  public static boolean conjunction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conjunction")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<conjunction>");
    result_ = conjunction_0(builder_, level_ + 1);
    if (!result_) result_ = negation(builder_, level_ + 1);
    if (result_) {
      marker_.done(CONJUNCTION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // negation AND conjunction
  private static boolean conjunction_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conjunction_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = negation(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, AND);
    result_ = result_ && conjunction(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // conjunction OR disjunction | conjunction
  public static boolean disjunction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "disjunction")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<disjunction>");
    result_ = disjunction_0(builder_, level_ + 1);
    if (!result_) result_ = conjunction(builder_, level_ + 1);
    if (result_) {
      marker_.done(DISJUNCTION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // conjunction OR disjunction
  private static boolean disjunction_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "disjunction_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = conjunction(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OR);
    result_ = result_ && disjunction(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // NOT negation | term
  public static boolean negation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "negation")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<negation>");
    result_ = negation_0(builder_, level_ + 1);
    if (!result_) result_ = term(builder_, level_ + 1);
    if (result_) {
      marker_.done(NEGATION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // NOT negation
  private static boolean negation_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "negation_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, NOT);
    result_ = result_ && negation(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // TAG | TRUE | FALSE | OPEN_BRACKET disjunction CLOSE_BRACKET
  public static boolean term(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<term>");
    result_ = consumeToken(builder_, TAG);
    if (!result_) result_ = consumeToken(builder_, TRUE);
    if (!result_) result_ = consumeToken(builder_, FALSE);
    if (!result_) result_ = term_3(builder_, level_ + 1);
    if (result_) {
      marker_.done(TERM);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // OPEN_BRACKET disjunction CLOSE_BRACKET
  private static boolean term_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, OPEN_BRACKET);
    result_ = result_ && disjunction(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACKET);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

}
