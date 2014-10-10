package org.modula;

import com.intellij.lang.Language;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 18.05.13
 * Time: 09:40
 * To change this template use File | Settings | File Templates.
 */
public class ModulaDefinitionModule extends Language {

	public static final ModulaDefinitionModule INSTANCE = new ModulaDefinitionModule();

	private ModulaDefinitionModule() {
		super("modula-def");
	}

}
