package org.modula.helpers.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import org.modula.ModulaDefinitionModule;
import org.modula.helpers.index.keys.ModuleIndex;
import org.modula.parsing.modula.psi.TokenModulaTypes;

/**
 * A {@link CompletionContributor} that adds the known names of modules to the code completion
 */
public class ModuleNameCompletionContributor extends CompletionContributor {

	public ModuleNameCompletionContributor() {
		extend(
			CompletionType.BASIC,
			PlatformPatterns.
					psiElement(TokenModulaTypes.IDENTIFIER).
					inside(PlatformPatterns.psiElement(TokenModulaTypes.MODULE_NAME)).
					withLanguage(ModulaDefinitionModule.INSTANCE),
			new CompletionProvider<CompletionParameters>() {
				@Override
				protected void addCompletions(@NotNull CompletionParameters parameters, ProcessingContext context, @NotNull CompletionResultSet result) {
					for (String moduleName : ModuleIndex.INSTANCE.getAllKeys(parameters.getOriginalFile().getProject())) {
						result.addElement(LookupElementBuilder.create(moduleName));
					}
				}
			}
		);
	}
}
