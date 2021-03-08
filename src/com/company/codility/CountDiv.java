package com.company.codility;

/*
https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 */
public class CountDiv {
    public static int solution(int A, int B, int K) {
        int first = A / K ;
        int second = B / K;
        int third = A % K == 0 ? 1 : 0;

        return second - first + third;
    }
}
