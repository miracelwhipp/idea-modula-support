package org.modula.parsing.utility;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;
import org.modula.parsing.modula.psi.*;

/**
 * Holds utility functions to obtain information from a Modula Psi Tree
 */
public final class ModulaPsiTraversingUtility {

	private ModulaPsiTraversingUtility() {
	}

	@Nullable
	public static String getModuleName(@Nullable PsiElement psi) {

		if (null == psi) {
			return null;
		}

		ModulaCompilationUnit parent = getModuleRootElement(psi);

		return getModuleNameFromCompilationUnit(parent);

	}

	@Nullable
	public static String getModuleNameFromCompilationUnit(@Nullable ModulaCompilationUnit parent) {
		if (parent == null) {
			return null;
		}


		if (parent.getDefinitionModule() != null) {
			ModulaModuleHeader header = parent.getDefinitionModule().getModuleHeader();
			return header.getIdent().getText();
		}


		ModulaProgramModule programModule = parent.getProgramModule();

		if (programModule != null) {
			ModulaProgramHeader header = programModule.getProgramHeader();
			return header.getIdent().getText();
		}

		return null;
	}

	@Nullable
	public static ModulaCompilationUnit getModuleRootElement(PsiElement psi) {
		PsiElement parent = psi;
		while (!((parent = parent.getParent()) instanceof ModulaCompilationUnit)) {
			if (null == parent) {
				return null;
			}
		}
		return (ModulaCompilationUnit) parent;
	}


	public static String getFirstDefinedIdentifier(PsiElement element) {

		if (element instanceof ModulaConstantDeclaration) {
			return ((ModulaConstantDeclaration) element).getIdent().getText();
		}

		if (element instanceof ModulaTypeDefinition) {
			return ((ModulaTypeDefinition) element).getIdent().getText();
		}

		if (element instanceof ModulaProcedureHeading) {
			return ((ModulaProcedureHeading) element).getIdent().getText();
		}

		if (element instanceof ModulaVariableNameDefinition) {
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
	public static String getTypeName(ModulaTypeDefinition psi) {

		return psi.getIdent().getText();


	}

}
