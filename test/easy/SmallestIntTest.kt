package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestIntTest {

    @Test
    fun case0() {
        val test = SmallestInt()
        val input = intArrayOf(1, 3, 6, 4, 1, 2)
        val actual = test.solution(input)

        assertEquals(5, actual)
    }

    @Test
    fun case1() {
        val test = SmallestInt()
        val input = intArrayOf(1,2,3)
        val actual = test.solution(input)

        assertEquals(4, actual)
    }

    @Test
    fun case2() {
        val test = SmallestInt()
        val input = intArrayOf(-1, -3)
        val actual = test.solution(input)

        assertEquals(1, actual)
    }
}