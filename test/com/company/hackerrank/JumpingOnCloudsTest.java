package com.company.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnCloudsTest {
    @Test
    void test() {
        int result = JumpingOnClouds.jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0));
        assertEquals(4, result);
    }

    @Test
    void test1() {
        int result = JumpingOnClouds.jumpingOnClouds(Arrays.asList(0, 0, 0, 0, 1, 0));
        assertEquals(3, result);
    }

    @Test
    void test2() {
        int result = JumpingOnClouds.jumpingOnClouds(Arrays.asList(0, 0, 0, 1, 0, 0));
        assertEquals(3, result);
    }
}