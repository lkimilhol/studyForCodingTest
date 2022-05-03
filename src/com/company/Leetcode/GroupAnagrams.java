package com.company.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    private static final String DONE = "DONE";

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answers = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(DONE)) {
                continue;
            }

            List<String> answer = new ArrayList<>();
            answer.add(strs[i]);

            for (int j = i; j < strs.length ; j++) {
                if (i == j || strs[j].equals(DONE)) {
                    continue;
                }

                if (isSame(strs[i], strs[j])) {
                    answer.add(strs[j]);
                    strs[j] = DONE;
                }
            }

            answers.add(answer);
        }

        return answers;
    }

    private boolean isSame(String origin, String target) {
        if (origin.length() != target.length()) {
            return false;
        }

        char[] baseValue = origin.toCharArray();
        Arrays.sort(baseValue);

        char[] compareToValue = target.toCharArray();
        Arrays.sort(compareToValue);

        for (int i = 0; i < baseValue.length; i++) {
            if (baseValue[i] != compareToValue[i]) {
                return false;
            }
        }
        return true;
    }
}
