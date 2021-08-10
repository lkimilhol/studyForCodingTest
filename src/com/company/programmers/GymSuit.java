package com.company.programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);

        Set<Integer> set = new HashSet<>();

        for (int i : reserve) {
            set.add(i);
        }

        int answer = lost.length;

        for (int i = 0; i < lost.length; i++) {
            if (set.contains(lost[i])) {
                set.remove(lost[i]);
                lost[i] = 0;
                answer--;
            }
        }

        for (int r : set) {
            for (int i = 0; i < lost.length; i++) {
                if (lost[i] == 0) {
                    continue;
                }
                if (r - 1 == lost[i] || r + 1 == lost[i]) {
                    lost[i] = 0;
                    answer--;
                    break;
                }
            }
            if (answer == 0) {
                break;
            }
        }

        return n - answer;
    }
}
