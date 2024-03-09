package com.company.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradingStudentsTest {
    @Test
    void test() {
        List<Integer> result = GradingStudents.gradingStudents(Arrays.asList(73, 67, 38, 33));

        assertEquals(result.get(0), 75);
        assertEquals(result.get(1), 67);
        assertEquals(result.get(2), 40);
        assertEquals(result.get(3), 33);
    }
}