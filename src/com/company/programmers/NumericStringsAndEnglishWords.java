package com.company.programmers;

import java.util.regex.Pattern;

public class NumericStringsAndEnglishWords {
    private static final String NUMERIC_PATTERN = "^[0-9]*$";

    public int solution(String s) {
        String[] inputs = s.split("");

        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (String input : inputs) {
            if (Pattern.matches(NUMERIC_PATTERN, input)) {
                result.append(input);
                continue;
            }

            temp.append(input);
            String parseNumber = parseNumber(temp.toString());

            if (!parseNumber.equals("")) {
                result.append(parseNumber);
                temp.delete(0, temp.length());
            }
        }

        return Integer.parseInt(result.toString());
    }

    private String parseNumber(String temp) {
        return switch (temp) {
            case "zero" -> "0";
            case "one" -> "1";
            case "two" -> "2";
            case "three" -> "3";
            case "four" -> "4";
            case "five" -> "5";
            case "six" -> "6";
            case "seven" -> "7";
            case "eight" -> "8";
            case "nine" -> "9";
            default -> "";
        };
    }
}
