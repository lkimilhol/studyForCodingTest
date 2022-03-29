package com.company.programmers;

import java.util.Arrays;

public class CrackdownCamera {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (o1, o2) -> {
            Integer a = o1[1];
            Integer b = o2[1];
            return a.compareTo(b);
        });

        int answer = 1;
        int value = routes[0][1];

        for (int i = 1; i < routes.length; i++) {
            int[] route = routes[i];

            if (route[0] <= value && value <= route[1]) {
                continue;
            }

            value = route[1];
            answer++;
        }

        return answer;
    }
}
