 package org.modula.parsing.grammar;

import com.intellij.openapi.project.Project;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.modula.parsing.definition.psi.ModulaTypes;
import com.intellij.psi.TokenType;
import org.modula.parsing.psi.ModulaTokenType;
import org.modula.parsing.grammar.ModulaSpecialtyAwareLexer;
import org.modula.parsing.grammar.DefinitionLexerBase;
import org.modula.parsing.ModulaParseException;
import org.modula.CompileTimeConditionLanguage;
import org.modula.P1CompileTimeConditionLanguage;
import org.modula.parsing.utility.BooleanStackSerializableAsShort;

%%

%public %class ModuleDefinitionLexer
%extends DefinitionLexerBase
%implements ModulaSpecialtyAwareLexer
%ctorarg Project project
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}


%init{

	super(project, YYINITIAL, INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE, COMPILE_TIME_CONDITION, P1_COMPILE_TIME_CONDITION, COMMENT);

%init}


CRLF = \n|\r|\r\n
BLANK = [\ \t\f]
WHITE_SPACE = {CRLF} | {BLANK}
Z = .|{CRLF}

OPEN_DOCUMENTATION_COMMENT   = \(\*\*[^\)]
OPEN_COMMENT                 = \(\*
CLOSE_COMMENT                = \*+\)
COMMENT_CONTENT              = (([^\*\(])|(\(+[^\(\*])|(\*+[^\*\)]))*

IDENTIFIER                   = [a-zA-Z_][a-zA-Z_0-9]*

CHAR_CONST                   = [0-7]+C
INT_CONST_BASE_16            = [0-9][0-9A-F]*[Hh]
INT_CONST_BASE_8             = [0-9]+B
INT_CONST_BASE_10            = [0-9]+
REAL_CONST                   = [0-9]+\.[0-9]*(E[+-]?[0-9]+)?
STRING_CONST_SINGLE          = '[^']*'
STRING_CONST_DOUBLE          = \"[^\"]*\"
STRING_CONST_SINGLE_UNICODE  = '[^']*'U
STRING_CONST_DOUBLE_UNICODE  = \"[^\"]*\"U
STRING_CONST_SINGLE_ANSI     = '[^']*'A
STRING_CONST_DOUBLE_ANSI     = \"[^\"]*\"A

SB_IF                        = \%IF
SB_THEN                      = \%THEN
SB_ELSIF                     = \%ELSIF
SB_ELSE                      = \%ELSE
SB_END                       = \%END

OPEN_DIRECTIVE               = <\*{BLANK}*
CLOSE_DIRECTIVE              = {BLANK}*\*>
IF_DIRECTIVE                 = {OPEN_DIRECTIVE}IF
THEN_DIRECTIVE               = THEN{CLOSE_DIRECTIVE}
ELSE_DIRECTIVE               = {OPEN_DIRECTIVE}ELSE{CLOSE_DIRECTIVE}
END_DIRECTIVE                = {OPEN_DIRECTIVE}END{CLOSE_DIRECTIVE}
ELSIF_DIRECTIVE              = {OPEN_DIRECTIVE}ELSIF
//TODO: use this directives for evaluation of compile time conditions
DEFINE_VALID_DIRECTIVE       = {OPEN_DIRECTIVE}DEFINE{BLANK}*\({BLANK}*{IDENTIFIER}{BLANK}*,{BLANK}*TRUE{BLANK}*\){CLOSE_DIRECTIVE}
DEFINE_INVALID_DIRECTIVE     = {OPEN_DIRECTIVE}DEFINE{BLANK}*\({BLANK}*{IDENTIFIER}{BLANK}*,{BLANK}*FALSE{BLANK}*\){CLOSE_DIRECTIVE}
ASSIGN_DIRECTIVE             = {OPEN_DIRECTIVE}ASSIGN{BLANK}*\({BLANK}*{IDENTIFIER}{BLANK}*,{BLANK}*TRUE{BLANK}*\){CLOSE_DIRECTIVE}
UNASSIGN_DIRECTIVE           = {OPEN_DIRECTIVE}ASSIGN{BLANK}*\({BLANK}*{IDENTIFIER}{BLANK}*,{BLANK}*FALSE{BLANK}*\){CLOSE_DIRECTIVE}
//TODO: define exactly the directives
COMPILER_DIRECTIVE_NAME      = {IDENTIFIER}({IDENTIFIER}|[\:\(\)])*
COMPILER_DIRECTIVE           = \/{COMPILER_DIRECTIVE_NAME}
COMPILER_DIRECTIVE_STATEMENT = {OPEN_DIRECTIVE}{COMPILER_DIRECTIVE}{COMPILER_DIRECTIVE}*{CLOSE_DIRECTIVE}

