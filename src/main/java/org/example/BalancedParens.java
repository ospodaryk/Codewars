package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BalancedParens {
    public static List<String> balancedParens(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    public static void backtrack(List<String> result, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            result.add(str);
            return;
        }

        if (open < max)
            backtrack(result, str + "(", open + 1, close, max);
        if (close < open)
            backtrack(result, str + ")", open, close + 1, max);
    }
}