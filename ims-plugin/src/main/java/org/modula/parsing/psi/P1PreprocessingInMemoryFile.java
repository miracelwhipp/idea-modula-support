package org.modula.parsing.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import org.modula.CompileTimeConditionLanguage;
import org.modula.P1CompileTimeConditionLanguage;
import org.modula.files.P1PreprocessingInMemoryFileType;
import org.modula.files.PreprocessingInMemoryFileType;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 20.06.13
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 */
public class P1PreprocessingInMemoryFile extends PsiFileBase {

	public P1PreprocessingInMemoryFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, P1CompileTimeConditionLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return P1PreprocessingInMemoryFileType.INSTANCE;
	}
}
