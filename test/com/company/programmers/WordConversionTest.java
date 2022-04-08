package com.company.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WordConversionTest {

    @DisplayName("hit, cog, [hot, dot, dog, lot, log, cog]")
    @Test
    void test01() {
        // given
        WordConversion wordConversion = new WordConversion();

        // when
        int solution = wordConversion.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"});

        // then
        assertEquals(4, solution);
    }
}