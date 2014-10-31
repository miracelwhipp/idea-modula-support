 package org.modula.parsing.grammar;

import com.intellij.openapi.project.Project;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.modula.parsing.modula.psi.TokenModulaTypes;
import com.intellij.psi.TokenType;
import org.modula.parsing.psi.ModulaTokenType;
import org.modula.parsing.grammar.ModulaSpecialtyAwareLexer;
import org.modula.parsing.grammar.ModulaLexerBase;
import org.modula.parsing.ModulaParseException;
import org.modula.CompileTimeConditionLanguage;
import org.modula.P1CompileTimeConditionLanguage;
import org.modula.parsing.utility.BooleanStackSerializableAsShort;

%%

%public %class ModulaLexer
%extends ModulaLexerBase
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

<YYINITIAL> :=                  { return TokenModulaTypes.ASSIGNMENT_OPERATOR; }
<YYINITIAL> =                   { return TokenModulaTypes.EQUALITY_OPERATOR; }
<YYINITIAL> ,                   { return TokenModulaTypes.COMMA; }
<YYINITIAL> \(                  { return TokenModulaTypes.OPEN_BRACE; }
<YYINITIAL> \)                  { return TokenModulaTypes.CLOSE_BRACE; }
<YYINITIAL> ;                   { return TokenModulaTypes.END_OF_STATEMENT; }
<YYINITIAL> \.                  { return TokenModulaTypes.DOT; }
<YYINITIAL> :                   { return TokenModulaTypes.TYPING_OPERATOR; }
<YYINITIAL> \{                  { return TokenModulaTypes.CURLY_BRACE_OPEN; }
<YYINITIAL> \}                  { return TokenModulaTypes.CURLY_BRACE_CLOSE; }
<YYINITIAL> \[                  { return TokenModulaTypes.SQUARE_BRACE_OPEN; }
<YYINITIAL> \]                  { return TokenModulaTypes.SQUARE_BRACE_CLOSE; }
<YYINITIAL> \.\.                { return TokenModulaTypes.RANGE_OPERATOR; }
<YYINITIAL> \|                  { return TokenModulaTypes.PIPE; }
<YYINITIAL> \<=                 { return TokenModulaTypes.LESS_EQUALS; }
<YYINITIAL> \< /[^=>]           { return TokenModulaTypes.LESS_THAN; }
<YYINITIAL> >=                  { return TokenModulaTypes.GREATER_EQUALS; }
<YYINITIAL> >  /[^=]            { return TokenModulaTypes.GREATER_THAN; }
<YYINITIAL> (\<>)|#             { return TokenModulaTypes.DIFFERENT; }
<YYINITIAL> IN /[^a-zA-Z_0-9]   { return TokenModulaTypes.CONTAINS; }
<YYINITIAL> \+                  { return TokenModulaTypes.PLUS; }
<YYINITIAL> \-                  { return TokenModulaTypes.MINUS; }
<YYINITIAL> OR /[^a-zA-Z_0-9]   { return TokenModulaTypes.OR; }
<YYINITIAL> BOR /[^a-zA-Z_0-9]  { return TokenModulaTypes.BITWISE_OR; }
<YYINITIAL> BXOR /[^a-zA-Z_0-9] { return TokenModulaTypes.BITWISE_XOR; }
<YYINITIAL> \*                  { return TokenModulaTypes.TIMES; }
<YYINITIAL> \/                  { return TokenModulaTypes.BY; }
<YYINITIAL> REM /[^a-zA-Z_0-9]  { return TokenModulaTypes.REMAINDER; }
<YYINITIAL> DIV /[^a-zA-Z_0-9]  { return TokenModulaTypes.DIVISION; }
<YYINITIAL> MOD /[^a-zA-Z_0-9]  { return TokenModulaTypes.MODULO; }
<YYINITIAL> AND /[^a-zA-Z_0-9]  { return TokenModulaTypes.AND; }
<YYINITIAL> &                   { return TokenModulaTypes.AND; }
<YYINITIAL> BAND /[^a-zA-Z_0-9] { return TokenModulaTypes.BITWISE_AND; }
<YYINITIAL> SHL /[^a-zA-Z_0-9]  { return TokenModulaTypes.SHIFT_LEFT; }
<YYINITIAL> SHR /[^a-zA-Z_0-9]  { return TokenModulaTypes.SHIFT_RIGHT; }
<YYINITIAL> SAR /[^a-zA-Z_0-9]  { return TokenModulaTypes.SHIFT_ARITHMETIC_RIGHT; }
<YYINITIAL> ROL /[^a-zA-Z_0-9]  { return TokenModulaTypes.ROTATE_LEFT; }
<YYINITIAL> ROR /[^a-zA-Z_0-9]  { return TokenModulaTypes.ROTATE_RIGHT; }
<YYINITIAL> NOT /[^a-zA-Z_0-9]  { return TokenModulaTypes.NOT; }
<YYINITIAL> \~                  { return TokenModulaTypes.NOT; }
<YYINITIAL> BNOT /[^a-zA-Z_0-9] { return TokenModulaTypes.BITWISE_NOT; }
<YYINITIAL> BY /[^a-zA-Z_0-9]   { return TokenModulaTypes.FOR_LOOP_INCREMENT; }
<YYINITIAL> \^                  { return TokenModulaTypes.POINTER_DEREFERENCE_OPERATOR; }

