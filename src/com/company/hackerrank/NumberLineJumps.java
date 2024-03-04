package com.company.hackerrank;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        String answer;
        while (true) {
            if (x1 == x2) {
                answer = "YES";
                break;
            }

            if (x1 > x2) {
                answer = "NO";
                break;
            }

            x1 += v1;
            x2 += v2;


        }
        return answer;
    }
}
