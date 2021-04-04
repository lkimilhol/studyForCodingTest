package com.company.programmers;

public class Nation124 {
    public static String solution(int n) {
        final int EXECUTOR = 3;
        int remainder;
        StringBuilder answer = new StringBuilder();
        String[] numberArr = new String[]{"4", "1", "2"};

        while (n != 0) {
            remainder = n % EXECUTOR;
            n /= EXECUTOR;

            answer.append(numberArr[remainder]);

            if (remainder == 0) n -= 1;
        }
        return answer.reverse().toString();
    }
}
