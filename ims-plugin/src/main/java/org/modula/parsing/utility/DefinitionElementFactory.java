package org.modula.parsing.utility;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.modula.files.ModuleDefinitionType;
import org.modula.parsing.modula.psi.ModulaDefinitionModule;
import org.modula.parsing.modula.psi.ModulaImportClause;
import org.modula.parsing.psi.DefinitionFile;

/**
 * A factory for PsiElements in Definition files.
 */
public final class DefinitionElementFactory {

	private DefinitionElementFactory() {}

	public static DefinitionFile createFile(@NotNull Project project, String text) {
		return (DefinitionFile) PsiFileFactory.getInstance(project).
				createFileFromText("dummy.def", ModuleDefinitionType.INSTANCE, text);
	}

	private static ModulaDefinitionModule createFileFirstChild(@NotNull Project project, String text) {
		return (ModulaDefinitionModule) createFile(project, text).getFirstChild();
	}

	public static ModulaImportClause createModuleImportClause(@NotNull Project project, @NotNull String moduleName) {
		ModulaDefinitionModule file = createFileFirstChild(project, "DEFINITION MODULE dummy; IMPORT " + moduleName + "; END dummy.");
		return file.getImportClauseList().get(0);
	}

	public static ModulaImportClause createSymbolImportClause(@NotNull Project project, @NotNull String moduleName, @NotNull String symbolName) {
		ModulaDefinitionModule file = createFileFirstChild(project, "DEFINITION MODULE dummy; FROM " + moduleName + " IMPORT " + symbolName + "; END dummy.");
		return file.getImportClauseList().get(0);
	}

	public static ModulaImportClause createImportClause(@NotNull Project project, @NotNull String moduleName, @Nullable String symbolName) {
		if (null == symbolName) {
			return createModuleImportClause(project, moduleName);
		}

		return createSymbolImportClause(project, moduleName, symbolName);
	}

}
