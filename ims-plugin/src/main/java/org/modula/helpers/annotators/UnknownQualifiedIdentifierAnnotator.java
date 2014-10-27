package org.modula.helpers.annotators;

import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import com.intellij.psi.search.GlobalSearchScope;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.fixes.ImportUnknownDesignatorFix;
import org.modula.helpers.index.keys.ImplicitEntities;
import org.modula.helpers.index.keys.ModuleIndex;
import org.modula.helpers.index.keys.SymbolByModule;
import org.modula.helpers.index.keys.SymbolIndex;
import org.modula.helpers.index.stubs.SymbolStubPsiElement;
import org.modula.parsing.modula.psi.*;
import org.modula.parsing.psi.ImportMap;
import org.modula.parsing.psi.ModuleImportStore;
import org.modula.parsing.psi.SymbolImportStore;
import org.modula.parsing.utility.ModulaPsiTraversingUtility;

import java.util.Collection;
import java.util.List;

/**
 * Annotates unknown qualified identifiers.
 */
public class UnknownQualifiedIdentifierAnnotator implements Annotator {
	@Override
	public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {

		if (!(element instanceof ModulaQualident)) {
			return;
		}

		ModulaQualident qualident = (ModulaQualident) element;

		List<ModulaIdent> symbolNameList = qualident.getIdentList();

		if (symbolNameList.size() == 0) {
			//will never happen in correct modula file
			return;
		}

		ModulaIdent definitionSymbolName = symbolNameList.get(0);

		String symbolName = definitionSymbolName.getText();


		ModulaDefinitionModule defRootElement = ModulaPsiTraversingUtility.getDefRootElement(element);

		if (defRootElement == null) {
			return;
		}

		ModulaIdent ident = defRootElement.getIdent();

		final GlobalSearchScope global = GlobalSearchScope.allScope(element.getProject());

		Collection<SymbolStubPsiElement> definesOfCurrentModule = SymbolByModule.INSTANCE.get(ident.getText(), element.getProject(), global);

		for (SymbolStubPsiElement symbol : definesOfCurrentModule) {
			if (symbol.getText().equals(symbolName)) {
				return;
			}
		}


		if (imported(symbolName, SymbolImportStore.getSymbolImportMap(element)) || imported(symbolName, ModuleImportStore.getModuleImportMap(element))) {
			return;
		}

		if (ImplicitEntities.isImplicitImport(symbolName)) {
			return;
		}

		Annotation errorAnnotation = holder.createErrorAnnotation(element, "unknown symbol : " + symbolName);
		errorAnnotation.setHighlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL);

		Collection<ModulaDefinitionModule> definitionModuleDefinitions = ModuleIndex.INSTANCE.get(symbolName, element.getProject(), global);

		if (!definitionModuleDefinitions.isEmpty()) {
			errorAnnotation.registerFix(new ImportUnknownDesignatorFix(symbolName));
		}

		Collection<SymbolStubPsiElement> symbolStubPsiElements = SymbolIndex.INSTANCE.get(symbolName, element.getProject(), global);

		for (SymbolStubPsiElement symbolStub : symbolStubPsiElements) {
			errorAnnotation.registerFix(new ImportUnknownDesignatorFix(symbolStub.getModule(), symbolName));
		}

	}

	private boolean imported(String symbolName, ImportMap<PsiElement> importMap) {
		return null != importMap && importMap.containsKey(symbolName);
	}
}
