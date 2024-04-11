package com.company.etc.ya20240411;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Test1Test {
    @Test
    public void test1() {
        List<Integer> frequency = Test1.frequency("1(2)23(3)");
    }

    @Test
    public void test2() {
        List<Integer> frequency = Test1.frequency("2110#(2)");
    }

    @Test
    public void test3() {
        List<Integer> frequency = Test1.frequency("23#(2)24#25#26#23#(3)");
    }

    @Test
    public void test4() {
        List<Integer> frequency = Test1.frequency("23#(100)");
    }
}