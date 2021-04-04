package com.company.programmers;

import java.util.ArrayList;
import java.util.List;

public class FunctionDevelopment {
    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int index= 0;
        int length = progresses.length;
        int cnt = 0;

        while (index < length) {
            if (progresses[index] >= 100) {
                for (int j = index; j < length; j++) {
                    if (progresses[j] >= 100) {
                        cnt++;
                        index = j + 1;
                    } else {
                        break;
                    }
                }

                answer.add(cnt);
                cnt = 0;
            }

            for (int i = index; i < length; i++) {
                progresses[i] += speeds[i];
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
