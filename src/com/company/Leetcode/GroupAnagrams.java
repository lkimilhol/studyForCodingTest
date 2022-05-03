package com.company.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    private HashMap<String, List<String>> hashMap = new HashMap<>();

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answers = new ArrayList<>();

        for (String str : strs) {
            sorting(str);
        }

        for (Map.Entry<String, List<String>> entry : hashMap.entrySet()) {
            answers.add(entry.getValue());
        }

        return answers;
    }

    private void sorting(String target) {
        char[] compareToValue = target.toCharArray();
        Arrays.sort(compareToValue);
        String sortedTarget = new String(compareToValue);

        if (hashMap.containsKey(sortedTarget)) {
            List<String> strings = hashMap.get(sortedTarget);
            strings.add(target);
            return;
        }

        hashMap.put(sortedTarget, new ArrayList<>(List.of(target)));
    }
}
