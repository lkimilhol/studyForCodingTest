package com.company.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingBookTest {
    @Test
    void test() {
        int result = DrawingBook.pageCount(6, 2);
        assertEquals(1, result);
    }

    @Test
    void test1() {
        int result = DrawingBook.pageCount(5, 4);
        assertEquals(0, result);
    }

    @Test
    void test2() {
        int result = DrawingBook.pageCount(7, 4);
        assertEquals(1, result);
    }

    @Test
    void test3() {
        int result = DrawingBook.pageCount(6, 5);
        assertEquals(1, result);
    }

    @Test
    void test4() {
        int result = DrawingBook.pageCount(19, 18);
        assertEquals(0, result);
    }

    @Test
    void test5() {
        int result = DrawingBook.pageCount(19, 15);
        assertEquals(2, result);
    }

    @Test
    void test6() {
        int result = DrawingBook.pageCount(19, 10);
        assertEquals(4, result);
    }

    @Test
    void test7() {
        int result = DrawingBook.pageCount(2, 1);
        assertEquals(0, result);
    }
}