<YYINITIAL> {CHAR_CONST}                  { return TokenModulaTypes.CHAR_CONST; }
<YYINITIAL> {INT_CONST_BASE_16}           { return TokenModulaTypes.INT_CONST_BASE_16; }
<YYINITIAL> {INT_CONST_BASE_8}            { return TokenModulaTypes.INT_CONST_BASE_8; }
<YYINITIAL> {INT_CONST_BASE_10}           { return TokenModulaTypes.INT_CONST_BASE_10; }
<YYINITIAL> {REAL_CONST} / [^.]           { return TokenModulaTypes.REAL_CONST; }
<YYINITIAL> {STRING_CONST_SINGLE}         { return TokenModulaTypes.STRING_CONST_SINGLE; }
<YYINITIAL> {STRING_CONST_DOUBLE}         { return TokenModulaTypes.STRING_CONST_DOUBLE; }
<YYINITIAL> {STRING_CONST_SINGLE_UNICODE} { return TokenModulaTypes.STRING_CONST_SINGLE_UNICODE; }
<YYINITIAL> {STRING_CONST_DOUBLE_UNICODE} { return TokenModulaTypes.STRING_CONST_DOUBLE_UNICODE; }
<YYINITIAL> {STRING_CONST_SINGLE_ANSI}    { return TokenModulaTypes.STRING_CONST_SINGLE_ANSI; }
<YYINITIAL> {STRING_CONST_DOUBLE_ANSI}    { return TokenModulaTypes.STRING_CONST_DOUBLE_ANSI; }



