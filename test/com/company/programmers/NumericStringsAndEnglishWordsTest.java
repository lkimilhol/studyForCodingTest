package com.company.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumericStringsAndEnglishWordsTest {

    @DisplayName("one4seveneight")
    @Test
    void test01() {
        // given
        NumericStringsAndEnglishWords numericStringsAndEnglishWords = new NumericStringsAndEnglishWords();
        // when
        int answer = numericStringsAndEnglishWords.solution("one4seveneight");
        // then
        assertEquals(1478, answer);
    }

}