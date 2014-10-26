package org.modula.parsing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Jan
 * Date: 20.05.13
 * Time: 19:13
 * To change this template use File | Settings | File Templates.
 */
public class CommentaryDenesterTest {

    private final String openComment;
    private final String closeComment;
    private final String code;
    private final String result;
    private final CommentaryDenester candidate;


    @Factory(dataProvider = "parameters")
    public CommentaryDenesterTest(String openComment, String closeComment, String code, String result) {
        this.openComment = openComment;
        this.closeComment = closeComment;
        this.code = code;
        this.result = result;
        candidate = new CommentaryDenester(openComment, closeComment);
    }


    @DataProvider
    public static Object[][] parameters() {
        return new Object[][]{
                new Object[]{"\\(\\*", "\\*\\)", "abcdefgh", "abcdefgh"},
                new Object[]{"\\(\\*", "\\*\\)", "(**)", "(**)"},
                new Object[]{"\\(\\*", "\\*\\)", "(*(**)*)", "(*    *)"},
                new Object[]{"\\(\\*", "\\*\\)",
                        "dlkhdlljk (* flkhng (* huhuh (* hohohohoh *) hihihihi *) hgjh*) rfshglfdhljk",
                        "dlkhdlljk (* flkhng    huhuh    hohohohoh    hihihihi    hgjh*) rfshglfdhljk"},
                new Object[]{"\\(\\*", "\\*\\)",
                        "dlkhdlljk (* flkhng (* huhuh (* hohohohoh *) hih(*ihihi*) *) hgjh*) rfshglfdhljk",
                        "dlkhdlljk (* flkhng    huhuh    hohohohoh    hih  ihihi      hgjh*) rfshglfdhljk"},
                new Object[]{"\\(\\*", "\\*\\)",
                        "dlkhdlljk (* flkhng (* hu(*huh *) iai(*aia (* hohoho*)hoh *) hihihihi *) hgjh*) rfshglfdhljk",
                        "dlkhdlljk (* flkhng    hu  huh    iai  aia    hohoho  hoh    hihihihi    hgjh*) rfshglfdhljk"},
                new Object[]{"/\\*", "\\*/", "/**/", "/**/"},
                new Object[]{"/\\*", "\\*/", "/*/**/*/", "/*    */"}};
    }

    @Test
    public void testResult() {
        Assert.assertEquals(candidate.preProcess(code, 0, code.length()).toString(), result);
    }

}
