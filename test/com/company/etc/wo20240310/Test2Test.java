package com.company.etc.wo20240310;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test2Test {
    @Test
    void test() {
        Test2 test2 = new Test2();
        String solution = test2.solution(new String[]{"a", "b", "c"}, new String[]{"b", "c", "d"});
        assertEquals(solution, "b,c");
    }

    @Test
    void test2() {
        Test2 test2 = new Test2();
        String solution = test2.solution(new String[]{"a", "b", "b"}, new String[]{"b", "c", "d"});
        assertEquals(solution, "b");
    }

    @Test
    void test3() {
        Test2 test2 = new Test2();
        String solution = test2.solution(new String[]{"a"}, new String[]{"b", "c", "d"});
        assertEquals(solution, "");
    }
}