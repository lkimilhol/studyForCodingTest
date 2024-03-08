package com.company.etc.ost20240306;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Test1Test {
    @Test
    void test1() {
        Test1 test = new Test1();
        int result = test.solution(new String[] {"AAFAFA", "FEECAA", "FABBCB", "CBEDEE", "CCCCCC"});
        assertEquals(3, result);
    }

    @Test
    void test2() {
        Test1 test = new Test1();
        int result = test.solution(new String[] {"BCD", "ABB", "FEE"});
        assertEquals(2, result);
    }
}