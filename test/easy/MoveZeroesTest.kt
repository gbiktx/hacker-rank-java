package easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MoveZeroesTest {

    @Test
    fun solution() {
        val array = intArrayOf(0,1,0,3,12)
        MoveZeroes().solution(array)

        assertArrayEquals(intArrayOf(1,3,12,0,0), array)
    }

    @Test
    fun solution1() {
        val array = intArrayOf(0,0,1)
        MoveZeroes().solution(array)

        assertArrayEquals(intArrayOf(1,0,0), array)
    }

    @Test
    fun solution2() {
        val array = intArrayOf(1)
        MoveZeroes().solution(array)

        assertArrayEquals(intArrayOf(1), array)
    }

    @Test
    fun solution3() {
        val array = intArrayOf(1, 0)
        MoveZeroes().solution(array)

        assertArrayEquals(intArrayOf(1, 0), array)
    }

    @Test
    fun solution4() {
        val array = intArrayOf(2, 1)
        MoveZeroes().solution(array)

        assertArrayEquals(intArrayOf(2, 1), array)
    }
}