package org.modula;

import com.intellij.lang.Language;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 20.06.13
 * Time: 23:11
 * To change this template use File | Settings | File Templates.
 */
public class P1CompileTimeConditionLanguage extends Language {

	public static P1CompileTimeConditionLanguage INSTANCE = new P1CompileTimeConditionLanguage();

	private P1CompileTimeConditionLanguage() {
		super("modula-p1-macintosh-compile-time-condition");
	}
}
