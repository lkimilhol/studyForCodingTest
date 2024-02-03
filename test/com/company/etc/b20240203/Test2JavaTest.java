package com.company.etc.b20240203;

import com.company.etc.b20240203.Test2Java;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test2JavaTest {

    @Test
    void testest() {
        Test2Java test2Java = new Test2Java();
        String result = test2Java.solution("bucketplace");

        assertEquals(result, "beckatplecu");
    }

}
