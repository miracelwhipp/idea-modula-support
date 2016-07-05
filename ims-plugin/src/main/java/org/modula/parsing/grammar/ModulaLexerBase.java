package org.modula.parsing.grammar;

import com.intellij.lang.Language;
import com.intellij.openapi.project.Project;
import com.intellij.psi.tree.IElementType;
import org.modula.parsing.ModulaParseException;
import org.modula.parsing.modula.psi.TokenModulaTypes;
import org.modula.parsing.utility.BooleanStackSerializableAsShort;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 06.12.13
 * Time: 19:08
 * To change this template use File | Settings | File Templates.
 */
public abstract class ModulaLexerBase implements ModulaSpecialtyAwareLexer {

	private int commentaryDepth = 0;
	private int falseDepth = 0;
	private BooleanStackSerializableAsShort constantConditionStates = new BooleanStackSerializableAsShort();
	private final Project project;

	private final int initial;
	private final int invalidConditionalCode;
	private final int erroneousConditionalCode;
	private final int compileTimeCondition;
	private final int p1CompileTimeCondition;
	private final int comment;


	protected ModulaLexerBase(Project project, int initial, int invalidConditionalCode,
	                          int erroneousConditionalCode, int compileTimeCondition, int p1CompileTimeCondition, int comment) {
		this.project = project;
		this.initial = initial;
		this.invalidConditionalCode = invalidConditionalCode;
		this.erroneousConditionalCode = erroneousConditionalCode;
		this.compileTimeCondition = compileTimeCondition;
		this.p1CompileTimeCondition = p1CompileTimeCondition;
		this.comment = comment;
	}

	public abstract CharSequence yytext();

	private IElementType pushInvalidContext() {
		falseDepth++;
		return TokenModulaTypes.COMPILE_TIME_INVALID_CODE;
	}

	private IElementType popInvalidContext() {

		if (falseDepth-- > 0) {
			return TokenModulaTypes.COMPILE_TIME_INVALID_CODE;
		}

		if (constantConditionStates.size() > 0) {
			constantConditionStates.pop();
		}
		falseDepth = 0;
		yybegin(initial);
		return TokenModulaTypes.COMPILE_TIME_END;
	}

	private IElementType startInvalidContext(int state) {
		yybegin(state);
		falseDepth = 0;
		return TokenModulaTypes.COMPILE_TIME_INVALID_CODE;
	}


	public IElementType validIf(boolean p1) {
		constantConditionStates.push(false);
		yybegin(p1 ? p1CompileTimeCondition : compileTimeCondition);
		return TokenModulaTypes.COMPILE_TIME_IF;
	}

	public IElementType invalidIf() {
		return pushInvalidContext();
	}

	public IElementType validElse() {
		startInvalidContext(invalidConditionalCode);
		return TokenModulaTypes.COMPILE_TIME_ELSE;
	}

	public IElementType invalidElse() {

		if (falseDepth > 0 || constantConditionStates.size() == 0) {
			return TokenModulaTypes.COMPILE_TIME_INVALID_CODE;
		}

		if (constantConditionStates.top()) {
			startInvalidContext(invalidConditionalCode);
			return TokenModulaTypes.COMPILE_TIME_ELSE;
		}

		constantConditionStates.top(true);
		yybegin(initial);
		return TokenModulaTypes.COMPILE_TIME_END;

	}


	public IElementType invalidElsif(boolean p1) {

		if (falseDepth > 0 || constantConditionStates.size() == 0) {
			return TokenModulaTypes.COMPILE_TIME_INVALID_CODE;
		}

		if (constantConditionStates.top()) {
			startInvalidContext(invalidConditionalCode);
			return TokenModulaTypes.COMPILE_TIME_ELSE;
		}

		yybegin(p1 ? p1CompileTimeCondition : compileTimeCondition);
		return TokenModulaTypes.COMPILE_TIME_IF;

	}

	public IElementType evaluateCondition(Language conditionLanguage) {
		try {
			if (CompileTimeConditionUtility.evaluate(yytext().toString(), project, conditionLanguage)) {
				constantConditionStates.top(true);
				yybegin(initial);
			} else {
				startInvalidContext(invalidConditionalCode);
			}
		} catch (ModulaParseException exception) {
			//TODO: log problem
			startInvalidContext(erroneousConditionalCode);
		}

		return TokenModulaTypes.COMPILE_TIME_CONDITION;

	}

	public IElementType invalidEnd() {
		return popInvalidContext();
	}

	public IElementType validEnd() {

		// invalid end. no matching IF
		if (constantConditionStates.size() == 0) {
			return TokenModulaTypes.COMPILE_TIME_END;
		}

		constantConditionStates.pop();

		return TokenModulaTypes.COMPILE_TIME_END;
	}

	public IElementType openComment() {
		if (commentaryDepth++ == 0) {
			yybegin(comment);
		}
		return TokenModulaTypes.COMMENT;
	}

	public IElementType closeComment() {
		if (--commentaryDepth == 0) {
			yybegin(initial);
		}

		if (commentaryDepth < 0) {
			commentaryDepth = 0;
		}

		return TokenModulaTypes.COMMENT;
	}

	@Override
	public void setConstantConditionStates(BooleanStackSerializableAsShort constantConditionStates) {
		this.constantConditionStates = constantConditionStates;
	}

	@Override
	public BooleanStackSerializableAsShort getConstantConditionStates() {
		return constantConditionStates;
	}

	@Override
	public void setCommentaryDepth(int commentaryDepth) {
		this.commentaryDepth = commentaryDepth;
	}

	@Override
	public int getCommentaryDepth() {
		return commentaryDepth;
	}

	@Override
	public int getFalseDepth() {
		return falseDepth;
	}

	@Override
	public void setFalseDepth(int depth) {
		falseDepth = depth;
	}
}
