package org.modula.helpers.annotators;

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StringStubIndexExtension;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.index.keys.*;
import org.modula.helpers.index.stubs.SymbolStub;
import org.modula.parsing.definition.psi.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Annotates unknown imported symbols.
 */
public class UnknownSymbolAnnotator implements Annotator {

	@Override
	public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {

		if (!(element instanceof DefinitionSymbolImportClause)) {
			return;
		}

		DefinitionSymbolImportClause importClause = (DefinitionSymbolImportClause) element;

		String moduleName = importClause.getModuleName().getText();

		Project project = element.getProject();

		if (!ModuleIndex.INSTANCE.getAllKeys(project).contains(moduleName) && !ImplicitEntities.isImplicitModule(moduleName)) {
			holder.createErrorAnnotation(importClause.getModuleName(), "module not found : " + moduleName).setHighlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL);
			return;
		}

		List<String> symbolsDefined = new ArrayList<String>();

		addSymbolsFromIndex(moduleName, symbolsDefined, TypeByModule.INSTANCE, project);
		addSymbolsFromIndex(moduleName, symbolsDefined, ConstantByModule.INSTANCE, project);
		addSymbolsFromIndex(moduleName, symbolsDefined, VariableByModule.INSTANCE, project);
		addSymbolsFromIndex(moduleName, symbolsDefined, ProcedureByModule.INSTANCE, project);


		List<DefinitionImportSymbol> importSymbols = importClause.getImportSymbolList();

		for (DefinitionImportSymbol symbol : importSymbols) {

			String symbolName = symbol.getText();

			if (symbolsDefined.contains(symbolName)) {
				continue;
			}

			if (ImplicitEntities.isImplicitSymbol(moduleName, symbolName)) {
				continue;
			}

			holder.createErrorAnnotation(symbol, "unknown symbol " + symbolName).setHighlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL);
		}

	}

	private void addSymbolsFromIndex(
			String module,
			List<String> symbols,
			StringStubIndexExtension<? extends SymbolStub> symbolByModule,
			Project project
	) {
		Collection<? extends SymbolStub> symbolsOfModule = symbolByModule.get(
				module,
				project,
				GlobalSearchScope.allScope(project)
		);

		if (null == symbolsOfModule) {
			return;
		}

		for (SymbolStub symbol : symbolsOfModule) {
			symbols.add(symbol.getStubName());
		}
	}
}
