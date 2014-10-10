package org.modula.parsing.utility;

import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.Nullable;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 02.06.13
 * Time: 22:05
 * To change this template use File | Settings | File Templates.
 */
public final class AstTraversingUtility {

	private AstTraversingUtility() {
	}


	@Nullable
	public static ASTNode findChildRecursivelyByType(ASTNode parent, IElementType type) {
		ASTNode ret = parent.findChildByType(type);

		if (null != ret) {
			return ret;
		}

		for (ASTNode child : parent.getChildren(null)) {
			ret = findChildRecursivelyByType(child, type);
			if (null != ret) {
				return ret;
			}
		}

		return ret;

	}

}
