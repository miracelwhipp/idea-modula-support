package org.modula.parsing;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 20.05.13
 * Time: 14:13
 * To change this template use File | Settings | File Templates.
 */
public interface Preprocessor {

	public CharSequence preProcess(CharSequence buffer, int startOffset, int endOffset);

}
