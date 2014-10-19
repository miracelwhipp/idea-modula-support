package org.modula.helpers.fixes;

import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.modula.parsing.definition.psi.DefinitionDefinitionFile;
import org.modula.parsing.definition.psi.DefinitionImportClause;
import org.modula.parsing.definition.psi.ModulaTypes;
import org.modula.parsing.utility.AstTraversingUtility;
import org.modula.parsing.utility.DefinitionElementFactory;

import java.util.List;

/**
 * A fix for {@link org.modula.helpers.annotators.UnknownQualidentAnnotator}. An unknown symbol or module might be imported from
 * if it exists in the project. Note that the fix does not check whether the imported symbol or module exists. It plainly creates
 * the import clause.
 */
public class ImportUnknownDesignatorFix implements IntentionAction {

	@NotNull
	private final String moduleName;

	@Nullable
	private final String symbolName;


	public ImportUnknownDesignatorFix(@NotNull String moduleName, @Nullable String symbolName) {
		this.moduleName = moduleName;
		this.symbolName = symbolName;
	}

	public ImportUnknownDesignatorFix(@NotNull String moduleName) {
		this(moduleName, null);
	}

	@NotNull
	@Override
	public String getText() {
		return "import symbol " + symbolName + " from module " + moduleName;
	}

	@NotNull
	@Override
	public String getFamilyName() {
		return "modula missing imports";
	}

	@Override
	public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
		return true;
	}

	@Override
	public void invoke(@NotNull final Project project, Editor editor, final PsiFile file) throws IncorrectOperationException {
		ApplicationManager.getApplication().runWriteAction(new Runnable() {
			@Override
			public void run() {

				ASTNode defFile =
						AstTraversingUtility.findChildRecursivelyByType(file.getNode(), ModulaTypes.DEFINITION_FILE);

				if (null == defFile) {
					return;
				}

				DefinitionDefinitionFile file = (DefinitionDefinitionFile) defFile.getPsi();

				PsiElement anchor;

				List<DefinitionImportClause> importClauseList = file.getImportClauseList();
				int size = importClauseList.size();
				if (size > 0) {
					anchor = importClauseList.get(size - 1);
				} else {
					anchor = file.getHeader();
				}

				PsiElement importClause = DefinitionElementFactory.createImportClause(project, moduleName, symbolName);
				importClause = file.addAfter(importClause, anchor);
				defFile.addLeaf(TokenType.WHITE_SPACE, "\n\n", importClause.getNode());
			}
		});

	}

	@Override
	public boolean startInWriteAction() {
		return true;
	}
}