OCC                          = {OPEN_DIRECTIVE}|\%
NON_COMPILE_TIME_STATEMENT   = [^%<T]*|\<[^*]|{OCC}[^IE]|{OCC}I[^F]|\%?T[^H]|\%?TH[^E]|\%?THE[^N]|[^%]THEN[^*]|[^%]THEN\*[^>]|{OCC}E[^L]|{OCC}EL[^S]|{OCC}ELS[^IE]|{OCC}ELSI[^F]

CT_IF                        = {SB_IF}|{IF_DIRECTIVE}
CT_THEN                      = {SB_THEN}|{THEN_DIRECTIVE}
CT_ELSIF                     = {SB_ELSIF}|{ELSIF_DIRECTIVE}
CT_ELSE                      = {SB_ELSE}|{ELSE_DIRECTIVE}
CT_END                       = {SB_END}|{END_DIRECTIVE}

%state DOCUMENTATION_COMMENT, COMMENT, COMPILE_TIME_CONDITION, INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE, P1_COMPILE_TIME_CONDITION

%%

<YYINITIAL> :=                  { return ModulaTypes.ASSIGNMENT_OPERATOR; }
<YYINITIAL> =                   { return ModulaTypes.EQUALITY_OPERATOR; }
<YYINITIAL> ,                   { return ModulaTypes.COMMA; }
<YYINITIAL> \(                  { return ModulaTypes.OPEN_BRACE; }
<YYINITIAL> \)                  { return ModulaTypes.CLOSE_BRACE; }
<YYINITIAL> ;                   { return ModulaTypes.END_OF_STATEMENT; }
<YYINITIAL> \.                  { return ModulaTypes.DOT; }
<YYINITIAL> :                   { return ModulaTypes.TYPING_OPERATOR; }
<YYINITIAL> \{                  { return ModulaTypes.CURLY_BRACE_OPEN; }
<YYINITIAL> \}                  { return ModulaTypes.CURLY_BRACE_CLOSE; }
<YYINITIAL> \[                  { return ModulaTypes.SQUARE_BRACE_OPEN; }
<YYINITIAL> \]                  { return ModulaTypes.SQUARE_BRACE_CLOSE; }
<YYINITIAL> \.\.                { return ModulaTypes.RANGE_OPERATOR; }
<YYINITIAL> \|                  { return ModulaTypes.PIPE; }
<YYINITIAL> \<=                 { return ModulaTypes.LESS_EQUALS; }
<YYINITIAL> \< /[^=>]           { return ModulaTypes.LESS_THAN; }
<YYINITIAL> >=                  { return ModulaTypes.GREATER_EQUALS; }
<YYINITIAL> >  /[^=]            { return ModulaTypes.GREATER_THAN; }
<YYINITIAL> (\<>)|#             { return ModulaTypes.DIFFERENT; }
<YYINITIAL> IN /[^a-zA-Z_0-9]   { return ModulaTypes.CONTAINS; }
<YYINITIAL> \+                  { return ModulaTypes.PLUS; }
<YYINITIAL> \-                  { return ModulaTypes.MINUS; }
<YYINITIAL> OR /[^a-zA-Z_0-9]   { return ModulaTypes.OR; }
<YYINITIAL> BOR /[^a-zA-Z_0-9]  { return ModulaTypes.BITWISE_OR; }
<YYINITIAL> BXOR /[^a-zA-Z_0-9] { return ModulaTypes.BITWISE_XOR; }
<YYINITIAL> \*                  { return ModulaTypes.TIMES; }
<YYINITIAL> \/                  { return ModulaTypes.BY; }
<YYINITIAL> REM /[^a-zA-Z_0-9]  { return ModulaTypes.REMAINDER; }
<YYINITIAL> DIV /[^a-zA-Z_0-9]  { return ModulaTypes.DIVISION; }
<YYINITIAL> MOD /[^a-zA-Z_0-9]  { return ModulaTypes.MODULO; }
<YYINITIAL> AND /[^a-zA-Z_0-9]  { return ModulaTypes.AND; }
<YYINITIAL> &                   { return ModulaTypes.AND; }
<YYINITIAL> BAND /[^a-zA-Z_0-9] { return ModulaTypes.BITWISE_AND; }
<YYINITIAL> SHL /[^a-zA-Z_0-9]  { return ModulaTypes.SHIFT_LEFT; }
<YYINITIAL> SHR /[^a-zA-Z_0-9]  { return ModulaTypes.SHIFT_RIGHT; }
<YYINITIAL> SAR /[^a-zA-Z_0-9]  { return ModulaTypes.SHIFT_ARITHMETIC_RIGHT; }
<YYINITIAL> ROL /[^a-zA-Z_0-9]  { return ModulaTypes.ROTATE_LEFT; }
<YYINITIAL> ROR /[^a-zA-Z_0-9]  { return ModulaTypes.ROTATE_RIGHT; }
<YYINITIAL> NOT /[^a-zA-Z_0-9]  { return ModulaTypes.NOT; }
<YYINITIAL> \~                  { return ModulaTypes.NOT; }
<YYINITIAL> BNOT /[^a-zA-Z_0-9] { return ModulaTypes.BITWISE_NOT; }
<YYINITIAL> BY /[^a-zA-Z_0-9]   { return ModulaTypes.FOR_LOOP_INCREMENT; }
<YYINITIAL> \^                  { return ModulaTypes.POINTER_DEREFERENCE_OPERATOR; }

