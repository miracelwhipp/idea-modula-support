// This is a generated file. Not intended for manual editing.
package org.modula.parsing.modula.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.modula.parsing.psi.ModulaElementType;
import org.modula.helpers.index.stub.element.types.ConstantStubElementType;
import org.modula.helpers.index.stub.element.types.EnumerationMemberStubElementType;
import org.modula.helpers.index.stub.element.types.ModuleStubElementType;
import org.modula.helpers.index.stub.element.types.ParameterStubElementType;
import org.modula.helpers.index.stub.element.types.ProcedureStubElementType;
import org.modula.helpers.index.stub.element.types.TypeStubElementType;
import org.modula.helpers.index.stub.element.types.VariableStubElementType;
import org.modula.parsing.psi.ModulaTokenType;
import org.modula.parsing.modula.psi.impl.*;

public interface TokenModulaTypes {

  IElementType ACTUAL_PARAMETERS = new ModulaElementType("ACTUAL_PARAMETERS");
  IElementType ANONYMOUS_ARRAY_CONSTANT = new ModulaElementType("ANONYMOUS_ARRAY_CONSTANT");
  IElementType ARRAY_RANGE_TYPE = new ModulaElementType("ARRAY_RANGE_TYPE");
  IElementType ARRAY_SELECTION = new ModulaElementType("ARRAY_SELECTION");
  IElementType ARRAY_SLICE = new ModulaElementType("ARRAY_SLICE");
  IElementType ARRAY_TYPE = new ModulaElementType("ARRAY_TYPE");
  IElementType ASM_STATEMENT = new ModulaElementType("ASM_STATEMENT");
  IElementType ASSEMBLER_STATEMENT = new ModulaElementType("ASSEMBLER_STATEMENT");
  IElementType ASSEMBLY_BLOCK = new ModulaElementType("ASSEMBLY_BLOCK");
  IElementType ASSERT_STATEMENT = new ModulaElementType("ASSERT_STATEMENT");
  IElementType ASSIGNMENT = new ModulaElementType("ASSIGNMENT");
  IElementType ATTRIBUTE = new ModulaElementType("ATTRIBUTE");
  IElementType BASIC_TYPE = new ModulaElementType("BASIC_TYPE");
  IElementType BLOCK = new ModulaElementType("BLOCK");
  IElementType CASE_DESIGNATOR = new ModulaElementType("CASE_DESIGNATOR");
  IElementType CASE_FACTOR = new ModulaElementType("CASE_FACTOR");
  IElementType CASE_LABELS = new ModulaElementType("CASE_LABELS");
  IElementType CASE_LABEL_EXPRESSION = new ModulaElementType("CASE_LABEL_EXPRESSION");
  IElementType CASE_LABEL_LIST = new ModulaElementType("CASE_LABEL_LIST");
  IElementType CASE_SIMPLE_EXPRESSION = new ModulaElementType("CASE_SIMPLE_EXPRESSION");
  IElementType CASE_STATEMENT = new ModulaElementType("CASE_STATEMENT");
  IElementType CASE_STATEMENTS = new ModulaElementType("CASE_STATEMENTS");
  IElementType CASE_TERM = new ModulaElementType("CASE_TERM");
  IElementType CLASS_DECLARATION = new ModulaElementType("CLASS_DECLARATION");
  IElementType COERCION_QUALIFIER = new ModulaElementType("COERCION_QUALIFIER");
  IElementType COMPILATION_UNIT = new ModulaElementType("COMPILATION_UNIT");
  IElementType COMPLEX_LITERAL = new ModulaElementType("COMPLEX_LITERAL");
  IElementType CONSTANT_DECLARATION = new ConstantStubElementType("CONSTANT_DECLARATION");
  IElementType CONSTANT_DECLARATIONS = new ModulaElementType("CONSTANT_DECLARATIONS");
  IElementType DECLARATION = new ModulaElementType("DECLARATION");
  IElementType DEFINITIONS = new ModulaElementType("DEFINITIONS");
  IElementType DEFINITION_MODULE = new ModulaElementType("DEFINITION_MODULE");
  IElementType DESIGNATOR = new ModulaElementType("DESIGNATOR");
  IElementType ELEMENT = new ModulaElementType("ELEMENT");
  IElementType ENUMERATION_DEFINITION = new ModulaElementType("ENUMERATION_DEFINITION");
  IElementType ENUMERATION_MEMBER_DEFINITION = new EnumerationMemberStubElementType("ENUMERATION_MEMBER_DEFINITION");
  IElementType EXPORT_CLAUSE = new ModulaElementType("EXPORT_CLAUSE");
  IElementType EXPORT_DECLARATION = new ModulaElementType("EXPORT_DECLARATION");
  IElementType EXPORT_DECLARATIONS = new ModulaElementType("EXPORT_DECLARATIONS");
  IElementType EXPORT_NAME_DECLARATION = new ModulaElementType("EXPORT_NAME_DECLARATION");
  IElementType EXPRESSION = new ModulaElementType("EXPRESSION");
  IElementType FACTOR = new ModulaElementType("FACTOR");
  IElementType FIELD_LIST = new ModulaElementType("FIELD_LIST");
  IElementType FIELD_LIST_SEQUENCE = new ModulaElementType("FIELD_LIST_SEQUENCE");
  IElementType FORMAL_PARAMETERS = new ModulaElementType("FORMAL_PARAMETERS");
  IElementType FORMAL_TYPE = new ModulaElementType("FORMAL_TYPE");
  IElementType FORMAL_TYPE_LIST = new ModulaElementType("FORMAL_TYPE_LIST");
  IElementType FOR_STATEMENT = new ModulaElementType("FOR_STATEMENT");
  IElementType FP_SECTION = new ModulaElementType("FP_SECTION");
  IElementType FUNC_STATEMENT = new ModulaElementType("FUNC_STATEMENT");
  IElementType IDENT = new ModulaElementType("IDENT");
  IElementType IDENT_ASSERT = new ModulaElementType("IDENT_ASSERT");
  IElementType IDENT_FUNC = new ModulaElementType("IDENT_FUNC");
  IElementType IDENT_LIST = new ModulaElementType("IDENT_LIST");
  IElementType IF_STATEMENT = new ModulaElementType("IF_STATEMENT");
  IElementType IGNORED = new ModulaElementType("IGNORED");
  IElementType IMPORT_CLAUSE = new ModulaElementType("IMPORT_CLAUSE");
  IElementType IMPORT_SYMBOL = new ModulaElementType("IMPORT_SYMBOL");
  IElementType INTEGER_LITERAL = new ModulaElementType("INTEGER_LITERAL");
  IElementType LOOP_STATEMENT = new ModulaElementType("LOOP_STATEMENT");
  IElementType MACRO_DECLARATION = new ModulaElementType("MACRO_DECLARATION");
  IElementType MODULE_BLOCK = new ModulaElementType("MODULE_BLOCK");
  IElementType MODULE_DECLARATION = new ModulaElementType("MODULE_DECLARATION");
  IElementType MODULE_EXPORT = new ModulaElementType("MODULE_EXPORT");
  IElementType MODULE_HEADER = new ModuleStubElementType("MODULE_HEADER");
  IElementType MODULE_IMPORT = new ModulaElementType("MODULE_IMPORT");
  IElementType MODULE_IMPORT_CLAUSE = new ModulaElementType("MODULE_IMPORT_CLAUSE");
  IElementType MODULE_NAME = new ModulaElementType("MODULE_NAME");
  IElementType NUMBER = new ModulaElementType("NUMBER");
  IElementType PARAMETER = new ModulaElementType("PARAMETER");
  IElementType PARAMETER_IDENT_LIST = new ModulaElementType("PARAMETER_IDENT_LIST");
  IElementType PARAMETER_LIST = new ModulaElementType("PARAMETER_LIST");
  IElementType PARAMETER_MODIFIER = new ModulaElementType("PARAMETER_MODIFIER");
  IElementType PARAMETER_NAME = new ParameterStubElementType("PARAMETER_NAME");
  IElementType PARAMETER_VALUE_MODIFIER = new ModulaElementType("PARAMETER_VALUE_MODIFIER");
  IElementType POINTER_TYPE = new ModulaElementType("POINTER_TYPE");
  IElementType PREDEFINED_IDENTIFIER = new ModulaElementType("PREDEFINED_IDENTIFIER");
  IElementType PRIORITY = new ModulaElementType("PRIORITY");
  IElementType PROCEDURE_ATTRIBUTES = new ModulaElementType("PROCEDURE_ATTRIBUTES");
  IElementType PROCEDURE_BLOCK = new ModulaElementType("PROCEDURE_BLOCK");
  IElementType PROCEDURE_CALL = new ModulaElementType("PROCEDURE_CALL");
  IElementType PROCEDURE_DECLARATION = new ModulaElementType("PROCEDURE_DECLARATION");
  IElementType PROCEDURE_EXPORT = new ModulaElementType("PROCEDURE_EXPORT");
  IElementType PROCEDURE_HEADING = new ProcedureStubElementType("PROCEDURE_HEADING");
  IElementType PROCEDURE_MODIFIERS = new ModulaElementType("PROCEDURE_MODIFIERS");
  IElementType PROCEDURE_TYPE = new ModulaElementType("PROCEDURE_TYPE");
  IElementType PROGRAM_HEADER = new ModulaElementType("PROGRAM_HEADER");
  IElementType PROGRAM_MODULE = new ModulaElementType("PROGRAM_MODULE");
  IElementType QUALIDENT = new ModulaElementType("QUALIDENT");
  IElementType REAL_LITERAL = new ModulaElementType("REAL_LITERAL");
  IElementType RECORD_SELECTION = new ModulaElementType("RECORD_SELECTION");
  IElementType RECORD_TYPE = new ModulaElementType("RECORD_TYPE");
  IElementType RECOVERING_EXPRESSION = new ModulaElementType("RECOVERING_EXPRESSION");
  IElementType RECOVER_END_OF_DECLARATION = new ModulaElementType("RECOVER_END_OF_DECLARATION");
  IElementType RECOVER_END_OF_EXPRESSION = new ModulaElementType("RECOVER_END_OF_EXPRESSION");
  IElementType RECOVER_END_OF_STATEMENT = new ModulaElementType("RECOVER_END_OF_STATEMENT");
  IElementType RECOVER_WHILE_STATEMENT = new ModulaElementType("RECOVER_WHILE_STATEMENT");
  IElementType REPEAT_STATEMENT = new ModulaElementType("REPEAT_STATEMENT");
  IElementType SET_EXPRESSION = new ModulaElementType("SET_EXPRESSION");
  IElementType SET_TYPE = new ModulaElementType("SET_TYPE");
  IElementType SIMPLE_EXPRESSION = new ModulaElementType("SIMPLE_EXPRESSION");
  IElementType SIMPLE_TYPE = new ModulaElementType("SIMPLE_TYPE");
  IElementType STATEMENT = new ModulaElementType("STATEMENT");
  IElementType STONY_BROOK_TYPE = new ModulaElementType("STONY_BROOK_TYPE");
  IElementType STRING = new ModulaElementType("STRING");
  IElementType SUB_RANGE_TYPE_OR_QUAL_IDENT = new ModulaElementType("SUB_RANGE_TYPE_OR_QUAL_IDENT");
  IElementType SYMBOL_IMPORT_CLAUSE = new ModulaElementType("SYMBOL_IMPORT_CLAUSE");
  IElementType TERM = new ModulaElementType("TERM");
  IElementType TYPES = new ModulaElementType("TYPES");
  IElementType TYPE_DECLARATION = new ModulaElementType("TYPE_DECLARATION");
  IElementType TYPE_DECLARATIONS = new ModulaElementType("TYPE_DECLARATIONS");
  IElementType TYPE_DEFINITION = new TypeStubElementType("TYPE_DEFINITION");
  IElementType TYPE_NAME = new ModulaElementType("TYPE_NAME");
  IElementType VARIABLE_ADDRESS_SPECIFICATION = new ModulaElementType("VARIABLE_ADDRESS_SPECIFICATION");
  IElementType VARIABLE_DECLARATION = new ModulaElementType("VARIABLE_DECLARATION");
  IElementType VARIABLE_DECLARATIONS = new ModulaElementType("VARIABLE_DECLARATIONS");
  IElementType VARIABLE_MODIFIERS = new ModulaElementType("VARIABLE_MODIFIERS");
  IElementType VARIABLE_NAME_DECLARATION = new ModulaElementType("VARIABLE_NAME_DECLARATION");
  IElementType VARIABLE_NAME_DEFINITION = new VariableStubElementType("VARIABLE_NAME_DEFINITION");
  IElementType VARIABLE_VOLATILE_SPECIFICATION = new ModulaElementType("VARIABLE_VOLATILE_SPECIFICATION");
  IElementType VARIANT = new ModulaElementType("VARIANT");
  IElementType WHILE_STATEMENT = new ModulaElementType("WHILE_STATEMENT");
  IElementType WITH_STATEMENT = new ModulaElementType("WITH_STATEMENT");

