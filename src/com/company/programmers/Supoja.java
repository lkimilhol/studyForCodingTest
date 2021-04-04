package com.company.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supoja {
    public static int[] solution(int[] answers) {
        final int[] student1 = {1, 2, 3, 4, 5};
        final int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        final int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int student1Length = student1.length;
        int student2Length = student2.length;
        int student3Length = student3.length;

        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1Length]) {
                answer1++;
            }

            if (answers[i] == student2[i % student2Length]) {
                answer2++;
            }

            if (answers[i] == student3[i % student3Length]) {
                answer3++;
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, answer1);
        map.put(2, answer2);
        map.put(3, answer3);

        List<Integer> keySet = new ArrayList<>(map.keySet());

        keySet.sort((o1, o2) -> map.get(o2) - map.get(o1));

        List<Integer> answer = new ArrayList<>();
        for (Integer i : keySet) {
            if (map.get(i) > 0) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }

}