<YYINITIAL> ARRAY { return TokenModulaTypes.ARRAY; }
<YYINITIAL> ASSEMBLER { return TokenModulaTypes.ASSEMBLER; }
<YYINITIAL> BIG { return TokenModulaTypes.BIG; }
<YYINITIAL> BEGIN { return TokenModulaTypes.BEGIN; }
<YYINITIAL> CASE { return TokenModulaTypes.CASE; }
<YYINITIAL> CMPLX { return TokenModulaTypes.CMPLX; }
<YYINITIAL> CONST { return TokenModulaTypes.CONST; }
<YYINITIAL> DEFINITION { return TokenModulaTypes.DEFINITION; }
<YYINITIAL> DLLACCESS { return TokenModulaTypes.DLLACCESS; }
<YYINITIAL> END { return TokenModulaTypes.END; }
<YYINITIAL> ELSE { return TokenModulaTypes.ELSE; }
<YYINITIAL> ELSIF { return TokenModulaTypes.ELSIF; }
<YYINITIAL> EXIT { return TokenModulaTypes.EXIT; }
<YYINITIAL> EXTERNAL { return TokenModulaTypes.EXTERNAL; }
<YYINITIAL> FAR { return TokenModulaTypes.FAR; }
<YYINITIAL> FORWARD { return TokenModulaTypes.FORWARD; }
<YYINITIAL> FOR / [^W] { return TokenModulaTypes.FOR; }
<YYINITIAL> FROM { return TokenModulaTypes.FROM; }
<YYINITIAL> GENERIC { return TokenModulaTypes.GENERIC; }
<YYINITIAL> IF { return TokenModulaTypes.IF; }
<YYINITIAL> IMPLEMENTATION { return TokenModulaTypes.IMPLEMENTATION; }
<YYINITIAL> IMPORT { return TokenModulaTypes.IMPORT; }
<YYINITIAL> INOUT { return TokenModulaTypes.INOUT; }
<YYINITIAL> MACRO { return TokenModulaTypes.MACRO; }
<YYINITIAL> MODULE { return TokenModulaTypes.MODULE; }
<YYINITIAL> NOHIGH { return TokenModulaTypes.NOHIGH; }
<YYINITIAL> OF { return TokenModulaTypes.OF; }
<YYINITIAL> OUT { return TokenModulaTypes.OUT; }
<YYINITIAL> PACKEDSET { return TokenModulaTypes.PACKEDSET; }
<YYINITIAL> POINTER { return TokenModulaTypes.POINTER; }
<YYINITIAL> PROCEDURE { return TokenModulaTypes.PROCEDURE; }
<YYINITIAL> PUBLIC { return TokenModulaTypes.PUBLIC; }
<YYINITIAL> PUREASM { return TokenModulaTypes.PUREASM; }
<YYINITIAL> QUALIFIED { return TokenModulaTypes.QUALIFIED; }
<YYINITIAL> RECORD { return TokenModulaTypes.RECORD; }
<YYINITIAL> REPEAT { return TokenModulaTypes.REPEAT; }
<YYINITIAL> RETURN { return TokenModulaTypes.RETURN; }
<YYINITIAL> SET { return TokenModulaTypes.SET; }
<YYINITIAL> SMALL { return TokenModulaTypes.SMALL; }
<YYINITIAL> THEN { return TokenModulaTypes.THEN; }
<YYINITIAL> TO { return TokenModulaTypes.TO; }
<YYINITIAL> TYPE { return TokenModulaTypes.TYPE; }
<YYINITIAL> UNSAFEGUARDED { return TokenModulaTypes.UNSAFEGUARDED; }
<YYINITIAL> UNTIL { return TokenModulaTypes.UNTIL; }
<YYINITIAL> VALUE { return TokenModulaTypes.VALUE; }
<YYINITIAL> VAR { return TokenModulaTypes.VAR; }
<YYINITIAL> VOLATILE { return TokenModulaTypes.VOLATILE; }
<YYINITIAL> WHILE { return TokenModulaTypes.WHILE; }
<YYINITIAL> WITH { return TokenModulaTypes.WITH; }

<YYINITIAL> INTEGER { return TokenModulaTypes.TOKEN_INTEGER; }
<YYINITIAL> CARDINAL { return TokenModulaTypes.TOKEN_CARDINAL; }
<YYINITIAL> REAL { return TokenModulaTypes.TOKEN_REAL; }
<YYINITIAL> LONGREAL { return TokenModulaTypes.TOKEN_LONGREAL; }
<YYINITIAL> COMPLEX { return TokenModulaTypes.TOKEN_COMPLEX; }
<YYINITIAL> LONGCOMPLEX { return TokenModulaTypes.TOKEN_LONGCOMPLEX; }
<YYINITIAL> BOOLEAN { return TokenModulaTypes.TOKEN_BOOLEAN; }
<YYINITIAL> CHAR { return TokenModulaTypes.TOKEN_CHAR; }
<YYINITIAL> BITSET { return TokenModulaTypes.TOKEN_BITSET; }

