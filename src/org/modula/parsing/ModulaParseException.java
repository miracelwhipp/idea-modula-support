package org.modula.parsing;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 22.06.13
 * Time: 17:05
 * To change this template use File | Settings | File Templates.
 */
public class ModulaParseException extends Exception {

	public ModulaParseException() {
	}

	public ModulaParseException(String message) {
		super(message);
	}

	public ModulaParseException(String message, Throwable cause) {
		super(message, cause);
	}

	public ModulaParseException(Throwable cause) {
		super(cause);
	}
}
