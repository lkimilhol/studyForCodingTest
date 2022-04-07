package com.company.practice;

public class Factorial {
    public static int solution(int n) {
        return factorial(n);
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
