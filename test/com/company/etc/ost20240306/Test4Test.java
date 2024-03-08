package com.company.etc.ost20240306;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test4Test {
    @Test
    void test() {
        Test4 test4 = new Test4();
        int[] result = test4.solution(2, new int[]{0, 0, 0, 1, 0, 0, 0});

        for (int i : result) {
            System.out.println(i);
        }
    }

    @Test
    void test2() {
        Test4 test4 = new Test4();
        int[] result = test4.solution(3, new int[]{0,0,0,0,0,0,0,0,0,3,3,1,1,2,0,0,0});

        for (int i : result) {
            System.out.println(i);
        }
    }
}