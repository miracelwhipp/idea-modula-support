package org.modula.helpers.index.keys;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubIndexKey;
import org.modula.helpers.index.stubs.SymbolStubPsiElement;
import org.modula.lang.ModulaContextKey;
import org.modula.parsing.utility.ModulaPsiTraversingUtility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Abstract superclass for Psi elements that define symbols inside a context
 *
 * @author miracelwhipp
 */
public abstract class CascadingStringStubIndexExtension<Psi extends PsiElement> extends StringStubIndexExtension<Psi> {

	public Collection<Psi> get(PsiElement element, Project project, GlobalSearchScope scope) {

		ModulaContextKey contextKey = ModulaPsiTraversingUtility.getContextKey(element);

		List<Psi> result = new ArrayList<Psi>();

		do {
			result.addAll(super.get(contextKey.getString(), project, scope));
		} while ((contextKey = contextKey.surroundingContext()) != null);

		return result;
	}


	public <Stub extends StubElement<? extends Psi>> void occurrence(Stub stub, IndexSink sink) {

		ModulaContextKey contextKey = ModulaPsiTraversingUtility.getContextKey(stub.getPsi());

		sink.occurrence(getKey(), contextKey.getString());
	}
}