<YYINITIAL> (SHORTINT)|(INTEGER8) { return TokenModulaTypes.TOKEN_SHORTINT; }
<YYINITIAL> (SHORTCARD)|(CARDINAL8) { return TokenModulaTypes.TOKEN_SHORTCARD; }
<YYINITIAL> INTEGER16 { return TokenModulaTypes.TOKEN_INTEGER16; }
<YYINITIAL> CARDINAL16 { return TokenModulaTypes.TOKEN_CARDINAL16; }
<YYINITIAL> INTEGER32 { return TokenModulaTypes.TOKEN_INTEGER32; }
<YYINITIAL> CARDINAL32 { return TokenModulaTypes.TOKEN_CARDINAL32; }
<YYINITIAL> LONGINT { return TokenModulaTypes.TOKEN_LONGINT; }
<YYINITIAL> LONGCARD { return TokenModulaTypes.TOKEN_LONGCARD; }
<YYINITIAL> INTEGER64 { return TokenModulaTypes.TOKEN_INTEGER64; }
<YYINITIAL> CARDINAL64 { return TokenModulaTypes.TOKEN_CARDINAL64; }
<YYINITIAL> ACHAR { return TokenModulaTypes.TOKEN_ACHAR; }
<YYINITIAL> UCHAR { return TokenModulaTypes.TOKEN_UCHAR; }
<YYINITIAL> (BYTEBOOL)|(BOOL8) { return TokenModulaTypes.TOKEN_BYTEBOOL; }
<YYINITIAL> (WORDBOOL)|(BOOL16) { return TokenModulaTypes.TOKEN_WORDBOOL; }
<YYINITIAL> (DWORDBOOL)|(BOOL32) { return TokenModulaTypes.TOKEN_DWORDBOOL; }
<YYINITIAL> BITSET16 { return TokenModulaTypes.TOKEN_BITSET16; }
<YYINITIAL> BITSET32 { return TokenModulaTypes.TOKEN_BITSET32; }



<YYINITIAL> {SB_IF}          { return validIf(false); }
<YYINITIAL> {IF_DIRECTIVE}   { return validIf(true);  }
<YYINITIAL> {CT_THEN}        { return TokenModulaTypes.COMPILE_TIME_THEN; }
<YYINITIAL> {CT_ELSE}        { return validElse(); }
<YYINITIAL> {CT_END}         { return validEnd(); }
<YYINITIAL> {OPEN_COMMENT}   { return openComment(); }
<YYINITIAL> {IDENTIFIER}     { return TokenModulaTypes.IDENTIFIER; }
<YYINITIAL> ({WHITE_SPACE})* { return TokenType.WHITE_SPACE; }

<YYINITIAL> {COMPILER_DIRECTIVE_STATEMENT} { return TokenModulaTypes.COMPILER_DIRECTIVE; }

<YYINITIAL> {SB_ELSIF} ([^%]|\%[^T]|\%T[^H]|\%TH[^E]|\%THE[^N])* {SB_THEN} {
	return validElse();
}

<YYINITIAL> {ELSIF_DIRECTIVE} ([^T]|T[^H]|TH[^E]|THE[^N]|(THEN[^\ \t\f*])|(THEN[\ \t\f]*[^*])|(THEN[\ \t\f]*\*[^>]))+ {THEN_DIRECTIVE} {
	return validElse();
}

<YYINITIAL> . { return TokenModulaTypes.ANYTHING; }

<COMPILE_TIME_CONDITION> ([^%]|%[^T]|%T[^H]|%TH[^E]|%THE[^N])* {
	return evaluateCondition(CompileTimeConditionLanguage.INSTANCE);
}

<P1_COMPILE_TIME_CONDITION> ([^T]|T[^H]|TH[^E]|THE[^N]|(THEN[^\ \t\f\*])|(THEN[\ \t\f]*[^\*])|(THEN[\ \t\f]*\*[^>]))* {
	return evaluateCondition(P1CompileTimeConditionLanguage.INSTANCE);
}

<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {CT_IF}           { return invalidIf(); }
<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {CT_THEN}         { return TokenModulaTypes.COMPILE_TIME_THEN; }
<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {SB_ELSIF}        { return invalidElsif(false); }
<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {ELSIF_DIRECTIVE} { return invalidElsif(true); }
<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {CT_ELSE}         { return invalidElse(); }
<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {CT_END}          { return invalidEnd(); }

<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {NON_COMPILE_TIME_STATEMENT} { return TokenModulaTypes.COMPILE_TIME_INVALID_CODE; }
<INVALID_CONDITIONAL_CODE, ERRORNEOUS_CONDITIONAL_CODE> {WHITE_SPACE}+               { return TokenType.WHITE_SPACE; }


<COMMENT> {OPEN_COMMENT}    { return openComment(); }
<COMMENT> {COMMENT_CONTENT} { return TokenModulaTypes.COMMENT; }
<COMMENT> {CLOSE_COMMENT}   { return closeComment(); }




