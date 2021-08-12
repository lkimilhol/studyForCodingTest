package com.company.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supoja {
    public int[] solution(int[] answers) {
        final int[] student1 = {1, 2, 3, 4, 5};
        final int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        final int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int studentAnswer1 = 0;
        int studentAnswer2 = 0;
        int studentAnswer3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) {
                studentAnswer1++;
            }
            if (answers[i] == student2[i % student2.length]) {
                studentAnswer2++;
            }
            if (answers[i] == student3[i % student3.length]) {
                studentAnswer3++;
            }
        }

        if (studentAnswer1 > studentAnswer2 && studentAnswer1 > studentAnswer3) {
            return new int[]{1};
        }
        if (studentAnswer2 > studentAnswer1 && studentAnswer2 > studentAnswer3) {
            return new int[]{2};
        }
        if (studentAnswer3 > studentAnswer1 && studentAnswer3 > studentAnswer2) {
            return new int[]{3};
        }

        if (studentAnswer1 == studentAnswer2 && studentAnswer2 == studentAnswer3) {
            return new int[]{1, 2, 3,};
        }

        if (studentAnswer1 == studentAnswer2) {
            return new int[]{1, 2};
        }

        if (studentAnswer2 == studentAnswer3) {
            return new int[]{2, 3};
        }

        if (studentAnswer1 == studentAnswer3) {
            return new int[]{1, 3};
        }

        return new int[]{};
    }
}
