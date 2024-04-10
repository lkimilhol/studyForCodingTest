package com.company.etc.yapretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3Test {
    @Test
    public void test1() {
        Test3 test3 = new Test3();
        int result = test3.solution(new int[]{0, 0, 1, 1}, new int[]{2});
        assertEquals(3, result);
    }

    @Test
    public void test2() {
        Test3 test3 = new Test3();
        int result = test3.solution(new int[]{0, 0, 0, 0, 2, 3, 3}, new int[]{2, 5, 6});
        assertEquals(5, result);
    }

    @Test
    public void test3() {
        Test3 test3 = new Test3();
        int result = test3.solution(new int[]{0, 0, 1, 2}, new int[]{1, 2});
        assertEquals(3, result);
    }

    @Test
    public void test4() {
        Test3 test3 = new Test3();
        int result = test3.solution(new int[]{0, 3, 0, 0, 5, 0, 5}, new int[]{4, 2, 6, 1, 0});
        assertEquals(7, result);
    }
}