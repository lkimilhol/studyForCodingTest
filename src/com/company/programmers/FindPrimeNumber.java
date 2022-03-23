package com.company.programmers;

import java.util.*;

public class FindPrimeNumber {
    private static final Set<Integer> PRIME = new HashSet<>();

    public static int solution(String numbers) {

        boolean[] visited = new boolean[numbers.length()];

        for (int r = 1; r <= numbers.length(); r++) {
            combination(numbers, visited, 0, r);
        }

        return PRIME.size();
    }

    private static void combination(String numbers, boolean[] visited, int start, int r) {
        if (r == 0) {
            int number = parseInt(numbers, visited);
            if (isPrime(number)) {
                PRIME.add(number);
            }
        }

        for (int i = start; i < numbers.length(); i++) {
            visited[i] = true;
            combination(numbers, visited, i + 1, r - 1);
            visited[i] = false;
        }
    }

    private static boolean isPrime(int number) {
        if (number == 0) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int parseInt(String numbers, boolean[] visited) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numbers.length(); i++) {
            if (visited[i]) {
                result.append(numbers.charAt(i));
            }
        }

        return Integer.parseInt(result.toString());
    }
}
