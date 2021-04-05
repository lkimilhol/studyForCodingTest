package com.company.programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Spicier {
    public int solution(int[] scoville, int K) {
        int sol = 0;
        int index = 0;

        PriorityQueue<Integer> minList = Arrays.stream(scoville)
                .sorted()
                .collect(PriorityQueue::new, PriorityQueue::add, PriorityQueue::addAll);

        while (isProgress(minList, K)) {
            if (minList.size() < 2 && scoville[index] < K) {
                return -1;
            }

            calculate(minList, index);
            index++;
            sol++;
        }
        return sol;
    }

    private void calculate(PriorityQueue<Integer> scoville, int index) {
        int a = scoville.poll();
        int b = scoville.poll();
        scoville.add(a + (b * 2));
    }

    private boolean isProgress(PriorityQueue<Integer> scoville, int K) {
        for (int item : scoville) {
            if (item < K) {
                return true;
            }
        }
        return false;
    }
}
