package org.modula.parsing.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import org.modula.ModulaDefinitionModule;
import org.modula.files.ModuleDefinitionType;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 18.05.13
 * Time: 11:58
 * To change this template use File | Settings | File Templates.
 */
public class DefinitionFile extends PsiFileBase {

	public DefinitionFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, ModulaDefinitionModule.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return ModuleDefinitionType.INSTANCE;
	}

}
