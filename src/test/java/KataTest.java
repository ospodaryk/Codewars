import org.junit.Test;
import org.example.Kata;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class KataTest {
    @Test
    public void test1() {
        check("samurai", "ai", true);
    }

    @Test
    public void test2() {
        check("sumo", "omo", false);
    }

    @Test
    public void test3() {
        check("ninja", "ja", true);
    }

    @Test
    public void test4() {
        check("sensei", "i", true);
    }

    @Test
    public void test5() {
        check("samurai", "ra", false);
    }

    @Test
    public void test6() {
        check("abc", "abcd", false);
    }

    @Test
    public void test7() {
        check("abc", "abc", true);
    }

    @Test
    public void test8() {
        check("abcabc", "bc", true);
    }

    @Test
    public void test9() {
        check("ails", "fails", false);
    }

    @Test
    public void test10() {
        check("fails", "ails", true);
    }

    @Test
    public void test11() {
        check("this", "fails", false);
    }

    @Test
    public void test12() {
        check("this", "", true);
    }

    @Test
    public void test13() {
        check(":-)", ":-(", false);
    }

    @Test
    public void test14() {
        check("!@#$%^&*() :-)", ":-)", true);
    }

    @Test
    public void test15() {
        check("abc\n", "abc", false);
    }

    private static void check(String str, String ending, boolean expected) {
        boolean result = Kata.solution(str, ending);
        assertEquals("Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected, expected, result);
    }
}
