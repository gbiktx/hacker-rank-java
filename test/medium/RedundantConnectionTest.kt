package medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RedundantConnectionTest {

    @Test
    fun `test 1`() {
        val test = RedundantConnection()
        val input = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3))

        val result = test.findRedundantConnection(input)

        assertEquals(2, result[0])
        assertEquals(3, result[1])
    }

    @Test
    fun `test 2`() {
        val test = RedundantConnection()
        val input = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(1, 4), intArrayOf(1, 5))

        val result = test.findRedundantConnection(input)

        assertEquals(1, result[0])
        assertEquals(4, result[1])
    }

    @Test
    fun `test 3`() {
        val test = RedundantConnection()
        val input = arrayOf(intArrayOf(1, 3), intArrayOf(3, 4), intArrayOf(1, 5), intArrayOf(3, 5), intArrayOf(2, 3))

        val result = test.findRedundantConnection(input)

        assertEquals(3, result[0])
        assertEquals(5, result[1])
    }

    @Test
    fun `test 4`() {
        val test = RedundantConnection()
        val input = arrayOf(intArrayOf(1, 4), intArrayOf(3, 4), intArrayOf(1, 3), intArrayOf(1, 2), intArrayOf(4, 5))

        val result = test.findRedundantConnection(input)

        assertEquals(1, result[0])
        assertEquals(3, result[1])
    }

    @Test
    fun `test 5`() {
        val test = RedundantConnection()
        val input = arrayOf(intArrayOf(3, 4), intArrayOf(1, 2), intArrayOf(2, 4), intArrayOf(3, 5), intArrayOf(2, 5))

        val result = test.findRedundantConnection(input)

        assertEquals(2, result[0])
        assertEquals(5, result[1])
    }

    @Test
    fun `test 6`() {
        val test = RedundantConnection()
        val input = arrayOf(
            intArrayOf(9, 10), intArrayOf(5, 8), intArrayOf(2, 6), intArrayOf(1, 5), intArrayOf(3, 8),
            intArrayOf(4, 9), intArrayOf(8, 10), intArrayOf(4, 10), intArrayOf(6, 8), intArrayOf(7, 9)
        )

        val result = test.findRedundantConnection(input)

        assertEquals(4, result[0])
        assertEquals(10, result[1])
    }

}