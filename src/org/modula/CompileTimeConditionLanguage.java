package org.modula;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 20.06.13
 * Time: 23:11
 * To change this template use File | Settings | File Templates.
 */
public class CompileTimeConditionLanguage extends Language {

	public static CompileTimeConditionLanguage INSTANCE = new CompileTimeConditionLanguage();

	private CompileTimeConditionLanguage() {
		super("modula-compile-time-condition");
	}
}
