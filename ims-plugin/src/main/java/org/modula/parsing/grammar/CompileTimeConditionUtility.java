package org.modula.parsing.grammar;

import com.intellij.lang.Language;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.impl.PsiFileFactoryImpl;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import org.jetbrains.annotations.NotNull;
import org.modula.CompileTimeConditionLanguage;
import org.modula.parsing.ModulaParseException;
import org.modula.parsing.compile.time.psi.*;
import org.modula.parsing.psi.CompileTimeTokenType;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 09.06.13
 * Time: 22:51
 * To change this template use File | Settings | File Templates.
 */
public final class CompileTimeConditionUtility {

	private CompileTimeConditionUtility() {
	}

	public static boolean evaluate(String text, Project project, @NotNull Language language) throws ModulaParseException {
		PsiElement root = parse(text, project, CompileTimeConditionLanguage.INSTANCE);
		return evaluate(root.getFirstChild());
	}

	private static boolean evaluate(String text) throws ModulaParseException {
		if (null == text) {
			throw new ModulaParseException("cannot evaluate null");
		}

		if (text.equals("TRUE")) {
			return true;
		}

		if (text.equals("FALSE")) {
			return false;
		}

		return text.trim().length() % 2 == 0;

	}

	private static boolean evaluate(PsiElement element) throws ModulaParseException {
		if (null == element) {
			throw new ModulaParseException("cannot evaluate null");
		}

		PsiElement nextSibling = element.getNextSibling();
		if (element instanceof PsiWhiteSpace) {
			return evaluate(nextSibling);
		}

		if (element instanceof CompileTimeConditionDisjunction) {
			CompileTimeConditionDisjunction disjunction = (CompileTimeConditionDisjunction) element;
			if (evaluate(disjunction.getConjunction())) {
				return true;
			}

			CompileTimeConditionDisjunction temp = disjunction.getDisjunction();
			return null != temp && evaluate(temp);
		}

		if (element instanceof CompileTimeConditionConjunction) {
			CompileTimeConditionConjunction conjunction = (CompileTimeConditionConjunction) element;
			if (!evaluate(conjunction.getNegation())) {
				return false;
			}

			CompileTimeConditionConjunction temp = conjunction.getConjunction();
			return null == temp || evaluate(temp);
		}

		if (element instanceof CompileTimeConditionNegation) {
			CompileTimeConditionNegation negation = (CompileTimeConditionNegation) element;

			CompileTimeConditionNegation temp = negation.getNegation();
			if (null != temp) {
				return !evaluate(temp);
			}

			return evaluate(negation.getTerm());
		}

		if (element instanceof CompileTimeConditionTerm) {
			CompileTimeConditionTerm term = (CompileTimeConditionTerm) element;
			if (null != term.getDisjunction()) {
				return evaluate(term.getDisjunction());
			}


			return evaluate(term.getText().trim());
		}

		if (nextSibling != element) {
			return evaluate(nextSibling);
		}

		throw new ModulaParseException("illegal token encountered: " +
				element.getClass().getCanonicalName() + " : " + element.toString());
	}

	private static PsiElement parse(String text, Project project, @NotNull Language language) {
		PsiFileFactory factory = PsiFileFactory.getInstance(project);
		if (null == factory) {
			factory = new PsiFileFactoryImpl(PsiManager.getInstance(project));
		}
		return factory.createFileFromText("condition.mctc", language, text);
	}

}
