package com.company.etc.b20240203;

import java.util.Arrays;

public class Test1Java {
    public int[] solution(int[] numbers, int goal) {
        int[] answer = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }

                if (numbers[i] + numbers[j] == goal) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        return Arrays.stream(answer).sorted().toArray();
    }
}
