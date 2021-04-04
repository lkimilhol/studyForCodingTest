package com.company.programmers;

import java.util.Arrays;
import java.util.stream.Stream;

public class BiggestNumber {
    public static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[numbers.length];

        int index = 0;
        for (int i : numbers) {
            arr[index++] = Integer.toString(i);
        }

        Arrays.sort(arr, (o1, o2) -> (o2+o1).compareTo(o1+o2));

        if (arr[0].equals("0")) return "0";

        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}
