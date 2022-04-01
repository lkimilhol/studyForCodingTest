package com.company.programmers;

import java.util.Arrays;

public class DiscController {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (o1, o2) -> {
            Integer a = o1[0] + o1[1];
            Integer b = o2[0] + o2[1];
            return a.compareTo(b);
        });

        int total = 0;
        int time = 0;

        for (int[] job : jobs) {
            if (job[0] <= time) {
                time += job[1];
                total += time - job[0];
                continue;
            }

            time += job[0] - time;
            time += job[1];
            total += time - job[0];
        }

        return total / jobs.length;
    }
}
