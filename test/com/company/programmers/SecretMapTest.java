package com.company.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SecretMapTest {

    @DisplayName(
            "n = 5\n" +
            "arr1 = [9, 20, 28, 18, 11]\n" +
            "arr2 = [30, 1, 21, 17, 28]")
    @Test
    void test01() {
        // given
        SecretMap secretMap = new SecretMap();

        // when
        String[] result = secretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});

        // then
        assertEquals("#####", result[0]);
        assertEquals("# # #", result[1]);
        assertEquals("### #", result[2]);
        assertEquals("#  ##", result[3]);
        assertEquals("#####", result[4]);
    }
}