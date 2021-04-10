package com.company.programmers;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {
    public int solution(String[][] clothes) {
        Map<String, Integer> items = new HashMap<>();
        for (String s[] : clothes) {
            items.put(s[1], items.getOrDefault(s[1], 0) + 1);
        }

        int answer = 1;

        for (int i : items.values()) {
            answer *= (i + 1);
        }

        return answer - 1;
    }
}
