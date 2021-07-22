package com.company.Leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        List<Integer> result = new LinkedList<>();

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9 && i == 0) {
                result.add(1);
            }

            if (digits[i] == 9) {
                digits[i] = 0;
                continue;
            }

            digits[i] = digits[i] + 1;
            break;
        }

        result.addAll(Arrays.stream(digits).boxed().collect(Collectors.toList()));
        return result.stream().mapToInt(i -> i).toArray();
    }
}
