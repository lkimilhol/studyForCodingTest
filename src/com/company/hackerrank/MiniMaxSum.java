package com.company.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        List<Integer> minimal = new ArrayList<>(arr);
        List<Integer> maximum = new ArrayList<>(arr);

        Collections.sort(minimal);
        maximum.sort(Collections.reverseOrder());

        long minimalSum = minimal.stream().limit(4).mapToLong(i -> i).sum();
        long maximumSum = maximum.stream().limit(4).mapToLong(i -> i).sum();
        System.out.println(minimalSum + " " + maximumSum);
    }
}
