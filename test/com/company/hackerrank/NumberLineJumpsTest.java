package com.company.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberLineJumpsTest {
    @Test
    void test1() {
        String result = NumberLineJumps.kangaroo(0, 3, 4, 2);
        assertEquals(result, "YES");
    }

    @Test
    void test2() {
        String result = NumberLineJumps.kangaroo(0, 2, 5, 3);
        assertEquals(result, "NO");
    }
}