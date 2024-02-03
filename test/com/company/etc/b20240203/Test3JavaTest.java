package com.company.etc.b20240203;

import com.company.etc.b20240203.Test3Java;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3JavaTest {
    @Test
    public void test() {
        Test3Java test3Java = new Test3Java();
        int i = test3Java.magicPair(new int[] { 42, 97, 13, 24, 1, 76 });
        assertEquals(i, 2);
    }
    @Test
    public void test2() {
        Test3Java test3Java = new Test3Java();
        int i = test3Java.magicPair(new int[] { 42, 11, 1, 97 });
        assertEquals(i, 2);
    }

    @Test
    public void test3() {
        Test3Java test3Java = new Test3Java();
        int i = test3Java.magicPair(new int[] { 13, 10, 35, 24, 76 });
        assertEquals(i, 4);
    }
}