package org.modula.parsing;

import com.intellij.lang.ParserDefinition;
import com.intellij.testFramework.ParsingTestCase;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 04.10.13
 * Time: 21:42
 * To change this template use File | Settings | File Templates.
 */
public class DefitionParsingTest extends ParsingTestCase {

	public DefitionParsingTest() {
		super("", "def", new DefinitionParserDefinition(), new CompileTimeParserDefinition());
	}

	@Override
	protected String getTestDataPath() {
		return "G:/projects/idea-modula-support/testData/DEF";
	}

	public void testhuha() {
		doTest(true);
	}

	public void testBasicDialogs() {
		doTest(true);
	}

	public void testConfigSettings() {
		doTest(true);
	}

	public void testDlgShell() {
		doTest(true);
	}

	public void testFileMap() {
		doTest(true);
	}

	public void testFormEditUI() {
		doTest(true);
	}

	public void testMemShare() {
		doTest(true);
	}

	public void testMoney() {
		doTest(true);
	}

	public void testPipedExec() {
		doTest(true);
	}

	public void testPipes() {
		doTest(true);
	}

	public void testSMTP() {
		doTest(true);
	}

	public void testSocket() {
		doTest(true);
	}

	public void testTextWindows() {
		doTest(true);
	}

	public void testThreads() {
		doTest(true);
	}

	public void testTimers() {
		doTest(true);
	}

	public void testWinShell() {
		doTest(true);
	}


	@Override
	protected boolean skipSpaces() {
		return false;
	}

	@Override
	protected boolean includeRanges() {
		return true;
	}


}
