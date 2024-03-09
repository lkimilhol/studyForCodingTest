package com.company.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade < 38) {
                result.add(grade);
                continue;
            }

            int roundNumber = 5 - (grade % 5);
            if (roundNumber < 3) {
                result.add(grade + roundNumber);
            } else {
                result.add(grade);
            }
        }
        return result;
    }
}
