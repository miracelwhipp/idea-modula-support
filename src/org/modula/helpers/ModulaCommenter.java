package org.modula.helpers;

import com.intellij.lang.Commenter;
import org.jetbrains.annotations.Nullable;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 02.06.13
 * Time: 20:16
 * To change this template use File | Settings | File Templates.
 */
public class ModulaCommenter implements Commenter {

	@Nullable
	@Override
	public String getLineCommentPrefix() {
		//there is no line comment in modula-2
		return null;
	}

	@Nullable
	@Override
	public String getBlockCommentPrefix() {
		return "(*";
	}

	@Nullable
	@Override
	public String getBlockCommentSuffix() {
		return "*)";
	}

	@Nullable
	@Override
	public String getCommentedBlockCommentPrefix() {
		return "(*";
	}

	@Nullable
	@Override
	public String getCommentedBlockCommentSuffix() {
		return "*)";
	}
}
