package com.company.etc.ya20240411;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Test2Test {
    @Test
    public void test1() {
        List<Integer> integers = Test2.minTime(List.of(1, 2, 4), List.of(3, 4, 5), List.of(2), List.of(6), 2);
        integers.stream().forEach(solution -> System.out.println(solution));
    }
}