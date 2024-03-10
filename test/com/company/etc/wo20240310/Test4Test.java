package com.company.etc.wo20240310;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test4Test {
    @Test
    void test() {
        Test4 test4 = new Test4();
        String result = test4.solution("/payment/1234/cancel");
        assertEquals("/payment/cancel?paymentId=1234", result);
    }

    @Test
    void test2() {
        Test4 test4 = new Test4();
        String result = test4.solution("/payment/1234");
        assertEquals("error", result);
    }

    @Test
    void test3() {
        Test4 test4 = new Test4();
        String result = test4.solution("/payment/a1234/cancel");
        assertEquals("error", result);
    }

    @Test
    void test4() {
        Test4 test4 = new Test4();
        String result = test4.solution("/payment/1234567890/cancel");
        assertEquals("error", result);
    }


    @Test
    void test5() {
        Test4 test4 = new Test4();
        String result = test4.solution("/payment/1234/5678");
        assertEquals("error", result);
    }
}