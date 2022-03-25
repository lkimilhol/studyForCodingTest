package com.company.programmers;

import java.util.Arrays;

public class Lifeboat {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int withIndex = 0;
        int answer = 0;

        for (int i = people.length - 1; i >= 0; i--) {
            if (people[i] == 0) {
                continue;
            }

            if (people[i] + people[withIndex] <= limit) {
                people[withIndex] = 0;
                withIndex++;
            }
            answer++;
        }

        return answer;
    }
}
