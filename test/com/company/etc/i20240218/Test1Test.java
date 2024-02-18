package com.company.etc.i20240218;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1Test {
    @Test
    public void test() {
        Test1 test1 = new Test1();
        int result = test1.solution(15);

        assertEquals(result, 2);
    }
}
