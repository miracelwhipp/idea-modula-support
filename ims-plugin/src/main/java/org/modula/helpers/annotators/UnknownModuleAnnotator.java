package org.modula.helpers.annotators;

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.keys.ImplicitEntities;
import org.modula.helpers.index.keys.ModuleIndex;
import org.modula.parsing.modula.psi.ModulaImportClause;
import org.modula.parsing.modula.psi.ModulaModuleName;
import org.modula.parsing.modula.psi.ModulaSymbolImportClause;

import java.util.Collection;

/**
 * Annotates unknown imported modules.
 */
public class UnknownModuleAnnotator implements Annotator {

	@Override
	public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {

		if (!(element instanceof ModulaImportClause)) {
			return;
		}

		ModulaImportClause importClause = (ModulaImportClause) element;

		if (null != importClause.getModuleImportClause()) {
			//will be done by org.modula.helpers.annotators.UnknownSymbolAnnotator
			return;
		}


		ModulaSymbolImportClause moduleImportClause = importClause.getSymbolImportClause();
		if (null == moduleImportClause) {
			return;
		}

		ModulaModuleName moduleNameElement = moduleImportClause.getModuleName();

		String moduleName = moduleNameElement.getText();

		if (ImplicitEntities.isImplicitModule(moduleName)) {
			return;
		}

		Collection<String> allKeys = ModuleIndex.INSTANCE.getAllKeys(element.getProject());

		if (allKeys.contains(moduleName)) {
			return;
		}

		holder.createErrorAnnotation(moduleNameElement, "module not found : " + moduleName).setHighlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL);

	}
}