  IElementType AND = new ModulaTokenType("AND");
  IElementType ANYTHING = new ModulaTokenType("ANYTHING");
  IElementType ARRAY = new ModulaTokenType("ARRAY");
  IElementType ASM = new ModulaTokenType("ASM");
  IElementType ASSEMBLER = new ModulaTokenType("ASSEMBLER");
  IElementType ASSERT = new ModulaTokenType("ASSERT");
  IElementType ASSIGNMENT_OPERATOR = new ModulaTokenType("ASSIGNMENT_OPERATOR");
  IElementType BEGIN = new ModulaTokenType("BEGIN");
  IElementType BIG = new ModulaTokenType("BIG");
  IElementType BITWISE_AND = new ModulaTokenType("BITWISE_AND");
  IElementType BITWISE_NOT = new ModulaTokenType("BITWISE_NOT");
  IElementType BITWISE_OR = new ModulaTokenType("BITWISE_OR");
  IElementType BITWISE_XOR = new ModulaTokenType("BITWISE_XOR");
  IElementType BREAK = new ModulaTokenType("BREAK");
  IElementType BY = new ModulaTokenType("BY");
  IElementType CASE = new ModulaTokenType("CASE");
  IElementType CHAR_CONST = new ModulaTokenType("CHAR_CONST");
  IElementType CLASS = new ModulaTokenType("CLASS");
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
  IElementType CONTINUE = new ModulaTokenType("CONTINUE");
  IElementType CURLY_BRACE_CLOSE = new ModulaTokenType("CURLY_BRACE_CLOSE");
  IElementType CURLY_BRACE_OPEN = new ModulaTokenType("CURLY_BRACE_OPEN");
  IElementType DEFINITION = new ModulaTokenType("DEFINITION");
  IElementType DIFFERENT = new ModulaTokenType("DIFFERENT");
  IElementType DIVISION = new ModulaTokenType("DIVISION");
  IElementType DLLACCESS = new ModulaTokenType("DLLACCESS");
  IElementType DO = new ModulaTokenType("DO");
  IElementType DOCUMENTATION_COMMENT = new ModulaTokenType("DOCUMENTATION_COMMENT");
  IElementType DOT = new ModulaTokenType("DOT");
  IElementType ELSE = new ModulaTokenType("ELSE");
  IElementType ELSIF = new ModulaTokenType("ELSIF");
  IElementType END = new ModulaTokenType("END");
  IElementType END_OF_STATEMENT = new ModulaTokenType("END_OF_STATEMENT");
  IElementType EQUALITY_OPERATOR = new ModulaTokenType("EQUALITY_OPERATOR");
  IElementType EXCEPT = new ModulaTokenType("EXCEPT");
  IElementType EXIT = new ModulaTokenType("EXIT");
  IElementType EXPORT = new ModulaTokenType("EXPORT");
  IElementType EXPORTS = new ModulaTokenType("EXPORTS");
  IElementType EXTERNAL = new ModulaTokenType("EXTERNAL");
  IElementType FAR = new ModulaTokenType("FAR");
  IElementType FINALLY = new ModulaTokenType("FINALLY");
  IElementType FOR = new ModulaTokenType("FOR");
  IElementType FORWARD = new ModulaTokenType("FORWARD");
  IElementType FOR_LOOP_INCREMENT = new ModulaTokenType("FOR_LOOP_INCREMENT");
  IElementType FROM = new ModulaTokenType("FROM");
  IElementType FUNC = new ModulaTokenType("FUNC");
  IElementType GENERIC = new ModulaTokenType("GENERIC");
  IElementType GREATER_EQUALS = new ModulaTokenType("GREATER_EQUALS");
  IElementType GREATER_THAN = new ModulaTokenType("GREATER_THAN");
  IElementType IDENTIFIER = new ModulaTokenType("IDENTIFIER");
  IElementType IF = new ModulaTokenType("IF");
  IElementType IMPLEMENTATION = new ModulaTokenType("IMPLEMENTATION");
  IElementType IMPORT = new ModulaTokenType("IMPORT");
  IElementType INDEX = new ModulaTokenType("INDEX");
  IElementType INHERIT = new ModulaTokenType("INHERIT");
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
  IElementType NAME = new ModulaTokenType("NAME");
  IElementType NEAR = new ModulaTokenType("NEAR");
  IElementType NOHIGH = new ModulaTokenType("NOHIGH");
  IElementType NOT = new ModulaTokenType("NOT");
  IElementType OF = new ModulaTokenType("OF");
  IElementType OPEN_BRACE = new ModulaTokenType("OPEN_BRACE");
  IElementType OR = new ModulaTokenType("OR");
  IElementType OUT = new ModulaTokenType("OUT");
  IElementType OVERRIDE = new ModulaTokenType("OVERRIDE");
  IElementType PACKEDSET = new ModulaTokenType("PACKEDSET");
  IElementType PIPE = new ModulaTokenType("PIPE");
  IElementType PLUS = new ModulaTokenType("PLUS");
  IElementType POINTER = new ModulaTokenType("POINTER");
  IElementType POINTER_DEREFERENCE_OPERATOR = new ModulaTokenType("POINTER_DEREFERENCE_OPERATOR");
  IElementType PROCEDURE = new ModulaTokenType("PROCEDURE");
  IElementType PUBLIC = new ModulaTokenType("PUBLIC");
  IElementType PUREASM = new ModulaTokenType("PUREASM");
  IElementType QUALIFIED = new ModulaTokenType("QUALIFIED");
  IElementType RANGE_OPERATOR = new ModulaTokenType("RANGE_OPERATOR");
  IElementType READONLY = new ModulaTokenType("READONLY");
  IElementType REAL_CONST = new ModulaTokenType("REAL_CONST");
  IElementType RECORD = new ModulaTokenType("RECORD");
  IElementType REMAINDER = new ModulaTokenType("REMAINDER");
  IElementType REPEAT = new ModulaTokenType("REPEAT");
  IElementType RESIDENT = new ModulaTokenType("RESIDENT");
  IElementType RETURN = new ModulaTokenType("RETURN");
  IElementType REVEAL = new ModulaTokenType("REVEAL");
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
  IElementType SYSTEM = new ModulaTokenType("SYSTEM");
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
       if (type == ACTUAL_PARAMETERS) {
        return new ModulaActualParametersImpl(node);
      }
      else if (type == ANONYMOUS_ARRAY_CONSTANT) {
        return new ModulaAnonymousArrayConstantImpl(node);
      }
      else if (type == ARRAY_RANGE_TYPE) {
        return new ModulaArrayRangeTypeImpl(node);
      }
      else if (type == ARRAY_SELECTION) {
        return new ModulaArraySelectionImpl(node);
      }
      else if (type == ARRAY_SLICE) {
        return new ModulaArraySliceImpl(node);
      }
      else if (type == ARRAY_TYPE) {
        return new ModulaArrayTypeImpl(node);
      }
      else if (type == ASM_STATEMENT) {
        return new ModulaAsmStatementImpl(node);
      }
      else if (type == ASSEMBLER_STATEMENT) {
        return new ModulaAssemblerStatementImpl(node);
      }
      else if (type == ASSEMBLY_BLOCK) {
        return new ModulaAssemblyBlockImpl(node);
      }
      else if (type == ASSERT_STATEMENT) {
        return new ModulaAssertStatementImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new ModulaAssignmentImpl(node);
      }
      else if (type == ATTRIBUTE) {
        return new ModulaAttributeImpl(node);
      }
      else if (type == BASIC_TYPE) {
        return new ModulaBasicTypeImpl(node);
      }
      else if (type == BLOCK) {
        return new ModulaBlockImpl(node);
      }
      else if (type == CASE_DESIGNATOR) {
        return new ModulaCaseDesignatorImpl(node);
      }
      else if (type == CASE_FACTOR) {
        return new ModulaCaseFactorImpl(node);
      }
      else if (type == CASE_LABELS) {
        return new ModulaCaseLabelsImpl(node);
      }
      else if (type == CASE_LABEL_EXPRESSION) {
        return new ModulaCaseLabelExpressionImpl(node);
      }
      else if (type == CASE_LABEL_LIST) {
        return new ModulaCaseLabelListImpl(node);
      }
      else if (type == CASE_SIMPLE_EXPRESSION) {
        return new ModulaCaseSimpleExpressionImpl(node);
      }
      else if (type == CASE_STATEMENT) {
        return new ModulaCaseStatementImpl(node);
      }
      else if (type == CASE_STATEMENTS) {
        return new ModulaCaseStatementsImpl(node);
      }
      else if (type == CASE_TERM) {
        return new ModulaCaseTermImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new ModulaClassDeclarationImpl(node);
      }
      else if (type == COERCION_QUALIFIER) {
        return new ModulaCoercionQualifierImpl(node);
      }
      else if (type == COMPILATION_UNIT) {
        return new ModulaCompilationUnitImpl(node);
      }
      else if (type == COMPLEX_LITERAL) {
        return new ModulaComplexLiteralImpl(node);
      }
      else if (type == CONSTANT_DECLARATION) {
        return new ModulaConstantDeclarationImpl(node);
      }
      else if (type == CONSTANT_DECLARATIONS) {
        return new ModulaConstantDeclarationsImpl(node);
      }
      else if (type == DECLARATION) {
        return new ModulaDeclarationImpl(node);
      }
      else if (type == DEFINITIONS) {
        return new ModulaDefinitionsImpl(node);
      }
      else if (type == DEFINITION_MODULE) {
        return new ModulaDefinitionModuleImpl(node);
      }
      else if (type == DESIGNATOR) {
        return new ModulaDesignatorImpl(node);
      }
      else if (type == ELEMENT) {
        return new ModulaElementImpl(node);
      }
      else if (type == ENUMERATION_DEFINITION) {
        return new ModulaEnumerationDefinitionImpl(node);
      }
      else if (type == ENUMERATION_MEMBER_DEFINITION) {
        return new ModulaEnumerationMemberDefinitionImpl(node);
      }
      else if (type == EXPORT_CLAUSE) {
        return new ModulaExportClauseImpl(node);
      }
      else if (type == EXPORT_DECLARATION) {
        return new ModulaExportDeclarationImpl(node);
      }
      else if (type == EXPORT_DECLARATIONS) {
        return new ModulaExportDeclarationsImpl(node);
      }
      else if (type == EXPORT_NAME_DECLARATION) {
        return new ModulaExportNameDeclarationImpl(node);
      }
      else if (type == EXPRESSION) {
        return new ModulaExpressionImpl(node);
      }
      else if (type == FACTOR) {
        return new ModulaFactorImpl(node);
      }
      else if (type == FIELD_LIST) {
        return new ModulaFieldListImpl(node);
      }
      else if (type == FIELD_LIST_SEQUENCE) {
        return new ModulaFieldListSequenceImpl(node);
      }
      else if (type == FORMAL_PARAMETERS) {
        return new ModulaFormalParametersImpl(node);
      }
      else if (type == FORMAL_TYPE) {
        return new ModulaFormalTypeImpl(node);
      }
      else if (type == FORMAL_TYPE_LIST) {
        return new ModulaFormalTypeListImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new ModulaForStatementImpl(node);
      }
      else if (type == FP_SECTION) {
        return new ModulaFPSectionImpl(node);
      }
      else if (type == FUNC_STATEMENT) {
        return new ModulaFuncStatementImpl(node);
      }
      else if (type == IDENT) {
        return new ModulaIdentImpl(node);
      }
      else if (type == IDENT_ASSERT) {
        return new ModulaIdentAssertImpl(node);
      }
      else if (type == IDENT_FUNC) {
        return new ModulaIdentFuncImpl(node);
      }
      else if (type == IDENT_LIST) {
        return new ModulaIdentListImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new ModulaIfStatementImpl(node);
      }
      else if (type == IGNORED) {
        return new ModulaIgnoredImpl(node);
      }
      else if (type == IMPORT_CLAUSE) {
        return new ModulaImportClauseImpl(node);
      }
      else if (type == IMPORT_SYMBOL) {
        return new ModulaImportSymbolImpl(node);
      }
      else if (type == INTEGER_LITERAL) {
        return new ModulaIntegerLiteralImpl(node);
      }
      else if (type == LOOP_STATEMENT) {
        return new ModulaLoopStatementImpl(node);
      }
      else if (type == MACRO_DECLARATION) {
        return new ModulaMacroDeclarationImpl(node);
      }
      else if (type == MODULE_BLOCK) {
        return new ModulaModuleBlockImpl(node);
      }
      else if (type == MODULE_DECLARATION) {
        return new ModulaModuleDeclarationImpl(node);
      }
      else if (type == MODULE_EXPORT) {
        return new ModulaModuleExportImpl(node);
      }
      else if (type == MODULE_HEADER) {
        return new ModulaModuleHeaderImpl(node);
      }
      else if (type == MODULE_IMPORT) {
        return new ModulaModuleImportImpl(node);
      }
      else if (type == MODULE_IMPORT_CLAUSE) {
        return new ModulaModuleImportClauseImpl(node);
      }
      else if (type == MODULE_NAME) {
        return new ModulaModuleNameImpl(node);
      }
      else if (type == NUMBER) {
        return new ModulaNumberImpl(node);
      }
      else if (type == PARAMETER) {
        return new ModulaParameterImpl(node);
      }
      else if (type == PARAMETER_IDENT_LIST) {
        return new ModulaParameterIdentListImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new ModulaParameterListImpl(node);
      }
      else if (type == PARAMETER_MODIFIER) {
        return new ModulaParameterModifierImpl(node);
      }
      else if (type == PARAMETER_NAME) {
        return new ModulaParameterNameImpl(node);
      }
      else if (type == PARAMETER_VALUE_MODIFIER) {
        return new ModulaParameterValueModifierImpl(node);
      }
      else if (type == POINTER_TYPE) {
        return new ModulaPointerTypeImpl(node);
      }
      else if (type == PREDEFINED_IDENTIFIER) {
        return new ModulaPredefinedIdentifierImpl(node);
      }
      else if (type == PRIORITY) {
        return new ModulaPriorityImpl(node);
      }
      else if (type == PROCEDURE_ATTRIBUTES) {
        return new ModulaProcedureAttributesImpl(node);
      }
      else if (type == PROCEDURE_BLOCK) {
        return new ModulaProcedureBlockImpl(node);
      }
      else if (type == PROCEDURE_CALL) {
        return new ModulaProcedureCallImpl(node);
      }
      else if (type == PROCEDURE_DECLARATION) {
        return new ModulaProcedureDeclarationImpl(node);
      }
      else if (type == PROCEDURE_EXPORT) {
        return new ModulaProcedureExportImpl(node);
      }
      else if (type == PROCEDURE_HEADING) {
        return new ModulaProcedureHeadingImpl(node);
      }
      else if (type == PROCEDURE_MODIFIERS) {
        return new ModulaProcedureModifiersImpl(node);
      }
      else if (type == PROCEDURE_TYPE) {
        return new ModulaProcedureTypeImpl(node);
      }
      else if (type == PROGRAM_HEADER) {
        return new ModulaProgramHeaderImpl(node);
      }
      else if (type == PROGRAM_MODULE) {
        return new ModulaProgramModuleImpl(node);
      }
      else if (type == QUALIDENT) {
        return new ModulaQualidentImpl(node);
      }
      else if (type == REAL_LITERAL) {
        return new ModulaRealLiteralImpl(node);
      }
      else if (type == RECORD_SELECTION) {
        return new ModulaRecordSelectionImpl(node);
      }
      else if (type == RECORD_TYPE) {
        return new ModulaRecordTypeImpl(node);
      }
      else if (type == RECOVERING_EXPRESSION) {
        return new ModulaRecoveringExpressionImpl(node);
      }
      else if (type == RECOVER_END_OF_DECLARATION) {
        return new ModulaRecoverEndOfDeclarationImpl(node);
      }
      else if (type == RECOVER_END_OF_EXPRESSION) {
        return new ModulaRecoverEndOfExpressionImpl(node);
      }
      else if (type == RECOVER_END_OF_STATEMENT) {
        return new ModulaRecoverEndOfStatementImpl(node);
      }
      else if (type == RECOVER_WHILE_STATEMENT) {
        return new ModulaRecoverWhileStatementImpl(node);
      }
      else if (type == REPEAT_STATEMENT) {
        return new ModulaRepeatStatementImpl(node);
      }
      else if (type == SET_EXPRESSION) {
        return new ModulaSetExpressionImpl(node);
      }
      else if (type == SET_TYPE) {
        return new ModulaSetTypeImpl(node);
      }
      else if (type == SIMPLE_EXPRESSION) {
        return new ModulaSimpleExpressionImpl(node);
      }
      else if (type == SIMPLE_TYPE) {
        return new ModulaSimpleTypeImpl(node);
      }
      else if (type == STATEMENT) {
        return new ModulaStatementImpl(node);
      }
      else if (type == STONY_BROOK_TYPE) {
        return new ModulaStonyBrookTypeImpl(node);
      }
      else if (type == STRING) {
        return new ModulaStringImpl(node);
      }
      else if (type == SUB_RANGE_TYPE_OR_QUAL_IDENT) {
        return new ModulaSubRangeTypeOrQualIdentImpl(node);
      }
      else if (type == SYMBOL_IMPORT_CLAUSE) {
        return new ModulaSymbolImportClauseImpl(node);
      }
      else if (type == TERM) {
        return new ModulaTermImpl(node);
      }
      else if (type == TYPES) {
        return new ModulaTypesImpl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new ModulaTypeDeclarationImpl(node);
      }
      else if (type == TYPE_DECLARATIONS) {
        return new ModulaTypeDeclarationsImpl(node);
      }
      else if (type == TYPE_DEFINITION) {
        return new ModulaTypeDefinitionImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new ModulaTypeNameImpl(node);
      }
      else if (type == VARIABLE_ADDRESS_SPECIFICATION) {
        return new ModulaVariableAddressSpecificationImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new ModulaVariableDeclarationImpl(node);
      }
      else if (type == VARIABLE_DECLARATIONS) {
        return new ModulaVariableDeclarationsImpl(node);
      }
      else if (type == VARIABLE_MODIFIERS) {
        return new ModulaVariableModifiersImpl(node);
      }
      else if (type == VARIABLE_NAME_DECLARATION) {
        return new ModulaVariableNameDeclarationImpl(node);
      }
      else if (type == VARIABLE_NAME_DEFINITION) {
        return new ModulaVariableNameDefinitionImpl(node);
      }
      else if (type == VARIABLE_VOLATILE_SPECIFICATION) {
        return new ModulaVariableVolatileSpecificationImpl(node);
      }
      else if (type == VARIANT) {
        return new ModulaVariantImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new ModulaWhileStatementImpl(node);
      }
      else if (type == WITH_STATEMENT) {
        return new ModulaWithStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
