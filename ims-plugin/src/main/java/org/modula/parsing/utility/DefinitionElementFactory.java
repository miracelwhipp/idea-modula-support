package org.modula.parsing.utility;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.modula.files.ModuleDefinitionType;
import org.modula.parsing.definition.psi.DefinitionDefinitionModule;
import org.modula.parsing.definition.psi.DefinitionImportClause;
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

	private static DefinitionDefinitionModule createFileFirstChild(@NotNull Project project, String text) {
		return (DefinitionDefinitionModule) createFile(project, text).getFirstChild();
	}

	public static DefinitionImportClause createModuleImportClause(@NotNull Project project, @NotNull String moduleName) {
		DefinitionDefinitionModule file = createFileFirstChild(project, "DEFINITION MODULE dummy; IMPORT " + moduleName + "; END dummy.");
		return file.getImportClauseList().get(0);
	}

	public static DefinitionImportClause createSymbolImportClause(@NotNull Project project, @NotNull String moduleName, @NotNull String symbolName) {
		DefinitionDefinitionModule file = createFileFirstChild(project, "DEFINITION MODULE dummy; FROM " + moduleName + " IMPORT " + symbolName + "; END dummy.");
		return file.getImportClauseList().get(0);
	}

	public static DefinitionImportClause createImportClause(@NotNull Project project, @NotNull String moduleName, @Nullable String symbolName) {
		if (null == symbolName) {
			return createModuleImportClause(project, moduleName);
		}

		return createSymbolImportClause(project, moduleName, symbolName);
	}

}
