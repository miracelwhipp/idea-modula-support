package org.modula.files;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.modula.CompileTimeConditionLanguage;

import javax.swing.*;

/**
 * A {@link LanguageFileType} that will only be used in memory to evaluate preprocessor conditions.
 */
//TODO: possibly unneeded - remove
public class PreprocessingInMemoryFileType extends LanguageFileType {

	public static PreprocessingInMemoryFileType INSTANCE = new PreprocessingInMemoryFileType();

	private PreprocessingInMemoryFileType() {
		super(CompileTimeConditionLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "modula-preprocessing-file";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "a file type for modula in memory preprocessor condition analysis";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "mctc";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return null;
	}
}
