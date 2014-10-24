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
		if (!(element instanceof DefinitionDefinitionModule)) {
			return;
		}

		DefinitionDefinitionModule module = (DefinitionDefinitionModule) element;
		DefinitionModuleHeader header = module.getModuleHeader();


		if (header.getIdent().getText().equals(module.getIdent().getText())) {
			return;
		}

		Annotation footerErrorAnnotation = holder.createErrorAnnotation(module.getIdent(), "wrong module name in Module footer.");
		footerErrorAnnotation.registerFix(new ChangeFooterNameFix(module.getIdent().getText()));
		footerErrorAnnotation.registerFix(new ChangeModuleNameFix(header.getIdent().getText()));

		Annotation headerErrorAnnotation = holder.createErrorAnnotation(header.getIdent(), "wrong module name in Module footer.");
		headerErrorAnnotation.registerFix(new ChangeFooterNameFix(module.getIdent().getText()));
		headerErrorAnnotation.registerFix(new ChangeModuleNameFix(header.getIdent().getText()));


	}
}
