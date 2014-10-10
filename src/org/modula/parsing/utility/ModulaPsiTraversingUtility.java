package org.modula.parsing.utility;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.Nullable;
import org.modula.parsing.definition.psi.*;

/**
 * Holds utility functions to obtain information from a Modula Psi Tree
 */
public final class ModulaPsiTraversingUtility {

	private ModulaPsiTraversingUtility() {}

	@Nullable
	public static String getModuleName(PsiElement psi) {

		if (null == psi) {
			return null;
		}

		PsiElement parent = getDefRootElement(psi);

		if (parent == null) {
			return null;
		}

		DefinitionDefinitionFile file = (DefinitionDefinitionFile) parent;

		DefinitionHeader header = file.getHeader();

		DefinitionModuleDefinition moduleDefinition;

		DefinitionGenericModuleDefinition genericModuleDefinition = header.getGenericModuleDefinition();
		if (null != genericModuleDefinition) {
			moduleDefinition = genericModuleDefinition.getModuleDefinition();
		} else {
			moduleDefinition = header.getModuleDefinition();
		}

		if (null == moduleDefinition) {
			return null;
		}

		return moduleDefinition.getModuleName().getText();
	}

	@Nullable
	public static PsiElement getDefRootElement(PsiElement psi) {
		PsiElement parent = psi;
		while (!((parent = parent.getParent()) instanceof DefinitionDefinitionFile)) {
			if (null == parent) {
				return null;
			}
		}
		return parent;
	}

	@Nullable
	public static String getTypeName(DefinitionTypeDefinition psi) {

		DefinitionOpaqueTypeDefinition opaqueTypeDefinition = psi.getOpaqueTypeDefinition();

		if (null != opaqueTypeDefinition) {
			return opaqueTypeDefinition.getText();
		}

		DefinitionTypeAliasDefinition typeAliasDefinition = psi.getTypeAliasDefinition();
		if (null == typeAliasDefinition) {
			return null;
		}

		return typeAliasDefinition.getTypeName().getText();


	}

}
