package easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BinarySearchTest {
    @Test
    fun case0() {
        val test = BinarySearch()
        val input = intArrayOf(-1, 0, 3, 5, 9, 12)
        val target = 9
        val actual = test.search(input, target)

        assertEquals(4, actual)
    }

    @Test
    fun case1() {
        val test = BinarySearch()
        val input = intArrayOf(-1, 0, 3, 5, 9, 12)
        val target = 2
        val actual = test.search(input, target)

        assertEquals(-1, actual)
    }

}