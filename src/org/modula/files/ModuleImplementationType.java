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
 * Time: 09:49
 * To change this template use File | Settings | File Templates.
 */
public class ModuleImplementationType extends LanguageFileType {

	public static ModuleImplementationType INSTANCE = new ModuleImplementationType();

	private ModuleImplementationType() {
		super(ModulaDefinitionModule.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "modula-mod-file";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "modula module implementation";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "mod";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return Icons.MOD_FILE;
	}
}
