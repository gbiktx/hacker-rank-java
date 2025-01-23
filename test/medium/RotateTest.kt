package medium

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RotateTest {

    @Test
    fun solution() {
        val array = intArrayOf(1,2,3,4,5,6,7)
        Rotate().solution(array, 3)

        assertArrayEquals(intArrayOf(5,6,7,1,2,3,4), array)
    }


    @Test
    fun solution1() {
        val array = intArrayOf(-1,-100,3,99)
        Rotate().solution(array, 2)

        assertArrayEquals(intArrayOf(3,99,-1,-100), array)
    }

    @Test
    fun solution2() {
        val array = intArrayOf(-1)
        Rotate().solution(array, 2)

        assertArrayEquals(intArrayOf(-1), array)
    }

    @Test
    fun solution3() {
        val array = intArrayOf(1,2)
        Rotate().solution(array, 3)

        assertArrayEquals(intArrayOf(2,1), array)
    }
}