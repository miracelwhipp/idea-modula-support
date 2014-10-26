package org.modula.parsing.utility;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.Nullable;
import org.modula.parsing.definition.psi.*;

/**
 * Holds utility functions to obtain information from a Modula Psi Tree
 */
public final class ModulaPsiTraversingUtility {

	private ModulaPsiTraversingUtility() {
	}

	@Nullable
	public static String getModuleName(PsiElement psi) {

		if (null == psi) {
			return null;
		}

		PsiElement parent = getDefRootElement(psi);

		if (parent == null) {
			return null;
		}

		DefinitionDefinitionModule file = (DefinitionDefinitionModule) parent;

		DefinitionModuleHeader header = file.getModuleHeader();


		return header.getIdent().getText();
	}

	@Nullable
	public static DefinitionDefinitionModule getDefRootElement(PsiElement psi) {
		PsiElement parent = psi;
		while (!((parent = parent.getParent()) instanceof DefinitionDefinitionModule)) {
			if (null == parent) {
				return null;
			}
		}
		return (DefinitionDefinitionModule) parent;
	}


	public static String getFirstDefinedIdentifier(PsiElement element) {

		if (element instanceof DefinitionConstantDeclaration) {
			return ((DefinitionConstantDeclaration) element).getIdent().getText();
		}

		if (element instanceof DefinitionTypeDefinition) {
			return ((DefinitionTypeDefinition) element).getIdent().getText();
		}

		if (element instanceof DefinitionProcedureHeading) {
			return ((DefinitionProcedureHeading) element).getIdent().getText();
		}

		if (element instanceof DefinitionVariableNameDefinition) {
			return element.getText();
		}

		for (PsiElement child : element.getChildren()) {
			String firstIdentifier = getFirstDefinedIdentifier(child);
			if (firstIdentifier != null) {
				return firstIdentifier;
			}
		}

		return null;

	}

	@Nullable
	public static String getTypeName(DefinitionTypeDefinition psi) {

		return psi.getIdent().getText();


	}

}