<YYINITIAL> {CHAR_CONST}                  { return ModulaTypes.CHAR_CONST; }
<YYINITIAL> {INT_CONST_BASE_16}           { return ModulaTypes.INT_CONST_BASE_16; }
<YYINITIAL> {INT_CONST_BASE_8}            { return ModulaTypes.INT_CONST_BASE_8; }
<YYINITIAL> {INT_CONST_BASE_10}           { return ModulaTypes.INT_CONST_BASE_10; }
<YYINITIAL> {REAL_CONST} / [^.]           { return ModulaTypes.REAL_CONST; }
<YYINITIAL> {STRING_CONST_SINGLE}         { return ModulaTypes.STRING_CONST_SINGLE; }
<YYINITIAL> {STRING_CONST_DOUBLE}         { return ModulaTypes.STRING_CONST_DOUBLE; }
<YYINITIAL> {STRING_CONST_SINGLE_UNICODE} { return ModulaTypes.STRING_CONST_SINGLE_UNICODE; }
<YYINITIAL> {STRING_CONST_DOUBLE_UNICODE} { return ModulaTypes.STRING_CONST_DOUBLE_UNICODE; }
<YYINITIAL> {STRING_CONST_SINGLE_ANSI}    { return ModulaTypes.STRING_CONST_SINGLE_ANSI; }
<YYINITIAL> {STRING_CONST_DOUBLE_ANSI}    { return ModulaTypes.STRING_CONST_DOUBLE_ANSI; }



