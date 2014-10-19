// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static org.modula.parsing.definition.psi.ModulaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DefinitionParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("org.modula.parsing.definition.DefinitionParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ANONYMOUS_PARAMETER) {
      result_ = anonymous_parameter(builder_, 0);
    }
    else if (root_ == ARRAY_CONSTANT) {
      result_ = array_constant(builder_, 0);
    }
    else if (root_ == ARRAY_CONSTANT_TYPE) {
      result_ = array_constant_type(builder_, 0);
    }
    else if (root_ == ARRAY_DECLARATION) {
      result_ = array_declaration(builder_, 0);
    }
    else if (root_ == ARRAY_DEFINITION) {
      result_ = array_definition(builder_, 0);
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
    else if (root_ == CASE_RANGE) {
      result_ = case_range(builder_, 0);
    }
    else if (root_ == CASE_STATEMENT) {
      result_ = case_statement(builder_, 0);
    }
    else if (root_ == COMPLEX_LITERAL) {
      result_ = complex_literal(builder_, 0);
    }
    else if (root_ == CONST_EXPRESSION) {
      result_ = const_expression(builder_, 0);
    }
    else if (root_ == CONST_FACTOR) {
      result_ = const_factor(builder_, 0);
    }
    else if (root_ == CONST_TERM) {
      result_ = const_term(builder_, 0);
    }
    else if (root_ == CONSTANT_ARRAY_ELEMENT) {
      result_ = constant_array_element(builder_, 0);
    }
    else if (root_ == CONSTANT_DEFINITION) {
      result_ = constant_definition(builder_, 0);
    }
    else if (root_ == CONSTANT_DEFINITIONS) {
      result_ = constant_definitions(builder_, 0);
    }
    else if (root_ == CONSTANT_DESIGNATOR) {
      result_ = constant_designator(builder_, 0);
    }
    else if (root_ == CONSTANT_NAME) {
      result_ = constant_name(builder_, 0);
    }
    else if (root_ == CONSTANT_TYPE) {
      result_ = constant_type(builder_, 0);
    }
    else if (root_ == CONSTANT_VALUE) {
      result_ = constant_value(builder_, 0);
    }
    else if (root_ == CONSTANT_VALUE_MODULE_PARAMETER) {
      result_ = constant_value_module_parameter(builder_, 0);
    }
    else if (root_ == DEFINITION_FILE) {
      result_ = definitionFile(builder_, 0);
    }
    else if (root_ == DEFINITION_CLAUSE) {
      result_ = definition_clause(builder_, 0);
    }
    else if (root_ == DESIGNATOR) {
      result_ = designator(builder_, 0);
    }
    else if (root_ == DO_STATEMENT) {
      result_ = do_statement(builder_, 0);
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
    else if (root_ == ENUMERATION_MEMBER_DESIGNATOR) {
      result_ = enumeration_member_designator(builder_, 0);
    }
    else if (root_ == ENUMERATION_MEMBER_NAME) {
      result_ = enumeration_member_name(builder_, 0);
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
    else if (root_ == FIELD) {
      result_ = field(builder_, 0);
    }
    else if (root_ == FIELD_NAME) {
      result_ = field_name(builder_, 0);
    }
    else if (root_ == FIELDS) {
      result_ = fields(builder_, 0);
    }
    else if (root_ == FOOTER) {
      result_ = footer(builder_, 0);
    }
    else if (root_ == FUNCTION_DESIGNATOR) {
      result_ = function_designator(builder_, 0);
    }
    else if (root_ == GENERIC_DESIGNATOR) {
      result_ = generic_designator(builder_, 0);
    }
    else if (root_ == GENERIC_MODULE_DEFINITION) {
      result_ = generic_module_definition(builder_, 0);
    }
    else if (root_ == HEADER) {
      result_ = header(builder_, 0);
    }
    else if (root_ == IDENT) {
      result_ = ident(builder_, 0);
    }
    else if (root_ == IF_STATEMENT) {
      result_ = if_statement(builder_, 0);
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
    else if (root_ == INDEX_TYPE) {
      result_ = index_type(builder_, 0);
    }
    else if (root_ == INNER_RANGE) {
      result_ = inner_range(builder_, 0);
    }
    else if (root_ == INTEGER_LITERAL) {
      result_ = integer_literal(builder_, 0);
    }
    else if (root_ == L_VALUE) {
      result_ = l_value(builder_, 0);
    }
    else if (root_ == LITERAL) {
      result_ = literal(builder_, 0);
    }
    else if (root_ == LOOP_STATEMENT) {
      result_ = loop_statement(builder_, 0);
    }
    else if (root_ == MACRO_CONSTANT_DEFINITION) {
      result_ = macro_constant_definition(builder_, 0);
    }
    else if (root_ == MACRO_CONSTANT_DEFINITIONS) {
      result_ = macro_constant_definitions(builder_, 0);
    }
    else if (root_ == MACRO_DECLARATION) {
      result_ = macro_declaration(builder_, 0);
    }
    else if (root_ == MACRO_INNER_DECLARATIONS) {
      result_ = macro_inner_declarations(builder_, 0);
    }
    else if (root_ == MACRO_TYPE_DEFINITION) {
      result_ = macro_type_definition(builder_, 0);
    }
    else if (root_ == MACRO_TYPE_DEFINITIONS) {
      result_ = macro_type_definitions(builder_, 0);
    }
    else if (root_ == MACRO_VARIABLE_DEFINITION) {
      result_ = macro_variable_definition(builder_, 0);
    }
    else if (root_ == MACRO_VARIABLE_DEFINITIONS) {
      result_ = macro_variable_definitions(builder_, 0);
    }
    else if (root_ == MODULE_DEFINITION) {
      result_ = module_definition(builder_, 0);
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
    else if (root_ == MODULE_PARAMETER) {
      result_ = module_parameter(builder_, 0);
    }
    else if (root_ == MODULE_PARAMETER_NAME) {
      result_ = module_parameter_name(builder_, 0);
    }
    else if (root_ == MODULE_PARAMETERS) {
      result_ = module_parameters(builder_, 0);
    }
    else if (root_ == NAMED_TYPE) {
      result_ = named_type(builder_, 0);
    }
    else if (root_ == NUMBER) {
      result_ = number(builder_, 0);
    }
    else if (root_ == OPAQUE_TYPE_DEFINITION) {
      result_ = opaque_type_definition(builder_, 0);
    }
    else if (root_ == PARAMETER) {
      result_ = parameter(builder_, 0);
    }
    else if (root_ == PARAMETER_NAME) {
      result_ = parameter_name(builder_, 0);
    }
    else if (root_ == PARAMETERS) {
      result_ = parameters(builder_, 0);
    }
    else if (root_ == PARAMETERS_COMMA_SEPARATED) {
      result_ = parameters_comma_separated(builder_, 0);
    }
    else if (root_ == POINTER_DEFINITION) {
      result_ = pointer_definition(builder_, 0);
    }
    else if (root_ == PREDEFINED_TYPE) {
      result_ = predefined_type(builder_, 0);
    }
    else if (root_ == PROCEDURE_ATTRIBUTES) {
      result_ = procedure_attributes(builder_, 0);
    }
    else if (root_ == PROCEDURE_DEFINITION) {
      result_ = procedure_definition(builder_, 0);
    }
    else if (root_ == PROCEDURE_MODIFIERS) {
      result_ = procedure_modifiers(builder_, 0);
    }
    else if (root_ == PROCEDURE_NAME) {
      result_ = procedure_name(builder_, 0);
    }
    else if (root_ == PROCEDURE_TYPE_DEFINITION) {
      result_ = procedure_type_definition(builder_, 0);
    }
    else if (root_ == QUALIDENT) {
      result_ = qualident(builder_, 0);
    }
    else if (root_ == RANGE) {
      result_ = range(builder_, 0);
    }
    else if (root_ == REAL_LITERAL) {
      result_ = real_literal(builder_, 0);
    }
    else if (root_ == RECORD_CONSTANT) {
      result_ = record_constant(builder_, 0);
    }
    else if (root_ == RECORD_DEFINITION) {
      result_ = record_definition(builder_, 0);
    }
    else if (root_ == RECOVER_END_OF_STATEMENT) {
      result_ = recover_end_of_statement(builder_, 0);
    }
    else if (root_ == RECOVER_WHILE_STATEMENT) {
      result_ = recover_while_statement(builder_, 0);
    }
    else if (root_ == SELECTOR) {
      result_ = selector(builder_, 0);
    }
    else if (root_ == SET_DEFINITION) {
      result_ = set_definition(builder_, 0);
    }
    else if (root_ == SET_DESIGNATOR) {
      result_ = set_designator(builder_, 0);
    }
    else if (root_ == SET_EXPRESSION) {
      result_ = set_expression(builder_, 0);
    }
    else if (root_ == SET_LITERAL) {
      result_ = set_literal(builder_, 0);
    }
    else if (root_ == SIMPLE_CONST_EXPRESSION) {
      result_ = simple_const_expression(builder_, 0);
    }
    else if (root_ == SIMPLE_EXPRESSION) {
      result_ = simple_expression(builder_, 0);
    }
    else if (root_ == STATEMENT) {
      result_ = statement(builder_, 0);
    }
    else if (root_ == STATEMENTS) {
      result_ = statements(builder_, 0);
    }
    else if (root_ == STATIC_FIELD) {
      result_ = static_field(builder_, 0);
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
    else if (root_ == SYMBOL_NAME) {
      result_ = symbol_name(builder_, 0);
    }
    else if (root_ == TERM) {
      result_ = term(builder_, 0);
    }
    else if (root_ == TYPE_ALIAS_DEFINITION) {
      result_ = type_alias_definition(builder_, 0);
    }
    else if (root_ == TYPE_DEFINITION) {
      result_ = type_definition(builder_, 0);
    }
    else if (root_ == TYPE_DEFINITIONS) {
      result_ = type_definitions(builder_, 0);
    }
    else if (root_ == TYPE_DESIGNATOR) {
      result_ = type_designator(builder_, 0);
    }
    else if (root_ == TYPE_NAME) {
      result_ = type_name(builder_, 0);
    }
    else if (root_ == TYPE_PARAMETER) {
      result_ = type_parameter(builder_, 0);
    }
    else if (root_ == TYPE_SPECIFICATION) {
      result_ = type_specification(builder_, 0);
    }
    else if (root_ == VARIABLE_DEFINITION) {
      result_ = variable_definition(builder_, 0);
    }
    else if (root_ == VARIABLE_DEFINITIONS) {
      result_ = variable_definitions(builder_, 0);
    }
    else if (root_ == VARIABLE_MODIFIERS) {
      result_ = variable_modifiers(builder_, 0);
    }
    else if (root_ == VARIABLE_NAME) {
      result_ = variable_name(builder_, 0);
    }
    else if (root_ == VARIABLE_NAME_DEFINITION) {
      result_ = variable_name_definition(builder_, 0);
    }
    else if (root_ == VARIANT) {
      result_ = variant(builder_, 0);
    }
    else if (root_ == VARIANT_FIELD) {
      result_ = variant_field(builder_, 0);
    }
    else if (root_ == VARIANTS) {
      result_ = variants(builder_, 0);
    }
    else if (root_ == WHATEVER) {
      result_ = whatever(builder_, 0);
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
  // ((VAR (INOUT | OUT)?)| CONST)? (NEAR|FAR|VALUE|NOHIGH)? (ARRAY OF)* type_specification
  public static boolean anonymous_parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anonymous_parameter")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<anonymous parameter>");
    result_ = anonymous_parameter_0(builder_, level_ + 1);
    result_ = result_ && anonymous_parameter_1(builder_, level_ + 1);
    result_ = result_ && anonymous_parameter_2(builder_, level_ + 1);
    result_ = result_ && type_specification(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ANONYMOUS_PARAMETER, result_, false, null);
    return result_;
  }

  // ((VAR (INOUT | OUT)?)| CONST)?
  private static boolean anonymous_parameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anonymous_parameter_0")) return false;
    anonymous_parameter_0_0(builder_, level_ + 1);
    return true;
  }

  // (VAR (INOUT | OUT)?)| CONST
  private static boolean anonymous_parameter_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anonymous_parameter_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = anonymous_parameter_0_0_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, CONST);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // VAR (INOUT | OUT)?
  private static boolean anonymous_parameter_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anonymous_parameter_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VAR);
    result_ = result_ && anonymous_parameter_0_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (INOUT | OUT)?
  private static boolean anonymous_parameter_0_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anonymous_parameter_0_0_0_1")) return false;
    anonymous_parameter_0_0_0_1_0(builder_, level_ + 1);
    return true;
  }

  // INOUT | OUT
  private static boolean anonymous_parameter_0_0_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anonymous_parameter_0_0_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INOUT);
    if (!result_) result_ = consumeToken(builder_, OUT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (NEAR|FAR|VALUE|NOHIGH)?
  private static boolean anonymous_parameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anonymous_parameter_1")) return false;
    anonymous_parameter_1_0(builder_, level_ + 1);
    return true;
  }

  // NEAR|FAR|VALUE|NOHIGH
  private static boolean anonymous_parameter_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anonymous_parameter_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NEAR);
    if (!result_) result_ = consumeToken(builder_, FAR);
    if (!result_) result_ = consumeToken(builder_, VALUE);
    if (!result_) result_ = consumeToken(builder_, NOHIGH);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (ARRAY OF)*
  private static boolean anonymous_parameter_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anonymous_parameter_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!anonymous_parameter_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "anonymous_parameter_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ARRAY OF
  private static boolean anonymous_parameter_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "anonymous_parameter_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ARRAY, OF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // array_constant_type CURLY_BRACE_OPEN (constant_array_element (COMMA constant_array_element)*)? CURLY_BRACE_CLOSE
  public static boolean array_constant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_constant")) return false;
    if (!nextTokenIs(builder_, "<array constant>", ARRAY, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<array constant>");
    result_ = array_constant_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURLY_BRACE_OPEN);
    result_ = result_ && array_constant_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURLY_BRACE_CLOSE);
    exit_section_(builder_, level_, marker_, ARRAY_CONSTANT, result_, false, null);
    return result_;
  }

  // (constant_array_element (COMMA constant_array_element)*)?
  private static boolean array_constant_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_constant_2")) return false;
    array_constant_2_0(builder_, level_ + 1);
    return true;
  }

  // constant_array_element (COMMA constant_array_element)*
  private static boolean array_constant_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_constant_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constant_array_element(builder_, level_ + 1);
    result_ = result_ && array_constant_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA constant_array_element)*
  private static boolean array_constant_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_constant_2_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!array_constant_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "array_constant_2_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA constant_array_element
  private static boolean array_constant_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_constant_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && constant_array_element(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // constant_type | array_declaration
  public static boolean array_constant_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_constant_type")) return false;
    if (!nextTokenIs(builder_, "<array constant type>", ARRAY, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<array constant type>");
    result_ = constant_type(builder_, level_ + 1);
    if (!result_) result_ = array_declaration(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ARRAY_CONSTANT_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ARRAY (range)? OF constant_type
  public static boolean array_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_declaration")) return false;
    if (!nextTokenIs(builder_, ARRAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ARRAY);
    result_ = result_ && array_declaration_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OF);
    result_ = result_ && constant_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, ARRAY_DECLARATION, result_);
    return result_;
  }

  // (range)?
  private static boolean array_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_declaration_1")) return false;
    array_declaration_1_0(builder_, level_ + 1);
    return true;
  }

  // (range)
  private static boolean array_declaration_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_declaration_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = range(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ARRAY index_type (COMMA index_type)* OF type_specification
  public static boolean array_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_definition")) return false;
    if (!nextTokenIs(builder_, ARRAY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ARRAY);
    result_ = result_ && index_type(builder_, level_ + 1);
    result_ = result_ && array_definition_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OF);
    result_ = result_ && type_specification(builder_, level_ + 1);
    exit_section_(builder_, marker_, ARRAY_DEFINITION, result_);
    return result_;
  }

  // (COMMA index_type)*
  private static boolean array_definition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_definition_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!array_definition_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "array_definition_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA index_type
  private static boolean array_definition_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_definition_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && index_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // l_value ASSIGNMENT_OPERATOR expression
  public static boolean assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = l_value(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGNMENT_OPERATOR);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, ASSIGNMENT, result_);
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
  // inner_range | literal
  public static boolean case_range(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_range")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<case range>");
    result_ = inner_range(builder_, level_ + 1);
    if (!result_) result_ = literal(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CASE_RANGE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // CASE statements END
  public static boolean case_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_statement")) return false;
    if (!nextTokenIs(builder_, CASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CASE);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, CASE_STATEMENT, result_);
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
  // simple_const_expression (relational_operator simple_const_expression)?
  public static boolean const_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<const expression>");
    result_ = simple_const_expression(builder_, level_ + 1);
    result_ = result_ && const_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CONST_EXPRESSION, result_, false, null);
    return result_;
  }

  // (relational_operator simple_const_expression)?
  private static boolean const_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_expression_1")) return false;
    const_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // relational_operator simple_const_expression
  private static boolean const_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = relational_operator(builder_, level_ + 1);
    result_ = result_ && simple_const_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // number | string | set_expression | (OPEN_BRACE const_expression CLOSE_BRACE) |
  // 					(NOT const_factor) | designator (OPEN_BRACE (const_expression (COMMA const_expression)*)? CLOSE_BRACE)?
  public static boolean const_factor(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_factor")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<const factor>");
    result_ = number(builder_, level_ + 1);
    if (!result_) result_ = string(builder_, level_ + 1);
    if (!result_) result_ = set_expression(builder_, level_ + 1);
    if (!result_) result_ = const_factor_3(builder_, level_ + 1);
    if (!result_) result_ = const_factor_4(builder_, level_ + 1);
    if (!result_) result_ = const_factor_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CONST_FACTOR, result_, false, null);
    return result_;
  }

  // OPEN_BRACE const_expression CLOSE_BRACE
  private static boolean const_factor_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_factor_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && const_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // NOT const_factor
  private static boolean const_factor_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_factor_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NOT);
    result_ = result_ && const_factor(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // designator (OPEN_BRACE (const_expression (COMMA const_expression)*)? CLOSE_BRACE)?
  private static boolean const_factor_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_factor_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = designator(builder_, level_ + 1);
    result_ = result_ && const_factor_5_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (OPEN_BRACE (const_expression (COMMA const_expression)*)? CLOSE_BRACE)?
  private static boolean const_factor_5_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_factor_5_1")) return false;
    const_factor_5_1_0(builder_, level_ + 1);
    return true;
  }

  // OPEN_BRACE (const_expression (COMMA const_expression)*)? CLOSE_BRACE
  private static boolean const_factor_5_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_factor_5_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && const_factor_5_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (const_expression (COMMA const_expression)*)?
  private static boolean const_factor_5_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_factor_5_1_0_1")) return false;
    const_factor_5_1_0_1_0(builder_, level_ + 1);
    return true;
  }

  // const_expression (COMMA const_expression)*
  private static boolean const_factor_5_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_factor_5_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = const_expression(builder_, level_ + 1);
    result_ = result_ && const_factor_5_1_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA const_expression)*
  private static boolean const_factor_5_1_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_factor_5_1_0_1_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!const_factor_5_1_0_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "const_factor_5_1_0_1_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA const_expression
  private static boolean const_factor_5_1_0_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_factor_5_1_0_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && const_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // const_factor ((TIMES | BY | DIVISION | MODULO | REMAINDER | AND) const_factor)*
  public static boolean const_term(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_term")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<const term>");
    result_ = const_factor(builder_, level_ + 1);
    result_ = result_ && const_term_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CONST_TERM, result_, false, null);
    return result_;
  }

  // ((TIMES | BY | DIVISION | MODULO | REMAINDER | AND) const_factor)*
  private static boolean const_term_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_term_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!const_term_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "const_term_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (TIMES | BY | DIVISION | MODULO | REMAINDER | AND) const_factor
  private static boolean const_term_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_term_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = const_term_1_0_0(builder_, level_ + 1);
    result_ = result_ && const_factor(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // TIMES | BY | DIVISION | MODULO | REMAINDER | AND
  private static boolean const_term_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "const_term_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TIMES);
    if (!result_) result_ = consumeToken(builder_, BY);
    if (!result_) result_ = consumeToken(builder_, DIVISION);
    if (!result_) result_ = consumeToken(builder_, MODULO);
    if (!result_) result_ = consumeToken(builder_, REMAINDER);
    if (!result_) result_ = consumeToken(builder_, AND);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // inner_range | integer_literal ARRAY_ELEMENT_RANGE_OPERATOR integer_literal | constant_value
  public static boolean constant_array_element(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_array_element")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<constant array element>");
    result_ = inner_range(builder_, level_ + 1);
    if (!result_) result_ = constant_array_element_1(builder_, level_ + 1);
    if (!result_) result_ = constant_value(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CONSTANT_ARRAY_ELEMENT, result_, false, null);
    return result_;
  }

  // integer_literal ARRAY_ELEMENT_RANGE_OPERATOR integer_literal
  private static boolean constant_array_element_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_array_element_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = integer_literal(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ARRAY_ELEMENT_RANGE_OPERATOR);
    result_ = result_ && integer_literal(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // constant_name EQUALITY_OPERATOR constant_value END_OF_STATEMENT
  public static boolean constant_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constant_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUALITY_OPERATOR);
    result_ = result_ && constant_value(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, CONSTANT_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONST (constant_definition)*
  public static boolean constant_definitions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_definitions")) return false;
    if (!nextTokenIs(builder_, CONST)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CONST);
    result_ = result_ && constant_definitions_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONSTANT_DEFINITIONS, result_);
    return result_;
  }

  // (constant_definition)*
  private static boolean constant_definitions_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_definitions_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!constant_definitions_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "constant_definitions_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (constant_definition)
  private static boolean constant_definitions_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_definitions_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constant_definition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // generic_designator
  public static boolean constant_designator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_designator")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = generic_designator(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONSTANT_DESIGNATOR, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean constant_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, CONSTANT_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean constant_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_type")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, CONSTANT_TYPE, result_);
    return result_;
  }

  /* ********************************************************** */
  // array_constant | record_constant | const_expression
  public static boolean constant_value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_value")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<constant value>");
    result_ = array_constant(builder_, level_ + 1);
    if (!result_) result_ = record_constant(builder_, level_ + 1);
    if (!result_) result_ = const_expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CONSTANT_VALUE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // module_parameter_name (COMMA module_parameter_name)* TYPING_OPERATOR type_specification
  public static boolean constant_value_module_parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_value_module_parameter")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = module_parameter_name(builder_, level_ + 1);
    result_ = result_ && constant_value_module_parameter_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && type_specification(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONSTANT_VALUE_MODULE_PARAMETER, result_);
    return result_;
  }

  // (COMMA module_parameter_name)*
  private static boolean constant_value_module_parameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_value_module_parameter_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!constant_value_module_parameter_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "constant_value_module_parameter_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA module_parameter_name
  private static boolean constant_value_module_parameter_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constant_value_module_parameter_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && module_parameter_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // header import_clause* definition_clause* footer
  public static boolean definitionFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitionFile")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<definition file>");
    result_ = header(builder_, level_ + 1);
    result_ = result_ && definitionFile_1(builder_, level_ + 1);
    result_ = result_ && definitionFile_2(builder_, level_ + 1);
    result_ = result_ && footer(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DEFINITION_FILE, result_, false, null);
    return result_;
  }

  // import_clause*
  private static boolean definitionFile_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitionFile_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!import_clause(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "definitionFile_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // definition_clause*
  private static boolean definitionFile_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definitionFile_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!definition_clause(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "definitionFile_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // procedure_definition | type_definitions | constant_definitions | variable_definitions
  public static boolean definition_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definition_clause")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<definition clause>");
    result_ = procedure_definition(builder_, level_ + 1);
    if (!result_) result_ = type_definitions(builder_, level_ + 1);
    if (!result_) result_ = constant_definitions(builder_, level_ + 1);
    if (!result_) result_ = variable_definitions(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DEFINITION_CLAUSE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // qualident ((DOT ident) | (SQUARE_BRACE_OPEN expression (COMMA expression)* SQUARE_BRACE_CLOSE) |
  // 				POINTER_DEREFERENCE_OPERATOR)*
  public static boolean designator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "designator")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualident(builder_, level_ + 1);
    result_ = result_ && designator_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, DESIGNATOR, result_);
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
  // DO statements END
  public static boolean do_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "do_statement")) return false;
    if (!nextTokenIs(builder_, DO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DO);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, DO_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // const_expression (RANGE_OPERATOR const_expression)*
  public static boolean element(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<element>");
    result_ = const_expression(builder_, level_ + 1);
    result_ = result_ && element_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ELEMENT, result_, false, null);
    return result_;
  }

  // (RANGE_OPERATOR const_expression)*
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

  // RANGE_OPERATOR const_expression
  private static boolean element_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "element_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RANGE_OPERATOR);
    result_ = result_ && const_expression(builder_, level_ + 1);
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
  // generic_designator
  public static boolean enumeration_member_designator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumeration_member_designator")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = generic_designator(builder_, level_ + 1);
    exit_section_(builder_, marker_, ENUMERATION_MEMBER_DESIGNATOR, result_);
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
  // number | string | set_expression | NOT factor |
  // 				designator (OPEN_BRACE (expression (COMMA expression)*)? CLOSE_BRACE)
  public static boolean factor(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<factor>");
    result_ = number(builder_, level_ + 1);
    if (!result_) result_ = string(builder_, level_ + 1);
    if (!result_) result_ = set_expression(builder_, level_ + 1);
    if (!result_) result_ = factor_3(builder_, level_ + 1);
    if (!result_) result_ = factor_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FACTOR, result_, false, null);
    return result_;
  }

  // NOT factor
  private static boolean factor_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NOT);
    result_ = result_ && factor(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // designator (OPEN_BRACE (expression (COMMA expression)*)? CLOSE_BRACE)
  private static boolean factor_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = designator(builder_, level_ + 1);
    result_ = result_ && factor_4_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OPEN_BRACE (expression (COMMA expression)*)? CLOSE_BRACE
  private static boolean factor_4_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor_4_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && factor_4_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (expression (COMMA expression)*)?
  private static boolean factor_4_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor_4_1_1")) return false;
    factor_4_1_1_0(builder_, level_ + 1);
    return true;
  }

  // expression (COMMA expression)*
  private static boolean factor_4_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor_4_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && factor_4_1_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA expression)*
  private static boolean factor_4_1_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor_4_1_1_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!factor_4_1_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "factor_4_1_1_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA expression
  private static boolean factor_4_1_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "factor_4_1_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variant_field | static_field
  public static boolean field(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field")) return false;
    if (!nextTokenIs(builder_, "<field>", CASE, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<field>");
    result_ = variant_field(builder_, level_ + 1);
    if (!result_) result_ = static_field(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FIELD, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean field_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, FIELD_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // (field (END_OF_STATEMENT field)*)? END_OF_STATEMENT?
  public static boolean fields(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fields")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<fields>");
    result_ = fields_0(builder_, level_ + 1);
    result_ = result_ && fields_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FIELDS, result_, false, null);
    return result_;
  }

  // (field (END_OF_STATEMENT field)*)?
  private static boolean fields_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fields_0")) return false;
    fields_0_0(builder_, level_ + 1);
    return true;
  }

  // field (END_OF_STATEMENT field)*
  private static boolean fields_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fields_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = field(builder_, level_ + 1);
    result_ = result_ && fields_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (END_OF_STATEMENT field)*
  private static boolean fields_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fields_0_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!fields_0_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "fields_0_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // END_OF_STATEMENT field
  private static boolean fields_0_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fields_0_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, END_OF_STATEMENT);
    result_ = result_ && field(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // END_OF_STATEMENT?
  private static boolean fields_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fields_1")) return false;
    consumeToken(builder_, END_OF_STATEMENT);
    return true;
  }

  /* ********************************************************** */
  // END module_name DOT
  public static boolean footer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "footer")) return false;
    if (!nextTokenIs(builder_, END)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, END);
    result_ = result_ && module_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, marker_, FOOTER, result_);
    return result_;
  }

  /* ********************************************************** */
  // generic_designator
  public static boolean function_designator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_designator")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = generic_designator(builder_, level_ + 1);
    exit_section_(builder_, marker_, FUNCTION_DESIGNATOR, result_);
    return result_;
  }

  /* ********************************************************** */
  // symbol_name ('^'* DOT symbol_name)*
  public static boolean generic_designator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_designator")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbol_name(builder_, level_ + 1);
    result_ = result_ && generic_designator_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, GENERIC_DESIGNATOR, result_);
    return result_;
  }

  // ('^'* DOT symbol_name)*
  private static boolean generic_designator_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_designator_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!generic_designator_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "generic_designator_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // '^'* DOT symbol_name
  private static boolean generic_designator_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_designator_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = generic_designator_1_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    result_ = result_ && symbol_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '^'*
  private static boolean generic_designator_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_designator_1_0_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!consumeToken(builder_, "^")) break;
      if (!empty_element_parsed_guard_(builder_, "generic_designator_1_0_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // GENERIC module_definition module_parameters
  public static boolean generic_module_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generic_module_definition")) return false;
    if (!nextTokenIs(builder_, GENERIC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, GENERIC);
    result_ = result_ && module_definition(builder_, level_ + 1);
    result_ = result_ && module_parameters(builder_, level_ + 1);
    exit_section_(builder_, marker_, GENERIC_MODULE_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // (generic_module_definition | module_definition) END_OF_STATEMENT
  public static boolean header(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "header")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<header>");
    result_ = header_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, level_, marker_, HEADER, result_, false, null);
    return result_;
  }

  // generic_module_definition | module_definition
  private static boolean header_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "header_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = generic_module_definition(builder_, level_ + 1);
    if (!result_) result_ = module_definition(builder_, level_ + 1);
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
  // IF statements END
  public static boolean if_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement")) return false;
    if (!nextTokenIs(builder_, IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IF);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, IF_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOCUMENTATION_COMMENT COMMENT COMPILE_TIME_IF COMPILE_TIME_CONDITION
  // 				COMPILE_TIME_THEN COMPILE_TIME_ELSE COMPILE_TIME_INVALID_CODE COMPILE_TIME_END COMPILER_DIRECTIVE
  public static boolean ignored(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ignored")) return false;
    if (!nextTokenIs(builder_, DOCUMENTATION_COMMENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOCUMENTATION_COMMENT, COMMENT, COMPILE_TIME_IF, COMPILE_TIME_CONDITION, COMPILE_TIME_THEN, COMPILE_TIME_ELSE, COMPILE_TIME_INVALID_CODE, COMPILE_TIME_END, COMPILER_DIRECTIVE);
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
  // TOKEN_BOOLEAN | TOKEN_CHAR | range | type_designator
  public static boolean index_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "index_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<index type>");
    result_ = consumeToken(builder_, TOKEN_BOOLEAN);
    if (!result_) result_ = consumeToken(builder_, TOKEN_CHAR);
    if (!result_) result_ = range(builder_, level_ + 1);
    if (!result_) result_ = type_designator(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INDEX_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // const_expression RANGE_OPERATOR const_expression
  public static boolean inner_range(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inner_range")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<inner range>");
    result_ = const_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RANGE_OPERATOR);
    result_ = result_ && const_expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INNER_RANGE, result_, false, null);
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
  // generic_designator
  public static boolean l_value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "l_value")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = generic_designator(builder_, level_ + 1);
    exit_section_(builder_, marker_, L_VALUE, result_);
    return result_;
  }

  /* ********************************************************** */
  // integer_literal | complex_literal | set_literal | enumeration_member_designator |
  // 					CHAR_CONST | real_literal | STRING_CONST_SINGLE | STRING_CONST_DOUBLE | STRING_CONST_SINGLE_UNICODE |
  // 					STRING_CONST_DOUBLE_UNICODE | STRING_CONST_SINGLE_ANSI | STRING_CONST_DOUBLE_ANSI
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<literal>");
    result_ = integer_literal(builder_, level_ + 1);
    if (!result_) result_ = complex_literal(builder_, level_ + 1);
    if (!result_) result_ = set_literal(builder_, level_ + 1);
    if (!result_) result_ = enumeration_member_designator(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, CHAR_CONST);
    if (!result_) result_ = real_literal(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, STRING_CONST_SINGLE);
    if (!result_) result_ = consumeToken(builder_, STRING_CONST_DOUBLE);
    if (!result_) result_ = consumeToken(builder_, STRING_CONST_SINGLE_UNICODE);
    if (!result_) result_ = consumeToken(builder_, STRING_CONST_DOUBLE_UNICODE);
    if (!result_) result_ = consumeToken(builder_, STRING_CONST_SINGLE_ANSI);
    if (!result_) result_ = consumeToken(builder_, STRING_CONST_DOUBLE_ANSI);
    exit_section_(builder_, level_, marker_, LITERAL, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LOOP statements END
  public static boolean loop_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "loop_statement")) return false;
    if (!nextTokenIs(builder_, LOOP)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LOOP);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, LOOP_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // constant_name EQUALITY_OPERATOR constant_value END_OF_STATEMENT
  public static boolean macro_constant_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_constant_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constant_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUALITY_OPERATOR);
    result_ = result_ && constant_value(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, MACRO_CONSTANT_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONST (macro_constant_definition)*
  public static boolean macro_constant_definitions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_constant_definitions")) return false;
    if (!nextTokenIs(builder_, CONST)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CONST);
    result_ = result_ && macro_constant_definitions_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, MACRO_CONSTANT_DEFINITIONS, result_);
    return result_;
  }

  // (macro_constant_definition)*
  private static boolean macro_constant_definitions_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_constant_definitions_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!macro_constant_definitions_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "macro_constant_definitions_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (macro_constant_definition)
  private static boolean macro_constant_definitions_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_constant_definitions_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = macro_constant_definition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // MACRO END_OF_STATEMENT macro_inner_declarations BEGIN statements END procedure_name
  public static boolean macro_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_declaration")) return false;
    if (!nextTokenIs(builder_, MACRO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, MACRO, END_OF_STATEMENT);
    result_ = result_ && macro_inner_declarations(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, BEGIN);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    result_ = result_ && procedure_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, MACRO_DECLARATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // (macro_type_definitions | macro_variable_definitions | macro_constant_definitions)*
  public static boolean macro_inner_declarations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_inner_declarations")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<macro inner declarations>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!macro_inner_declarations_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "macro_inner_declarations", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, MACRO_INNER_DECLARATIONS, true, false, null);
    return true;
  }

  // macro_type_definitions | macro_variable_definitions | macro_constant_definitions
  private static boolean macro_inner_declarations_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_inner_declarations_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = macro_type_definitions(builder_, level_ + 1);
    if (!result_) result_ = macro_variable_definitions(builder_, level_ + 1);
    if (!result_) result_ = macro_constant_definitions(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (type_alias_definition | opaque_type_definition) END_OF_STATEMENT
  public static boolean macro_type_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_type_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = macro_type_definition_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, MACRO_TYPE_DEFINITION, result_);
    return result_;
  }

  // type_alias_definition | opaque_type_definition
  private static boolean macro_type_definition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_type_definition_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_alias_definition(builder_, level_ + 1);
    if (!result_) result_ = opaque_type_definition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TYPE macro_type_definition*
  public static boolean macro_type_definitions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_type_definitions")) return false;
    if (!nextTokenIs(builder_, TYPE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TYPE);
    result_ = result_ && macro_type_definitions_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, MACRO_TYPE_DEFINITIONS, result_);
    return result_;
  }

  // macro_type_definition*
  private static boolean macro_type_definitions_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_type_definitions_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!macro_type_definition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "macro_type_definitions_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // variable_name (COMMA variable_name)* variable_modifiers TYPING_OPERATOR
  // 									type_specification (EQUALITY_OPERATOR constant_value)? END_OF_STATEMENT
  public static boolean macro_variable_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_variable_definition")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<macro variable definition>");
    result_ = variable_name(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, macro_variable_definition_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, variable_modifiers(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, TYPING_OPERATOR)) && result_;
    result_ = pinned_ && report_error_(builder_, type_specification(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, macro_variable_definition_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, END_OF_STATEMENT) && result_;
    exit_section_(builder_, level_, marker_, MACRO_VARIABLE_DEFINITION, result_, pinned_, recover_by_end_of_statement_parser_);
    return result_ || pinned_;
  }

  // (COMMA variable_name)*
  private static boolean macro_variable_definition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_variable_definition_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!macro_variable_definition_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "macro_variable_definition_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA variable_name
  private static boolean macro_variable_definition_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_variable_definition_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && variable_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (EQUALITY_OPERATOR constant_value)?
  private static boolean macro_variable_definition_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_variable_definition_5")) return false;
    macro_variable_definition_5_0(builder_, level_ + 1);
    return true;
  }

  // EQUALITY_OPERATOR constant_value
  private static boolean macro_variable_definition_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_variable_definition_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQUALITY_OPERATOR);
    result_ = result_ && constant_value(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // VAR (macro_variable_definition)*
  public static boolean macro_variable_definitions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_variable_definitions")) return false;
    if (!nextTokenIs(builder_, VAR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VAR);
    result_ = result_ && macro_variable_definitions_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, MACRO_VARIABLE_DEFINITIONS, result_);
    return result_;
  }

  // (macro_variable_definition)*
  private static boolean macro_variable_definitions_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_variable_definitions_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!macro_variable_definitions_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "macro_variable_definitions_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (macro_variable_definition)
  private static boolean macro_variable_definitions_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_variable_definitions_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = macro_variable_definition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (UNSAFEGUARDED)? DEFINITION MODULE module_name
  public static boolean module_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_definition")) return false;
    if (!nextTokenIs(builder_, "<module definition>", DEFINITION, UNSAFEGUARDED)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<module definition>");
    result_ = module_definition_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DEFINITION, MODULE);
    result_ = result_ && module_name(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MODULE_DEFINITION, result_, false, null);
    return result_;
  }

  // (UNSAFEGUARDED)?
  private static boolean module_definition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_definition_0")) return false;
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
  // constant_value_module_parameter | type_parameter
  public static boolean module_parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_parameter")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constant_value_module_parameter(builder_, level_ + 1);
    if (!result_) result_ = type_parameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, MODULE_PARAMETER, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean module_parameter_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_parameter_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, MODULE_PARAMETER_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // module_parameter (END_OF_STATEMENT module_parameter)*
  public static boolean module_parameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_parameters")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = module_parameter(builder_, level_ + 1);
    result_ = result_ && module_parameters_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, MODULE_PARAMETERS, result_);
    return result_;
  }

  // (END_OF_STATEMENT module_parameter)*
  private static boolean module_parameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_parameters_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!module_parameters_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "module_parameters_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // END_OF_STATEMENT module_parameter
  private static boolean module_parameters_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "module_parameters_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, END_OF_STATEMENT);
    result_ = result_ && module_parameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // type_designator | basic_type | stony_brook_type
  public static boolean named_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "named_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<named type>");
    result_ = type_designator(builder_, level_ + 1);
    if (!result_) result_ = basic_type(builder_, level_ + 1);
    if (!result_) result_ = stony_brook_type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NAMED_TYPE, result_, false, null);
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
  // integer_literal | real_literal
  public static boolean number(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "number")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<number>");
    result_ = integer_literal(builder_, level_ + 1);
    if (!result_) result_ = real_literal(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NUMBER, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean opaque_type_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opaque_type_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, OPAQUE_TYPE_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // ((VAR (INOUT | OUT)?)| CONST)? parameter_name (COMMA parameter_name)* TYPING_OPERATOR (NEAR|FAR|VALUE|NOHIGH)? (ARRAY OF)* type_specification
  public static boolean parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<parameter>");
    result_ = parameter_0(builder_, level_ + 1);
    result_ = result_ && parameter_name(builder_, level_ + 1);
    result_ = result_ && parameter_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && parameter_4(builder_, level_ + 1);
    result_ = result_ && parameter_5(builder_, level_ + 1);
    result_ = result_ && type_specification(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PARAMETER, result_, false, null);
    return result_;
  }

  // ((VAR (INOUT | OUT)?)| CONST)?
  private static boolean parameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_0")) return false;
    parameter_0_0(builder_, level_ + 1);
    return true;
  }

  // (VAR (INOUT | OUT)?)| CONST
  private static boolean parameter_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter_0_0_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, CONST);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // VAR (INOUT | OUT)?
  private static boolean parameter_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VAR);
    result_ = result_ && parameter_0_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (INOUT | OUT)?
  private static boolean parameter_0_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_0_0_0_1")) return false;
    parameter_0_0_0_1_0(builder_, level_ + 1);
    return true;
  }

  // INOUT | OUT
  private static boolean parameter_0_0_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_0_0_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INOUT);
    if (!result_) result_ = consumeToken(builder_, OUT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA parameter_name)*
  private static boolean parameter_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!parameter_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameter_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA parameter_name
  private static boolean parameter_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && parameter_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (NEAR|FAR|VALUE|NOHIGH)?
  private static boolean parameter_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_4")) return false;
    parameter_4_0(builder_, level_ + 1);
    return true;
  }

  // NEAR|FAR|VALUE|NOHIGH
  private static boolean parameter_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NEAR);
    if (!result_) result_ = consumeToken(builder_, FAR);
    if (!result_) result_ = consumeToken(builder_, VALUE);
    if (!result_) result_ = consumeToken(builder_, NOHIGH);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (ARRAY OF)*
  private static boolean parameter_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_5")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!parameter_5_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameter_5", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ARRAY OF
  private static boolean parameter_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ARRAY, OF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean parameter_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, PARAMETER_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // OPEN_BRACE (parameter (END_OF_STATEMENT parameter)*)? CLOSE_BRACE
  public static boolean parameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters")) return false;
    if (!nextTokenIs(builder_, OPEN_BRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && parameters_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, PARAMETERS, result_);
    return result_;
  }

  // (parameter (END_OF_STATEMENT parameter)*)?
  private static boolean parameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_1")) return false;
    parameters_1_0(builder_, level_ + 1);
    return true;
  }

  // parameter (END_OF_STATEMENT parameter)*
  private static boolean parameters_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter(builder_, level_ + 1);
    result_ = result_ && parameters_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (END_OF_STATEMENT parameter)*
  private static boolean parameters_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_1_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!parameters_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameters_1_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // END_OF_STATEMENT parameter
  private static boolean parameters_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, END_OF_STATEMENT);
    result_ = result_ && parameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // anonymous_parameter (COMMA anonymous_parameter)*
  public static boolean parameters_comma_separated(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_comma_separated")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<parameters comma separated>");
    result_ = anonymous_parameter(builder_, level_ + 1);
    result_ = result_ && parameters_comma_separated_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PARAMETERS_COMMA_SEPARATED, result_, false, null);
    return result_;
  }

  // (COMMA anonymous_parameter)*
  private static boolean parameters_comma_separated_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_comma_separated_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!parameters_comma_separated_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameters_comma_separated_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA anonymous_parameter
  private static boolean parameters_comma_separated_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_comma_separated_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && anonymous_parameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // POINTER TO type_specification
  public static boolean pointer_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pointer_definition")) return false;
    if (!nextTokenIs(builder_, POINTER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, POINTER, TO);
    result_ = result_ && type_specification(builder_, level_ + 1);
    exit_section_(builder_, marker_, POINTER_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // basic_type | stony_brook_type
  public static boolean predefined_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predefined_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<predefined type>");
    result_ = basic_type(builder_, level_ + 1);
    if (!result_) result_ = stony_brook_type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PREDEFINED_TYPE, result_, false, null);
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
  // PROCEDURE procedure_name export_name_declaration? parameters?
  // 								(TYPING_OPERATOR type_specification)? procedure_attributes? END_OF_STATEMENT
  // 								(procedure_modifiers)?
  public static boolean procedure_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_definition")) return false;
    if (!nextTokenIs(builder_, PROCEDURE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PROCEDURE);
    result_ = result_ && procedure_name(builder_, level_ + 1);
    result_ = result_ && procedure_definition_2(builder_, level_ + 1);
    result_ = result_ && procedure_definition_3(builder_, level_ + 1);
    result_ = result_ && procedure_definition_4(builder_, level_ + 1);
    result_ = result_ && procedure_definition_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    result_ = result_ && procedure_definition_7(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROCEDURE_DEFINITION, result_);
    return result_;
  }

  // export_name_declaration?
  private static boolean procedure_definition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_definition_2")) return false;
    export_name_declaration(builder_, level_ + 1);
    return true;
  }

  // parameters?
  private static boolean procedure_definition_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_definition_3")) return false;
    parameters(builder_, level_ + 1);
    return true;
  }

  // (TYPING_OPERATOR type_specification)?
  private static boolean procedure_definition_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_definition_4")) return false;
    procedure_definition_4_0(builder_, level_ + 1);
    return true;
  }

  // TYPING_OPERATOR type_specification
  private static boolean procedure_definition_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_definition_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && type_specification(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // procedure_attributes?
  private static boolean procedure_definition_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_definition_5")) return false;
    procedure_attributes(builder_, level_ + 1);
    return true;
  }

  // (procedure_modifiers)?
  private static boolean procedure_definition_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_definition_7")) return false;
    procedure_definition_7_0(builder_, level_ + 1);
    return true;
  }

  // (procedure_modifiers)
  private static boolean procedure_definition_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_definition_7_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = procedure_modifiers(builder_, level_ + 1);
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
  // IDENTIFIER
  public static boolean procedure_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, PROCEDURE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // PROCEDURE (OPEN_BRACE parameters_comma_separated? CLOSE_BRACE (TYPING_OPERATOR type_specification)? procedure_attributes?)?
  public static boolean procedure_type_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_type_definition")) return false;
    if (!nextTokenIs(builder_, PROCEDURE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PROCEDURE);
    result_ = result_ && procedure_type_definition_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROCEDURE_TYPE_DEFINITION, result_);
    return result_;
  }

  // (OPEN_BRACE parameters_comma_separated? CLOSE_BRACE (TYPING_OPERATOR type_specification)? procedure_attributes?)?
  private static boolean procedure_type_definition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_type_definition_1")) return false;
    procedure_type_definition_1_0(builder_, level_ + 1);
    return true;
  }

  // OPEN_BRACE parameters_comma_separated? CLOSE_BRACE (TYPING_OPERATOR type_specification)? procedure_attributes?
  private static boolean procedure_type_definition_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_type_definition_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && procedure_type_definition_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    result_ = result_ && procedure_type_definition_1_0_3(builder_, level_ + 1);
    result_ = result_ && procedure_type_definition_1_0_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // parameters_comma_separated?
  private static boolean procedure_type_definition_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_type_definition_1_0_1")) return false;
    parameters_comma_separated(builder_, level_ + 1);
    return true;
  }

  // (TYPING_OPERATOR type_specification)?
  private static boolean procedure_type_definition_1_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_type_definition_1_0_3")) return false;
    procedure_type_definition_1_0_3_0(builder_, level_ + 1);
    return true;
  }

  // TYPING_OPERATOR type_specification
  private static boolean procedure_type_definition_1_0_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_type_definition_1_0_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && type_specification(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // procedure_attributes?
  private static boolean procedure_type_definition_1_0_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedure_type_definition_1_0_4")) return false;
    procedure_attributes(builder_, level_ + 1);
    return true;
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
  // ident (DOT ident)*
  public static boolean qualident(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualident")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ident(builder_, level_ + 1);
    result_ = result_ && qualident_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIDENT, result_);
    return result_;
  }

  // (DOT ident)*
  private static boolean qualident_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualident_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!qualident_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "qualident_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // DOT ident
  private static boolean qualident_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualident_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (named_type)? SQUARE_BRACE_OPEN inner_range SQUARE_BRACE_CLOSE
  public static boolean range(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<range>");
    result_ = range_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SQUARE_BRACE_OPEN);
    result_ = result_ && inner_range(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SQUARE_BRACE_CLOSE);
    exit_section_(builder_, level_, marker_, RANGE, result_, false, null);
    return result_;
  }

  // (named_type)?
  private static boolean range_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_0")) return false;
    range_0_0(builder_, level_ + 1);
    return true;
  }

  // (named_type)
  private static boolean range_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "range_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = named_type(builder_, level_ + 1);
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
  // constant_type CURLY_BRACE_OPEN constant_value (COMMA constant_value)* CURLY_BRACE_CLOSE
  public static boolean record_constant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "record_constant")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constant_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURLY_BRACE_OPEN);
    result_ = result_ && constant_value(builder_, level_ + 1);
    result_ = result_ && record_constant_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURLY_BRACE_CLOSE);
    exit_section_(builder_, marker_, RECORD_CONSTANT, result_);
    return result_;
  }

  // (COMMA constant_value)*
  private static boolean record_constant_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "record_constant_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!record_constant_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "record_constant_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA constant_value
  private static boolean record_constant_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "record_constant_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && constant_value(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // RECORD fields END
  public static boolean record_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "record_definition")) return false;
    if (!nextTokenIs(builder_, RECORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RECORD);
    result_ = result_ && fields(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, RECORD_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // END_OF_STATEMENT
  static boolean recover_by_end_of_statement(PsiBuilder builder_, int level_) {
    return consumeToken(builder_, END_OF_STATEMENT);
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
  // definitionFile
  static boolean root(PsiBuilder builder_, int level_) {
    return definitionFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // case_range (COMMA case_range)*
  public static boolean selector(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "selector")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<selector>");
    result_ = case_range(builder_, level_ + 1);
    result_ = result_ && selector_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SELECTOR, result_, false, null);
    return result_;
  }

  // (COMMA case_range)*
  private static boolean selector_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "selector_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!selector_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "selector_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA case_range
  private static boolean selector_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "selector_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && case_range(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (SET|PACKEDSET) OF type_specification (BIG|SMALL)?
  public static boolean set_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_definition")) return false;
    if (!nextTokenIs(builder_, "<set definition>", PACKEDSET, SET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<set definition>");
    result_ = set_definition_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OF);
    result_ = result_ && type_specification(builder_, level_ + 1);
    result_ = result_ && set_definition_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SET_DEFINITION, result_, false, null);
    return result_;
  }

  // SET|PACKEDSET
  private static boolean set_definition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_definition_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SET);
    if (!result_) result_ = consumeToken(builder_, PACKEDSET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (BIG|SMALL)?
  private static boolean set_definition_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_definition_3")) return false;
    set_definition_3_0(builder_, level_ + 1);
    return true;
  }

  // BIG|SMALL
  private static boolean set_definition_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_definition_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BIG);
    if (!result_) result_ = consumeToken(builder_, SMALL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // generic_designator
  public static boolean set_designator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_designator")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = generic_designator(builder_, level_ + 1);
    exit_section_(builder_, marker_, SET_DESIGNATOR, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualident CURLY_BRACE_OPEN (element (COMMA elemten)*)?  CURLY_BRACE_CLOSE
  public static boolean set_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_expression")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURLY_BRACE_OPEN);
    result_ = result_ && set_expression_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURLY_BRACE_CLOSE);
    exit_section_(builder_, marker_, SET_EXPRESSION, result_);
    return result_;
  }

  // (element (COMMA elemten)*)?
  private static boolean set_expression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_expression_2")) return false;
    set_expression_2_0(builder_, level_ + 1);
    return true;
  }

  // element (COMMA elemten)*
  private static boolean set_expression_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_expression_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = element(builder_, level_ + 1);
    result_ = result_ && set_expression_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA elemten)*
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

  // COMMA elemten
  private static boolean set_expression_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_expression_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, ELEMTEN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // set_designator CURLY_BRACE_OPEN (literal (COMMA literal)*)? CURLY_BRACE_CLOSE
  public static boolean set_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_literal")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = set_designator(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURLY_BRACE_OPEN);
    result_ = result_ && set_literal_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CURLY_BRACE_CLOSE);
    exit_section_(builder_, marker_, SET_LITERAL, result_);
    return result_;
  }

  // (literal (COMMA literal)*)?
  private static boolean set_literal_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_literal_2")) return false;
    set_literal_2_0(builder_, level_ + 1);
    return true;
  }

  // literal (COMMA literal)*
  private static boolean set_literal_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_literal_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = literal(builder_, level_ + 1);
    result_ = result_ && set_literal_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA literal)*
  private static boolean set_literal_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_literal_2_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!set_literal_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "set_literal_2_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA literal
  private static boolean set_literal_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_literal_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && literal(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (PLUS | MINUS)? const_term ((PLUS | MINUS | OR) const_term)*
  public static boolean simple_const_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_const_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<simple const expression>");
    result_ = simple_const_expression_0(builder_, level_ + 1);
    result_ = result_ && const_term(builder_, level_ + 1);
    result_ = result_ && simple_const_expression_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SIMPLE_CONST_EXPRESSION, result_, false, null);
    return result_;
  }

  // (PLUS | MINUS)?
  private static boolean simple_const_expression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_const_expression_0")) return false;
    simple_const_expression_0_0(builder_, level_ + 1);
    return true;
  }

  // PLUS | MINUS
  private static boolean simple_const_expression_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_const_expression_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ((PLUS | MINUS | OR) const_term)*
  private static boolean simple_const_expression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_const_expression_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!simple_const_expression_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "simple_const_expression_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (PLUS | MINUS | OR) const_term
  private static boolean simple_const_expression_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_const_expression_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = simple_const_expression_2_0_0(builder_, level_ + 1);
    result_ = result_ && const_term(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PLUS | MINUS | OR
  private static boolean simple_const_expression_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_const_expression_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, OR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (PLUS | MINUS)? term ((PLUS | MINUS | OR) term)*
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

  // ((PLUS | MINUS | OR) term)*
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

  // (PLUS | MINUS | OR) term
  private static boolean simple_expression_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_expression_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = simple_expression_2_0_0(builder_, level_ + 1);
    result_ = result_ && term(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PLUS | MINUS | OR
  private static boolean simple_expression_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_expression_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, OR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // do_statement | loop_statement | if_statement | case_statement | assignment
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<statement>");
    result_ = do_statement(builder_, level_ + 1);
    if (!result_) result_ = loop_statement(builder_, level_ + 1);
    if (!result_) result_ = if_statement(builder_, level_ + 1);
    if (!result_) result_ = case_statement(builder_, level_ + 1);
    if (!result_) result_ = assignment(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATEMENT, result_, false, recover_end_of_statement_parser_);
    return result_;
  }

  /* ********************************************************** */
  // statement (END_OF_STATEMENT statement)*
  public static boolean statements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<statements>");
    result_ = statement(builder_, level_ + 1);
    result_ = result_ && statements_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, STATEMENTS, result_, false, null);
    return result_;
  }

  // (END_OF_STATEMENT statement)*
  private static boolean statements_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!statements_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "statements_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // END_OF_STATEMENT statement
  private static boolean statements_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, END_OF_STATEMENT);
    result_ = result_ && statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // field_name (COMMA field_name)* TYPING_OPERATOR type_specification
  public static boolean static_field(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_field")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = field_name(builder_, level_ + 1);
    result_ = result_ && static_field_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && type_specification(builder_, level_ + 1);
    exit_section_(builder_, marker_, STATIC_FIELD, result_);
    return result_;
  }

  // (COMMA field_name)*
  private static boolean static_field_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_field_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!static_field_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "static_field_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA field_name
  private static boolean static_field_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "static_field_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && field_name(builder_, level_ + 1);
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
  // IDENTIFIER
  public static boolean symbol_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, SYMBOL_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // factor ((TIMES | BY | DIVISION | MODULO | REMAINDER | AND) factor)*
  public static boolean term(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<term>");
    result_ = factor(builder_, level_ + 1);
    result_ = result_ && term_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TERM, result_, false, null);
    return result_;
  }

  // ((TIMES | BY | DIVISION | MODULO | REMAINDER | AND) factor)*
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

  // (TIMES | BY | DIVISION | MODULO | REMAINDER | AND) factor
  private static boolean term_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = term_1_0_0(builder_, level_ + 1);
    result_ = result_ && factor(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // TIMES | BY | DIVISION | MODULO | REMAINDER | AND
  private static boolean term_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "term_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TIMES);
    if (!result_) result_ = consumeToken(builder_, BY);
    if (!result_) result_ = consumeToken(builder_, DIVISION);
    if (!result_) result_ = consumeToken(builder_, MODULO);
    if (!result_) result_ = consumeToken(builder_, REMAINDER);
    if (!result_) result_ = consumeToken(builder_, AND);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // type_name EQUALITY_OPERATOR type_specification
  public static boolean type_alias_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_alias_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUALITY_OPERATOR);
    result_ = result_ && type_specification(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_ALIAS_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // (type_alias_definition | opaque_type_definition) END_OF_STATEMENT
  public static boolean type_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_definition_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_OF_STATEMENT);
    exit_section_(builder_, marker_, TYPE_DEFINITION, result_);
    return result_;
  }

  // type_alias_definition | opaque_type_definition
  private static boolean type_definition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_definition_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = type_alias_definition(builder_, level_ + 1);
    if (!result_) result_ = opaque_type_definition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TYPE type_definition*
  public static boolean type_definitions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_definitions")) return false;
    if (!nextTokenIs(builder_, TYPE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TYPE);
    result_ = result_ && type_definitions_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_DEFINITIONS, result_);
    return result_;
  }

  // type_definition*
  private static boolean type_definitions_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_definitions_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!type_definition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_definitions_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // generic_designator
  public static boolean type_designator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_designator")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = generic_designator(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_DESIGNATOR, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean type_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, TYPE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // module_parameter_name (COMMA module_parameter_name)* TYPING_OPERATOR TYPE
  public static boolean type_parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameter")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = module_parameter_name(builder_, level_ + 1);
    result_ = result_ && type_parameter_1(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, TYPING_OPERATOR, TYPE);
    exit_section_(builder_, marker_, TYPE_PARAMETER, result_);
    return result_;
  }

  // (COMMA module_parameter_name)*
  private static boolean type_parameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameter_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!type_parameter_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_parameter_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA module_parameter_name
  private static boolean type_parameter_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_parameter_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && module_parameter_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // predefined_type | pointer_definition | set_definition | array_definition | record_definition
  //                          | enumeration_definition | procedure_type_definition | range | type_designator
  public static boolean type_specification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_specification")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type specification>");
    result_ = predefined_type(builder_, level_ + 1);
    if (!result_) result_ = pointer_definition(builder_, level_ + 1);
    if (!result_) result_ = set_definition(builder_, level_ + 1);
    if (!result_) result_ = array_definition(builder_, level_ + 1);
    if (!result_) result_ = record_definition(builder_, level_ + 1);
    if (!result_) result_ = enumeration_definition(builder_, level_ + 1);
    if (!result_) result_ = procedure_type_definition(builder_, level_ + 1);
    if (!result_) result_ = range(builder_, level_ + 1);
    if (!result_) result_ = type_designator(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_SPECIFICATION, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // variable_name_definition export_name_declaration? (COMMA variable_name_definition export_name_declaration?)*
  // 							variable_modifiers TYPING_OPERATOR type_specification
  // 							(EQUALITY_OPERATOR constant_value)? END_OF_STATEMENT
  public static boolean variable_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_definition")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<variable definition>");
    result_ = variable_name_definition(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, variable_definition_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, variable_definition_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, variable_modifiers(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, TYPING_OPERATOR)) && result_;
    result_ = pinned_ && report_error_(builder_, type_specification(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, variable_definition_6(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, END_OF_STATEMENT) && result_;
    exit_section_(builder_, level_, marker_, VARIABLE_DEFINITION, result_, pinned_, recover_while_statement_parser_);
    return result_ || pinned_;
  }

  // export_name_declaration?
  private static boolean variable_definition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_definition_1")) return false;
    export_name_declaration(builder_, level_ + 1);
    return true;
  }

  // (COMMA variable_name_definition export_name_declaration?)*
  private static boolean variable_definition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_definition_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!variable_definition_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "variable_definition_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA variable_name_definition export_name_declaration?
  private static boolean variable_definition_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_definition_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && variable_name_definition(builder_, level_ + 1);
    result_ = result_ && variable_definition_2_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // export_name_declaration?
  private static boolean variable_definition_2_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_definition_2_0_2")) return false;
    export_name_declaration(builder_, level_ + 1);
    return true;
  }

  // (EQUALITY_OPERATOR constant_value)?
  private static boolean variable_definition_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_definition_6")) return false;
    variable_definition_6_0(builder_, level_ + 1);
    return true;
  }

  // EQUALITY_OPERATOR constant_value
  private static boolean variable_definition_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_definition_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQUALITY_OPERATOR);
    result_ = result_ && constant_value(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // VAR (variable_definition)*
  public static boolean variable_definitions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_definitions")) return false;
    if (!nextTokenIs(builder_, VAR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VAR);
    result_ = result_ && variable_definitions_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, VARIABLE_DEFINITIONS, result_);
    return result_;
  }

  // (variable_definition)*
  private static boolean variable_definitions_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_definitions_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!variable_definitions_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "variable_definitions_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (variable_definition)
  private static boolean variable_definitions_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_definitions_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable_definition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
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
  // IDENTIFIER
  public static boolean variable_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, VARIABLE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable_name
  public static boolean variable_name_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_name_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, VARIABLE_NAME_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // selector TYPING_OPERATOR fields
  public static boolean variant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variant")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<variant>");
    result_ = selector(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && fields(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, VARIANT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // CASE (field_name)? TYPING_OPERATOR type_specification OF variants END
  public static boolean variant_field(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variant_field")) return false;
    if (!nextTokenIs(builder_, CASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CASE);
    result_ = result_ && variant_field_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPING_OPERATOR);
    result_ = result_ && type_specification(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OF);
    result_ = result_ && variants(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, VARIANT_FIELD, result_);
    return result_;
  }

  // (field_name)?
  private static boolean variant_field_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variant_field_1")) return false;
    variant_field_1_0(builder_, level_ + 1);
    return true;
  }

  // (field_name)
  private static boolean variant_field_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variant_field_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = field_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variant (PIPE variant)* (ELSE fields?)?
  public static boolean variants(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variants")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<variants>");
    result_ = variant(builder_, level_ + 1);
    result_ = result_ && variants_1(builder_, level_ + 1);
    result_ = result_ && variants_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, VARIANTS, result_, false, null);
    return result_;
  }

  // (PIPE variant)*
  private static boolean variants_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variants_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!variants_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "variants_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // PIPE variant
  private static boolean variants_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variants_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PIPE);
    result_ = result_ && variant(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (ELSE fields?)?
  private static boolean variants_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variants_2")) return false;
    variants_2_0(builder_, level_ + 1);
    return true;
  }

  // ELSE fields?
  private static boolean variants_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variants_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && variants_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // fields?
  private static boolean variants_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variants_2_0_1")) return false;
    fields(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (expression | literal | ASSIGNMENT_OPERATOR | SQUARE_BRACE_OPEN | SQUARE_BRACE_CLOSE | DOT | COMMA |
  // 				CURLY_BRACE_OPEN | CURLY_BRACE_CLOSE | THEN | ELSE | ELSIF | FOR | TO | BY | CASE |
  // 				OF | WHILE | REPEAT | UNTIL | WITH | EXIT | RETURN | ANYTHING | OPEN_BRACE | CLOSE_BRACE | IDENTIFIER)*
  public static boolean whatever(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whatever")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<whatever>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!whatever_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "whatever", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, WHATEVER, true, false, null);
    return true;
  }

  // expression | literal | ASSIGNMENT_OPERATOR | SQUARE_BRACE_OPEN | SQUARE_BRACE_CLOSE | DOT | COMMA |
  // 				CURLY_BRACE_OPEN | CURLY_BRACE_CLOSE | THEN | ELSE | ELSIF | FOR | TO | BY | CASE |
  // 				OF | WHILE | REPEAT | UNTIL | WITH | EXIT | RETURN | ANYTHING | OPEN_BRACE | CLOSE_BRACE | IDENTIFIER
  private static boolean whatever_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whatever_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ASSIGNMENT_OPERATOR);
    if (!result_) result_ = consumeToken(builder_, SQUARE_BRACE_OPEN);
    if (!result_) result_ = consumeToken(builder_, SQUARE_BRACE_CLOSE);
    if (!result_) result_ = consumeToken(builder_, DOT);
    if (!result_) result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, CURLY_BRACE_OPEN);
    if (!result_) result_ = consumeToken(builder_, CURLY_BRACE_CLOSE);
    if (!result_) result_ = consumeToken(builder_, THEN);
    if (!result_) result_ = consumeToken(builder_, ELSE);
    if (!result_) result_ = consumeToken(builder_, ELSIF);
    if (!result_) result_ = consumeToken(builder_, FOR);
    if (!result_) result_ = consumeToken(builder_, TO);
    if (!result_) result_ = consumeToken(builder_, BY);
    if (!result_) result_ = consumeToken(builder_, CASE);
    if (!result_) result_ = consumeToken(builder_, OF);
    if (!result_) result_ = consumeToken(builder_, WHILE);
    if (!result_) result_ = consumeToken(builder_, REPEAT);
    if (!result_) result_ = consumeToken(builder_, UNTIL);
    if (!result_) result_ = consumeToken(builder_, WITH);
    if (!result_) result_ = consumeToken(builder_, EXIT);
    if (!result_) result_ = consumeToken(builder_, RETURN);
    if (!result_) result_ = consumeToken(builder_, ANYTHING);
    if (!result_) result_ = consumeToken(builder_, OPEN_BRACE);
    if (!result_) result_ = consumeToken(builder_, CLOSE_BRACE);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  final static Parser recover_by_end_of_statement_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return recover_by_end_of_statement(builder_, level_ + 1);
    }
  };
  final static Parser recover_end_of_statement_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return recover_end_of_statement(builder_, level_ + 1);
    }
  };
  final static Parser recover_while_statement_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return recover_while_statement(builder_, level_ + 1);
    }
  };
}
