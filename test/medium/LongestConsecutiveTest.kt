package medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LongestConsecutiveTest {
    @Test
    fun case0() {
        val test = LongestConsecutive()
        val input = intArrayOf(100, 4, 200, 1, 3, 2)
        val actual = test.longestConsecutive(input)

        assertEquals(4, actual)
    }

    @Test
    fun case1() {
        val test = LongestConsecutive()
        val input = intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)
        val actual = test.longestConsecutive(input)

        assertEquals(9, actual)
    }

    @Test
    fun case2() {
        val test = LongestConsecutive()
        val input = intArrayOf(1)
        val actual = test.longestConsecutive(input)

        assertEquals(1, actual)
    }

    @Test
    fun case3() {
        val test = LongestConsecutive()
        val input = intArrayOf(100,-2,-1,0)
        val actual = test.longestConsecutive(input)

        assertEquals(3, actual)
    }

    @Test
    fun case4() {
        val test = LongestConsecutive()
        val input = intArrayOf(-1000000000,1,2,3,9,1000000000)
        val actual = test.longestConsecutive(input)

        assertEquals(3, actual)
    }
    @Test
    fun case5() {
        val test = LongestConsecutive()
        val input = intArrayOf(9,1,4,7,3,-1,0,5,8,-1,6)
        val actual = test.longestConsecutive(input)

        assertEquals(7, actual)
    }

    @Test
    fun case6() {
        val test = LongestConsecutive()
        val input = intArrayOf()
        val actual = test.longestConsecutive(input)

        assertEquals(0, actual)
    }
}