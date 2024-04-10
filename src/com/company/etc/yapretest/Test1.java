package com.company.etc.yapretest;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public int solution(String s) {
        int result = 0;
        boolean isContinue = true;

        List<String> banana = Arrays.asList("B", "A", "N", "A", "N", "A");

        while (true) {
            for (String input : banana) {
                if (!s.contains(input)) {
                    isContinue = false;
                    break;
                }

                int idx = s.indexOf(input);

                StringBuilder sb = new StringBuilder(s);
                sb.deleteCharAt(idx);
                s = sb.toString();

            }

            if (!isContinue) {
                break;
            }

            result++;
        }

        return result;
    }
}
