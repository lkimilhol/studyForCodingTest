package com.company.Leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void test01() {
        // given

        test01 test01 = new test01();
        test01.a = 1;
        test01 test02 = new test01();
        test02.a = 1;

        System.out.println(test01.equals(test02));

        Set<test01> test01Set = new HashSet<>();
        test01Set.add(test01);
        test01Set.add(test02);
        System.out.println(test01Set.size());

        Map<test01, Integer> map = new HashMap<>();
        map.put(test01, 1);
        map.put(test02, 1);

        System.out.println(map.size());
    }

    static class test01 {
        int a;
        int b;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            test01 test01 = (test01) o;
            return a == test01.a && b == test01.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }
}