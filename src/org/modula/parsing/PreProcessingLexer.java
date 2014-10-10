package org.modula.parsing;

import com.intellij.lexer.Lexer;
import com.intellij.lexer.LexerPosition;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.Nullable;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 20.05.13
 * Time: 14:08
 * To change this template use File | Settings | File Templates.
 */
public class PreProcessingLexer extends Lexer {

	private final Lexer delegate;
	private final Preprocessor preprocessor;

	private CharSequence currentBuffer;

	public PreProcessingLexer(Lexer delegate, Preprocessor preprocessor) {
		this.delegate = delegate;
		this.preprocessor = preprocessor;
	}

	@Override
	public void start(CharSequence buffer, int startOffset, int endOffset, int initialState) {
		currentBuffer = buffer;
		delegate.start(preprocessor.preProcess(buffer, startOffset, endOffset), startOffset, endOffset, initialState);
	}

	@Override
	public int getState() {
		return delegate.getState();
	}

	@Nullable
	@Override
	public IElementType getTokenType() {
		return delegate.getTokenType();
	}

	@Override
	public int getTokenStart() {
		return delegate.getTokenStart();
	}

	@Override
	public int getTokenEnd() {
		return delegate.getTokenEnd();
	}

	@Override
	public void advance() {
		delegate.advance();
	}

	@Override
	public LexerPosition getCurrentPosition() {
		return delegate.getCurrentPosition();
	}

	@Override
	public void restore(LexerPosition position) {
		delegate.restore(position);
	}

	@Override
	public CharSequence getBufferSequence() {
		return currentBuffer;
	}

	@Override
	public int getBufferEnd() {
		return delegate.getBufferEnd();
	}
}
