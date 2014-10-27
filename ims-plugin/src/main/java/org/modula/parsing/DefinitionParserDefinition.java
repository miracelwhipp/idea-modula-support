package org.modula.parsing;

import com.intellij.lang.*;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.stubs.PsiFileStub;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.IStubFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.modula.ModulaDefinitionModule;
import org.modula.parsing.definition.DefinitionParser;
import org.modula.parsing.grammar.ModulaSpecialtyAwareLexerAdapter;
import org.modula.parsing.grammar.ModulaLexer;
import org.modula.parsing.psi.DefinitionFile;
import org.modula.parsing.definition.psi.ModulaTypes;

import java.io.Reader;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 18.05.13
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public class DefinitionParserDefinition extends IStubFileElementType implements ParserDefinition {

	public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);

	public static final TokenSet COMMENTS = TokenSet.create(ModulaTypes.COMMENT, ModulaTypes.DOCUMENTATION_COMMENT,
			ModulaTypes.COMPILE_TIME_CONDITION, ModulaTypes.COMPILE_TIME_ELSE, ModulaTypes.COMPILE_TIME_END,
			ModulaTypes.COMPILE_TIME_IF, ModulaTypes.COMPILE_TIME_INVALID_CODE, ModulaTypes.COMPILE_TIME_THEN,
			ModulaTypes.COMPILER_DIRECTIVE);

	public static final TokenSet STRING_LITERALS =
			TokenSet.create(ModulaTypes.STRING_CONST_DOUBLE, ModulaTypes.STRING_CONST_DOUBLE_ANSI,
					ModulaTypes.STRING_CONST_DOUBLE_UNICODE, ModulaTypes.STRING_CONST_SINGLE,
					ModulaTypes.STRING_CONST_SINGLE_ANSI, ModulaTypes.STRING_CONST_SINGLE_UNICODE);

	public static final IFileElementType FILE = new IStubFileElementType<PsiFileStub>(Language.findInstance(ModulaDefinitionModule.class));

	public DefinitionParserDefinition() {
		super(ModulaDefinitionModule.INSTANCE);
	}

	public DefinitionParserDefinition(@NonNls String debugName) {
		super(debugName, ModulaDefinitionModule.INSTANCE);
	}

	@NotNull
	@Override
	public Lexer createLexer(Project project) {
		return new FlexAdapter(new ModulaSpecialtyAwareLexerAdapter(new ModulaLexer((Reader) null, project)));
	}

	@Override
	public PsiParser createParser(Project project) {
		return new DefinitionParser();
	}

	@Override
	public IFileElementType getFileNodeType() {
		return FILE;
	}

	@NotNull
	@Override
	public TokenSet getWhitespaceTokens() {
		return WHITE_SPACES;
	}

	@NotNull
	@Override
	public TokenSet getCommentTokens() {
		return COMMENTS;
	}

	@NotNull
	@Override
	public TokenSet getStringLiteralElements() {
		return STRING_LITERALS;
	}

	@NotNull
	@Override
	public PsiElement createElement(ASTNode node) {
		return ModulaTypes.Factory.createElement(node);
	}

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new DefinitionFile(viewProvider);
	}

	@Override
	public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
		return SpaceRequirements.MAY;
	}
}
