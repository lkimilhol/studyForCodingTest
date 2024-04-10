package com.company.etc.yapretest;

import java.util.Arrays;

public class Test2 {
    public int solution(String s, int[] C) {
        int result = 0;
        char[] charArray = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }

        boolean isIdentical = false;
        int start = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (i == charArray.length - 1) {
                if (isIdentical) {
                    int[] costs = Arrays.stream(C, start, i + 1).sorted().toArray();
                    for (int j = 0; j < costs.length - 1; j++) {
                        result += costs[j];
                    }
                }

                break;
            }

            if (charArray[i] == charArray[i + 1]) {
                if (!isIdentical) {
                    start = i;
                    isIdentical = true;
                }
                continue;
            }

            if (isIdentical) {
                int[] costs = Arrays.stream(C, start, i + 1).sorted().toArray();
                for (int j = 0; j < costs.length - 1; j++) {
                    result += costs[j];
                }
            }

            isIdentical = false;
        }

        return result;
    }
}
