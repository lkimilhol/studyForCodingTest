package com.company.Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        Map<Integer, String> strings = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            strings.put(indices[i], Character.toString(s.charAt(i)));
        }
        Object[] mapkey = strings.keySet().toArray();
        Arrays.sort(mapkey);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.size(); i++) {
            sb.append(strings.get(i));
        }
        return sb.toString();
    }
}
