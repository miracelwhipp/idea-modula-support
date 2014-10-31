package org.modula.helpers.highlight;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.project.ex.ProjectManagerEx;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.grammar.ModulaSpecialtyAwareLexerAdapter;
import org.modula.parsing.grammar.ModulaLexer;
import org.modula.parsing.modula.psi.TokenModulaTypes;

import java.io.Reader;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 18.05.13
 * Time: 16:20
 * To change this template use File | Settings | File Templates.
 */
public class ModulaSyntaxHighlighter extends SyntaxHighlighterBase {

	public static final TextAttributesKey[] COMMENT = new TextAttributesKey[]{
			TextAttributesKey.createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
	};

	public static final TextAttributesKey[] DOCUMENTATION_COMMENT = new TextAttributesKey[]{
			TextAttributesKey.createTextAttributesKey("DOCUMENTATION_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT)
	};

	public static final TextAttributesKey[] KEYWORD = new TextAttributesKey[]{
			TextAttributesKey.createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
	};

	public static final TextAttributesKey[] IDENTIFIER = new TextAttributesKey[]{
			TextAttributesKey.createTextAttributesKey("IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
	};

	public static final TextAttributesKey[] PREDEFINED_SYMBOL = new TextAttributesKey[]{
			TextAttributesKey.createTextAttributesKey("IDENTIFIER", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL)
	};

	public static final TextAttributesKey[] INVALID_COMPILE_CONDITIONAL = new TextAttributesKey[]{
			TextAttributesKey.createTextAttributesKey("INVALID_COMPILE_CONDITIONAL", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
	};

	public static final Collection<IElementType> KEYWORDS =
			Arrays.asList(TokenModulaTypes.DEFINITION, TokenModulaTypes.IMPLEMENTATION, TokenModulaTypes.MODULE, TokenModulaTypes.ARRAY, TokenModulaTypes.GENERIC,
					TokenModulaTypes.UNSAFEGUARDED, TokenModulaTypes.END, TokenModulaTypes.TYPE, TokenModulaTypes.FROM, TokenModulaTypes.IMPORT,
					TokenModulaTypes.PROCEDURE, TokenModulaTypes.FORWARD, TokenModulaTypes.MACRO, TokenModulaTypes.ASSEMBLER,
					TokenModulaTypes.PUREASM, TokenModulaTypes.VAR, TokenModulaTypes.INOUT, TokenModulaTypes.OUT, TokenModulaTypes.CONST,
					TokenModulaTypes.FAR, TokenModulaTypes.VALUE, TokenModulaTypes.NOHIGH, TokenModulaTypes.ARRAY, TokenModulaTypes.OF,
					TokenModulaTypes.BY, TokenModulaTypes.CMPLX, TokenModulaTypes.VOLATILE, TokenModulaTypes.PUBLIC, TokenModulaTypes.EXTERNAL,
					TokenModulaTypes.DLLACCESS, TokenModulaTypes.POINTER, TokenModulaTypes.TO, TokenModulaTypes.SET, TokenModulaTypes.BIG,
					TokenModulaTypes.SMALL, TokenModulaTypes.PACKEDSET, TokenModulaTypes.RECORD, TokenModulaTypes.CASE, TokenModulaTypes.ELSE,
					TokenModulaTypes.COMPILE_TIME_IF, TokenModulaTypes.COMPILE_TIME_THEN, TokenModulaTypes.COMPILE_TIME_CONDITION,
					TokenModulaTypes.COMPILE_TIME_ELSE, TokenModulaTypes.COMPILE_TIME_END, TokenModulaTypes.IF, TokenModulaTypes.THEN,
					TokenModulaTypes.ELSIF, TokenModulaTypes.FOR, TokenModulaTypes.WHILE, TokenModulaTypes.REPEAT, TokenModulaTypes.UNTIL,
					TokenModulaTypes.RETURN, TokenModulaTypes.WITH, TokenModulaTypes.EXIT, TokenModulaTypes.LOOP, TokenModulaTypes.DO,
					TokenModulaTypes.BEGIN
			);

	public static final Collection<IElementType> PREDEFINED_SYMBOLS =
			Arrays.asList(TokenModulaTypes.TOKEN_INTEGER, TokenModulaTypes.TOKEN_CARDINAL, TokenModulaTypes.TOKEN_REAL,
					TokenModulaTypes.TOKEN_LONGREAL, TokenModulaTypes.TOKEN_COMPLEX, TokenModulaTypes.TOKEN_LONGCOMPLEX,
					TokenModulaTypes.TOKEN_BOOLEAN, TokenModulaTypes.TOKEN_CHAR, TokenModulaTypes.TOKEN_BITSET,
					TokenModulaTypes.TOKEN_SHORTINT, TokenModulaTypes.TOKEN_SHORTCARD, TokenModulaTypes.TOKEN_INTEGER16,
					TokenModulaTypes.TOKEN_CARDINAL16, TokenModulaTypes.TOKEN_INTEGER32, TokenModulaTypes.TOKEN_CARDINAL32,
					TokenModulaTypes.TOKEN_INTEGER64, TokenModulaTypes.TOKEN_CARDINAL64, TokenModulaTypes.TOKEN_LONGINT,
					TokenModulaTypes.TOKEN_LONGCARD, TokenModulaTypes.TOKEN_ACHAR, TokenModulaTypes.TOKEN_UCHAR,
					TokenModulaTypes.TOKEN_BYTEBOOL, TokenModulaTypes.TOKEN_WORDBOOL, TokenModulaTypes.TOKEN_DWORDBOOL,
					TokenModulaTypes.TOKEN_BITSET16, TokenModulaTypes.TOKEN_BITSET32
			);


	public static final TextAttributesKey[] EMPTY = new TextAttributesKey[0];

	@NotNull
	@Override
	public Lexer getHighlightingLexer() {
		return new FlexAdapter(new ModulaSpecialtyAwareLexerAdapter(
				new ModulaLexer((Reader) null, ProjectManagerEx.getInstanceEx().getOpenProjects()[0])));
	}

	@NotNull
	@Override
	public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
		if (tokenType.equals(TokenModulaTypes.COMMENT)) {
			return COMMENT;
		} else if (tokenType.equals(TokenModulaTypes.DOCUMENTATION_COMMENT)) {
			return DOCUMENTATION_COMMENT;
		} else if (KEYWORDS.contains(tokenType)) {
			return KEYWORD;
		} else if (PREDEFINED_SYMBOLS.contains(tokenType)) {
			return PREDEFINED_SYMBOL;
		} else if (tokenType.equals(TokenModulaTypes.IDENTIFIER)) {
			return IDENTIFIER;
		} else if (tokenType.equals(TokenModulaTypes.COMPILE_TIME_INVALID_CODE)) {
			return INVALID_COMPILE_CONDITIONAL;
		} else {
			return EMPTY;
		}
	}
}
