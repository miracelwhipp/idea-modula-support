package org.modula.parsing.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.Key;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.modula.helpers.index.keys.SymbolByModule;
import org.modula.parsing.definition.psi.DefinitionDefinitionModule;
import org.modula.parsing.utility.ModulaPsiTraversingUtility;

import java.util.Collection;

/**
 * As superclass of {@link org.modula.parsing.definition.psi.DefinitionModuleImport} it stores the imported
 * symbols of a file.
 */
public class SymbolImportStore extends ASTWrapperPsiElement {

	private static final Key<ImportMap<PsiElement>> KEY = Key.create("modula.symbol.import.map");


	public SymbolImportStore(@NotNull ASTNode node) {
		super(node);
		storeSymbol();
	}

	private void storeSymbol() {
		ImportMap<PsiElement> symbolImportMap = getSymbolImportMap(this);

		if (null == symbolImportMap) {
			return;
		}

		symbolImportMap.put(getNode().getText(), this);
	}

	@Nullable
	public static ImportMap<PsiElement> getSymbolImportMap(PsiElement psi) {

        DefinitionDefinitionModule definitionFile = ModulaPsiTraversingUtility.getDefRootElement(psi);

		if (null == definitionFile) {
			return null;
		}

		synchronized (KEY) {
			ImportMap<PsiElement> symbolImportMap = definitionFile.getUserData(KEY);
			if (null == symbolImportMap) {

                String moduleName = definitionFile.getModuleHeader().getIdent().getText();

                symbolImportMap = new ImportMap<PsiElement>(new PsiElementInModulaFileRepairer(), moduleName, SymbolByModule.INSTANCE, psi.getProject());
				definitionFile.putUserData(KEY, symbolImportMap);
			}
			return symbolImportMap;
		}


	}


}