<YYINITIAL> ARRAY { return ModulaTypes.ARRAY; }
<YYINITIAL> ASSEMBLER { return ModulaTypes.ASSEMBLER; }
<YYINITIAL> BIG { return ModulaTypes.BIG; }
<YYINITIAL> BEGIN { return ModulaTypes.BEGIN; }
<YYINITIAL> CASE { return ModulaTypes.CASE; }
<YYINITIAL> CMPLX { return ModulaTypes.CMPLX; }
<YYINITIAL> CONST { return ModulaTypes.CONST; }
<YYINITIAL> DEFINITION { return ModulaTypes.DEFINITION; }
<YYINITIAL> DLLACCESS { return ModulaTypes.DLLACCESS; }
<YYINITIAL> END { return ModulaTypes.END; }
<YYINITIAL> ELSE { return ModulaTypes.ELSE; }
<YYINITIAL> ELSIF { return ModulaTypes.ELSIF; }
<YYINITIAL> EXIT { return ModulaTypes.EXIT; }
<YYINITIAL> EXTERNAL { return ModulaTypes.EXTERNAL; }
<YYINITIAL> FAR { return ModulaTypes.FAR; }
<YYINITIAL> FORWARD { return ModulaTypes.FORWARD; }
<YYINITIAL> FOR / [^W] { return ModulaTypes.FOR; }
<YYINITIAL> FROM { return ModulaTypes.FROM; }
<YYINITIAL> GENERIC { return ModulaTypes.GENERIC; }
<YYINITIAL> IF { return ModulaTypes.IF; }
<YYINITIAL> IMPORT { return ModulaTypes.IMPORT; }
<YYINITIAL> INOUT { return ModulaTypes.INOUT; }
<YYINITIAL> MACRO { return ModulaTypes.MACRO; }
<YYINITIAL> MODULE { return ModulaTypes.MODULE; }
<YYINITIAL> NOHIGH { return ModulaTypes.NOHIGH; }
<YYINITIAL> OF { return ModulaTypes.OF; }
<YYINITIAL> OUT { return ModulaTypes.OUT; }
<YYINITIAL> PACKEDSET { return ModulaTypes.PACKEDSET; }
<YYINITIAL> POINTER { return ModulaTypes.POINTER; }
<YYINITIAL> PROCEDURE { return ModulaTypes.PROCEDURE; }
<YYINITIAL> PUBLIC { return ModulaTypes.PUBLIC; }
<YYINITIAL> PUREASM { return ModulaTypes.PUREASM; }
<YYINITIAL> QUALIFIED { return ModulaTypes.QUALIFIED; }
<YYINITIAL> RECORD { return ModulaTypes.RECORD; }
<YYINITIAL> REPEAT { return ModulaTypes.REPEAT; }
<YYINITIAL> RETURN { return ModulaTypes.RETURN; }
<YYINITIAL> SET { return ModulaTypes.SET; }
<YYINITIAL> SMALL { return ModulaTypes.SMALL; }
<YYINITIAL> THEN { return ModulaTypes.THEN; }
<YYINITIAL> TO { return ModulaTypes.TO; }
<YYINITIAL> TYPE { return ModulaTypes.TYPE; }
<YYINITIAL> UNSAFEGUARDED { return ModulaTypes.UNSAFEGUARDED; }
<YYINITIAL> UNTIL { return ModulaTypes.UNTIL; }
<YYINITIAL> VALUE { return ModulaTypes.VALUE; }
<YYINITIAL> VAR { return ModulaTypes.VAR; }
<YYINITIAL> VOLATILE { return ModulaTypes.VOLATILE; }
<YYINITIAL> WHILE { return ModulaTypes.WHILE; }
<YYINITIAL> WITH { return ModulaTypes.WITH; }

<YYINITIAL> INTEGER { return ModulaTypes.TOKEN_INTEGER; }
<YYINITIAL> CARDINAL { return ModulaTypes.TOKEN_CARDINAL; }
<YYINITIAL> REAL { return ModulaTypes.TOKEN_REAL; }
<YYINITIAL> LONGREAL { return ModulaTypes.TOKEN_LONGREAL; }
<YYINITIAL> COMPLEX { return ModulaTypes.TOKEN_COMPLEX; }
<YYINITIAL> LONGCOMPLEX { return ModulaTypes.TOKEN_LONGCOMPLEX; }
<YYINITIAL> BOOLEAN { return ModulaTypes.TOKEN_BOOLEAN; }
<YYINITIAL> CHAR { return ModulaTypes.TOKEN_CHAR; }
<YYINITIAL> BITSET { return ModulaTypes.TOKEN_BITSET; }

