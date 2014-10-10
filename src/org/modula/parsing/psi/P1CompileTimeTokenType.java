package org.modula.parsing.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.modula.CompileTimeConditionLanguage;
import org.modula.P1CompileTimeConditionLanguage;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 18.05.13
 * Time: 10:03
 * To change this template use File | Settings | File Templates.
 */
public class P1CompileTimeTokenType extends IElementType {

	public P1CompileTimeTokenType(@NotNull @NonNls String debugName) {
		super(debugName, P1CompileTimeConditionLanguage.INSTANCE);
	}

	@Override
	public String toString() {
		return "P1CompileTimeTokenType." + super.toString();
	}

}
