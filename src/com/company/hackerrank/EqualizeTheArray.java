package com.company.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class EqualizeTheArray {
    public static int equalizeArray(List<Integer> arr) {
        int result = 0;
        List<Integer> checkedList = new ArrayList<>();

        for (Integer i : arr) {
            if (checkedList.contains(i)) {
                continue;
            }

            long count = arr.stream().filter(n -> i == n).count();

            checkedList.add(i);

            if (result < count) {
                result = (int) count;
            }
        }

        return arr.size() - result;
    }
}
