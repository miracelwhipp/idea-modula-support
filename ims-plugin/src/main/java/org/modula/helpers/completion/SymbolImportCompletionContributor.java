package org.modula.helpers.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import org.modula.ModulaDefinitionModule;
import org.modula.helpers.index.keys.ProcedureByModule;
import org.modula.helpers.index.keys.VariableByModule;
import org.modula.helpers.index.stubs.SymbolStub;
import org.modula.helpers.index.keys.ConstantByModule;
import org.modula.helpers.index.keys.TypeByModule;
import org.modula.parsing.modula.psi.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * contributes completion for symbols imported from a module.
 * Assume to have the following code
 * <code>FROM module1 IMPORT symbol1, Symbol2, Symbol3;</code>
 * when the cursor is over symbol1 to symbol3 the contributor will contribute completion for every symbol defined in
 * module module1
 */
public class SymbolImportCompletionContributor extends CompletionContributor {

	public SymbolImportCompletionContributor() {
		extend(
			CompletionType.BASIC,
			PlatformPatterns.psiElement(
				TokenModulaTypes.IDENTIFIER).
				inside(PlatformPatterns.psiElement(TokenModulaTypes.IMPORT_SYMBOL)).
				withLanguage(ModulaDefinitionModule.INSTANCE
				),
				new CompletionProvider<CompletionParameters>() {

					@Override
					protected void addCompletions(@NotNull CompletionParameters parameters, ProcessingContext context, @NotNull CompletionResultSet result) {

						PsiElement parent = parameters.getPosition().getParent().getParent();
						if (!(parent instanceof ModulaSymbolImportClause)) {
							return;
						}

						ModulaSymbolImportClause clause = (ModulaSymbolImportClause) parent;
						ModulaModuleName moduleName = clause.getModuleName();

						String moduleKey = moduleName.getText();
						Project project = parameters.getOriginalFile().getProject();


						List<SymbolStub> symbols = new ArrayList<SymbolStub>();

						addSymbolsFromModuleBasedIndex(moduleKey, symbols, TypeByModule.INSTANCE, project);
						addSymbolsFromModuleBasedIndex(moduleKey, symbols, ConstantByModule.INSTANCE, project);
						addSymbolsFromModuleBasedIndex(moduleKey, symbols, VariableByModule.INSTANCE, project);
						addSymbolsFromModuleBasedIndex(moduleKey, symbols, ProcedureByModule.INSTANCE, project);


						for (SymbolStub symbol: symbols) {
							String lookup = getLookupFromSymbol(symbol);

							if (null == lookup) {
								continue;
							}

							result.addElement(LookupElementBuilder.create(lookup));
						}

					}
				}
		);
	}

	private void addSymbolsFromModuleBasedIndex(
			String moduleKey,
			List<SymbolStub> symbols,
			StringStubIndexExtension<? extends SymbolStub> index,
			Project project
	) {
		Collection<? extends SymbolStub> symbolsOfModule = index.get(
				moduleKey,
				project,
				GlobalSearchScope.allScope(project)
		);

		if (null == symbolsOfModule) {
			return;
		}

		for (SymbolStub symbol : symbolsOfModule) {
			symbols.add(symbol);
		}
	}

	private String getLookupFromSymbol(SymbolStub symbol) {
		return symbol.getStubName();
	}
}
