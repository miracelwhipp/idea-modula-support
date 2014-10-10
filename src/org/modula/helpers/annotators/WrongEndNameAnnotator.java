package org.modula.helpers.annotators;

import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.modula.helpers.fixes.ChangeFooterNameFix;
import org.modula.helpers.fixes.ChangeModuleNameFix;
import org.modula.parsing.definition.psi.*;

/**
 * Annotates Def file footers whose module name does not match the one in the header.
 */
public class WrongEndNameAnnotator implements Annotator {

	@Override
	public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
		if (!(element instanceof DefinitionFooter)) {
			return;
		}

		DefinitionFooter footer = (DefinitionFooter) element;
		PsiElement parentElement = footer.getParent();

		if (!(parentElement instanceof DefinitionDefinitionFile)) {
			return;
		}

		DefinitionDefinitionFile definitionFile = (DefinitionDefinitionFile) parentElement;
		DefinitionHeader header = definitionFile.getHeader();
		DefinitionModuleDefinition moduleDefinition = header.getModuleDefinition();

		if (null == moduleDefinition) {

			DefinitionGenericModuleDefinition genericModuleDefinition = header.getGenericModuleDefinition();
			if (null == genericModuleDefinition) {
				return;
			}

			moduleDefinition = genericModuleDefinition.getModuleDefinition();
		}

		if (moduleDefinition.getModuleName().getText().equals(footer.getModuleName().getText())) {
			return;
		}

		Annotation footerErrorAnnotation = holder.createErrorAnnotation(footer.getModuleName(), "wrong module name in Module footer.");
		footerErrorAnnotation.registerFix(new ChangeFooterNameFix(moduleDefinition.getModuleName().getText()));
		footerErrorAnnotation.registerFix(new ChangeModuleNameFix(footer.getModuleName().getText()));

		Annotation headerErrorAnnotation = holder.createErrorAnnotation(moduleDefinition.getModuleName(), "wrong module name in Module footer.");
		headerErrorAnnotation.registerFix(new ChangeFooterNameFix(moduleDefinition.getModuleName().getText()));
		headerErrorAnnotation.registerFix(new ChangeModuleNameFix(footer.getModuleName().getText()));


	}
}
