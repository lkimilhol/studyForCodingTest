package com.company.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NetworkTest {

    @DisplayName("3, [[1, 1, 0], [1, 1, 0], [0, 0, 1]]")
    @Test
    void test01() {
        // given
        Network network = new Network();

        // when
        int solution = network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});

        // then
        assertEquals(2, solution);
    }

    @DisplayName("1, [[1, 1, 0], [1, 1, 1], [0, 1, 1]]")
    @Test
    void test02() {
        // given
        Network network = new Network();

        // when
        int solution = network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}});

        // then
        assertEquals(1, solution);
    }
}