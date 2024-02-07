package com.company.etc.w20240205

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class Test2Test {
    @Test
    fun `테스트1`() {
        val test = Test2()
        val resut = test.solution(arrayOf(
                intArrayOf(1, 8, 1, 13),
                intArrayOf(5, 18, 6, 9)
        )
                , 100000
        )
        assertEquals(resut, 20)
   }

    @Test
    fun `테스트2`() {
        val test = Test2()
        val resut = test.solution(arrayOf(
                intArrayOf(1, 22, 3, 8),
                intArrayOf(13, 12, 13, 17),
                intArrayOf(14, 22, 15, 0),
        )
                , 100000
        )
        assertEquals(resut, 41)
    }
}