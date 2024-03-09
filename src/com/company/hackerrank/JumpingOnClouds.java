package com.company.hackerrank;

import java.util.List;

public class JumpingOnClouds {
    public static int jumpingOnClouds(List<Integer> c) {
        int index = 0;
        int result = 0;

        while (index <= c.size() - 2) {
            if (index == c.size() - 2) {
                if (c.get(index + 1) == 0) {
                    return ++result;
                }
            }

            if (c.get(index + 2) == 1) {
                result++;
                index += 1;
                continue;
            }

            result++;
            index += 2;
        }

        return result;
    }
}
