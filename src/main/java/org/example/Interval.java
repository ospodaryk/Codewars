package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Interval {

    public static int sumIntervals(int[][] intervals) {
        List<List<Integer>> array = new ArrayList<>();
        getArray(intervals, array);

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i - 1).get(1) > array.get(i).get(0)) {
                if (array.get(i - 1).get(1) < array.get(i).get(1)) {
                    array.get(i - 1).set(1, array.get(i).get(1));
                }
                array.get(i).remove(1);
                array.get(i).remove(0);
                array.remove(i);
                i--;
            }
        }
        array.forEach(System.out::println);
        if (array.size() == 1) {
            return array.get(0).get(1) - array.get(0).get(0);
        }
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i).get(1) - array.get(i).get(0);
        }

        return sum;
    }


    private static void getArray(int[][] intervals, List<List<Integer>> array) {
        for (int i = 0; i < intervals.length; i++) {
            array.add(new ArrayList<>());
            array.get(i).add(intervals[i][0]);
            array.get(i).add(intervals[i][1]);
        }
        sort(array);
    }

    private static void sort(List<List<Integer>> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - 1 - i; j++) {
                if (array.get(j).get(0) > array.get(j + 1).get(0)) {
                    ArrayList<Integer> tnp = (ArrayList<Integer>) array.get(j + 1);
                    array.set(j + 1, array.get(j));
                    array.set(j, tnp);
                }
            }
        }
    }
}
