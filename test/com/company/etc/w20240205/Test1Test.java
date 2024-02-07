package com.company.etc.w20240205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1Test {
    @Test
    public void test1() {
        Test1 test1 = new Test1();
        int result = test1.solution(1000, "HTHTHTH", "TTHHTTH");
        assertEquals(result, 1400);
    }

    @Test
    public void test2() {
        Test1 test1 = new Test1();
        int result = test1.solution(1200, "TTHHH", "HHTHT");
        assertEquals(result, 900);
    }

    @Test
    public void test3() {
        Test1 test1 = new Test1();
        int result = test1.solution(1500, "HHHTH", "TTTHT");
        assertEquals(result, 0);
    }

    @Test
    public void test4() {
        Test1 test1 = new Test1();
        int result = test1.solution(1500, "HHHHH", "HHHHH");
        assertEquals(result, 2000);
    }
}