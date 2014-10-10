package org.modula.parsing.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.openapi.util.Pair;
import com.intellij.psi.tree.IElementType;
import org.modula.parsing.utility.BooleanStackSerializableAsShort;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 31.05.13
 * Time: 22:19
 * To change this template use File | Settings | File Templates.
 */
public class ModulaSpecialtyAwareLexerAdapter implements FlexLexer {

	private final ModulaSpecialtyAwareLexer lexer;

	public ModulaSpecialtyAwareLexerAdapter(ModulaSpecialtyAwareLexer lexer) {
		this.lexer = lexer;
	}


	@Override
	public void yybegin(int state) {
		Pair<Integer, Pair<BooleanStackSerializableAsShort, Pair<Integer, Integer>>> pair = split(state);
		lexer.setCommentaryDepth(pair.getFirst());
		lexer.setConstantConditionStates(pair.getSecond().getFirst());
		lexer.setFalseDepth(pair.getSecond().getSecond().getFirst());
		lexer.yybegin(pair.getSecond().getSecond().getSecond());
	}

	@Override
	public int yystate() {
		return merge(lexer.getCommentaryDepth(), lexer.getConstantConditionStates(), lexer.getFalseDepth(), lexer.yystate());
	}

	@Override
	public int getTokenStart() {
		return lexer.getTokenStart();
	}

	@Override
	public int getTokenEnd() {
		return lexer.getTokenEnd();
	}

	@Override
	public IElementType advance() throws IOException {
		return lexer.advance();
	}

	@Override
	public void reset(CharSequence buf, int start, int end, int initialState) {
		Pair<Integer, Pair<BooleanStackSerializableAsShort, Pair<Integer, Integer>>> pair = split(initialState);
		lexer.setCommentaryDepth(pair.getFirst());
		lexer.setConstantConditionStates(pair.getSecond().getFirst());
		lexer.setFalseDepth(pair.getSecond().getSecond().getFirst());
		lexer.reset(buf, start, end, pair.getSecond().getSecond().getSecond());
	}


	private static Pair<Integer, Pair<BooleanStackSerializableAsShort, Pair<Integer, Integer>>> split(int externalState) {
		return Pair.create(externalState >> 16, Pair.create(new BooleanStackSerializableAsShort((externalState & 0xFFFF00) >> 8), Pair.create((externalState & 0xF0) >> 4, externalState & 0xF)));
	}

	private static int merge(int commentaryDepth, BooleanStackSerializableAsShort constantConditionStates, int falseDepth, int state) {
		if ((commentaryDepth & 0xFF) != commentaryDepth) {
			throw new IllegalArgumentException("commentaryDepth is to big : " + commentaryDepth);
		}
		if ((state & 0xF) != state) {
			throw new IllegalArgumentException("state is to big : " + state);
		}
		if ((falseDepth & 0xF) != falseDepth) {
			throw new IllegalArgumentException("falseDepth is to big : " + falseDepth);
		}
		short serializedConditionStates = constantConditionStates.serializeAsShort();
		return ((commentaryDepth & 0xFF) << 24) | ((serializedConditionStates & 0xFFFF) << 8) | ((falseDepth & 0xF) << 4) | (state & 0xF);
	}

}
