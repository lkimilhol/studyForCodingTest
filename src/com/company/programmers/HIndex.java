package com.company.programmers;

import java.util.Arrays;

public class HIndex {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;

        int length = citations.length;

        for (int i = 1; i <= citations.length; i++) {
            if (citations[i - 1] == 0) {
                continue;
            }

            boolean check = true;
            int prev = length - i;
            int next = length - prev;

            for (int j = 0; j < prev; j++) {
                if (citations[j] > i) {
                    check = false;
                    break;
                }
            }

            if (!check) {
                continue;
            }

            for (int j = next; j < length; j++) {
                if (citations[j] < i) {
                    check = false;
                    break;
                }
            }

            if (!check) {
                continue;
            }

            return i;
        }
        return answer;
    }
}


