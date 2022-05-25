package com.company.programmers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TupleTest {

    @DisplayName("{{2},{2,1},{2,1,3},{2,1,3,4}}")
    @Test
    void test01() {
        // given
        Tuple tuple = new Tuple();

        // when
        int[] answer = tuple.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");

        // then
        assertEquals(2, answer[0]);
        assertEquals(1, answer[1]);
        assertEquals(3, answer[2]);
        assertEquals(4, answer[3]);
    }
}
