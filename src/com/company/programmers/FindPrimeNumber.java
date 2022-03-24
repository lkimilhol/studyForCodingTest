package com.company.programmers;

import java.util.*;

public class FindPrimeNumber {
    private static final Set<Integer> PRIME = new HashSet<>();

    public static int solution(String numbers) {
        String[] numberArr = numbers.split("");

        for (int r = 1; r <= numberArr.length; r++) {
            permutation(numberArr, 0, numberArr.length, r);
        }

        return PRIME.size();
    }

    private static void permutation(String[] arr, int depth, int n, int r) {
        if (depth == r) {
            int number = parseInt(arr, r);

            if (isPrime(number)) {
                PRIME.add(number);
            }
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    private static int parseInt(String[] arr, int r) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < r; i++) {
            s.append(arr[i]);
        }

        return Integer.parseInt(s.toString());
    }

    private static void swap(String[] numberArr, int depth, int i) {
        String temp = numberArr[depth];
        numberArr[depth] = numberArr[i];
        numberArr[i] = temp;
    }

    private static boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
