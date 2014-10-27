package org.modula.helpers.highlight;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.command.impl.DummyProject;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ex.ProjectManagerEx;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.grammar.ModulaSpecialtyAwareLexerAdapter;
import org.modula.parsing.grammar.ModulaLexer;
import org.modula.parsing.definition.psi.ModulaTypes;

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
public class ModuleDefinitionSyntaxHighlighter extends SyntaxHighlighterBase {

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
			Arrays.asList(ModulaTypes.DEFINITION, ModulaTypes.MODULE, ModulaTypes.ARRAY, ModulaTypes.GENERIC,
					ModulaTypes.UNSAFEGUARDED, ModulaTypes.END, ModulaTypes.TYPE, ModulaTypes.FROM, ModulaTypes.IMPORT,
					ModulaTypes.PROCEDURE, ModulaTypes.FORWARD, ModulaTypes.MACRO, ModulaTypes.ASSEMBLER,
					ModulaTypes.PUREASM, ModulaTypes.VAR, ModulaTypes.INOUT, ModulaTypes.OUT, ModulaTypes.CONST,
					ModulaTypes.FAR, ModulaTypes.VALUE, ModulaTypes.NOHIGH, ModulaTypes.ARRAY, ModulaTypes.OF,
					ModulaTypes.BY, ModulaTypes.CMPLX, ModulaTypes.VOLATILE, ModulaTypes.PUBLIC, ModulaTypes.EXTERNAL,
					ModulaTypes.DLLACCESS, ModulaTypes.POINTER, ModulaTypes.TO, ModulaTypes.SET, ModulaTypes.BIG,
					ModulaTypes.SMALL, ModulaTypes.PACKEDSET, ModulaTypes.RECORD, ModulaTypes.CASE, ModulaTypes.ELSE,
					ModulaTypes.COMPILE_TIME_IF, ModulaTypes.COMPILE_TIME_THEN, ModulaTypes.COMPILE_TIME_CONDITION,
					ModulaTypes.COMPILE_TIME_ELSE, ModulaTypes.COMPILE_TIME_END, ModulaTypes.IF, ModulaTypes.THEN,
					ModulaTypes.ELSIF, ModulaTypes.FOR, ModulaTypes.WHILE, ModulaTypes.REPEAT, ModulaTypes.UNTIL,
					ModulaTypes.RETURN, ModulaTypes.WITH, ModulaTypes.EXIT, ModulaTypes.LOOP, ModulaTypes.DO,
					ModulaTypes.BEGIN
			);

	public static final Collection<IElementType> PREDEFINED_SYMBOLS =
			Arrays.asList(ModulaTypes.TOKEN_INTEGER, ModulaTypes.TOKEN_CARDINAL, ModulaTypes.TOKEN_REAL,
					ModulaTypes.TOKEN_LONGREAL, ModulaTypes.TOKEN_COMPLEX, ModulaTypes.TOKEN_LONGCOMPLEX,
					ModulaTypes.TOKEN_BOOLEAN, ModulaTypes.TOKEN_CHAR, ModulaTypes.TOKEN_BITSET,
					ModulaTypes.TOKEN_SHORTINT, ModulaTypes.TOKEN_SHORTCARD, ModulaTypes.TOKEN_INTEGER16,
					ModulaTypes.TOKEN_CARDINAL16, ModulaTypes.TOKEN_INTEGER32, ModulaTypes.TOKEN_CARDINAL32,
					ModulaTypes.TOKEN_INTEGER64, ModulaTypes.TOKEN_CARDINAL64, ModulaTypes.TOKEN_LONGINT,
					ModulaTypes.TOKEN_LONGCARD, ModulaTypes.TOKEN_ACHAR, ModulaTypes.TOKEN_UCHAR,
					ModulaTypes.TOKEN_BYTEBOOL, ModulaTypes.TOKEN_WORDBOOL, ModulaTypes.TOKEN_DWORDBOOL,
					ModulaTypes.TOKEN_BITSET16, ModulaTypes.TOKEN_BITSET32
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
		if (tokenType.equals(ModulaTypes.COMMENT)) {
			return COMMENT;
		} else if (tokenType.equals(ModulaTypes.DOCUMENTATION_COMMENT)) {
			return DOCUMENTATION_COMMENT;
		} else if (KEYWORDS.contains(tokenType)) {
			return KEYWORD;
		} else if (PREDEFINED_SYMBOLS.contains(tokenType)) {
			return PREDEFINED_SYMBOL;
		} else if (tokenType.equals(ModulaTypes.IDENTIFIER)) {
			return IDENTIFIER;
		} else if (tokenType.equals(ModulaTypes.COMPILE_TIME_INVALID_CODE)) {
			return INVALID_COMPILE_CONDITIONAL;
		} else {
			return EMPTY;
		}
	}
}
