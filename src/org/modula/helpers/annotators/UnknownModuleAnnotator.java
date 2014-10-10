package org.modula.helpers.annotators;

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.keys.ModuleIndex;
import org.modula.parsing.definition.psi.DefinitionImportClause;
import org.modula.parsing.definition.psi.DefinitionModuleImportClause;
import org.modula.parsing.definition.psi.DefinitionModuleName;
import org.modula.parsing.definition.psi.DefinitionSymbolImportClause;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Annotates unknown imported modules.
 */
public class UnknownModuleAnnotator implements Annotator {

	@Override
	public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {

		if (!(element instanceof DefinitionImportClause)) {
			return;
		}

		DefinitionImportClause importClause = (DefinitionImportClause) element;

		if (null != importClause.getModuleImportClause()) {
			//will be done by org.modula.helpers.annotators.UnknownSymbolAnnotator
			return;
		}


		DefinitionSymbolImportClause moduleImportClause = importClause.getSymbolImportClause();
		if (null == moduleImportClause) {
			return;
		}

		DefinitionModuleName moduleName = moduleImportClause.getModuleName();

		Collection<String> allKeys = ModuleIndex.INSTANCE.getAllKeys(element.getProject());

		if (allKeys.contains(moduleName.getText())) {
			return;
		}

		holder.createErrorAnnotation(moduleName, "module not found : " + moduleName.getText()).setHighlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL);

	}
}
