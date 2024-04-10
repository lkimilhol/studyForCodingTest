package com.company.etc.yapretest;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public int solution(int[] T, int[] A) {
        List<Integer> result = new ArrayList<>();

        for (int skill : A) {
            if (!result.contains(skill)) {
                result.add(skill);
            }

            int target = T[skill];

            while (true) {
                if (!result.contains(target)) {
                    result.add(target);
                    target = T[target];
                }

                if (target == 0) {
                    if (!result.contains(target)) {
                        result.add(target);
                    }
                    break;
                }

                if (result.contains(target)) {
                    break;
                }
            }
        }

        return result.size();
    }
}
