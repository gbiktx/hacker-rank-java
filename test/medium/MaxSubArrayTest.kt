package medium

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MaxSubArrayTest {

    @Test
    fun solution1() {
        val test = MaxSubArray()
        val result = test.solution(intArrayOf(-2,1,-3,4,-1,2,1,-5,4))

        assertEquals(6, result)
    }
    @Test
    fun solution2() {
        val test = MaxSubArray()
        val result = test.solution(intArrayOf(1))

        assertEquals(1, result)
    }

    @Test
    fun solution3() {
        val test = MaxSubArray()
        val result = test.solution(intArrayOf(5,4,-1,7,8))

        assertEquals(23, result)
    }

    @Test
    fun solution4() {
        val test = MaxSubArray()
        val result = test.solution(intArrayOf(-2,1))

        assertEquals(1, result)
    }

    @Test
    fun solution5() {
        val test = MaxSubArray()
        val result = test.solution(intArrayOf(1,2))

        assertEquals(3, result)
    }

    @Test
    fun solution6() {
        val test = MaxSubArray()
        val result = test.solution(intArrayOf(8,-19,5,-4,20))

        assertEquals(21, result)
    }
}