package com.company.Leetcode

import org.junit.Assert
import org.junit.Test

class LongestCommonPrefixTest {
    @Test
    fun `테스트1`() {
        val longestCommonPrefix = LongestCommonPrefix()
        val sol = longestCommonPrefix.longestCommonPrefix(
                arrayOf("flower", "flow", "flight")
        )

        Assert.assertEquals("fl", sol)
    }

    @Test
    fun `테스트2`() {
        val longestCommonPrefix = LongestCommonPrefix()
        val sol = longestCommonPrefix.longestCommonPrefix(
                arrayOf("dog","racecar","car")
        )

        Assert.assertEquals("", sol)
    }

    @Test
    fun `테스트3`() {
        val longestCommonPrefix = LongestCommonPrefix()
        val sol = longestCommonPrefix.longestCommonPrefix(
                arrayOf("ab","a")
        )

        Assert.assertEquals("a", sol)
    }
}