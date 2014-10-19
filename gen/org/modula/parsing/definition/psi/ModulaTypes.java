// This is a generated file. Not intended for manual editing.
package org.modula.parsing.definition.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.modula.parsing.psi.ModulaElementType;
import org.modula.helpers.index.stub.element.types.ConstantStubElementType;
import org.modula.helpers.index.stub.element.types.ModuleStubElementType;
import org.modula.helpers.index.stub.element.types.ProcedureStubElementType;
import org.modula.helpers.index.stub.element.types.TypeStubElementType;
import org.modula.helpers.index.stub.element.types.VariableStubElementType;
import org.modula.parsing.psi.ModulaTokenType;
import org.modula.parsing.definition.psi.impl.*;

public interface ModulaTypes {

  IElementType ANONYMOUS_PARAMETER = new ModulaElementType("ANONYMOUS_PARAMETER");
  IElementType ARRAY_CONSTANT = new ModulaElementType("ARRAY_CONSTANT");
  IElementType ARRAY_CONSTANT_TYPE = new ModulaElementType("ARRAY_CONSTANT_TYPE");
  IElementType ARRAY_DECLARATION = new ModulaElementType("ARRAY_DECLARATION");
  IElementType ARRAY_DEFINITION = new ModulaElementType("ARRAY_DEFINITION");
  IElementType ASSIGNMENT = new ModulaElementType("ASSIGNMENT");
  IElementType ATTRIBUTE = new ModulaElementType("ATTRIBUTE");
  IElementType BASIC_TYPE = new ModulaElementType("BASIC_TYPE");
  IElementType CASE_RANGE = new ModulaElementType("CASE_RANGE");
  IElementType CASE_STATEMENT = new ModulaElementType("CASE_STATEMENT");
  IElementType COMPLEX_LITERAL = new ModulaElementType("COMPLEX_LITERAL");
  IElementType CONSTANT_ARRAY_ELEMENT = new ModulaElementType("CONSTANT_ARRAY_ELEMENT");
  IElementType CONSTANT_DEFINITION = new ConstantStubElementType("CONSTANT_DEFINITION");
  IElementType CONSTANT_DEFINITIONS = new ModulaElementType("CONSTANT_DEFINITIONS");
  IElementType CONSTANT_DESIGNATOR = new ModulaElementType("CONSTANT_DESIGNATOR");
  IElementType CONSTANT_NAME = new ModulaElementType("CONSTANT_NAME");
  IElementType CONSTANT_TYPE = new ModulaElementType("CONSTANT_TYPE");
  IElementType CONSTANT_VALUE = new ModulaElementType("CONSTANT_VALUE");
  IElementType CONSTANT_VALUE_MODULE_PARAMETER = new ModulaElementType("CONSTANT_VALUE_MODULE_PARAMETER");
  IElementType CONST_EXPRESSION = new ModulaElementType("CONST_EXPRESSION");
  IElementType CONST_FACTOR = new ModulaElementType("CONST_FACTOR");
  IElementType CONST_TERM = new ModulaElementType("CONST_TERM");
  IElementType DEFINITION_CLAUSE = new ModulaElementType("DEFINITION_CLAUSE");
  IElementType DEFINITION_FILE = new ModulaElementType("DEFINITION_FILE");
  IElementType DESIGNATOR = new ModulaElementType("DESIGNATOR");
  IElementType DO_STATEMENT = new ModulaElementType("DO_STATEMENT");
  IElementType ELEMENT = new ModulaElementType("ELEMENT");
  IElementType ENUMERATION_DEFINITION = new ModulaElementType("ENUMERATION_DEFINITION");
  IElementType ENUMERATION_MEMBER_DEFINITION = new ModulaElementType("ENUMERATION_MEMBER_DEFINITION");
  IElementType ENUMERATION_MEMBER_DESIGNATOR = new ModulaElementType("ENUMERATION_MEMBER_DESIGNATOR");
  IElementType ENUMERATION_MEMBER_NAME = new ModulaElementType("ENUMERATION_MEMBER_NAME");
  IElementType EXPORT_NAME_DECLARATION = new ModulaElementType("EXPORT_NAME_DECLARATION");
  IElementType EXPRESSION = new ModulaElementType("EXPRESSION");
  IElementType FACTOR = new ModulaElementType("FACTOR");
  IElementType FIELD = new ModulaElementType("FIELD");
  IElementType FIELDS = new ModulaElementType("FIELDS");
  IElementType FIELD_NAME = new ModulaElementType("FIELD_NAME");
  IElementType FOOTER = new ModulaElementType("FOOTER");
  IElementType FUNCTION_DESIGNATOR = new ModulaElementType("FUNCTION_DESIGNATOR");
  IElementType GENERIC_DESIGNATOR = new ModulaElementType("GENERIC_DESIGNATOR");
  IElementType GENERIC_MODULE_DEFINITION = new ModulaElementType("GENERIC_MODULE_DEFINITION");
  IElementType HEADER = new ModulaElementType("HEADER");
  IElementType IDENT = new ModulaElementType("IDENT");
  IElementType IF_STATEMENT = new ModulaElementType("IF_STATEMENT");
  IElementType IGNORED = new ModulaElementType("IGNORED");
  IElementType IMPORT_CLAUSE = new ModulaElementType("IMPORT_CLAUSE");
  IElementType IMPORT_SYMBOL = new ModulaElementType("IMPORT_SYMBOL");
  IElementType INDEX_TYPE = new ModulaElementType("INDEX_TYPE");
  IElementType INNER_RANGE = new ModulaElementType("INNER_RANGE");
  IElementType INTEGER_LITERAL = new ModulaElementType("INTEGER_LITERAL");
  IElementType LITERAL = new ModulaElementType("LITERAL");
  IElementType LOOP_STATEMENT = new ModulaElementType("LOOP_STATEMENT");
  IElementType L_VALUE = new ModulaElementType("L_VALUE");
  IElementType MACRO_CONSTANT_DEFINITION = new ModulaElementType("MACRO_CONSTANT_DEFINITION");
  IElementType MACRO_CONSTANT_DEFINITIONS = new ModulaElementType("MACRO_CONSTANT_DEFINITIONS");
  IElementType MACRO_DECLARATION = new ModulaElementType("MACRO_DECLARATION");
  IElementType MACRO_INNER_DECLARATIONS = new ModulaElementType("MACRO_INNER_DECLARATIONS");
  IElementType MACRO_TYPE_DEFINITION = new ModulaElementType("MACRO_TYPE_DEFINITION");
  IElementType MACRO_TYPE_DEFINITIONS = new ModulaElementType("MACRO_TYPE_DEFINITIONS");
  IElementType MACRO_VARIABLE_DEFINITION = new ModulaElementType("MACRO_VARIABLE_DEFINITION");
  IElementType MACRO_VARIABLE_DEFINITIONS = new ModulaElementType("MACRO_VARIABLE_DEFINITIONS");
  IElementType MODULE_DEFINITION = new ModuleStubElementType("MODULE_DEFINITION");
  IElementType MODULE_IMPORT = new ModulaElementType("MODULE_IMPORT");
  IElementType MODULE_IMPORT_CLAUSE = new ModulaElementType("MODULE_IMPORT_CLAUSE");
  IElementType MODULE_NAME = new ModulaElementType("MODULE_NAME");
  IElementType MODULE_PARAMETER = new ModulaElementType("MODULE_PARAMETER");
  IElementType MODULE_PARAMETERS = new ModulaElementType("MODULE_PARAMETERS");
  IElementType MODULE_PARAMETER_NAME = new ModulaElementType("MODULE_PARAMETER_NAME");
  IElementType NAMED_TYPE = new ModulaElementType("NAMED_TYPE");
  IElementType NUMBER = new ModulaElementType("NUMBER");
  IElementType OPAQUE_TYPE_DEFINITION = new ModulaElementType("OPAQUE_TYPE_DEFINITION");
  IElementType PARAMETER = new ModulaElementType("PARAMETER");
  IElementType PARAMETERS = new ModulaElementType("PARAMETERS");
  IElementType PARAMETERS_COMMA_SEPARATED = new ModulaElementType("PARAMETERS_COMMA_SEPARATED");
  IElementType PARAMETER_NAME = new ModulaElementType("PARAMETER_NAME");
  IElementType POINTER_DEFINITION = new ModulaElementType("POINTER_DEFINITION");
  IElementType PREDEFINED_TYPE = new ModulaElementType("PREDEFINED_TYPE");
  IElementType PROCEDURE_ATTRIBUTES = new ModulaElementType("PROCEDURE_ATTRIBUTES");
  IElementType PROCEDURE_DEFINITION = new ProcedureStubElementType("PROCEDURE_DEFINITION");
  IElementType PROCEDURE_MODIFIERS = new ModulaElementType("PROCEDURE_MODIFIERS");
  IElementType PROCEDURE_NAME = new ModulaElementType("PROCEDURE_NAME");
  IElementType PROCEDURE_TYPE_DEFINITION = new ModulaElementType("PROCEDURE_TYPE_DEFINITION");
  IElementType QUALIDENT = new ModulaElementType("QUALIDENT");
  IElementType RANGE = new ModulaElementType("RANGE");
  IElementType REAL_LITERAL = new ModulaElementType("REAL_LITERAL");
  IElementType RECORD_CONSTANT = new ModulaElementType("RECORD_CONSTANT");
  IElementType RECORD_DEFINITION = new ModulaElementType("RECORD_DEFINITION");
  IElementType RECOVER_END_OF_STATEMENT = new ModulaElementType("RECOVER_END_OF_STATEMENT");
  IElementType RECOVER_WHILE_STATEMENT = new ModulaElementType("RECOVER_WHILE_STATEMENT");
  IElementType SELECTOR = new ModulaElementType("SELECTOR");
  IElementType SET_DEFINITION = new ModulaElementType("SET_DEFINITION");
  IElementType SET_DESIGNATOR = new ModulaElementType("SET_DESIGNATOR");
  IElementType SET_EXPRESSION = new ModulaElementType("SET_EXPRESSION");
  IElementType SET_LITERAL = new ModulaElementType("SET_LITERAL");
  IElementType SIMPLE_CONST_EXPRESSION = new ModulaElementType("SIMPLE_CONST_EXPRESSION");
  IElementType SIMPLE_EXPRESSION = new ModulaElementType("SIMPLE_EXPRESSION");
  IElementType STATEMENT = new ModulaElementType("STATEMENT");
  IElementType STATEMENTS = new ModulaElementType("STATEMENTS");
  IElementType STATIC_FIELD = new ModulaElementType("STATIC_FIELD");
  IElementType STONY_BROOK_TYPE = new ModulaElementType("STONY_BROOK_TYPE");
  IElementType STRING = new ModulaElementType("STRING");
  IElementType SYMBOL_IMPORT_CLAUSE = new ModulaElementType("SYMBOL_IMPORT_CLAUSE");
  IElementType SYMBOL_NAME = new ModulaElementType("SYMBOL_NAME");
  IElementType TERM = new ModulaElementType("TERM");
  IElementType TYPE_ALIAS_DEFINITION = new ModulaElementType("TYPE_ALIAS_DEFINITION");
  IElementType TYPE_DEFINITION = new TypeStubElementType("TYPE_DEFINITION");
  IElementType TYPE_DEFINITIONS = new ModulaElementType("TYPE_DEFINITIONS");
  IElementType TYPE_DESIGNATOR = new ModulaElementType("TYPE_DESIGNATOR");
  IElementType TYPE_NAME = new ModulaElementType("TYPE_NAME");
  IElementType TYPE_PARAMETER = new ModulaElementType("TYPE_PARAMETER");
  IElementType TYPE_SPECIFICATION = new ModulaElementType("TYPE_SPECIFICATION");
  IElementType VARIABLE_DEFINITION = new ModulaElementType("VARIABLE_DEFINITION");
  IElementType VARIABLE_DEFINITIONS = new ModulaElementType("VARIABLE_DEFINITIONS");
  IElementType VARIABLE_MODIFIERS = new ModulaElementType("VARIABLE_MODIFIERS");
  IElementType VARIABLE_NAME = new ModulaElementType("VARIABLE_NAME");
  IElementType VARIABLE_NAME_DEFINITION = new VariableStubElementType("VARIABLE_NAME_DEFINITION");
  IElementType VARIANT = new ModulaElementType("VARIANT");
  IElementType VARIANTS = new ModulaElementType("VARIANTS");
  IElementType VARIANT_FIELD = new ModulaElementType("VARIANT_FIELD");
  IElementType WHATEVER = new ModulaElementType("WHATEVER");

