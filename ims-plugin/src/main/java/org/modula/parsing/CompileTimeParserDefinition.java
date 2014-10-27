package org.modula.parsing;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import org.modula.CompileTimeConditionLanguage;
import org.modula.parsing.compile.time.ConditionParser;
import org.modula.parsing.compile.time.psi.CompileTimeConditionTypes;
import org.modula.parsing.grammar.CompileTimeConditionLexer;
import org.modula.parsing.grammar.ModulaSpecialtyAwareLexerAdapter;
import org.modula.parsing.modula.psi.TokenModulaTypes;
import org.modula.parsing.psi.PreprocessingInMemoryFile;

import java.io.Reader;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 20.06.13
 * Time: 22:55
 * To change this template use File | Settings | File Templates.
 */
public class CompileTimeParserDefinition implements ParserDefinition {

	public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
	public static final TokenSet COMMENTS = TokenSet.create(TokenModulaTypes.COMMENT);


	public static final IFileElementType FILE =
			new IFileElementType(CompileTimeConditionLanguage.INSTANCE);
//	public static final IFileElementType FILE =
//			new IFileElementType(Language.findInstance(CompileTimeConditionLanguage.class));


	@NotNull
	@Override
	public Lexer createLexer(Project project) {
		return new FlexAdapter(new ModulaSpecialtyAwareLexerAdapter(new CompileTimeConditionLexer((Reader) null)));
	}

	@Override
	public PsiParser createParser(Project project) {
		return new ConditionParser();
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
		return TokenSet.EMPTY;
	}

	@NotNull
	@Override
	public PsiElement createElement(ASTNode node) {
		return CompileTimeConditionTypes.Factory.createElement(node);
	}

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new PreprocessingInMemoryFile(viewProvider);
	}

	@Override
	public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
		return SpaceRequirements.MAY;
	}
}
