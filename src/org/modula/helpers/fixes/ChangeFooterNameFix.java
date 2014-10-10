package org.modula.helpers.fixes;

import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.impl.source.tree.CompositeElement;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.modula.parsing.definition.psi.DefinitionFooter;
import org.modula.parsing.definition.psi.ModulaTypes;
import org.modula.parsing.utility.AstTraversingUtility;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 02.06.13
 * Time: 20:29
 * To change this template use File | Settings | File Templates.
 */
public class ChangeFooterNameFix implements IntentionAction {

	private final String newName;

	public ChangeFooterNameFix(String newName) {
		this.newName = newName;
	}

	@NotNull
	@Override
	public String getText() {
		return "change footer module name to " + newName;
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
	public void invoke(@NotNull final Project project, Editor editor, final PsiFile file) throws IncorrectOperationException {
		ApplicationManager.getApplication().runWriteAction(new Runnable() {
			@Override
			public void run() {
				ASTNode defFile =
						AstTraversingUtility.findChildRecursivelyByType(file.getNode(), ModulaTypes.DEFINITION_FILE);

				if (null == defFile) {
					return;
				}

				ASTNode footer = defFile.findChildByType(ModulaTypes.FOOTER);

				if (null == footer) {
					return;
				}

				ASTNode moduleName = footer.findChildByType(ModulaTypes.MODULE_NAME);

				if (null == moduleName) {
					return;
				}

				ASTNode header = defFile.findChildByType(ModulaTypes.HEADER);

				if (null == header) {
					return;
				}

				ASTNode childRecursivelyByType = AstTraversingUtility.findChildRecursivelyByType(header, ModulaTypes.MODULE_NAME);

				if (null == childRecursivelyByType) {
					return;
				}

				ASTNode correctName =
						childRecursivelyByType.copyElement();

				footer.replaceChild(moduleName, correctName);
			}
		});
	}

	@Override
	public boolean startInWriteAction() {
		return true;
	}
}
