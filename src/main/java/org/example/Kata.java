package org.example;

public class Kata {
    public static boolean solution(String str, String ending) {
        if (ending.isEmpty()) {
            return true;
        }
        int endIndex = str.lastIndexOf(ending);
        return endIndex != -1 && endIndex == str.length() - ending.length();
    }
}
