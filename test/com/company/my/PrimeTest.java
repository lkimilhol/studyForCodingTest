package com.company.my;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PrimeTest {

    @Test
    void test() {
        // given
        // when
        // then
        assertTrue(isPrimeNumber(101));
    }

    private boolean isPrimeNumber(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
