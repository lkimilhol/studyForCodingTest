package com.company.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FactorialTest {
    @DisplayName("팩토리얼 재귀 테스트")
    @Test
    void factorial() {
        // given
        // when

        // then
        assertEquals(120, Factorial.solution(5));
    }
}