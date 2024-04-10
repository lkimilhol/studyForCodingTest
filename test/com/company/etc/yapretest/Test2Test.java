package com.company.etc.yapretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2Test {
    @Test
    public void test1() {
        Test2 test2 = new Test2();
        int result = test2.solution("abccbd", new int[]{0, 1, 2, 3, 4, 5});
        assertEquals(2, result);
    }

    @Test
    public void test2() {
        Test2 test2 = new Test2();
        int result = test2.solution("aabbcc", new int[]{1, 2, 1, 2, 1, 2});
        assertEquals(3, result);
    }

    @Test
    public void test3() {
        Test2 test2 = new Test2();
        int result = test2.solution("aaaa", new int[]{3, 4, 5, 6});
        assertEquals(12, result);
    }

    @Test
    public void test4() {
        Test2 test2 = new Test2();
        int result = test2.solution("ababa", new int[]{10, 5, 10, 5, 10});
        assertEquals(0, result);
    }
}