package com.company.programmers;

import java.util.Arrays;

public class Lifeboat {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0;
        int cnt = 0;

        for (int i = people.length - 1; i >= 0; i--) {
            if (people[i] == 0) {
                continue;
            }

            if (people[i] + people[start] <= limit) {
                people[start] = 0;
                start++;
            }
            cnt++;
        }

        return cnt;
    }
}
