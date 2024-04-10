package com.company.etc.yapretest;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test1Test {
    @Test
    public void test1() {
        Test1 test1 = new Test1();
        int result = test1.solution("NAABXXAN");
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        Test1 test1 = new Test1();
        int result = test1.solution("NAANAAXNABABYNNBZ");
        assertEquals(2, result);
    }
}