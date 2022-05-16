package com.company.Leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberOfIslandsTest {

    @Test
    void test01() {
        // given
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        // when
        int answer = numberOfIslands.numIslands(new char[][]{
                {'1', '1', '1', '1', '0',},
                {'1', '1', '0', '1', '0',},
                {'1', '1', '0', '0', '0',},
                {'0', '0', '0', '0', '0',},
        });
        // then
        assertEquals(1, answer);
    }

    @Test
    void test02() {
        // given
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        // when
        int answer = numberOfIslands.numIslands(new char[][]{
                {'1', '1', '0', '0', '0',},
                {'1', '1', '0', '0', '0',},
                {'0', '0', '1', '0', '0',},
                {'0', '0', '0', '1', '1',},
        });
        // then
        assertEquals(3, answer);
    }

    @Test
    void test03() {
        // given
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        // when
        int answer = numberOfIslands.numIslands(new char[][]{
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'},
        });
        // then
        assertEquals(1, answer);
    }
}