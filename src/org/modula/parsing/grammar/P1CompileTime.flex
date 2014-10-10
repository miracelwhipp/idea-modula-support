package org.modula.parsing.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.modula.parsing.definition.psi.ModulaTypes;
import com.intellij.psi.TokenType;
import org.modula.parsing.psi.ModulaTokenType;
import org.modula.parsing.grammar.NestedCommentaryAwareLexer;
import org.modula.parsing.compile.time.psi.CompileTimeConditionTypes;
import org.modula.parsing.utility.BooleanStackSerializableAsShort;

%%

%public %class CompileTimeConditionLexer
%implements ModulaSpecialtyAwareLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%{
	private int commentaryDepth = 0;

	@Override
	public void setCommentaryDepth(int commentaryDepth) {
		this.commentaryDepth = commentaryDepth;
	}

	@Override
	public int getCommentaryDepth() {
		return commentaryDepth;
	}

	@Override
	public void setConstantConditionStates(BooleanStackSerializableAsShort constantConditionStates) {
	}

	@Override
	public BooleanStackSerializableAsShort getConstantConditionStates() {
		return new BooleanStackSerializableAsShort();
	}

	@Override
	public int getFalseDepth() {
		return 0;
	}

	@Override
	public void setFalseDepth(int depth) {
	}

%}

CRLF = \n|\r|\r\n
WHITE_SPACE = {CRLF} | [\ \t\f]

OPEN_COMMENT                = \(\*
CLOSE_COMMENT               = \*\)
COMMENT_CONTENT             = ([^*(]|\(+[^*]|\*+[^)])*

IDENTIFIER                  = [a-zA-Z_][a-zA-Z_0-9]*


%state COMMENT

%%


<YYINITIAL> {OPEN_COMMENT}     {
	yybegin(COMMENT);
	commentaryDepth++;
	return ModulaTypes.COMMENT;
}

<COMMENT> {OPEN_COMMENT}     {
	commentaryDepth++;
	return ModulaTypes.COMMENT;
}

<COMMENT>   {COMMENT_CONTENT}  { return ModulaTypes.COMMENT; }

<COMMENT>   {CLOSE_COMMENT}     {

	if (--commentaryDepth == 0) {
		yybegin(YYINITIAL);
	}

	return ModulaTypes.COMMENT;
}

<YYINITIAL> AND { return CompileTimeConditionTypes.AND; }
<YYINITIAL> OR { return CompileTimeConditionTypes.OR; }
<YYINITIAL> NOT { return CompileTimeConditionTypes.NOT; }
<YYINITIAL> \( { return CompileTimeConditionTypes.OPEN_BRACKET; }
<YYINITIAL> \) { return CompileTimeConditionTypes.CLOSE_BRACKET; }
<YYINITIAL> TRUE { return CompileTimeConditionTypes.TRUE; }
<YYINITIAL> FALSE { return CompileTimeConditionTypes.FALSE; }




<YYINITIAL> {IDENTIFIER} { return CompileTimeConditionTypes.TAG; }

<YYINITIAL> ({WHITE_SPACE})* { return TokenType.WHITE_SPACE; }

<YYINITIAL> . { return ModulaTypes.ANYTHING; }