  IElementType AND = new ModulaTokenType("AND");
  IElementType ANYTHING = new ModulaTokenType("ANYTHING");
  IElementType ARRAY = new ModulaTokenType("ARRAY");
  IElementType ARRAY_ELEMENT_RANGE_OPERATOR = new ModulaTokenType("ARRAY_ELEMENT_RANGE_OPERATOR");
  IElementType ASSEMBLER = new ModulaTokenType("ASSEMBLER");
  IElementType ASSIGNMENT_OPERATOR = new ModulaTokenType("ASSIGNMENT_OPERATOR");
  IElementType BEGIN = new ModulaTokenType("BEGIN");
  IElementType BIG = new ModulaTokenType("BIG");
  IElementType BITWISE_AND = new ModulaTokenType("BITWISE_AND");
  IElementType BITWISE_NOT = new ModulaTokenType("BITWISE_NOT");
  IElementType BITWISE_OR = new ModulaTokenType("BITWISE_OR");
  IElementType BITWISE_XOR = new ModulaTokenType("BITWISE_XOR");
  IElementType BY = new ModulaTokenType("BY");
  IElementType CASE = new ModulaTokenType("CASE");
  IElementType CHAR_CONST = new ModulaTokenType("CHAR_CONST");
  IElementType CLOSE_BRACE = new ModulaTokenType("CLOSE_BRACE");
  IElementType CMPLX = new ModulaTokenType("CMPLX");
  IElementType COMMA = new ModulaTokenType("COMMA");
  IElementType COMMENT = new ModulaTokenType("COMMENT");
  IElementType COMPILER_DIRECTIVE = new ModulaTokenType("COMPILER_DIRECTIVE");
  IElementType COMPILE_TIME_CONDITION = new ModulaTokenType("COMPILE_TIME_CONDITION");
  IElementType COMPILE_TIME_ELSE = new ModulaTokenType("COMPILE_TIME_ELSE");
  IElementType COMPILE_TIME_END = new ModulaTokenType("COMPILE_TIME_END");
  IElementType COMPILE_TIME_IF = new ModulaTokenType("COMPILE_TIME_IF");
  IElementType COMPILE_TIME_INVALID_CODE = new ModulaTokenType("COMPILE_TIME_INVALID_CODE");
  IElementType COMPILE_TIME_THEN = new ModulaTokenType("COMPILE_TIME_THEN");
  IElementType CONST = new ModulaTokenType("CONST");
  IElementType CONTAINS = new ModulaTokenType("CONTAINS");
  IElementType CURLY_BRACE_CLOSE = new ModulaTokenType("CURLY_BRACE_CLOSE");
  IElementType CURLY_BRACE_OPEN = new ModulaTokenType("CURLY_BRACE_OPEN");
  IElementType DEFINITION = new ModulaTokenType("DEFINITION");
  IElementType DIFFERENT = new ModulaTokenType("DIFFERENT");
  IElementType DIVISION = new ModulaTokenType("DIVISION");
  IElementType DLLACCESS = new ModulaTokenType("DLLACCESS");
  IElementType DO = new ModulaTokenType("DO");
  IElementType DOCUMENTATION_COMMENT = new ModulaTokenType("DOCUMENTATION_COMMENT");
  IElementType DOT = new ModulaTokenType("DOT");
  IElementType ELEMTEN = new ModulaTokenType("elemten");
  IElementType ELSE = new ModulaTokenType("ELSE");
  IElementType ELSIF = new ModulaTokenType("ELSIF");
  IElementType END = new ModulaTokenType("END");
  IElementType END_OF_STATEMENT = new ModulaTokenType("END_OF_STATEMENT");
  IElementType EQUALITY_OPERATOR = new ModulaTokenType("EQUALITY_OPERATOR");
  IElementType EXIT = new ModulaTokenType("EXIT");
  IElementType EXTERNAL = new ModulaTokenType("EXTERNAL");
  IElementType FAR = new ModulaTokenType("FAR");
  IElementType FOR = new ModulaTokenType("FOR");
  IElementType FORWARD = new ModulaTokenType("FORWARD");
  IElementType FROM = new ModulaTokenType("FROM");
  IElementType GENERIC = new ModulaTokenType("GENERIC");
  IElementType GREATER_EQUALS = new ModulaTokenType("GREATER_EQUALS");
  IElementType GREATER_THAN = new ModulaTokenType("GREATER_THAN");
  IElementType IDENTIFIER = new ModulaTokenType("IDENTIFIER");
  IElementType IF = new ModulaTokenType("IF");
  IElementType IMPORT = new ModulaTokenType("IMPORT");
  IElementType INOUT = new ModulaTokenType("INOUT");
  IElementType INT_CONST_BASE_10 = new ModulaTokenType("INT_CONST_BASE_10");
  IElementType INT_CONST_BASE_16 = new ModulaTokenType("INT_CONST_BASE_16");
  IElementType INT_CONST_BASE_8 = new ModulaTokenType("INT_CONST_BASE_8");
  IElementType LESS_EQUALS = new ModulaTokenType("LESS_EQUALS");
  IElementType LESS_THAN = new ModulaTokenType("LESS_THAN");
  IElementType LOOP = new ModulaTokenType("LOOP");
  IElementType MACRO = new ModulaTokenType("MACRO");
  IElementType MINUS = new ModulaTokenType("MINUS");
  IElementType MODULE = new ModulaTokenType("MODULE");
  IElementType MODULO = new ModulaTokenType("MODULO");
  IElementType NEAR = new ModulaTokenType("NEAR");
  IElementType NOHIGH = new ModulaTokenType("NOHIGH");
  IElementType NOT = new ModulaTokenType("NOT");
  IElementType OF = new ModulaTokenType("OF");
  IElementType OPEN_BRACE = new ModulaTokenType("OPEN_BRACE");
  IElementType OR = new ModulaTokenType("OR");
  IElementType OUT = new ModulaTokenType("OUT");
  IElementType PACKEDSET = new ModulaTokenType("PACKEDSET");
  IElementType PIPE = new ModulaTokenType("PIPE");
  IElementType PLUS = new ModulaTokenType("PLUS");
  IElementType POINTER = new ModulaTokenType("POINTER");
  IElementType POINTER_DEREFERENCE_OPERATOR = new ModulaTokenType("POINTER_DEREFERENCE_OPERATOR");
  IElementType PROCEDURE = new ModulaTokenType("PROCEDURE");
  IElementType PUBLIC = new ModulaTokenType("PUBLIC");
  IElementType PUREASM = new ModulaTokenType("PUREASM");
  IElementType RANGE_OPERATOR = new ModulaTokenType("RANGE_OPERATOR");
  IElementType REAL_CONST = new ModulaTokenType("REAL_CONST");
  IElementType RECORD = new ModulaTokenType("RECORD");
  IElementType REMAINDER = new ModulaTokenType("REMAINDER");
  IElementType REPEAT = new ModulaTokenType("REPEAT");
  IElementType RETURN = new ModulaTokenType("RETURN");
  IElementType ROTATE_LEFT = new ModulaTokenType("ROTATE_LEFT");
  IElementType ROTATE_RIGHT = new ModulaTokenType("ROTATE_RIGHT");
  IElementType SET = new ModulaTokenType("SET");
  IElementType SHIFT_ARITHMETIC_RIGHT = new ModulaTokenType("SHIFT_ARITHMETIC_RIGHT");
  IElementType SHIFT_LEFT = new ModulaTokenType("SHIFT_LEFT");
  IElementType SHIFT_RIGHT = new ModulaTokenType("SHIFT_RIGHT");
  IElementType SMALL = new ModulaTokenType("SMALL");
  IElementType SQUARE_BRACE_CLOSE = new ModulaTokenType("SQUARE_BRACE_CLOSE");
  IElementType SQUARE_BRACE_OPEN = new ModulaTokenType("SQUARE_BRACE_OPEN");
  IElementType STRING_CONST_DOUBLE = new ModulaTokenType("STRING_CONST_DOUBLE");
  IElementType STRING_CONST_DOUBLE_ANSI = new ModulaTokenType("STRING_CONST_DOUBLE_ANSI");
  IElementType STRING_CONST_DOUBLE_UNICODE = new ModulaTokenType("STRING_CONST_DOUBLE_UNICODE");
  IElementType STRING_CONST_SINGLE = new ModulaTokenType("STRING_CONST_SINGLE");
  IElementType STRING_CONST_SINGLE_ANSI = new ModulaTokenType("STRING_CONST_SINGLE_ANSI");
  IElementType STRING_CONST_SINGLE_UNICODE = new ModulaTokenType("STRING_CONST_SINGLE_UNICODE");
  IElementType THEN = new ModulaTokenType("THEN");
  IElementType TIMES = new ModulaTokenType("TIMES");
  IElementType TO = new ModulaTokenType("TO");
  IElementType TOKEN_ACHAR = new ModulaTokenType("TOKEN_ACHAR");
  IElementType TOKEN_BITSET = new ModulaTokenType("TOKEN_BITSET");
  IElementType TOKEN_BITSET16 = new ModulaTokenType("TOKEN_BITSET16");
  IElementType TOKEN_BITSET32 = new ModulaTokenType("TOKEN_BITSET32");
  IElementType TOKEN_BOOLEAN = new ModulaTokenType("TOKEN_BOOLEAN");
  IElementType TOKEN_BYTEBOOL = new ModulaTokenType("TOKEN_BYTEBOOL");
  IElementType TOKEN_CARDINAL = new ModulaTokenType("TOKEN_CARDINAL");
  IElementType TOKEN_CARDINAL16 = new ModulaTokenType("TOKEN_CARDINAL16");
  IElementType TOKEN_CARDINAL32 = new ModulaTokenType("TOKEN_CARDINAL32");
  IElementType TOKEN_CARDINAL64 = new ModulaTokenType("TOKEN_CARDINAL64");
  IElementType TOKEN_CHAR = new ModulaTokenType("TOKEN_CHAR");
  IElementType TOKEN_COMPLEX = new ModulaTokenType("TOKEN_COMPLEX");
  IElementType TOKEN_DWORDBOOL = new ModulaTokenType("TOKEN_DWORDBOOL");
  IElementType TOKEN_INTEGER = new ModulaTokenType("TOKEN_INTEGER");
  IElementType TOKEN_INTEGER16 = new ModulaTokenType("TOKEN_INTEGER16");
  IElementType TOKEN_INTEGER32 = new ModulaTokenType("TOKEN_INTEGER32");
  IElementType TOKEN_INTEGER64 = new ModulaTokenType("TOKEN_INTEGER64");
  IElementType TOKEN_LONGCARD = new ModulaTokenType("TOKEN_LONGCARD");
  IElementType TOKEN_LONGCOMPLEX = new ModulaTokenType("TOKEN_LONGCOMPLEX");
  IElementType TOKEN_LONGINT = new ModulaTokenType("TOKEN_LONGINT");
  IElementType TOKEN_LONGREAL = new ModulaTokenType("TOKEN_LONGREAL");
  IElementType TOKEN_REAL = new ModulaTokenType("TOKEN_REAL");
  IElementType TOKEN_SHORTCARD = new ModulaTokenType("TOKEN_SHORTCARD");
  IElementType TOKEN_SHORTINT = new ModulaTokenType("TOKEN_SHORTINT");
  IElementType TOKEN_UCHAR = new ModulaTokenType("TOKEN_UCHAR");
  IElementType TOKEN_WORDBOOL = new ModulaTokenType("TOKEN_WORDBOOL");
  IElementType TYPE = new ModulaTokenType("TYPE");
  IElementType TYPING_OPERATOR = new ModulaTokenType("TYPING_OPERATOR");
  IElementType UNSAFEGUARDED = new ModulaTokenType("UNSAFEGUARDED");
  IElementType UNTIL = new ModulaTokenType("UNTIL");
  IElementType VALUE = new ModulaTokenType("VALUE");
  IElementType VAR = new ModulaTokenType("VAR");
  IElementType VOLATILE = new ModulaTokenType("VOLATILE");
  IElementType WHILE = new ModulaTokenType("WHILE");
  IElementType WITH = new ModulaTokenType("WITH");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ANONYMOUS_PARAMETER) {
        return new DefinitionAnonymousParameterImpl(node);
      }
      else if (type == ARRAY_CONSTANT) {
        return new DefinitionArrayConstantImpl(node);
      }
      else if (type == ARRAY_CONSTANT_TYPE) {
        return new DefinitionArrayConstantTypeImpl(node);
      }
      else if (type == ARRAY_DECLARATION) {
        return new DefinitionArrayDeclarationImpl(node);
      }
      else if (type == ARRAY_DEFINITION) {
        return new DefinitionArrayDefinitionImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new DefinitionAssignmentImpl(node);
      }
      else if (type == ATTRIBUTE) {
        return new DefinitionAttributeImpl(node);
      }
      else if (type == BASIC_TYPE) {
        return new DefinitionBasicTypeImpl(node);
      }
      else if (type == CASE_RANGE) {
        return new DefinitionCaseRangeImpl(node);
      }
      else if (type == CASE_STATEMENT) {
        return new DefinitionCaseStatementImpl(node);
      }
      else if (type == COMPLEX_LITERAL) {
        return new DefinitionComplexLiteralImpl(node);
      }
      else if (type == CONSTANT_ARRAY_ELEMENT) {
        return new DefinitionConstantArrayElementImpl(node);
      }
      else if (type == CONSTANT_DEFINITION) {
        return new DefinitionConstantDefinitionImpl(node);
      }
      else if (type == CONSTANT_DEFINITIONS) {
        return new DefinitionConstantDefinitionsImpl(node);
      }
      else if (type == CONSTANT_DESIGNATOR) {
        return new DefinitionConstantDesignatorImpl(node);
      }
      else if (type == CONSTANT_NAME) {
        return new DefinitionConstantNameImpl(node);
      }
      else if (type == CONSTANT_TYPE) {
        return new DefinitionConstantTypeImpl(node);
      }
      else if (type == CONSTANT_VALUE) {
        return new DefinitionConstantValueImpl(node);
      }
      else if (type == CONSTANT_VALUE_MODULE_PARAMETER) {
        return new DefinitionConstantValueModuleParameterImpl(node);
      }
      else if (type == CONST_EXPRESSION) {
        return new DefinitionConstExpressionImpl(node);
      }
      else if (type == CONST_FACTOR) {
        return new DefinitionConstFactorImpl(node);
      }
      else if (type == CONST_TERM) {
        return new DefinitionConstTermImpl(node);
      }
      else if (type == DEFINITION_CLAUSE) {
        return new DefinitionDefinitionClauseImpl(node);
      }
      else if (type == DEFINITION_FILE) {
        return new DefinitionDefinitionFileImpl(node);
      }
      else if (type == DESIGNATOR) {
        return new DefinitionDesignatorImpl(node);
      }
      else if (type == DO_STATEMENT) {
        return new DefinitionDoStatementImpl(node);
      }
      else if (type == ELEMENT) {
        return new DefinitionElementImpl(node);
      }
      else if (type == ENUMERATION_DEFINITION) {
        return new DefinitionEnumerationDefinitionImpl(node);
      }
      else if (type == ENUMERATION_MEMBER_DEFINITION) {
        return new DefinitionEnumerationMemberDefinitionImpl(node);
      }
      else if (type == ENUMERATION_MEMBER_DESIGNATOR) {
        return new DefinitionEnumerationMemberDesignatorImpl(node);
      }
      else if (type == ENUMERATION_MEMBER_NAME) {
        return new DefinitionEnumerationMemberNameImpl(node);
      }
      else if (type == EXPORT_NAME_DECLARATION) {
        return new DefinitionExportNameDeclarationImpl(node);
      }
      else if (type == EXPRESSION) {
        return new DefinitionExpressionImpl(node);
      }
      else if (type == FACTOR) {
        return new DefinitionFactorImpl(node);
      }
      else if (type == FIELD) {
        return new DefinitionFieldImpl(node);
      }
      else if (type == FIELDS) {
        return new DefinitionFieldsImpl(node);
      }
      else if (type == FIELD_NAME) {
        return new DefinitionFieldNameImpl(node);
      }
      else if (type == FOOTER) {
        return new DefinitionFooterImpl(node);
      }
      else if (type == FUNCTION_DESIGNATOR) {
        return new DefinitionFunctionDesignatorImpl(node);
      }
      else if (type == GENERIC_DESIGNATOR) {
        return new DefinitionGenericDesignatorImpl(node);
      }
      else if (type == GENERIC_MODULE_DEFINITION) {
        return new DefinitionGenericModuleDefinitionImpl(node);
      }
      else if (type == HEADER) {
        return new DefinitionHeaderImpl(node);
      }
      else if (type == IDENT) {
        return new DefinitionIdentImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new DefinitionIfStatementImpl(node);
      }
      else if (type == IGNORED) {
        return new DefinitionIgnoredImpl(node);
      }
      else if (type == IMPORT_CLAUSE) {
        return new DefinitionImportClauseImpl(node);
      }
      else if (type == IMPORT_SYMBOL) {
        return new DefinitionImportSymbolImpl(node);
      }
      else if (type == INDEX_TYPE) {
        return new DefinitionIndexTypeImpl(node);
      }
      else if (type == INNER_RANGE) {
        return new DefinitionInnerRangeImpl(node);
      }
      else if (type == INTEGER_LITERAL) {
        return new DefinitionIntegerLiteralImpl(node);
      }
      else if (type == LITERAL) {
        return new DefinitionLiteralImpl(node);
      }
      else if (type == LOOP_STATEMENT) {
        return new DefinitionLoopStatementImpl(node);
      }
      else if (type == L_VALUE) {
        return new DefinitionLValueImpl(node);
      }
      else if (type == MACRO_CONSTANT_DEFINITION) {
        return new DefinitionMacroConstantDefinitionImpl(node);
      }
      else if (type == MACRO_CONSTANT_DEFINITIONS) {
        return new DefinitionMacroConstantDefinitionsImpl(node);
      }
      else if (type == MACRO_DECLARATION) {
        return new DefinitionMacroDeclarationImpl(node);
      }
      else if (type == MACRO_INNER_DECLARATIONS) {
        return new DefinitionMacroInnerDeclarationsImpl(node);
      }
      else if (type == MACRO_TYPE_DEFINITION) {
        return new DefinitionMacroTypeDefinitionImpl(node);
      }
      else if (type == MACRO_TYPE_DEFINITIONS) {
        return new DefinitionMacroTypeDefinitionsImpl(node);
      }
      else if (type == MACRO_VARIABLE_DEFINITION) {
        return new DefinitionMacroVariableDefinitionImpl(node);
      }
      else if (type == MACRO_VARIABLE_DEFINITIONS) {
        return new DefinitionMacroVariableDefinitionsImpl(node);
      }
      else if (type == MODULE_DEFINITION) {
        return new DefinitionModuleDefinitionImpl(node);
      }
      else if (type == MODULE_IMPORT) {
        return new DefinitionModuleImportImpl(node);
      }
      else if (type == MODULE_IMPORT_CLAUSE) {
        return new DefinitionModuleImportClauseImpl(node);
      }
      else if (type == MODULE_NAME) {
        return new DefinitionModuleNameImpl(node);
      }
      else if (type == MODULE_PARAMETER) {
        return new DefinitionModuleParameterImpl(node);
      }
      else if (type == MODULE_PARAMETERS) {
        return new DefinitionModuleParametersImpl(node);
      }
      else if (type == MODULE_PARAMETER_NAME) {
        return new DefinitionModuleParameterNameImpl(node);
      }
      else if (type == NAMED_TYPE) {
        return new DefinitionNamedTypeImpl(node);
      }
      else if (type == NUMBER) {
        return new DefinitionNumberImpl(node);
      }
      else if (type == OPAQUE_TYPE_DEFINITION) {
        return new DefinitionOpaqueTypeDefinitionImpl(node);
      }
      else if (type == PARAMETER) {
        return new DefinitionParameterImpl(node);
      }
      else if (type == PARAMETERS) {
        return new DefinitionParametersImpl(node);
      }
      else if (type == PARAMETERS_COMMA_SEPARATED) {
        return new DefinitionParametersCommaSeparatedImpl(node);
      }
      else if (type == PARAMETER_NAME) {
        return new DefinitionParameterNameImpl(node);
      }
      else if (type == POINTER_DEFINITION) {
        return new DefinitionPointerDefinitionImpl(node);
      }
      else if (type == PREDEFINED_TYPE) {
        return new DefinitionPredefinedTypeImpl(node);
      }
      else if (type == PROCEDURE_ATTRIBUTES) {
        return new DefinitionProcedureAttributesImpl(node);
      }
      else if (type == PROCEDURE_DEFINITION) {
        return new DefinitionProcedureDefinitionImpl(node);
      }
      else if (type == PROCEDURE_MODIFIERS) {
        return new DefinitionProcedureModifiersImpl(node);
      }
      else if (type == PROCEDURE_NAME) {
        return new DefinitionProcedureNameImpl(node);
      }
      else if (type == PROCEDURE_TYPE_DEFINITION) {
        return new DefinitionProcedureTypeDefinitionImpl(node);
      }
      else if (type == QUALIDENT) {
        return new DefinitionQualidentImpl(node);
      }
      else if (type == RANGE) {
        return new DefinitionRangeImpl(node);
      }
      else if (type == REAL_LITERAL) {
        return new DefinitionRealLiteralImpl(node);
      }
      else if (type == RECORD_CONSTANT) {
        return new DefinitionRecordConstantImpl(node);
      }
      else if (type == RECORD_DEFINITION) {
        return new DefinitionRecordDefinitionImpl(node);
      }
      else if (type == RECOVER_END_OF_STATEMENT) {
        return new DefinitionRecoverEndOfStatementImpl(node);
      }
      else if (type == RECOVER_WHILE_STATEMENT) {
        return new DefinitionRecoverWhileStatementImpl(node);
      }
      else if (type == SELECTOR) {
        return new DefinitionSelectorImpl(node);
      }
      else if (type == SET_DEFINITION) {
        return new DefinitionSetDefinitionImpl(node);
      }
      else if (type == SET_DESIGNATOR) {
        return new DefinitionSetDesignatorImpl(node);
      }
      else if (type == SET_EXPRESSION) {
        return new DefinitionSetExpressionImpl(node);
      }
      else if (type == SET_LITERAL) {
        return new DefinitionSetLiteralImpl(node);
      }
      else if (type == SIMPLE_CONST_EXPRESSION) {
        return new DefinitionSimpleConstExpressionImpl(node);
      }
      else if (type == SIMPLE_EXPRESSION) {
        return new DefinitionSimpleExpressionImpl(node);
      }
      else if (type == STATEMENT) {
        return new DefinitionStatementImpl(node);
      }
      else if (type == STATEMENTS) {
        return new DefinitionStatementsImpl(node);
      }
      else if (type == STATIC_FIELD) {
        return new DefinitionStaticFieldImpl(node);
      }
      else if (type == STONY_BROOK_TYPE) {
        return new DefinitionStonyBrookTypeImpl(node);
      }
      else if (type == STRING) {
        return new DefinitionStringImpl(node);
      }
      else if (type == SYMBOL_IMPORT_CLAUSE) {
        return new DefinitionSymbolImportClauseImpl(node);
      }
      else if (type == SYMBOL_NAME) {
        return new DefinitionSymbolNameImpl(node);
      }
      else if (type == TERM) {
        return new DefinitionTermImpl(node);
      }
      else if (type == TYPE_ALIAS_DEFINITION) {
        return new DefinitionTypeAliasDefinitionImpl(node);
      }
      else if (type == TYPE_DEFINITION) {
        return new DefinitionTypeDefinitionImpl(node);
      }
      else if (type == TYPE_DEFINITIONS) {
        return new DefinitionTypeDefinitionsImpl(node);
      }
      else if (type == TYPE_DESIGNATOR) {
        return new DefinitionTypeDesignatorImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new DefinitionTypeNameImpl(node);
      }
      else if (type == TYPE_PARAMETER) {
        return new DefinitionTypeParameterImpl(node);
      }
      else if (type == TYPE_SPECIFICATION) {
        return new DefinitionTypeSpecificationImpl(node);
      }
      else if (type == VARIABLE_DEFINITION) {
        return new DefinitionVariableDefinitionImpl(node);
      }
      else if (type == VARIABLE_DEFINITIONS) {
        return new DefinitionVariableDefinitionsImpl(node);
      }
      else if (type == VARIABLE_MODIFIERS) {
        return new DefinitionVariableModifiersImpl(node);
      }
      else if (type == VARIABLE_NAME) {
        return new DefinitionVariableNameImpl(node);
      }
      else if (type == VARIABLE_NAME_DEFINITION) {
        return new DefinitionVariableNameDefinitionImpl(node);
      }
      else if (type == VARIANT) {
        return new DefinitionVariantImpl(node);
      }
      else if (type == VARIANTS) {
        return new DefinitionVariantsImpl(node);
      }
      else if (type == VARIANT_FIELD) {
        return new DefinitionVariantFieldImpl(node);
      }
      else if (type == WHATEVER) {
        return new DefinitionWhateverImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