<YYINITIAL> (SHORTINT)|(INTEGER8) { return ModulaTypes.TOKEN_SHORTINT; }
<YYINITIAL> (SHORTCARD)|(CARDINAL8) { return ModulaTypes.TOKEN_SHORTCARD; }
<YYINITIAL> INTEGER16 { return ModulaTypes.TOKEN_INTEGER16; }
<YYINITIAL> CARDINAL16 { return ModulaTypes.TOKEN_CARDINAL16; }
<YYINITIAL> INTEGER32 { return ModulaTypes.TOKEN_INTEGER32; }
<YYINITIAL> CARDINAL32 { return ModulaTypes.TOKEN_CARDINAL32; }
<YYINITIAL> LONGINT { return ModulaTypes.TOKEN_LONGINT; }
<YYINITIAL> LONGCARD { return ModulaTypes.TOKEN_LONGCARD; }
<YYINITIAL> INTEGER64 { return ModulaTypes.TOKEN_INTEGER64; }
<YYINITIAL> CARDINAL64 { return ModulaTypes.TOKEN_CARDINAL64; }
<YYINITIAL> ACHAR { return ModulaTypes.TOKEN_ACHAR; }
<YYINITIAL> UCHAR { return ModulaTypes.TOKEN_UCHAR; }
<YYINITIAL> (BYTEBOOL)|(BOOL8) { return ModulaTypes.TOKEN_BYTEBOOL; }
<YYINITIAL> (WORDBOOL)|(BOOL16) { return ModulaTypes.TOKEN_WORDBOOL; }
<YYINITIAL> (DWORDBOOL)|(BOOL32) { return ModulaTypes.TOKEN_DWORDBOOL; }
<YYINITIAL> BITSET16 { return ModulaTypes.TOKEN_BITSET16; }
<YYINITIAL> BITSET32 { return ModulaTypes.TOKEN_BITSET32; }



<YYINITIAL> {SB_IF}          { return validIf(false); }
<YYINITIAL> {IF_DIRECTIVE}   { return validIf(true);  }
<YYINITIAL> {CT_THEN}        { return ModulaTypes.COMPILE_TIME_THEN; }
<YYINITIAL> {CT_ELSE}        { return validElse(); }
<YYINITIAL> {CT_END}         { return validEnd(); }
<YYINITIAL> {OPEN_COMMENT}   { return openComment(); }
<YYINITIAL> {IDENTIFIER}     { return ModulaTypes.IDENTIFIER; }
<YYINITIAL> ({WHITE_SPACE})* { return TokenType.WHITE_SPACE; }

<YYINITIAL> {COMPILER_DIRECTIVE_STATEMENT} { return ModulaTypes.COMPILER_DIRECTIVE; }

<YYINITIAL> {SB_ELSIF} ([^%]|\%[^T]|\%T[^H]|\%TH[^E]|\%THE[^N])* {SB_THEN} {
	return validElse();
}

<YYINITIAL> {ELSIF_DIRECTIVE} ([^T]|T[^H]|TH[^E]|THE[^N]|(THEN[^\ \t\f*])|(THEN[\ \t\f]*[^*])|(THEN[\ \t\f]*\*[^>]))+ {THEN_DIRECTIVE} {
	return validElse();
}

<YYINITIAL> . { return ModulaTypes.ANYTHING; }

<COMPILE_TIME_CONDITION> ([^%]|%[^T]|%T[^H]|%TH[^E]|%THE[^N])* {
	return evaluateCondition(CompileTimeConditionLanguage.INSTANCE);
}

<P1_COMPILE_TIME_CONDITION> ([^T]|T[^H]|TH[^E]|THE[^N]|(THEN[^\ \t\f\*])|(THEN[\ \t\f]*[^\*])|(THEN[\ \t\f]*\*[^>]))* {
	return evaluateCondition(P1CompileTimeConditionLanguage.INSTANCE);
}

<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {CT_IF}           { return invalidIf(); }
<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {CT_THEN}         { return ModulaTypes.COMPILE_TIME_THEN; }
<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {SB_ELSIF}        { return invalidElsif(false); }
<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {ELSIF_DIRECTIVE} { return invalidElsif(true); }
<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {CT_ELSE}         { return invalidElse(); }
<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {CT_END}          { return invalidEnd(); }

<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {NON_COMPILE_TIME_STATEMENT} { return ModulaTypes.COMPILE_TIME_INVALID_CODE; }
<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {WHITE_SPACE}+               { return TokenType.WHITE_SPACE; }


<COMMENT> {OPEN_COMMENT}    { return openComment(); }
<COMMENT> {COMMENT_CONTENT} { return ModulaTypes.COMMENT; }
<COMMENT> {CLOSE_COMMENT}   { return closeComment(); }




