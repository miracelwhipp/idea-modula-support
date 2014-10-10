package org.modula.parsing.utility;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 04.12.13
 * Time: 17:11
 * To change this template use File | Settings | File Templates.
 */
public interface BooleanStack {

	void push(boolean value);

	boolean pop();

	boolean top();

	void top(boolean value);

	int size();

	boolean empty();

}
