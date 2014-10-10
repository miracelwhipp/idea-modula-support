package org.modula.parsing.grammar;

import org.modula.parsing.utility.BooleanStackSerializableAsShort;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 20.06.13
 * Time: 22:26
 * To change this template use File | Settings | File Templates.
 */
public interface CompileTimeConditionAwareLexer {

	void setConstantConditionStates(BooleanStackSerializableAsShort constantConditionStates);

	BooleanStackSerializableAsShort getConstantConditionStates();

	int getFalseDepth();

	void setFalseDepth(int depth);


}
