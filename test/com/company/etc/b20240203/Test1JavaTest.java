package com.company.etc.b20240203;

import com.company.etc.b20240203.Test1Java;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1JavaTest {
    @Test
    public void solution() {
        int[] numbers = new int[] { 4, 3, 5, 1 };
        Test1Java test = new Test1Java();

        int[] solution = test.solution(numbers, 4);

        assertEquals(solution[0], 1);
        assertEquals(solution[1], 3);
    }
}
