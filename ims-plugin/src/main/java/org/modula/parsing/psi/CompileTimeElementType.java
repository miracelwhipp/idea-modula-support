package org.modula.parsing.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.modula.CompileTimeConditionLanguage;
import org.modula.ModulaDefinitionModule;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 18.05.13
 * Time: 10:06
 * To change this template use File | Settings | File Templates.
 */
public class CompileTimeElementType extends IElementType {

	public CompileTimeElementType(@NotNull @NonNls String debugName) {
		super(debugName, CompileTimeConditionLanguage.INSTANCE);
	}
}
