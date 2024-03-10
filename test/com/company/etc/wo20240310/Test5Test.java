package com.company.etc.wo20240310;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test5Test {
    @Test
    void test() {
        Test5 test5 = new Test5();
        int[] result = test5.solution(new int[]{1, 3, 2, 5, 3, 1});
        assertEquals(2, result[0]);
        assertEquals(5, result[1]);
    }

    @Test
    void test2() {
        Test5 test5 = new Test5();
        int[] result = test5.solution(new int[]{1,2,3,4,4,3,2,5});
        assertEquals(1, result[0]);
        assertEquals(5, result[1]);
    }

}