package org.modula.parsing.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import org.modula.CompileTimeConditionLanguage;
import org.modula.files.PreprocessingInMemoryFileType;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 20.06.13
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 */
public class PreprocessingInMemoryFile extends PsiFileBase {

	public PreprocessingInMemoryFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, CompileTimeConditionLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return PreprocessingInMemoryFileType.INSTANCE;
	}
}
