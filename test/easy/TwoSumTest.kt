package easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TwoSumTest {

    @Test
    fun test1() {
        val test = TwoSum()
        val result = test.twoSum(intArrayOf(2,7,11,15), 9)

        assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun test2() {
        val test = TwoSum()
        val result = test.twoSum(intArrayOf(3,2,4), 6)

        assertArrayEquals(intArrayOf(1, 2), result)
    }

    @Test
    fun test3() {
        val test = TwoSum()
        val result = test.twoSum(intArrayOf(3, 3), 6)

        assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun test4() {
        val test = TwoSum()
        val result = test.twoSum(intArrayOf(3,2,3), 6)

        assertArrayEquals(intArrayOf(0, 2), result)
    }
}