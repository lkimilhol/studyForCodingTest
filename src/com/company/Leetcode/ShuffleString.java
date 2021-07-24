package com.company.Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] tmp = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            tmp[indices[i]] = s.charAt(i);
        }
        return String.valueOf(tmp);
    }
}
