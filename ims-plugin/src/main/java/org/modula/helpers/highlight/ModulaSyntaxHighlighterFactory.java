package org.modula.helpers.highlight;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 18.05.13
 * Time: 16:41
 * To change this template use File | Settings | File Templates.
 */
public class ModulaSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

	@NotNull
	@Override
	public SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
		return new ModuleDefinitionSyntaxHighlighter();
	}
}
