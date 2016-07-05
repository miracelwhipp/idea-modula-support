package org.modula.lang;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

/**
 * Defines a context of valid identifiers
 *
 * @author miracelwhipp
 */
public class ModulaContextKey {


	private final String[] elements;
	private final int length;

	private ModulaContextKey(String[] elements, int length) {
		this.elements = elements;
		this.length = length;
	}

	public ModulaContextKey(String[] elements) {
		this.elements = Arrays.copyOf(elements, elements.length);
		int length = 0;
		for (String element : elements) {
			length += element.length() + 1;
		}
		this.length = length;
	}

	@NotNull
	public String getString() {
		StringBuilder builder = new StringBuilder(length);
		boolean first = true;
		for (String element : elements) {
			if (first) {
				first = false;
			} else {
				builder.append(".");
			}
			builder.append(element);
		}

		return builder.toString();
	}

	@Nullable
	public ModulaContextKey surroundingContext() {

		if (elements.length == 0) {
			return null;
		}

		return new ModulaContextKey(Arrays.copyOf(elements, elements.length - 1), length - elements[elements.length - 1].length());
	}

}
