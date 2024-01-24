package com.company.Leetcode

import org.junit.Assert
import org.junit.Test

class RomanTest {
    @Test
    fun `테스트1`() {
        val roman = Roman()
        val sol = roman.romanToInt("I")

        Assert.assertEquals(sol, 1)
    }

    @Test
    fun `테스트2`() {
        val roman = Roman()
        val sol = roman.romanToInt("III")

        Assert.assertEquals(sol, 3)
    }

    @Test
    fun `테스트3`() {
        val roman = Roman()
        val sol = roman.romanToInt("LVIII")

        Assert.assertEquals(sol, 58)
    }

    @Test
    fun `테스트4`() {
        val roman = Roman()
        val sol = roman.romanToInt("MCMXCIV")

        Assert.assertEquals(sol, 1994)
    }
}