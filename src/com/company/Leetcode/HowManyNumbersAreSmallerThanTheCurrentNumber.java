package com.company.Leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static int[] solution(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Comparator.reverseOrder());
        int[] sol = new int[nums.length];
        Map<Integer, Integer> tmp = new HashMap<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (!arr[i].equals(arr[i + 1])) {
                tmp.put(arr[i], arr.length - i - 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (!tmp.containsKey(nums[i])) {
                sol[i] = 0;
                continue;
            }
            sol[i] = tmp.get(nums[i]);
        }

        return sol;
    }
}
