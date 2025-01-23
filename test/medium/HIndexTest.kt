package medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HIndexTest {
    @Test
    fun case0() {
        val test = HIndex()
        val input = intArrayOf(3,0,6,1,5)
        val result = test.hIndex(input)

        assertEquals(3, result)
    }

    @Test
    fun case1() {
        val test = HIndex()
        val input = intArrayOf(1,3,1)
        val result = test.hIndex(input)

        assertEquals(1, result)
    }

    @Test
    fun case2() {
        val test = HIndex()
        val input = intArrayOf(100)
        val result = test.hIndex(input)

        assertEquals(1, result)
    }

    @Test
    fun case3() {
        val test = HIndex()
        val input = intArrayOf(0)
        val result = test.hIndex(input)

        assertEquals(0, result)
    }

    @Test
    fun case4() {
        val test = HIndex()
        val input = intArrayOf(0, 0, 1)
        val result = test.hIndex(input)

        assertEquals(1, result)
    }

    @Test
    fun case5() {
        val test = HIndex()
        val input = intArrayOf(0, 0, 2)
        val result = test.hIndex(input)

        assertEquals(1, result)
    }

    @Test
    fun case6() {
        val test = HIndex()
        val input = intArrayOf(1)
        val result = test.hIndex(input)

        assertEquals(1, result)
    }

    @Test
    fun case7() {
        val test = HIndex()
        val input = intArrayOf(0,1)
        val result = test.hIndex(input)

        assertEquals(1, result)
    }

    @Test
    fun case8() {
        val test = HIndex()
        val input = intArrayOf(11,15)
        val result = test.hIndex(input)

        assertEquals(2, result)
    }
}