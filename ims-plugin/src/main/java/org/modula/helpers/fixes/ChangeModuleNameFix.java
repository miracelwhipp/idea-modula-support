package org.modula.helpers.fixes;

import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.modula.psi.TokenModulaTypes;
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
						AstTraversingUtility.findChildRecursivelyByType(file.getNode(), TokenModulaTypes.DEFINITION_MODULE);
				ASTNode correctName = defFile.findChildByType(TokenModulaTypes.IDENT);

				ASTNode header = defFile.findChildByType(TokenModulaTypes.MODULE_HEADER);
				ASTNode moduleName = header.findChildByType(TokenModulaTypes.IDENT);

				header.replaceChild(moduleName, correctName);
			}
		});
	}

	@Override
	public boolean startInWriteAction() {
		return true;
	}
}
