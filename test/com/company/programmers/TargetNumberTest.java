package com.company.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TargetNumberTest {

    @DisplayName("[1, 1, 1, 1, 1], 3")
    @Test
    void test01() {
        // given
        TargetNumber targetNumber = new TargetNumber();

        // when
        int solution = targetNumber.solution(new int[]{1, 1, 1, 1, 1}, 3);

        // then
        assertEquals(5, solution);
    }

    @DisplayName("[4, 1, 2, 1], 4")
    @Test
    void test02() {
        // given
        TargetNumber targetNumber = new TargetNumber();

        // when
        int solution = targetNumber.solution(new int[]{4, 1, 2, 1}, 4);

        // then
        assertEquals(2, solution);
    }
}