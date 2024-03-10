package com.company.etc.wo20240310;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3Test {
    @Test
    void test() {
        Test3 test3 = new Test3();
        String[] result = test3.solution(
                new String[]{"123456789,유기농쌀 4KG,50000", "234578882,배달이캐릭터숟가락,3000"},
                new String[]{"20220810,123456789,5", "20220810,234578882,30", "20220811,123456789,7"}
        );

        for (String s : result) {
            System.out.println(s);
        }
    }

}