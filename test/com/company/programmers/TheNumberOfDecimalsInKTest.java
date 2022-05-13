package com.company.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TheNumberOfDecimalsInKTest {

    @DisplayName("437674, 3")
    @Test
    void test01() {
        // given
        TheNumberOfDecimalsInK test = new TheNumberOfDecimalsInK();

        // when
        int answer = test.solution(437674, 3);

        // then
        assertEquals(3, answer);
    }

    @DisplayName("110011, 10")
    @Test
    void test02() {
        // given
        TheNumberOfDecimalsInK test = new TheNumberOfDecimalsInK();

        // when
        int answer = test.solution(110011, 10);

        // then
        assertEquals(2, answer);
    }

    @DisplayName("110011, 10")
    @Test
    void test03() {
        // given
        TheNumberOfDecimalsInK test = new TheNumberOfDecimalsInK();

        // when
        int answer = test.solution(12930120, 7);

        // then
        assertEquals(0, answer);
    }
}