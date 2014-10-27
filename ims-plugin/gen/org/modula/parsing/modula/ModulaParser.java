// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static org.modula.parsing.modula.psi.TokenModulaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ModulaParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("org.modula.parsing.modula.ModulaParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ACTUAL_PARAMETERS) {
      result_ = ActualParameters(builder_, 0);
    }
    else if (root_ == ARRAY_TYPE) {
      result_ = ArrayType(builder_, 0);
    }
    else if (root_ == CASE_LABEL_LIST) {
      result_ = CaseLabelList(builder_, 0);
    }
    else if (root_ == CASE_LABELS) {
      result_ = CaseLabels(builder_, 0);
    }
    else if (root_ == CASE_STATEMENT) {
      result_ = CaseStatement(builder_, 0);
    }
    else if (root_ == COMPILATION_UNIT) {
      result_ = CompilationUnit(builder_, 0);
    }
    else if (root_ == CONSTANT_DECLARATION) {
      result_ = ConstantDeclaration(builder_, 0);
    }
    else if (root_ == DEFINITION_MODULE) {
      result_ = DefinitionModule(builder_, 0);
    }
    else if (root_ == EXP_LIST) {
      result_ = ExpList(builder_, 0);
    }
    else if (root_ == FP_SECTION) {
      result_ = FPSection(builder_, 0);
    }
    else if (root_ == FIELD_LIST) {
      result_ = FieldList(builder_, 0);
    }
    else if (root_ == FIELD_LIST_SEQUENCE) {
      result_ = FieldListSequence(builder_, 0);
    }
    else if (root_ == FOR_STATEMENT) {
      result_ = ForStatement(builder_, 0);
    }
    else if (root_ == FORMAL_PARAMETERS) {
      result_ = FormalParameters(builder_, 0);
    }
    else if (root_ == FORMAL_TYPE) {
      result_ = FormalType(builder_, 0);
    }
    else if (root_ == FORMAL_TYPE_LIST) {
      result_ = FormalTypeList(builder_, 0);
    }
    else if (root_ == IDENT_LIST) {
      result_ = IdentList(builder_, 0);
    }
    else if (root_ == IF_STATEMENT) {
      result_ = IfStatement(builder_, 0);
    }
    else if (root_ == LOOP_STATEMENT) {
      result_ = LoopStatement(builder_, 0);
    }
    else if (root_ == MODULE_DECLARATION) {
      result_ = ModuleDeclaration(builder_, 0);
    }
    else if (root_ == POINTER_TYPE) {
      result_ = PointerType(builder_, 0);
    }
    else if (root_ == PROCEDURE_CALL) {
      result_ = ProcedureCall(builder_, 0);
    }
    else if (root_ == PROCEDURE_DECLARATION) {
      result_ = ProcedureDeclaration(builder_, 0);
    }
    else if (root_ == PROCEDURE_HEADING) {
      result_ = ProcedureHeading(builder_, 0);
    }
    else if (root_ == PROCEDURE_TYPE) {
      result_ = ProcedureType(builder_, 0);
    }
    else if (root_ == PROGRAM_MODULE) {
      result_ = ProgramModule(builder_, 0);
    }
    else if (root_ == RECORD_TYPE) {
      result_ = RecordType(builder_, 0);
    }
    else if (root_ == REPEAT_STATEMENT) {
      result_ = RepeatStatement(builder_, 0);
    }
    else if (root_ == SET_TYPE) {
      result_ = SetType(builder_, 0);
    }
    else if (root_ == SIMPLE_TYPE) {
      result_ = SimpleType(builder_, 0);
    }
    else if (root_ == STATEMENT_SEQUENCE) {
      result_ = StatementSequence(builder_, 0);
    }
    else if (root_ == SUB_RANGE_TYPE) {
      result_ = SubRangeType(builder_, 0);
    }
    else if (root_ == TYPE_DECLARATION) {
      result_ = TypeDeclaration(builder_, 0);
    }
    else if (root_ == VARIABLE_DECLARATION) {
      result_ = VariableDeclaration(builder_, 0);
    }
    else if (root_ == WHILE_STATEMENT) {
      result_ = WhileStatement(builder_, 0);
    }
    else if (root_ == WITH_STATEMENT) {
      result_ = WithStatement(builder_, 0);
    }
    else if (root_ == ARRAY_RANGE_TYPE) {
      result_ = array_range_type(builder_, 0);
    }
    else if (root_ == ASSIGNMENT) {
      result_ = assignment(builder_, 0);
    }
    else if (root_ == ATTRIBUTE) {
      result_ = attribute(builder_, 0);
    }
    else if (root_ == BASIC_TYPE) {
      result_ = basic_type(builder_, 0);
    }
    else if (root_ == BLOCK) {
      result_ = block(builder_, 0);
    }
    else if (root_ == CASE_STATEMENTS) {
      result_ = caseStatements(builder_, 0);
    }
    else if (root_ == COMPLEX_LITERAL) {
      result_ = complex_literal(builder_, 0);
    }
    else if (root_ == DECLARATION) {
      result_ = declaration(builder_, 0);
    }
    else if (root_ == DEFINITIONS) {
      result_ = definitions(builder_, 0);
    }
    else if (root_ == DESIGNATOR) {
      result_ = designator(builder_, 0);
    }
    else if (root_ == ELEMENT) {
      result_ = element(builder_, 0);
    }
    else if (root_ == ENUMERATION_DEFINITION) {
      result_ = enumeration_definition(builder_, 0);
    }
    else if (root_ == ENUMERATION_MEMBER_DEFINITION) {
      result_ = enumeration_member_definition(builder_, 0);
    }
    else if (root_ == ENUMERATION_MEMBER_NAME) {
      result_ = enumeration_member_name(builder_, 0);
    }
    else if (root_ == EXPORT_CLAUSE) {
      result_ = export_clause(builder_, 0);
    }
    else if (root_ == EXPORT_NAME_DECLARATION) {
      result_ = export_name_declaration(builder_, 0);
    }
    else if (root_ == EXPRESSION) {
      result_ = expression(builder_, 0);
    }
    else if (root_ == FACTOR) {
      result_ = factor(builder_, 0);
    }
    else if (root_ == IDENT) {
      result_ = ident(builder_, 0);
    }
    else if (root_ == IGNORED) {
      result_ = ignored(builder_, 0);
    }
    else if (root_ == IMPORT_CLAUSE) {
      result_ = import_clause(builder_, 0);
    }
    else if (root_ == IMPORT_SYMBOL) {
      result_ = import_symbol(builder_, 0);
    }
    else if (root_ == INTEGER_LITERAL) {
      result_ = integer_literal(builder_, 0);
    }
    else if (root_ == MACRO_DECLARATION) {
      result_ = macro_declaration(builder_, 0);
    }
    else if (root_ == MODULE_HEADER) {
      result_ = module_header(builder_, 0);
    }
    else if (root_ == MODULE_IMPORT) {
      result_ = module_import(builder_, 0);
    }
    else if (root_ == MODULE_IMPORT_CLAUSE) {
      result_ = module_import_clause(builder_, 0);
    }
    else if (root_ == MODULE_NAME) {
      result_ = module_name(builder_, 0);
    }
    else if (root_ == NUMBER) {
      result_ = number(builder_, 0);
    }
    else if (root_ == PARAMETER_MODIFIER) {
      result_ = parameter_modifier(builder_, 0);
    }
    else if (root_ == PARAMETER_VALUE_MODIFIER) {
      result_ = parameter_value_modifier(builder_, 0);
    }
    else if (root_ == PRIORITY) {
      result_ = priority(builder_, 0);
    }
    else if (root_ == PROCEDURE_ATTRIBUTES) {
      result_ = procedure_attributes(builder_, 0);
    }
    else if (root_ == PROCEDURE_MODIFIERS) {
      result_ = procedure_modifiers(builder_, 0);
    }
    else if (root_ == PROGRAM_HEADER) {
      result_ = program_header(builder_, 0);
    }
    else if (root_ == QUALIDENT) {
      result_ = qualident(builder_, 0);
    }
    else if (root_ == REAL_LITERAL) {
      result_ = real_literal(builder_, 0);
    }
    else if (root_ == RECOVER_END_OF_STATEMENT) {
      result_ = recover_end_of_statement(builder_, 0);
    }
    else if (root_ == RECOVER_WHILE_STATEMENT) {
      result_ = recover_while_statement(builder_, 0);
    }
    else if (root_ == SET_EXPRESSION) {
      result_ = set_expression(builder_, 0);
    }
    else if (root_ == SIMPLE_EXPRESSION) {
      result_ = simple_expression(builder_, 0);
    }
    else if (root_ == STATEMENT) {
      result_ = statement(builder_, 0);
    }
    else if (root_ == STONY_BROOK_TYPE) {
      result_ = stony_brook_type(builder_, 0);
    }
    else if (root_ == STRING) {
      result_ = string(builder_, 0);
    }
    else if (root_ == SYMBOL_IMPORT_CLAUSE) {
      result_ = symbol_import_clause(builder_, 0);
    }
    else if (root_ == TERM) {
      result_ = term(builder_, 0);
    }
    else if (root_ == TYPE_DEFINITION) {
      result_ = type_definition(builder_, 0);
    }
    else if (root_ == TYPES) {
      result_ = types(builder_, 0);
    }
    else if (root_ == VARIABLE_MODIFIERS) {
      result_ = variable_modifiers(builder_, 0);
    }
    else if (root_ == VARIABLE_NAME_DEFINITION) {
      result_ = variable_name_definition(builder_, 0);
    }
    else if (root_ == VARIANT) {
      result_ = variant(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return root(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // OPEN_BRACE (ExpList)? CLOSE_BRACE
  public static boolean ActualParameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ActualParameters")) return false;
    if (!nextTokenIs(builder_, OPEN_BRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && ActualParameters_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, ACTUAL_PARAMETERS, result_);
    return result_;
  }

  // (ExpList)?
  private static boolean ActualParameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ActualParameters_1")) return false;
    ActualParameters_1_0(builder_, level_ + 1);
    return true;
  }

  // (ExpList)
  private static boolean ActualParameters_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ActualParameters_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ExpList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ARRAY array_range_type (COMMA array_range_type)* OF types
  public static boolean ArrayType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayType")) return false;
    if (!nextTokenIs(builder_, ARRAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ARRAY);
    result_ = result_ && array_range_type(builder_, level_ + 1);
    result_ = result_ && ArrayType_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OF);
    result_ = result_ && types(builder_, level_ + 1);
    exit_section_(builder_, marker_, ARRAY_TYPE, result_);
    return result_;
  }

  // (COMMA array_range_type)*
  private static boolean ArrayType_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayType_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ArrayType_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ArrayType_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA array_range_type
  private static boolean ArrayType_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayType_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && array_range_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CaseLabels (COMMA CaseLabels)*
  public static boolean CaseLabelList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseLabelList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<case label list>");
    result_ = CaseLabels(builder_, level_ + 1);
    result_ = result_ && CaseLabelList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CASE_LABEL_LIST, result_, false, null);
    return result_;
  }

  // (COMMA CaseLabels)*
  private static boolean CaseLabelList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseLabelList_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!CaseLabelList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "CaseLabelList_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA CaseLabels
  private static boolean CaseLabelList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseLabelList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && CaseLabels(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expression (RANGE_OPERATOR expression)*
  public static boolean CaseLabels(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseLabels")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<case labels>");
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && CaseLabels_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CASE_LABELS, result_, false, null);
    return result_;
  }

  // (RANGE_OPERATOR expression)*
  private static boolean CaseLabels_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseLabels_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!CaseLabels_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "CaseLabels_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // RANGE_OPERATOR expression
  private static boolean CaseLabels_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseLabels_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RANGE_OPERATOR);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CASE expression OF caseStatements (PIPE caseStatements)* (ELSE StatementSequence)? END
  public static boolean CaseStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseStatement")) return false;
    if (!nextTokenIs(builder_, CASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CASE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OF);
    result_ = result_ && caseStatements(builder_, level_ + 1);
    result_ = result_ && CaseStatement_4(builder_, level_ + 1);
    result_ = result_ && CaseStatement_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, CASE_STATEMENT, result_);
    return result_;
  }

  // (PIPE caseStatements)*
  private static boolean CaseStatement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseStatement_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!CaseStatement_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "CaseStatement_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // PIPE caseStatements
  private static boolean CaseStatement_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseStatement_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PIPE);
    result_ = result_ && caseStatements(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (ELSE StatementSequence)?
  private static boolean CaseStatement_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseStatement_5")) return false;
    CaseStatement_5_0(builder_, level_ + 1);
    return true;
  }

  // ELSE StatementSequence
  private static boolean CaseStatement_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseStatement_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && StatementSequence(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DefinitionModule | [IMPLEMENTATION] ProgramModule
  public static boolean CompilationUnit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CompilationUnit")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<compilation unit>");
    result_ = DefinitionModule(builder_, level_ + 1);
    if (!result_) result_ = CompilationUnit_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, COMPILATION_UNIT, result_, false, null);
    return result_;
  }

  // [IMPLEMENTATION] ProgramModule
  private static boolean CompilationUnit_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CompilationUnit_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = CompilationUnit_1_0(builder_, level_ + 1);
    result_ = result_ && ProgramModule(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [IMPLEMENTATION]
  private static boolean CompilationUnit_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CompilationUnit_1_0")) return false;
    consumeToken(builder_, IMPLEMENTATION);
    return true;
  }

  /* ********************************************************** */
  // ident EQUALITY_OPERATOR expression
  public static boolean ConstantDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstantDeclaration")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUALITY_OPERATOR);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONSTANT_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // module_header END_OF_STATEMENT (import_clause)* (definitions)* END ident DOT
  public static boolean DefinitionModule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DefinitionModule")) return false;
    if (!nextTokenIs(builder_, "<definition module>", DEFINITION, UNSAFEGUARDED)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<definition module>");
    result_ = module_header(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    result_ = result_ && DefinitionModule_2(builder_, level_ + 1);
    result_ = result_ && DefinitionModule_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, level_, marker_, DEFINITION_MODULE, result_, false, null);
    return result_;
  }

  // (import_clause)*
  private static boolean DefinitionModule_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DefinitionModule_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!DefinitionModule_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "DefinitionModule_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (import_clause)
  private static boolean DefinitionModule_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DefinitionModule_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = import_clause(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (definitions)*
  private static boolean DefinitionModule_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DefinitionModule_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!DefinitionModule_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "DefinitionModule_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (definitions)
  private static boolean DefinitionModule_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DefinitionModule_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = definitions(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expression (COMMA expression)*
  public static boolean ExpList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExpList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<exp list>");
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && ExpList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXP_LIST, result_, false, null);
    return result_;
  }

  // (COMMA expression)*
  private static boolean ExpList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExpList_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ExpList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ExpList_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA expression
  private static boolean ExpList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExpList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (parameter_modifier)? IdentList TYPING_OPERATOR (parameter_value_modifier)? (ARRAY OF)* FormalType
  public static boolean FPSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FPSection")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<fp section>");
    result_ = FPSection_0(builder_, level_ + 1);
    result_ = result_ && IdentList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && FPSection_3(builder_, level_ + 1);
    result_ = result_ && FPSection_4(builder_, level_ + 1);
    result_ = result_ && FormalType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FP_SECTION, result_, false, null);
    return result_;
  }

  // (parameter_modifier)?
  private static boolean FPSection_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FPSection_0")) return false;
    FPSection_0_0(builder_, level_ + 1);
    return true;
  }

  // (parameter_modifier)
  private static boolean FPSection_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FPSection_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter_modifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (parameter_value_modifier)?
  private static boolean FPSection_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FPSection_3")) return false;
    FPSection_3_0(builder_, level_ + 1);
    return true;
  }

  // (parameter_value_modifier)
  private static boolean FPSection_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FPSection_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter_value_modifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (ARRAY OF)*
  private static boolean FPSection_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FPSection_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!FPSection_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "FPSection_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ARRAY OF
  private static boolean FPSection_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FPSection_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ARRAY, OF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (IdentList TYPING_OPERATOR types | CASE ident TYPING_OPERATOR qualident OF variant (PIPE variant)* (ELSE FieldListSequence)? END)?
  public static boolean FieldList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldList")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<field list>");
    FieldList_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FIELD_LIST, true, false, null);
    return true;
  }

  // IdentList TYPING_OPERATOR types | CASE ident TYPING_OPERATOR qualident OF variant (PIPE variant)* (ELSE FieldListSequence)? END
  private static boolean FieldList_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldList_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = FieldList_0_0(builder_, level_ + 1);
    if (!result_) result_ = FieldList_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IdentList TYPING_OPERATOR types
  private static boolean FieldList_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldList_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = IdentList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && types(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // CASE ident TYPING_OPERATOR qualident OF variant (PIPE variant)* (ELSE FieldListSequence)? END
  private static boolean FieldList_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldList_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CASE);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && qualident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OF);
    result_ = result_ && variant(builder_, level_ + 1);
    result_ = result_ && FieldList_0_1_6(builder_, level_ + 1);
    result_ = result_ && FieldList_0_1_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (PIPE variant)*
  private static boolean FieldList_0_1_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldList_0_1_6")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!FieldList_0_1_6_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "FieldList_0_1_6", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // PIPE variant
  private static boolean FieldList_0_1_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldList_0_1_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PIPE);
    result_ = result_ && variant(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (ELSE FieldListSequence)?
  private static boolean FieldList_0_1_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldList_0_1_7")) return false;
    FieldList_0_1_7_0(builder_, level_ + 1);
    return true;
  }

  // ELSE FieldListSequence
  private static boolean FieldList_0_1_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldList_0_1_7_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && FieldListSequence(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // FieldList (END_OF_STATEMENT FieldList)*
  public static boolean FieldListSequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldListSequence")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<field list sequence>");
    result_ = FieldList(builder_, level_ + 1);
    result_ = result_ && FieldListSequence_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FIELD_LIST_SEQUENCE, result_, false, null);
    return result_;
  }

  // (END_OF_STATEMENT FieldList)*
  private static boolean FieldListSequence_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldListSequence_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!FieldListSequence_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "FieldListSequence_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // END_OF_STATEMENT FieldList
  private static boolean FieldListSequence_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FieldListSequence_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, END_OF_STATEMENT);
    result_ = result_ && FieldList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // FOR ident ASSIGNMENT_OPERATOR expression TO expression (FOR_LOOP_INCREMENT expression)? DO StatementSequence END
  public static boolean ForStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForStatement")) return false;
    if (!nextTokenIs(builder_, FOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FOR);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGNMENT_OPERATOR);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TO);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && ForStatement_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DO);
    result_ = result_ && StatementSequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, FOR_STATEMENT, result_);
    return result_;
  }

  // (FOR_LOOP_INCREMENT expression)?
  private static boolean ForStatement_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForStatement_6")) return false;
    ForStatement_6_0(builder_, level_ + 1);
    return true;
  }

  // FOR_LOOP_INCREMENT expression
  private static boolean ForStatement_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForStatement_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FOR_LOOP_INCREMENT);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // OPEN_BRACE (FPSection (END_OF_STATEMENT FPSection)*)? CLOSE_BRACE (TYPING_OPERATOR qualident)?
  public static boolean FormalParameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameters")) return false;
    if (!nextTokenIs(builder_, OPEN_BRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && FormalParameters_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    result_ = result_ && FormalParameters_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, FORMAL_PARAMETERS, result_);
    return result_;
  }

  // (FPSection (END_OF_STATEMENT FPSection)*)?
  private static boolean FormalParameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameters_1")) return false;
    FormalParameters_1_0(builder_, level_ + 1);
    return true;
  }

  // FPSection (END_OF_STATEMENT FPSection)*
  private static boolean FormalParameters_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameters_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = FPSection(builder_, level_ + 1);
    result_ = result_ && FormalParameters_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (END_OF_STATEMENT FPSection)*
  private static boolean FormalParameters_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameters_1_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!FormalParameters_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "FormalParameters_1_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // END_OF_STATEMENT FPSection
  private static boolean FormalParameters_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameters_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, END_OF_STATEMENT);
    result_ = result_ && FPSection(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (TYPING_OPERATOR qualident)?
  private static boolean FormalParameters_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameters_3")) return false;
    FormalParameters_3_0(builder_, level_ + 1);
    return true;
  }

  // TYPING_OPERATOR qualident
  private static boolean FormalParameters_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameters_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && qualident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (ARRAY OF)? qualident
  public static boolean FormalType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<formal type>");
    result_ = FormalType_0(builder_, level_ + 1);
    result_ = result_ && qualident(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FORMAL_TYPE, result_, false, null);
    return result_;
  }

  // (ARRAY OF)?
  private static boolean FormalType_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalType_0")) return false;
    FormalType_0_0(builder_, level_ + 1);
    return true;
  }

  // ARRAY OF
  private static boolean FormalType_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalType_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ARRAY, OF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // OPEN_BRACE (parameter_modifier? (parameter_value_modifier)? FormalType (COMMA parameter_modifier? (parameter_value_modifier)? FormalType)*)? CLOSE_BRACE (TYPING_OPERATOR qualident)?
  public static boolean FormalTypeList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalTypeList")) return false;
    if (!nextTokenIs(builder_, OPEN_BRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && FormalTypeList_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    result_ = result_ && FormalTypeList_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, FORMAL_TYPE_LIST, result_);
    return result_;
  }

  // (parameter_modifier? (parameter_value_modifier)? FormalType (COMMA parameter_modifier? (parameter_value_modifier)? FormalType)*)?
  private static boolean FormalTypeList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalTypeList_1")) return false;
    FormalTypeList_1_0(builder_, level_ + 1);
    return true;
  }

  // parameter_modifier? (parameter_value_modifier)? FormalType (COMMA parameter_modifier? (parameter_value_modifier)? FormalType)*
  private static boolean FormalTypeList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalTypeList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = FormalTypeList_1_0_0(builder_, level_ + 1);
    result_ = result_ && FormalTypeList_1_0_1(builder_, level_ + 1);
    result_ = result_ && FormalType(builder_, level_ + 1);
    result_ = result_ && FormalTypeList_1_0_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // parameter_modifier?
  private static boolean FormalTypeList_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalTypeList_1_0_0")) return false;
    parameter_modifier(builder_, level_ + 1);
    return true;
  }

  // (parameter_value_modifier)?
  private static boolean FormalTypeList_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalTypeList_1_0_1")) return false;
    FormalTypeList_1_0_1_0(builder_, level_ + 1);
    return true;
  }

  // (parameter_value_modifier)
  private static boolean FormalTypeList_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalTypeList_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter_value_modifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA parameter_modifier? (parameter_value_modifier)? FormalType)*
  private static boolean FormalTypeList_1_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalTypeList_1_0_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!FormalTypeList_1_0_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "FormalTypeList_1_0_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA parameter_modifier? (parameter_value_modifier)? FormalType
  private static boolean FormalTypeList_1_0_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalTypeList_1_0_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && FormalTypeList_1_0_3_0_1(builder_, level_ + 1);
    result_ = result_ && FormalTypeList_1_0_3_0_2(builder_, level_ + 1);
    result_ = result_ && FormalType(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // parameter_modifier?
  private static boolean FormalTypeList_1_0_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalTypeList_1_0_3_0_1")) return false;
    parameter_modifier(builder_, level_ + 1);
    return true;
  }

  // (parameter_value_modifier)?
  private static boolean FormalTypeList_1_0_3_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalTypeList_1_0_3_0_2")) return false;
    FormalTypeList_1_0_3_0_2_0(builder_, level_ + 1);
    return true;
  }

  // (parameter_value_modifier)
  private static boolean FormalTypeList_1_0_3_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalTypeList_1_0_3_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter_value_modifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (TYPING_OPERATOR qualident)?
  private static boolean FormalTypeList_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalTypeList_3")) return false;
    FormalTypeList_3_0(builder_, level_ + 1);
    return true;
  }

  // TYPING_OPERATOR qualident
  private static boolean FormalTypeList_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalTypeList_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && qualident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ident (COMMA ident)*
  public static boolean IdentList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IdentList")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ident(builder_, level_ + 1);
    result_ = result_ && IdentList_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, IDENT_LIST, result_);
    return result_;
  }

  // (COMMA ident)*
  private static boolean IdentList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IdentList_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!IdentList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "IdentList_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA ident
  private static boolean IdentList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IdentList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IF expression THEN StatementSequence (ELSIF expression THEN StatementSequence)* (ELSE StatementSequence)? END
  public static boolean IfStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement")) return false;
    if (!nextTokenIs(builder_, IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IF);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, THEN);
    result_ = result_ && StatementSequence(builder_, level_ + 1);
    result_ = result_ && IfStatement_4(builder_, level_ + 1);
    result_ = result_ && IfStatement_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, IF_STATEMENT, result_);
    return result_;
  }

  // (ELSIF expression THEN StatementSequence)*
  private static boolean IfStatement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!IfStatement_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "IfStatement_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ELSIF expression THEN StatementSequence
  private static boolean IfStatement_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSIF);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, THEN);
    result_ = result_ && StatementSequence(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (ELSE StatementSequence)?
  private static boolean IfStatement_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement_5")) return false;
    IfStatement_5_0(builder_, level_ + 1);
    return true;
  }

  // ELSE StatementSequence
  private static boolean IfStatement_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && StatementSequence(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LOOP StatementSequence END
  public static boolean LoopStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LoopStatement")) return false;
    if (!nextTokenIs(builder_, LOOP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LOOP);
    result_ = result_ && StatementSequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, LOOP_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // MODULE ident END_OF_STATEMENT (import_clause)* (export_clause)? block ident
  public static boolean ModuleDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ModuleDeclaration")) return false;
    if (!nextTokenIs(builder_, MODULE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MODULE);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    result_ = result_ && ModuleDeclaration_3(builder_, level_ + 1);
    result_ = result_ && ModuleDeclaration_4(builder_, level_ + 1);
    result_ = result_ && block(builder_, level_ + 1);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, MODULE_DECLARATION, result_);
    return result_;
  }

  // (import_clause)*
  private static boolean ModuleDeclaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ModuleDeclaration_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ModuleDeclaration_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ModuleDeclaration_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (import_clause)
  private static boolean ModuleDeclaration_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ModuleDeclaration_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = import_clause(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (export_clause)?
  private static boolean ModuleDeclaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ModuleDeclaration_4")) return false;
    ModuleDeclaration_4_0(builder_, level_ + 1);
    return true;
  }

  // (export_clause)
  private static boolean ModuleDeclaration_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ModuleDeclaration_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = export_clause(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // POINTER TO types
  public static boolean PointerType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PointerType")) return false;
    if (!nextTokenIs(builder_, POINTER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, POINTER, TO);
    result_ = result_ && types(builder_, level_ + 1);
    exit_section_(builder_, marker_, POINTER_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // designator (ActualParameters)?
  public static boolean ProcedureCall(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureCall")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<procedure call>");
    result_ = designator(builder_, level_ + 1);
    result_ = result_ && ProcedureCall_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PROCEDURE_CALL, result_, false, null);
    return result_;
  }

  // (ActualParameters)?
  private static boolean ProcedureCall_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureCall_1")) return false;
    ProcedureCall_1_0(builder_, level_ + 1);
    return true;
  }

  // (ActualParameters)
  private static boolean ProcedureCall_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureCall_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ActualParameters(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ProcedureHeading END_OF_STATEMENT block ident
  public static boolean ProcedureDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureDeclaration")) return false;
    if (!nextTokenIs(builder_, PROCEDURE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ProcedureHeading(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    result_ = result_ && block(builder_, level_ + 1);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROCEDURE_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // PROCEDURE ident export_name_declaration? FormalParameters?
  //                                  procedure_attributes?
  //                                  (END_OF_STATEMENT macro_declaration)?
  public static boolean ProcedureHeading(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureHeading")) return false;
    if (!nextTokenIs(builder_, PROCEDURE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PROCEDURE);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && ProcedureHeading_2(builder_, level_ + 1);
    result_ = result_ && ProcedureHeading_3(builder_, level_ + 1);
    result_ = result_ && ProcedureHeading_4(builder_, level_ + 1);
    result_ = result_ && ProcedureHeading_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROCEDURE_HEADING, result_);
    return result_;
  }

  // export_name_declaration?
  private static boolean ProcedureHeading_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureHeading_2")) return false;
    export_name_declaration(builder_, level_ + 1);
    return true;
  }

  // FormalParameters?
  private static boolean ProcedureHeading_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureHeading_3")) return false;
    FormalParameters(builder_, level_ + 1);
    return true;
  }

  // procedure_attributes?
  private static boolean ProcedureHeading_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureHeading_4")) return false;
    procedure_attributes(builder_, level_ + 1);
    return true;
  }

  // (END_OF_STATEMENT macro_declaration)?
  private static boolean ProcedureHeading_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureHeading_5")) return false;
    ProcedureHeading_5_0(builder_, level_ + 1);
    return true;
  }

  // END_OF_STATEMENT macro_declaration
  private static boolean ProcedureHeading_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureHeading_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, END_OF_STATEMENT);
    result_ = result_ && macro_declaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PROCEDURE (FormalTypeList)? procedure_attributes?
  public static boolean ProcedureType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureType")) return false;
    if (!nextTokenIs(builder_, PROCEDURE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PROCEDURE);
    result_ = result_ && ProcedureType_1(builder_, level_ + 1);
    result_ = result_ && ProcedureType_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROCEDURE_TYPE, result_);
    return result_;
  }

  // (FormalTypeList)?
  private static boolean ProcedureType_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureType_1")) return false;
    ProcedureType_1_0(builder_, level_ + 1);
    return true;
  }

  // (FormalTypeList)
  private static boolean ProcedureType_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureType_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = FormalTypeList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // procedure_attributes?
  private static boolean ProcedureType_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureType_2")) return false;
    procedure_attributes(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // program_header END_OF_STATEMENT {import_clause} block ident DOT
  public static boolean ProgramModule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProgramModule")) return false;
    if (!nextTokenIs(builder_, MODULE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = program_header(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    result_ = result_ && ProgramModule_2(builder_, level_ + 1);
    result_ = result_ && block(builder_, level_ + 1);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, marker_, PROGRAM_MODULE, result_);
    return result_;
  }

  // {import_clause}
  private static boolean ProgramModule_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProgramModule_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = import_clause(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // RECORD FieldListSequence END
  public static boolean RecordType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecordType")) return false;
    if (!nextTokenIs(builder_, RECORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RECORD);
    result_ = result_ && FieldListSequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, RECORD_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // REPEAT StatementSequence UNTIL expression
  public static boolean RepeatStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RepeatStatement")) return false;
    if (!nextTokenIs(builder_, REPEAT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, REPEAT);
    result_ = result_ && StatementSequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, UNTIL);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, REPEAT_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // (SET|PACKEDSET) OF SimpleType (BIG|SMALL)?
  public static boolean SetType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SetType")) return false;
    if (!nextTokenIs(builder_, "<set type>", PACKEDSET, SET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<set type>");
    result_ = SetType_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OF);
    result_ = result_ && SimpleType(builder_, level_ + 1);
    result_ = result_ && SetType_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SET_TYPE, result_, false, null);
    return result_;
  }

  // SET|PACKEDSET
  private static boolean SetType_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SetType_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SET);
    if (!result_) result_ = consumeToken(builder_, PACKEDSET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (BIG|SMALL)?
  private static boolean SetType_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SetType_3")) return false;
    SetType_3_0(builder_, level_ + 1);
    return true;
  }

  // BIG|SMALL
  private static boolean SetType_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SetType_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BIG);
    if (!result_) result_ = consumeToken(builder_, SMALL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualident | enumeration_definition | SubRangeType
  public static boolean SimpleType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SimpleType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<simple type>");
    result_ = qualident(builder_, level_ + 1);
    if (!result_) result_ = enumeration_definition(builder_, level_ + 1);
    if (!result_) result_ = SubRangeType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SIMPLE_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // statement (END_OF_STATEMENT statement)*
  public static boolean StatementSequence(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StatementSequence")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<statement sequence>");
    result_ = statement(builder_, level_ + 1);
    result_ = result_ && StatementSequence_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATEMENT_SEQUENCE, result_, false, null);
    return result_;
  }

  // (END_OF_STATEMENT statement)*
  private static boolean StatementSequence_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StatementSequence_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!StatementSequence_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "StatementSequence_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // END_OF_STATEMENT statement
  private static boolean StatementSequence_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StatementSequence_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, END_OF_STATEMENT);
    result_ = result_ && statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (qualident)? SQUARE_BRACE_OPEN expression RANGE_OPERATOR expression SQUARE_BRACE_CLOSE
  public static boolean SubRangeType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SubRangeType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<sub range type>");
    result_ = SubRangeType_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SQUARE_BRACE_OPEN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RANGE_OPERATOR);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SQUARE_BRACE_CLOSE);
    exit_section_(builder_, level_, marker_, SUB_RANGE_TYPE, result_, false, null);
    return result_;
  }

  // (qualident)?
  private static boolean SubRangeType_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SubRangeType_0")) return false;
    SubRangeType_0_0(builder_, level_ + 1);
    return true;
  }

  // (qualident)
  private static boolean SubRangeType_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SubRangeType_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ident EQUALITY_OPERATOR types
  public static boolean TypeDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDeclaration")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUALITY_OPERATOR);
    result_ = result_ && types(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable_name_definition export_name_declaration? (COMMA variable_name_definition export_name_declaration?)*
  // 							variable_modifiers TYPING_OPERATOR types (EQUALITY_OPERATOR expression)?
  public static boolean VariableDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariableDeclaration")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable_name_definition(builder_, level_ + 1);
    result_ = result_ && VariableDeclaration_1(builder_, level_ + 1);
    result_ = result_ && VariableDeclaration_2(builder_, level_ + 1);
    result_ = result_ && variable_modifiers(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && types(builder_, level_ + 1);
    result_ = result_ && VariableDeclaration_6(builder_, level_ + 1);
    exit_section_(builder_, marker_, VARIABLE_DECLARATION, result_);
    return result_;
  }

  // export_name_declaration?
  private static boolean VariableDeclaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariableDeclaration_1")) return false;
    export_name_declaration(builder_, level_ + 1);
    return true;
  }

  // (COMMA variable_name_definition export_name_declaration?)*
  private static boolean VariableDeclaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariableDeclaration_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!VariableDeclaration_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "VariableDeclaration_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA variable_name_definition export_name_declaration?
  private static boolean VariableDeclaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariableDeclaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && variable_name_definition(builder_, level_ + 1);
    result_ = result_ && VariableDeclaration_2_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // export_name_declaration?
  private static boolean VariableDeclaration_2_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariableDeclaration_2_0_2")) return false;
    export_name_declaration(builder_, level_ + 1);
    return true;
  }

  // (EQUALITY_OPERATOR expression)?
  private static boolean VariableDeclaration_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariableDeclaration_6")) return false;
    VariableDeclaration_6_0(builder_, level_ + 1);
    return true;
  }

  // EQUALITY_OPERATOR expression
  private static boolean VariableDeclaration_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VariableDeclaration_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQUALITY_OPERATOR);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // WHILE expression DO StatementSequence END
  public static boolean WhileStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WhileStatement")) return false;
    if (!nextTokenIs(builder_, WHILE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, WHILE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DO);
    result_ = result_ && StatementSequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, WHILE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // WITH designator DO StatementSequence END
  public static boolean WithStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WithStatement")) return false;
    if (!nextTokenIs(builder_, WITH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, WITH);
    result_ = result_ && designator(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DO);
    result_ = result_ && StatementSequence(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, WITH_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualident | enumeration_definition | SubRangeType | TOKEN_CHAR | TOKEN_BOOLEAN
  public static boolean array_range_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_range_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<array range type>");
    result_ = qualident(builder_, level_ + 1);
    if (!result_) result_ = enumeration_definition(builder_, level_ + 1);
    if (!result_) result_ = SubRangeType(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, TOKEN_CHAR);
    if (!result_) result_ = consumeToken(builder_, TOKEN_BOOLEAN);
    exit_section_(builder_, level_, marker_, ARRAY_RANGE_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // designator ASSIGNMENT_OPERATOR expression
  public static boolean assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<assignment>");
    result_ = designator(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGNMENT_OPERATOR);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ASSIGNMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER OPEN_BRACE (attribute? (COMMA attribute?)* )? CLOSE_BRACE | IDENTIFIER
  public static boolean attribute(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attribute_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, ATTRIBUTE, result_);
    return result_;
  }

  // IDENTIFIER OPEN_BRACE (attribute? (COMMA attribute?)* )? CLOSE_BRACE
  private static boolean attribute_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, OPEN_BRACE);
    result_ = result_ && attribute_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attribute? (COMMA attribute?)* )?
  private static boolean attribute_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_0_2")) return false;
    attribute_0_2_0(builder_, level_ + 1);
    return true;
  }

  // attribute? (COMMA attribute?)*
  private static boolean attribute_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attribute_0_2_0_0(builder_, level_ + 1);
    result_ = result_ && attribute_0_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // attribute?
  private static boolean attribute_0_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_0_2_0_0")) return false;
    attribute(builder_, level_ + 1);
    return true;
  }

  // (COMMA attribute?)*
  private static boolean attribute_0_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_0_2_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!attribute_0_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "attribute_0_2_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA attribute?
  private static boolean attribute_0_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_0_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && attribute_0_2_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // attribute?
  private static boolean attribute_0_2_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attribute_0_2_0_1_0_1")) return false;
    attribute(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // TOKEN_INTEGER | TOKEN_CARDINAL | TOKEN_REAL | TOKEN_LONGREAL | TOKEN_COMPLEX | TOKEN_LONGCOMPLEX |
  // 					TOKEN_BOOLEAN | TOKEN_CHAR | TOKEN_BITSET
  public static boolean basic_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basic_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<basic type>");
    result_ = consumeToken(builder_, TOKEN_INTEGER);
    if (!result_) result_ = consumeToken(builder_, TOKEN_CARDINAL);
    if (!result_) result_ = consumeToken(builder_, TOKEN_REAL);
    if (!result_) result_ = consumeToken(builder_, TOKEN_LONGREAL);
    if (!result_) result_ = consumeToken(builder_, TOKEN_COMPLEX);
    if (!result_) result_ = consumeToken(builder_, TOKEN_LONGCOMPLEX);
    if (!result_) result_ = consumeToken(builder_, TOKEN_BOOLEAN);
    if (!result_) result_ = consumeToken(builder_, TOKEN_CHAR);
    if (!result_) result_ = consumeToken(builder_, TOKEN_BITSET);
    exit_section_(builder_, level_, marker_, BASIC_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (declaration)* (BEGIN StatementSequence)? END
  public static boolean block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<block>");
    result_ = block_0(builder_, level_ + 1);
    result_ = result_ && block_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, level_, marker_, BLOCK, result_, false, null);
    return result_;
  }

  // (declaration)*
  private static boolean block_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!block_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "block_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (declaration)
  private static boolean block_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = declaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (BEGIN StatementSequence)?
  private static boolean block_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_1")) return false;
    block_1_0(builder_, level_ + 1);
    return true;
  }

  // BEGIN StatementSequence
  private static boolean block_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BEGIN);
    result_ = result_ && StatementSequence(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CaseLabelList TYPING_OPERATOR StatementSequence
  public static boolean caseStatements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseStatements")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<case statements>");
    result_ = CaseLabelList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && StatementSequence(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CASE_STATEMENTS, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // CMPLX OPEN_BRACE real_literal COMMA real_literal CLOSE_BRACE
  public static boolean complex_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "complex_literal")) return false;
    if (!nextTokenIs(builder_, CMPLX)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, CMPLX, OPEN_BRACE);
    result_ = result_ && real_literal(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && real_literal(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, COMPLEX_LITERAL, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONST (ConstantDeclaration END_OF_STATEMENT)* |
  // 				TYPE (TypeDeclaration END_OF_STATEMENT)* |
  // 				VAR (VariableDeclaration END_OF_STATEMENT)* |
  // 				ProcedureDeclaration END_OF_STATEMENT |
  // 				ModuleDeclaration END_OF_STATEMENT
  public static boolean declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<declaration>");
    result_ = declaration_0(builder_, level_ + 1);
    if (!result_) result_ = declaration_1(builder_, level_ + 1);
    if (!result_) result_ = declaration_2(builder_, level_ + 1);
    if (!result_) result_ = declaration_3(builder_, level_ + 1);
    if (!result_) result_ = declaration_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DECLARATION, result_, false, null);
    return result_;
  }

  // CONST (ConstantDeclaration END_OF_STATEMENT)*
  private static boolean declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declaration_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CONST);
    result_ = result_ && declaration_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (ConstantDeclaration END_OF_STATEMENT)*
  private static boolean declaration_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declaration_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!declaration_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "declaration_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ConstantDeclaration END_OF_STATEMENT
  private static boolean declaration_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declaration_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ConstantDeclaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // TYPE (TypeDeclaration END_OF_STATEMENT)*
  private static boolean declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declaration_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TYPE);
    result_ = result_ && declaration_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (TypeDeclaration END_OF_STATEMENT)*
  private static boolean declaration_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declaration_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!declaration_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "declaration_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // TypeDeclaration END_OF_STATEMENT
  private static boolean declaration_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declaration_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = TypeDeclaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // VAR (VariableDeclaration END_OF_STATEMENT)*
  private static boolean declaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declaration_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VAR);
    result_ = result_ && declaration_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (VariableDeclaration END_OF_STATEMENT)*
  private static boolean declaration_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declaration_2_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!declaration_2_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "declaration_2_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // VariableDeclaration END_OF_STATEMENT
  private static boolean declaration_2_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declaration_2_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = VariableDeclaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ProcedureDeclaration END_OF_STATEMENT
  private static boolean declaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declaration_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ProcedureDeclaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ModuleDeclaration END_OF_STATEMENT
  private static boolean declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declaration_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ModuleDeclaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONST (ConstantDeclaration END_OF_STATEMENT)* |
  // 				TYPE (type_definition)* |
  // 				VAR (VariableDeclaration END_OF_STATEMENT)* |
  // 				ProcedureHeading END_OF_STATEMENT
  public static boolean definitions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitions")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<definitions>");
    result_ = definitions_0(builder_, level_ + 1);
    if (!result_) result_ = definitions_1(builder_, level_ + 1);
    if (!result_) result_ = definitions_2(builder_, level_ + 1);
    if (!result_) result_ = definitions_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DEFINITIONS, result_, false, null);
    return result_;
  }

  // CONST (ConstantDeclaration END_OF_STATEMENT)*
  private static boolean definitions_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitions_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CONST);
    result_ = result_ && definitions_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (ConstantDeclaration END_OF_STATEMENT)*
  private static boolean definitions_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitions_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!definitions_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "definitions_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ConstantDeclaration END_OF_STATEMENT
  private static boolean definitions_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitions_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ConstantDeclaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // TYPE (type_definition)*
  private static boolean definitions_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitions_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TYPE);
    result_ = result_ && definitions_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (type_definition)*
  private static boolean definitions_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitions_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!definitions_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "definitions_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (type_definition)
  private static boolean definitions_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitions_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_definition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // VAR (VariableDeclaration END_OF_STATEMENT)*
  private static boolean definitions_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitions_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VAR);
    result_ = result_ && definitions_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (VariableDeclaration END_OF_STATEMENT)*
  private static boolean definitions_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitions_2_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!definitions_2_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "definitions_2_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // VariableDeclaration END_OF_STATEMENT
  private static boolean definitions_2_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitions_2_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = VariableDeclaration(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ProcedureHeading END_OF_STATEMENT
  private static boolean definitions_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitions_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ProcedureHeading(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualident ((DOT ident) | (SQUARE_BRACE_OPEN expression (COMMA expression)* SQUARE_BRACE_CLOSE) |
  // 				POINTER_DEREFERENCE_OPERATOR)*
  public static boolean designator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "designator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<designator>");
    result_ = qualident(builder_, level_ + 1);
    result_ = result_ && designator_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DESIGNATOR, result_, false, null);
    return result_;
  }

  // ((DOT ident) | (SQUARE_BRACE_OPEN expression (COMMA expression)* SQUARE_BRACE_CLOSE) |
  // 				POINTER_DEREFERENCE_OPERATOR)*
  private static boolean designator_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "designator_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!designator_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "designator_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (DOT ident) | (SQUARE_BRACE_OPEN expression (COMMA expression)* SQUARE_BRACE_CLOSE) |
  // 				POINTER_DEREFERENCE_OPERATOR
  private static boolean designator_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "designator_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = designator_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = designator_1_0_1(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, POINTER_DEREFERENCE_OPERATOR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DOT ident
  private static boolean designator_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "designator_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SQUARE_BRACE_OPEN expression (COMMA expression)* SQUARE_BRACE_CLOSE
  private static boolean designator_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "designator_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SQUARE_BRACE_OPEN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && designator_1_0_1_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SQUARE_BRACE_CLOSE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA expression)*
  private static boolean designator_1_0_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "designator_1_0_1_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!designator_1_0_1_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "designator_1_0_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA expression
  private static boolean designator_1_0_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "designator_1_0_1_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expression (RANGE_OPERATOR expression)*
  public static boolean element(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<element>");
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && element_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ELEMENT, result_, false, null);
    return result_;
  }

  // (RANGE_OPERATOR expression)*
  private static boolean element_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!element_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "element_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // RANGE_OPERATOR expression
  private static boolean element_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RANGE_OPERATOR);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // OPEN_BRACE enumeration_member_definition
  // 								(COMMA enumeration_member_definition)* CLOSE_BRACE (BIG | SMALL)?
  public static boolean enumeration_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumeration_definition")) return false;
    if (!nextTokenIs(builder_, OPEN_BRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && enumeration_member_definition(builder_, level_ + 1);
    result_ = result_ && enumeration_definition_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    result_ = result_ && enumeration_definition_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, ENUMERATION_DEFINITION, result_);
    return result_;
  }

  // (COMMA enumeration_member_definition)*
  private static boolean enumeration_definition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumeration_definition_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!enumeration_definition_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enumeration_definition_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA enumeration_member_definition
  private static boolean enumeration_definition_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumeration_definition_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && enumeration_member_definition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (BIG | SMALL)?
  private static boolean enumeration_definition_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumeration_definition_4")) return false;
    enumeration_definition_4_0(builder_, level_ + 1);
    return true;
  }

  // BIG | SMALL
  private static boolean enumeration_definition_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumeration_definition_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BIG);
    if (!result_) result_ = consumeToken(builder_, SMALL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // enumeration_member_name (EQUALITY_OPERATOR integer_literal)?
  public static boolean enumeration_member_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumeration_member_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = enumeration_member_name(builder_, level_ + 1);
    result_ = result_ && enumeration_member_definition_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ENUMERATION_MEMBER_DEFINITION, result_);
    return result_;
  }

  // (EQUALITY_OPERATOR integer_literal)?
  private static boolean enumeration_member_definition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumeration_member_definition_1")) return false;
    enumeration_member_definition_1_0(builder_, level_ + 1);
    return true;
  }

  // EQUALITY_OPERATOR integer_literal
  private static boolean enumeration_member_definition_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumeration_member_definition_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQUALITY_OPERATOR);
    result_ = result_ && integer_literal(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean enumeration_member_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumeration_member_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, ENUMERATION_MEMBER_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // EXPORT (QUALIFIED)? IdentList END_OF_STATEMENT
  public static boolean export_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "export_clause")) return false;
    if (!nextTokenIs(builder_, EXPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXPORT);
    result_ = result_ && export_clause_1(builder_, level_ + 1);
    result_ = result_ && IdentList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, EXPORT_CLAUSE, result_);
    return result_;
  }

  // (QUALIFIED)?
  private static boolean export_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "export_clause_1")) return false;
    consumeToken(builder_, QUALIFIED);
    return true;
  }

  /* ********************************************************** */
  // SQUARE_BRACE_OPEN (STRING_CONST_SINGLE | STRING_CONST_DOUBLE) SQUARE_BRACE_CLOSE
  public static boolean export_name_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "export_name_declaration")) return false;
    if (!nextTokenIs(builder_, SQUARE_BRACE_OPEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SQUARE_BRACE_OPEN);
    result_ = result_ && export_name_declaration_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SQUARE_BRACE_CLOSE);
    exit_section_(builder_, marker_, EXPORT_NAME_DECLARATION, result_);
    return result_;
  }

  // STRING_CONST_SINGLE | STRING_CONST_DOUBLE
  private static boolean export_name_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "export_name_declaration_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRING_CONST_SINGLE);
    if (!result_) result_ = consumeToken(builder_, STRING_CONST_DOUBLE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // simple_expression (relational_operator simple_expression)?
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expression>");
    result_ = simple_expression(builder_, level_ + 1);
    result_ = result_ && expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXPRESSION, result_, false, null);
    return result_;
  }

  // (relational_operator simple_expression)?
  private static boolean expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_1")) return false;
    expression_1_0(builder_, level_ + 1);
    return true;
  }

  // relational_operator simple_expression
  private static boolean expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = relational_operator(builder_, level_ + 1);
    result_ = result_ && simple_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // number | string | CHAR_CONST | set_expression | negation_operator factor |
  // 				designator (ActualParameters)? | OPEN_BRACE expression CLOSE_BRACE
  public static boolean factor(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<factor>");
    result_ = number(builder_, level_ + 1);
    if (!result_) result_ = string(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, CHAR_CONST);
    if (!result_) result_ = set_expression(builder_, level_ + 1);
    if (!result_) result_ = factor_4(builder_, level_ + 1);
    if (!result_) result_ = factor_5(builder_, level_ + 1);
    if (!result_) result_ = factor_6(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FACTOR, result_, false, null);
    return result_;
  }

  // negation_operator factor
  private static boolean factor_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = negation_operator(builder_, level_ + 1);
    result_ = result_ && factor(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // designator (ActualParameters)?
  private static boolean factor_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = designator(builder_, level_ + 1);
    result_ = result_ && factor_5_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (ActualParameters)?
  private static boolean factor_5_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor_5_1")) return false;
    factor_5_1_0(builder_, level_ + 1);
    return true;
  }

  // (ActualParameters)
  private static boolean factor_5_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor_5_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ActualParameters(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OPEN_BRACE expression CLOSE_BRACE
  private static boolean factor_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean ident(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ident")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, IDENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOCUMENTATION_COMMENT COMMENT COMPILE_TIME_IF COMPILE_TIME_CONDITION GENERIC ANYTHING UNSAFEGUARDED DEFINITION
  // 				COMPILE_TIME_THEN COMPILE_TIME_ELSE COMPILE_TIME_INVALID_CODE COMPILE_TIME_END COMPILER_DIRECTIVE
  public static boolean ignored(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ignored")) return false;
    if (!nextTokenIs(builder_, DOCUMENTATION_COMMENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOCUMENTATION_COMMENT, COMMENT, COMPILE_TIME_IF, COMPILE_TIME_CONDITION, GENERIC, ANYTHING, UNSAFEGUARDED, DEFINITION, COMPILE_TIME_THEN, COMPILE_TIME_ELSE, COMPILE_TIME_INVALID_CODE, COMPILE_TIME_END, COMPILER_DIRECTIVE);
    exit_section_(builder_, marker_, IGNORED, result_);
    return result_;
  }

  /* ********************************************************** */
  // module_import_clause | symbol_import_clause
  public static boolean import_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_clause")) return false;
    if (!nextTokenIs(builder_, "<import clause>", FROM, IMPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<import clause>");
    result_ = module_import_clause(builder_, level_ + 1);
    if (!result_) result_ = symbol_import_clause(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, IMPORT_CLAUSE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean import_symbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_symbol")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, IMPORT_SYMBOL, result_);
    return result_;
  }

  /* ********************************************************** */
  // INT_CONST_BASE_8 | INT_CONST_BASE_16 | INT_CONST_BASE_10
  public static boolean integer_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "integer_literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<integer literal>");
    result_ = consumeToken(builder_, INT_CONST_BASE_8);
    if (!result_) result_ = consumeToken(builder_, INT_CONST_BASE_16);
    if (!result_) result_ = consumeToken(builder_, INT_CONST_BASE_10);
    exit_section_(builder_, level_, marker_, INTEGER_LITERAL, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // MACRO END_OF_STATEMENT block ident
  public static boolean macro_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_declaration")) return false;
    if (!nextTokenIs(builder_, MACRO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, MACRO, END_OF_STATEMENT);
    result_ = result_ && block(builder_, level_ + 1);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, MACRO_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // (UNSAFEGUARDED)? DEFINITION MODULE ident
  public static boolean module_header(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_header")) return false;
    if (!nextTokenIs(builder_, "<module header>", DEFINITION, UNSAFEGUARDED)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<module header>");
    result_ = module_header_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DEFINITION, MODULE);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MODULE_HEADER, result_, false, null);
    return result_;
  }

  // (UNSAFEGUARDED)?
  private static boolean module_header_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_header_0")) return false;
    consumeToken(builder_, UNSAFEGUARDED);
    return true;
  }

  /* ********************************************************** */
  // module_name
  public static boolean module_import(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_import")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = module_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, MODULE_IMPORT, result_);
    return result_;
  }

  /* ********************************************************** */
  // IMPORT module_import (COMMA module_import)* END_OF_STATEMENT
  public static boolean module_import_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_import_clause")) return false;
    if (!nextTokenIs(builder_, IMPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IMPORT);
    result_ = result_ && module_import(builder_, level_ + 1);
    result_ = result_ && module_import_clause_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, MODULE_IMPORT_CLAUSE, result_);
    return result_;
  }

  // (COMMA module_import)*
  private static boolean module_import_clause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_import_clause_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!module_import_clause_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "module_import_clause_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA module_import
  private static boolean module_import_clause_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_import_clause_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && module_import(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean module_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, MODULE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // NOT | BITWISE_NOT
  static boolean negation_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "negation_operator")) return false;
    if (!nextTokenIs(builder_, "", BITWISE_NOT, NOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NOT);
    if (!result_) result_ = consumeToken(builder_, BITWISE_NOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // integer_literal | real_literal | complex_literal
  public static boolean number(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "number")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<number>");
    result_ = integer_literal(builder_, level_ + 1);
    if (!result_) result_ = real_literal(builder_, level_ + 1);
    if (!result_) result_ = complex_literal(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NUMBER, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (VAR (INOUT | OUT)?)| CONST
  public static boolean parameter_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_modifier")) return false;
    if (!nextTokenIs(builder_, "<parameter modifier>", CONST, VAR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<parameter modifier>");
    result_ = parameter_modifier_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, CONST);
    exit_section_(builder_, level_, marker_, PARAMETER_MODIFIER, result_, false, null);
    return result_;
  }

  // VAR (INOUT | OUT)?
  private static boolean parameter_modifier_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_modifier_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VAR);
    result_ = result_ && parameter_modifier_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (INOUT | OUT)?
  private static boolean parameter_modifier_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_modifier_0_1")) return false;
    parameter_modifier_0_1_0(builder_, level_ + 1);
    return true;
  }

  // INOUT | OUT
  private static boolean parameter_modifier_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_modifier_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INOUT);
    if (!result_) result_ = consumeToken(builder_, OUT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // NEAR|FAR|VALUE|NOHIGH
  public static boolean parameter_value_modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_value_modifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<parameter value modifier>");
    result_ = consumeToken(builder_, NEAR);
    if (!result_) result_ = consumeToken(builder_, FAR);
    if (!result_) result_ = consumeToken(builder_, VALUE);
    if (!result_) result_ = consumeToken(builder_, NOHIGH);
    exit_section_(builder_, level_, marker_, PARAMETER_VALUE_MODIFIER, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // SQUARE_BRACE_OPEN expression SQUARE_BRACE_CLOSE
  public static boolean priority(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "priority")) return false;
    if (!nextTokenIs(builder_, SQUARE_BRACE_OPEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SQUARE_BRACE_OPEN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SQUARE_BRACE_CLOSE);
    exit_section_(builder_, marker_, PRIORITY, result_);
    return result_;
  }

  /* ********************************************************** */
  // SQUARE_BRACE_OPEN attribute (COMMA attribute)* SQUARE_BRACE_CLOSE
  public static boolean procedure_attributes(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_attributes")) return false;
    if (!nextTokenIs(builder_, SQUARE_BRACE_OPEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SQUARE_BRACE_OPEN);
    result_ = result_ && attribute(builder_, level_ + 1);
    result_ = result_ && procedure_attributes_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SQUARE_BRACE_CLOSE);
    exit_section_(builder_, marker_, PROCEDURE_ATTRIBUTES, result_);
    return result_;
  }

  // (COMMA attribute)*
  private static boolean procedure_attributes_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_attributes_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!procedure_attributes_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "procedure_attributes_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA attribute
  private static boolean procedure_attributes_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_attributes_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && attribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (FORWARD | macro_declaration | ASSEMBLER | PUREASM) END_OF_STATEMENT
  public static boolean procedure_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<procedure modifiers>");
    result_ = procedure_modifiers_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, level_, marker_, PROCEDURE_MODIFIERS, result_, false, null);
    return result_;
  }

  // FORWARD | macro_declaration | ASSEMBLER | PUREASM
  private static boolean procedure_modifiers_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_modifiers_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FORWARD);
    if (!result_) result_ = macro_declaration(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ASSEMBLER);
    if (!result_) result_ = consumeToken(builder_, PUREASM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TIMES | BY | REMAINDER | DIVISION | MODULO | AND | BITWISE_AND | SHIFT_LEFT | SHIFT_RIGHT | SHIFT_ARITHMETIC_RIGHT | ROTATE_LEFT | ROTATE_RIGHT
  static boolean product_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "product_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TIMES);
    if (!result_) result_ = consumeToken(builder_, BY);
    if (!result_) result_ = consumeToken(builder_, REMAINDER);
    if (!result_) result_ = consumeToken(builder_, DIVISION);
    if (!result_) result_ = consumeToken(builder_, MODULO);
    if (!result_) result_ = consumeToken(builder_, AND);
    if (!result_) result_ = consumeToken(builder_, BITWISE_AND);
    if (!result_) result_ = consumeToken(builder_, SHIFT_LEFT);
    if (!result_) result_ = consumeToken(builder_, SHIFT_RIGHT);
    if (!result_) result_ = consumeToken(builder_, SHIFT_ARITHMETIC_RIGHT);
    if (!result_) result_ = consumeToken(builder_, ROTATE_LEFT);
    if (!result_) result_ = consumeToken(builder_, ROTATE_RIGHT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // MODULE ident [priority]
  public static boolean program_header(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "program_header")) return false;
    if (!nextTokenIs(builder_, MODULE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MODULE);
    result_ = result_ && ident(builder_, level_ + 1);
    result_ = result_ && program_header_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROGRAM_HEADER, result_);
    return result_;
  }

  // [priority]
  private static boolean program_header_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "program_header_2")) return false;
    priority(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ident (DOT ident)* | basic_type | stony_brook_type
  public static boolean qualident(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualident")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<qualident>");
    result_ = qualident_0(builder_, level_ + 1);
    if (!result_) result_ = basic_type(builder_, level_ + 1);
    if (!result_) result_ = stony_brook_type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, QUALIDENT, result_, false, null);
    return result_;
  }

  // ident (DOT ident)*
  private static boolean qualident_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualident_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ident(builder_, level_ + 1);
    result_ = result_ && qualident_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (DOT ident)*
  private static boolean qualident_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualident_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!qualident_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "qualident_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // DOT ident
  private static boolean qualident_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualident_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // REAL_CONST
  public static boolean real_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "real_literal")) return false;
    if (!nextTokenIs(builder_, REAL_CONST)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, REAL_CONST);
    exit_section_(builder_, marker_, REAL_LITERAL, result_);
    return result_;
  }

  /* ********************************************************** */
  // !(END_OF_STATEMENT | END)
  public static boolean recover_end_of_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recover_end_of_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, "<recover end of statement>");
    result_ = !recover_end_of_statement_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, RECOVER_END_OF_STATEMENT, result_, false, null);
    return result_;
  }

  // END_OF_STATEMENT | END
  private static boolean recover_end_of_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recover_end_of_statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, END_OF_STATEMENT);
    if (!result_) result_ = consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (!(END_OF_STATEMENT))*
  public static boolean recover_while_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recover_while_statement")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<recover while statement>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!recover_while_statement_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "recover_while_statement", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, RECOVER_WHILE_STATEMENT, true, false, null);
    return true;
  }

  // !(END_OF_STATEMENT)
  private static boolean recover_while_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recover_while_statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LESS_THAN | LESS_EQUALS | EQUALITY_OPERATOR | GREATER_EQUALS | GREATER_THAN | DIFFERENT | CONTAINS
  static boolean relational_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relational_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LESS_THAN);
    if (!result_) result_ = consumeToken(builder_, LESS_EQUALS);
    if (!result_) result_ = consumeToken(builder_, EQUALITY_OPERATOR);
    if (!result_) result_ = consumeToken(builder_, GREATER_EQUALS);
    if (!result_) result_ = consumeToken(builder_, GREATER_THAN);
    if (!result_) result_ = consumeToken(builder_, DIFFERENT);
    if (!result_) result_ = consumeToken(builder_, CONTAINS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CompilationUnit
  static boolean root(PsiBuilder builder_, int level_) {
    return CompilationUnit(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // qualident CURLY_BRACE_OPEN (element (COMMA element)*)?  CURLY_BRACE_CLOSE
  public static boolean set_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<set expression>");
    result_ = qualident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURLY_BRACE_OPEN);
    result_ = result_ && set_expression_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURLY_BRACE_CLOSE);
    exit_section_(builder_, level_, marker_, SET_EXPRESSION, result_, false, null);
    return result_;
  }

  // (element (COMMA element)*)?
  private static boolean set_expression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_expression_2")) return false;
    set_expression_2_0(builder_, level_ + 1);
    return true;
  }

  // element (COMMA element)*
  private static boolean set_expression_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_expression_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = element(builder_, level_ + 1);
    result_ = result_ && set_expression_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA element)*
  private static boolean set_expression_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_expression_2_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!set_expression_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "set_expression_2_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA element
  private static boolean set_expression_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_expression_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && element(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (PLUS | MINUS)? term (sum_operator term)*
  public static boolean simple_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<simple expression>");
    result_ = simple_expression_0(builder_, level_ + 1);
    result_ = result_ && term(builder_, level_ + 1);
    result_ = result_ && simple_expression_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SIMPLE_EXPRESSION, result_, false, null);
    return result_;
  }

  // (PLUS | MINUS)?
  private static boolean simple_expression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_expression_0")) return false;
    simple_expression_0_0(builder_, level_ + 1);
    return true;
  }

  // PLUS | MINUS
  private static boolean simple_expression_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_expression_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (sum_operator term)*
  private static boolean simple_expression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_expression_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!simple_expression_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "simple_expression_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // sum_operator term
  private static boolean simple_expression_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_expression_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = sum_operator(builder_, level_ + 1);
    result_ = result_ && term(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (assignment | ProcedureCall | IfStatement | CaseStatement | WhileStatement |
  // 				RepeatStatement | LoopStatement | ForStatement | WithStatement | EXIT | RETURN (expression)?)?
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<statement>");
    statement_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATEMENT, true, false, recover_end_of_statement_parser_);
    return true;
  }

  // assignment | ProcedureCall | IfStatement | CaseStatement | WhileStatement |
  // 				RepeatStatement | LoopStatement | ForStatement | WithStatement | EXIT | RETURN (expression)?
  private static boolean statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assignment(builder_, level_ + 1);
    if (!result_) result_ = ProcedureCall(builder_, level_ + 1);
    if (!result_) result_ = IfStatement(builder_, level_ + 1);
    if (!result_) result_ = CaseStatement(builder_, level_ + 1);
    if (!result_) result_ = WhileStatement(builder_, level_ + 1);
    if (!result_) result_ = RepeatStatement(builder_, level_ + 1);
    if (!result_) result_ = LoopStatement(builder_, level_ + 1);
    if (!result_) result_ = ForStatement(builder_, level_ + 1);
    if (!result_) result_ = WithStatement(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, EXIT);
    if (!result_) result_ = statement_0_10(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // RETURN (expression)?
  private static boolean statement_0_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0_10")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RETURN);
    result_ = result_ && statement_0_10_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (expression)?
  private static boolean statement_0_10_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0_10_1")) return false;
    statement_0_10_1_0(builder_, level_ + 1);
    return true;
  }

  // (expression)
  private static boolean statement_0_10_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0_10_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TOKEN_SHORTINT | TOKEN_SHORTCARD | TOKEN_INTEGER16 | TOKEN_CARDINAL16 | TOKEN_INTEGER32 |
  // 					TOKEN_CARDINAL32 | TOKEN_LONGINT | TOKEN_LONGCARD | TOKEN_INTEGER64 | TOKEN_CARDINAL64 |
  // 					TOKEN_ACHAR | TOKEN_UCHAR | TOKEN_BYTEBOOL | TOKEN_WORDBOOL | TOKEN_DWORDBOOL |
  // 					TOKEN_BITSET16 | TOKEN_BITSET32
  public static boolean stony_brook_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stony_brook_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<stony brook type>");
    result_ = consumeToken(builder_, TOKEN_SHORTINT);
    if (!result_) result_ = consumeToken(builder_, TOKEN_SHORTCARD);
    if (!result_) result_ = consumeToken(builder_, TOKEN_INTEGER16);
    if (!result_) result_ = consumeToken(builder_, TOKEN_CARDINAL16);
    if (!result_) result_ = consumeToken(builder_, TOKEN_INTEGER32);
    if (!result_) result_ = consumeToken(builder_, TOKEN_CARDINAL32);
    if (!result_) result_ = consumeToken(builder_, TOKEN_LONGINT);
    if (!result_) result_ = consumeToken(builder_, TOKEN_LONGCARD);
    if (!result_) result_ = consumeToken(builder_, TOKEN_INTEGER64);
    if (!result_) result_ = consumeToken(builder_, TOKEN_CARDINAL64);
    if (!result_) result_ = consumeToken(builder_, TOKEN_ACHAR);
    if (!result_) result_ = consumeToken(builder_, TOKEN_UCHAR);
    if (!result_) result_ = consumeToken(builder_, TOKEN_BYTEBOOL);
    if (!result_) result_ = consumeToken(builder_, TOKEN_WORDBOOL);
    if (!result_) result_ = consumeToken(builder_, TOKEN_DWORDBOOL);
    if (!result_) result_ = consumeToken(builder_, TOKEN_BITSET16);
    if (!result_) result_ = consumeToken(builder_, TOKEN_BITSET32);
    exit_section_(builder_, level_, marker_, STONY_BROOK_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // STRING_CONST_DOUBLE | STRING_CONST_DOUBLE_ANSI | STRING_CONST_DOUBLE_UNICODE | STRING_CONST_SINGLE |
  // 				STRING_CONST_SINGLE_ANSI | STRING_CONST_SINGLE_UNICODE
  public static boolean string(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<string>");
    result_ = consumeToken(builder_, STRING_CONST_DOUBLE);
    if (!result_) result_ = consumeToken(builder_, STRING_CONST_DOUBLE_ANSI);
    if (!result_) result_ = consumeToken(builder_, STRING_CONST_DOUBLE_UNICODE);
    if (!result_) result_ = consumeToken(builder_, STRING_CONST_SINGLE);
    if (!result_) result_ = consumeToken(builder_, STRING_CONST_SINGLE_ANSI);
    if (!result_) result_ = consumeToken(builder_, STRING_CONST_SINGLE_UNICODE);
    exit_section_(builder_, level_, marker_, STRING, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // PLUS | MINUS | OR | BITWISE_OR | BITWISE_XOR
  static boolean sum_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sum_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, OR);
    if (!result_) result_ = consumeToken(builder_, BITWISE_OR);
    if (!result_) result_ = consumeToken(builder_, BITWISE_XOR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // FROM module_name IMPORT import_symbol (COMMA import_symbol)* END_OF_STATEMENT
  public static boolean symbol_import_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol_import_clause")) return false;
    if (!nextTokenIs(builder_, FROM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FROM);
    result_ = result_ && module_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IMPORT);
    result_ = result_ && import_symbol(builder_, level_ + 1);
    result_ = result_ && symbol_import_clause_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, SYMBOL_IMPORT_CLAUSE, result_);
    return result_;
  }

  // (COMMA import_symbol)*
  private static boolean symbol_import_clause_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol_import_clause_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!symbol_import_clause_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "symbol_import_clause_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA import_symbol
  private static boolean symbol_import_clause_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol_import_clause_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && import_symbol(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // factor (product_operator factor)*
  public static boolean term(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<term>");
    result_ = factor(builder_, level_ + 1);
    result_ = result_ && term_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TERM, result_, false, null);
    return result_;
  }

  // (product_operator factor)*
  private static boolean term_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!term_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "term_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // product_operator factor
  private static boolean term_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = product_operator(builder_, level_ + 1);
    result_ = result_ && factor(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ident (EQUALITY_OPERATOR types)? END_OF_STATEMENT
  public static boolean type_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ident(builder_, level_ + 1);
    result_ = result_ && type_definition_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, TYPE_DEFINITION, result_);
    return result_;
  }

  // (EQUALITY_OPERATOR types)?
  private static boolean type_definition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_definition_1")) return false;
    type_definition_1_0(builder_, level_ + 1);
    return true;
  }

  // EQUALITY_OPERATOR types
  private static boolean type_definition_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_definition_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQUALITY_OPERATOR);
    result_ = result_ && types(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // SimpleType | ArrayType | RecordType | SetType | PointerType | ProcedureType
  public static boolean types(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "types")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<types>");
    result_ = SimpleType(builder_, level_ + 1);
    if (!result_) result_ = ArrayType(builder_, level_ + 1);
    if (!result_) result_ = RecordType(builder_, level_ + 1);
    if (!result_) result_ = SetType(builder_, level_ + 1);
    if (!result_) result_ = PointerType(builder_, level_ + 1);
    if (!result_) result_ = ProcedureType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPES, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (SQUARE_BRACE_OPEN VOLATILE SQUARE_BRACE_CLOSE)?
  // 							(SQUARE_BRACE_OPEN (SQUARE_BRACE_OPEN (NEAR | FAR) SQUARE_BRACE_CLOSE)? STRING_CONST_SINGLE (PUBLIC | EXTERNAL)? SQUARE_BRACE_CLOSE)?
  // 							(SQUARE_BRACE_OPEN DLLACCESS (STRING_CONST_SINGLE)? SQUARE_BRACE_CLOSE)?
  public static boolean variable_modifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<variable modifiers>");
    result_ = variable_modifiers_0(builder_, level_ + 1);
    result_ = result_ && variable_modifiers_1(builder_, level_ + 1);
    result_ = result_ && variable_modifiers_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, VARIABLE_MODIFIERS, result_, false, null);
    return result_;
  }

  // (SQUARE_BRACE_OPEN VOLATILE SQUARE_BRACE_CLOSE)?
  private static boolean variable_modifiers_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers_0")) return false;
    variable_modifiers_0_0(builder_, level_ + 1);
    return true;
  }

  // SQUARE_BRACE_OPEN VOLATILE SQUARE_BRACE_CLOSE
  private static boolean variable_modifiers_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, SQUARE_BRACE_OPEN, VOLATILE, SQUARE_BRACE_CLOSE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SQUARE_BRACE_OPEN (SQUARE_BRACE_OPEN (NEAR | FAR) SQUARE_BRACE_CLOSE)? STRING_CONST_SINGLE (PUBLIC | EXTERNAL)? SQUARE_BRACE_CLOSE)?
  private static boolean variable_modifiers_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers_1")) return false;
    variable_modifiers_1_0(builder_, level_ + 1);
    return true;
  }

  // SQUARE_BRACE_OPEN (SQUARE_BRACE_OPEN (NEAR | FAR) SQUARE_BRACE_CLOSE)? STRING_CONST_SINGLE (PUBLIC | EXTERNAL)? SQUARE_BRACE_CLOSE
  private static boolean variable_modifiers_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SQUARE_BRACE_OPEN);
    result_ = result_ && variable_modifiers_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, STRING_CONST_SINGLE);
    result_ = result_ && variable_modifiers_1_0_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SQUARE_BRACE_CLOSE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SQUARE_BRACE_OPEN (NEAR | FAR) SQUARE_BRACE_CLOSE)?
  private static boolean variable_modifiers_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers_1_0_1")) return false;
    variable_modifiers_1_0_1_0(builder_, level_ + 1);
    return true;
  }

  // SQUARE_BRACE_OPEN (NEAR | FAR) SQUARE_BRACE_CLOSE
  private static boolean variable_modifiers_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SQUARE_BRACE_OPEN);
    result_ = result_ && variable_modifiers_1_0_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SQUARE_BRACE_CLOSE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // NEAR | FAR
  private static boolean variable_modifiers_1_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers_1_0_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NEAR);
    if (!result_) result_ = consumeToken(builder_, FAR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (PUBLIC | EXTERNAL)?
  private static boolean variable_modifiers_1_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers_1_0_3")) return false;
    variable_modifiers_1_0_3_0(builder_, level_ + 1);
    return true;
  }

  // PUBLIC | EXTERNAL
  private static boolean variable_modifiers_1_0_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers_1_0_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PUBLIC);
    if (!result_) result_ = consumeToken(builder_, EXTERNAL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SQUARE_BRACE_OPEN DLLACCESS (STRING_CONST_SINGLE)? SQUARE_BRACE_CLOSE)?
  private static boolean variable_modifiers_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers_2")) return false;
    variable_modifiers_2_0(builder_, level_ + 1);
    return true;
  }

  // SQUARE_BRACE_OPEN DLLACCESS (STRING_CONST_SINGLE)? SQUARE_BRACE_CLOSE
  private static boolean variable_modifiers_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, SQUARE_BRACE_OPEN, DLLACCESS);
    result_ = result_ && variable_modifiers_2_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SQUARE_BRACE_CLOSE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (STRING_CONST_SINGLE)?
  private static boolean variable_modifiers_2_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_modifiers_2_0_2")) return false;
    consumeToken(builder_, STRING_CONST_SINGLE);
    return true;
  }

  /* ********************************************************** */
  // ident
  public static boolean variable_name_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_name_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, VARIABLE_NAME_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // (CaseLabelList TYPING_OPERATOR FieldListSequence)?
  public static boolean variant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variant")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<variant>");
    variant_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, VARIANT, true, false, null);
    return true;
  }

  // CaseLabelList TYPING_OPERATOR FieldListSequence
  private static boolean variant_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variant_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = CaseLabelList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && FieldListSequence(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  final static Parser recover_end_of_statement_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return recover_end_of_statement(builder_, level_ + 1);
    }
  };
}
