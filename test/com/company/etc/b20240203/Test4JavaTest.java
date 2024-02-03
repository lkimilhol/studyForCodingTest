package com.company.etc.b20240203;

import com.company.etc.b20240203.Test4Java;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Test4JavaTest {
    @Test
    void testSingleMatchPattern() {
        assertTrue(Test4Java.doesMatchPattern("BucketPlace", "BP"));
        assertTrue(Test4Java.doesMatchPattern("BucketPlace", "BuPl"));
        assertFalse(Test4Java.doesMatchPattern("BucketList", "BP"));
        assertTrue(Test4Java.doesMatchPattern("BucketPlaceB", "BPaB"));
    }

    @Test
    void testMultipleMatchPattern() {
        String[] inputs = {"BucketPlace", "BucketList", "BucketPizza"};
        String pattern = "BP";
        List<Boolean> expectedResults = List.of(true, false, true);
        assertEquals(expectedResults, Test4Java.checkPatterns(inputs, pattern));
    }

}