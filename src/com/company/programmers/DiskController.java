package com.company.programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (o1, o2) -> {
            Integer a = o1[0];
            Integer b = o2[0];
            return a.compareTo(b);
        });

        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));

        int answer = 0;
        int index = 0;
        int count = 0;
        int end = 0;

        while (count < jobs.length) {
            while (index < jobs.length && jobs[index][0] <= end) {
                queue.add(jobs[index++]);
            }

            if (queue.isEmpty()) {
                end = jobs[index][0];
                continue;
            }

            int[] temp = queue.poll();
            answer += temp[1] + end - temp[0];
            end += temp[1];
            count++;
        }
        return answer / jobs.length;
    }
}
