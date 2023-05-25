import org.example.BalancedParens;
import org.junit.Test;
import org.junit.runners.JUnit4;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class BalancedParensTest {
    private void assertBalancedParens(int n, List<String> expectedOutput) {
        List<String> actualOutput = BalancedParens.balancedParens(n);
        Collections.sort(actualOutput);
        Collections.sort(expectedOutput);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testBalancedParensWithZero() {
        assertBalancedParens(0, Arrays.asList(""));
    }

    @Test
    public void testBalancedParensWithOne() {
        assertBalancedParens(1, Arrays.asList("()"));
    }

    @Test
    public void testBalancedParensWithTwo() {
        assertBalancedParens(2, Arrays.asList("(())", "()()"));
    }

    @Test
    public void testBalancedParensWithThree() {
        assertBalancedParens(3, Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"));
    }

    @Test
    public void testBalancedParensWithFour() {
        assertBalancedParens(4, Arrays.asList("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"));
    }
}
