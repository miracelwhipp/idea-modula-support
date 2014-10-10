package org.modula.parsing;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 20.05.13
 * Time: 14:21
 * To change this template use File | Settings | File Templates.
 */
public class CommentaryDenester implements Preprocessor {

	private final String startCommentary;
	private final String endCommentary;
	private final Pattern pattern;

	public CommentaryDenester(String startCommentary, String endCommentary) {
		this.startCommentary = startCommentary;
		this.endCommentary = endCommentary;
		pattern = Pattern.compile("(" + startCommentary + "|" + endCommentary + ")");
	}


	@Override
	public CharSequence preProcess(CharSequence buffer, int startOffset, int endOffset) {

		int commentaryDepth = -1;

//		for (MatchResult result : new MatchIterable(pattern.matcher(buffer.subSequence(0, startOffset)))) {
//			if (result.groupCount() != 1) {
//				throw new IllegalStateException("pattern needs to include one and only one group.");
//			}
//
//			String match = result.group(1);
//			if (match.matches(startCommentary)) {
//				commentaryDepth++;
//			} else if (match.matches(endCommentary)){
//				commentaryDepth--;
//			} else {
//				throw new IllegalStateException("match matches neither '" + startCommentary + "' nor '" + endCommentary + "'.");
//			}
//
//		}

		StringBuilder ret = new StringBuilder(buffer.length());
		ret.append(buffer.subSequence(0, startOffset));

		Matcher matcher = pattern.matcher(buffer.subSequence(startOffset, endOffset));


		int previous = 0;

		for (MatchResult result : new MatchIterable(matcher)) {

			int position = result.start();

			ret.append(buffer.subSequence(previous + startOffset, position + startOffset));

			if (result.groupCount() != 1) {
				throw new IllegalStateException("pattern needs to include one and only one group.");
			}

			String match = result.group(1);
			if (match.matches(startCommentary)) {
				commentaryDepth++;
				if (commentaryDepth < 1) {
					ret.append(buffer.subSequence(position + startOffset, position + match.length() + startOffset));
				} else {
					for (int i = 0; i < match.length(); i++) {
						ret.append(" ");
					}
				}
			} else if (match.matches(endCommentary)){
				if (commentaryDepth < 1) {
					ret.append(buffer.subSequence(position + startOffset, position + match.length() + startOffset));
				} else {
					for (int i = 0; i < match.length(); i++) {
						ret.append(" ");
					}
				}
				commentaryDepth--;
			} else {
				throw new IllegalStateException("match matches neither '" + startCommentary + "' nor '" + endCommentary + "'.");
			}

			previous = position + match.length();

		}

		ret.append(buffer.subSequence(previous + startOffset, endOffset));

		// TODO endOffset or endOffset + 1?
		ret.append(buffer.subSequence(endOffset, buffer.length()));
		return ret;
	}
}
