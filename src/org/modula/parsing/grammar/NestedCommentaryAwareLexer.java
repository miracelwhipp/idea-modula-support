package org.modula.parsing.grammar;

import com.intellij.lexer.FlexLexer;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 31.05.13
 * Time: 22:24
 * To change this template use File | Settings | File Templates.
 */
public interface NestedCommentaryAwareLexer extends FlexLexer {

	void setCommentaryDepth(int commentaryDepth);

	int getCommentaryDepth();


}
