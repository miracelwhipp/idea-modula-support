package org.modula.parsing;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 20.05.13
 * Time: 18:46
 * To change this template use File | Settings | File Templates.
 */
public class MatchIterable implements Iterable<MatchResult> {

	private final Matcher matcher;

	public MatchIterable(Matcher matcher) {
		this.matcher = matcher;
	}

	public class MatchIterator implements Iterator<MatchResult> {

		MatchResult result = null;

		@Override
		public boolean hasNext() {

			result = null;

			if (!matcher.find()) {
				return false;
			}

			result = matcher.toMatchResult();

			return true;
		}

		@Override
		public MatchResult next() {
			if (null == result) {
				hasNext();
			}

			if (null == result) {
				throw new NoSuchElementException();
			}

			MatchResult ret = result;
			result = null;

			return ret;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}


	@Override
	public Iterator<MatchResult> iterator() {
		return new MatchIterator();
	}
}
