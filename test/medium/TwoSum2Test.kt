package medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TwoSum2Test {
    @Test
    fun test1() {
        val test = TwoSum2()
        val result = test.twoSum(intArrayOf(2, 7, 11, 15), 9)

        assertArrayEquals(intArrayOf(1, 2), result)
    }

    @Test
    fun test2() {
        val test = TwoSum2()
        val result = test.twoSum(intArrayOf(2,3,4), 6)

        assertArrayEquals(intArrayOf(1, 3), result)
    }

    @Test
    fun test3() {
        val test = TwoSum2()
        val result = test.twoSum(intArrayOf(-1,0), 6)

        assertArrayEquals(intArrayOf(1, 2), result)
    }


}