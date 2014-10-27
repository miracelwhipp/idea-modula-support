package org.modula.parsing.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.utility.ModulaPsiTraversingUtility;

/**
 * Check is validated if and only if the value is still in a modula file
 */
public class PsiElementInModulaFileRepairer implements ImportMap.ConsistencyRepairer<PsiElement> {

	@Override
	public boolean check(@NotNull ImportMap<PsiElement> imports, @NotNull String key, @NotNull PsiElement value) {

		if (null == ModulaPsiTraversingUtility.getModuleRootElement(value)) {
			imports.remove(key);
			return false;
		}

		String consistentKey = value.getText();
		if (consistentKey.equals(key)) {
			return true;
		}

		imports.remove(key);
		imports.put(consistentKey, value);

		return false;
	}
}
