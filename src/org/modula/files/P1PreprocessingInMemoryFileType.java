package org.modula.files;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.modula.CompileTimeConditionLanguage;

import javax.swing.*;

/**
 * A {@link com.intellij.openapi.fileTypes.LanguageFileType} that will only be used in memory to evaluate preprocessor conditions.
 */
public class P1PreprocessingInMemoryFileType extends LanguageFileType {

	public static P1PreprocessingInMemoryFileType INSTANCE = new P1PreprocessingInMemoryFileType();

	private P1PreprocessingInMemoryFileType() {
		super(CompileTimeConditionLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "modula-p1-macintosh-preprocessing-file";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "a file type for modula in memory preprocessor condition analysis";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "p1mctc";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return null;
	}
}
