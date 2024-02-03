package com.company.etc.b20240203;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4Java {
    public static List<Boolean> checkPatterns(String[] inputs, String pattern) {
        List<Boolean> list = new ArrayList<>();
        for (String input : inputs) {
            Boolean doesMatchPattern = doesMatchPattern(input, pattern);
            list.add(doesMatchPattern);
        }
        return list;
    }

    public static boolean doesMatchPattern(String s, String pattern) {
        StringBuilder matchingChars = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (pattern.contains(String.valueOf(ch))) {
                matchingChars.append(ch);
            }
        }

        return matchingChars.toString().equals(pattern);
    }
}
