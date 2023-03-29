package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        if (seconds <= 0) {
            return "now";
        }
        int minute = seconds / 60;
        int hour = minute / 60;
        int day = hour / 24;
        int year = day / 365;
        seconds -= minute * 60;
        minute -= hour * 60;
        hour -= day * 24;
        day -= year * 365;
        List<String> result = new ArrayList<>();
        result.add(findString(year, "year"));
        result.add(findString(day, "day"));
        result.add(findString(hour, "hour"));
        result.add(findString(minute, "minute"));
        result.add(findString(seconds, "second"));
        result = result.stream().filter(obj -> obj != "").collect(Collectors.toList());
        switch (result.size()) {
            case 1:
                return result.get(0);
            case 2:
                return result.get(0) + " and " + result.get(1);
            default:
                String r = "";
                for (int i = 0; i < result.size() - 2; i++) {
                    r += result.get(i) + ", ";
                }
                return r + result.get(result.size() - 2) + " and " + result.get(result.size() - 1);
        }
    }

    public static String findString(int a, String nameValue) {
        if ((a != 1) && ((a != 0))) {
            return a + " " + nameValue + "s";
        } else if (a == 1) {
            return a + " " + nameValue;
        }
        return "";
    }
}