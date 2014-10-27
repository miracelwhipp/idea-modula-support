package org.modula.parsing.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.Key;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.modula.parsing.modula.psi.ModulaCompilationUnit;
import org.modula.parsing.utility.ModulaPsiTraversingUtility;

/**
 * As superclass of {@link org.modula.parsing.modula.psi.ModulaDefinitionModule} it stores the imported
 * modules of a file.
 */
public class ModuleImportStore extends ASTWrapperPsiElement {

	private static final Key<ImportMap<PsiElement>> KEY = Key.create("modula.module.import.map");

	public ModuleImportStore(@NotNull ASTNode node) {
		super(node);
		storeModule();
	}

	private void storeModule() {
		ImportMap<PsiElement> moduleImportMap = getModuleImportMap(this);

		if (null == moduleImportMap) {
			return;
		}

		moduleImportMap.put(getNode().getText(), this);
	}

	@Nullable
	public static ImportMap<PsiElement> getModuleImportMap(PsiElement psi) {

		ModulaCompilationUnit modulaFile = ModulaPsiTraversingUtility.getModuleRootElement(psi);

		if (null == modulaFile) {
			return null;
		}

		synchronized (KEY) {
			ImportMap<PsiElement> moduleImportMap = modulaFile.getUserData(KEY);
			if (null == moduleImportMap) {
				moduleImportMap = new ImportMap<PsiElement>(new PsiElementInModulaFileRepairer());
				modulaFile.putUserData(KEY, moduleImportMap);
			}
			return moduleImportMap;
		}
	}

}
