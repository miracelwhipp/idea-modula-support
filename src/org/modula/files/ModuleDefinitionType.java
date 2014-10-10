package org.modula.files;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.modula.ModulaDefinitionModule;
import org.modula.gui.Icons;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 18.05.13
 * Time: 09:45
 * To change this template use File | Settings | File Templates.
 */
public class ModuleDefinitionType extends LanguageFileType {

	public static ModuleDefinitionType INSTANCE = new ModuleDefinitionType();

	private ModuleDefinitionType() {
		super(ModulaDefinitionModule.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "modula-def-file";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "modula module definition";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "def";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return Icons.DEF_FILE;
	}
}
