package org.modula.helpers.index.keys;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileSystemItem;
import com.intellij.psi.stubs.PsiFileStub;
import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.definition.psi.DefinitionDefinitionFile;
import org.modula.parsing.definition.psi.DefinitionModuleDefinition;

/**
 * An index holding every modula .def file that is parsed correctly and thus defines a module.
 */
public class ModuleDefinitionFileIndex extends StringStubIndexExtension<DefinitionModuleDefinition> {

	public static final StubIndexKey<String, DefinitionModuleDefinition> KEY = StubIndexKey.createIndexKey("modula.module.definition.file.index");

	public static final ModuleDefinitionFileIndex INSTANCE = new ModuleDefinitionFileIndex();


	@NotNull
	@Override
	public StubIndexKey<String, DefinitionModuleDefinition> getKey() {
		return KEY;
	}

	public static String getContainingFile(PsiElement psi) {
		if (psi instanceof PsiFileSystemItem) {
			return ((PsiFileSystemItem) psi).getName();
		}

		if (psi instanceof PsiFileStub) {
			return getContainingFile(((PsiFileStub) psi).getPsi());
		}
		return psi.getContainingFile().getName();
	}

}
