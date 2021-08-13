package com.company.codility;

import java.util.HashMap;
import java.util.Map;

public class FirstUnique {
    public int solution(int[] A) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i : A) {
            Integer aDefault = result.getOrDefault(i, 0);
            result.put(i, ++aDefault);
        }

        for (int i : A) {
            if (result.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }
}
