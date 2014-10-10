package org.modula.helpers.fixes;

import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.definition.psi.ModulaTypes;
import org.modula.parsing.utility.AstTraversingUtility;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 02.06.13
 * Time: 22:16
 * To change this template use File | Settings | File Templates.
 */
public class ChangeModuleNameFix implements IntentionAction {

	private final String name;

	public ChangeModuleNameFix(String name) {
		this.name = name;
	}

	@NotNull
	@Override
	public String getText() {
		return "change module name to " + name;
	}

	@NotNull
	@Override
	public String getFamilyName() {
		return "modula trailing name inconsistency";
	}

	@Override
	public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
		return true;
	}

	@Override
	public void invoke(@NotNull Project project, Editor editor, final PsiFile file) throws IncorrectOperationException {
		ApplicationManager.getApplication().runWriteAction(new Runnable() {
			@Override
			public void run() {
				ASTNode defFile =
						AstTraversingUtility.findChildRecursivelyByType(file.getNode(), ModulaTypes.DEFINITION_FILE);
				ASTNode footer = defFile.findChildByType(ModulaTypes.FOOTER);
				ASTNode correctName = footer.findChildByType(ModulaTypes.MODULE_NAME).copyElement();

				ASTNode header = defFile.findChildByType(ModulaTypes.HEADER);
				ASTNode moduleDefinition =
						AstTraversingUtility.findChildRecursivelyByType(header, ModulaTypes.MODULE_DEFINITION);
				ASTNode moduleName = moduleDefinition.findChildByType(ModulaTypes.MODULE_NAME);

				moduleDefinition.replaceChild(moduleName, correctName);
			}
		});
	}

	@Override
	public boolean startInWriteAction() {
		return true;
	}
}
