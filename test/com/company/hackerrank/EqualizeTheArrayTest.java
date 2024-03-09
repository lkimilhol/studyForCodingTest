package com.company.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EqualizeTheArrayTest {
    @Test
    void test() {
        int result = EqualizeTheArray.equalizeArray(Arrays.asList(3, 3, 2, 1, 3));
        assertEquals(2, result);
    }
}
