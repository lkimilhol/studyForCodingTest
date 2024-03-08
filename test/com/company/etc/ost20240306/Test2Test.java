package com.company.etc.ost20240306;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2Test {
    @Test
    void test1() {
        Test2 test2 = new Test2();
        int[] result = test2.solution(new int[]{1, 2, 3, 4, 5, 6}, new int[]{6, 2, 5, 1, 4, 3});

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    void test2() {
        Test2 test2 = new Test2();
        int[] result = test2.solution(new int[]{11, 2, 9, 13, 24}, new int[]{9, 2, 13, 24, 11});

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}