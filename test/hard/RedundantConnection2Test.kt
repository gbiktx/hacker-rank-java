package hard

import medium.RedundantConnection
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RedundantConnection2Test {

    @Test
    fun `test 1`() {
        val test = RedundantConnection2()
        val input = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 3))

        val result = test.findRedundantDirectedConnection(input)

        assertEquals(2, result[0])
        assertEquals(3, result[1])
    }

    @Test
    fun `test 2`() {
        val test = RedundantConnection2()
        val input = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 1), intArrayOf(1, 5))

        val result = test.findRedundantDirectedConnection(input)

        assertEquals(4, result[0])
        assertEquals(1, result[1])
    }

    @Test
    fun `test 3`() {
        val test = RedundantConnection2()
        val input = arrayOf(intArrayOf(2, 1), intArrayOf(3, 1), intArrayOf(4, 2), intArrayOf(1, 4))

        val result = test.findRedundantDirectedConnection(input)

        assertEquals(2, result[0])
        assertEquals(1, result[1])
    }

    @Test
    fun `test 4`() {
        val test = RedundantConnection2()
        val input = arrayOf(intArrayOf(3, 1), intArrayOf(1, 4), intArrayOf(3, 5), intArrayOf(1, 2), intArrayOf(1, 5))

        val result = test.findRedundantDirectedConnection(input)

        assertEquals(1, result[0])
        assertEquals(5, result[1])
    }

    @Test
    fun `test 5`() {
        val test = RedundantConnection2()
        val input = arrayOf(intArrayOf(4, 2), intArrayOf(1, 5), intArrayOf(5, 2), intArrayOf(5,3), intArrayOf(2, 4))

        val result = test.findRedundantDirectedConnection(input)

        assertEquals(4, result[0])
        assertEquals(2, result[1])
    }

    @Test
    fun `test 6`() {
        val test = RedundantConnection2()
        val input = arrayOf(intArrayOf(5, 2), intArrayOf(5, 1), intArrayOf(3, 1), intArrayOf(3, 4), intArrayOf(3, 5))

        val result = test.findRedundantDirectedConnection(input)

        assertEquals(3, result[0])
        assertEquals(1, result[1])
    }

    @Test
    fun `test 7`() {
        val test = RedundantConnection2()
        val input = arrayOf(intArrayOf(1, 4), intArrayOf(5, 2), intArrayOf(1, 3), intArrayOf(4, 5), intArrayOf(1, 5))

        val result = test.findRedundantDirectedConnection(input)

        assertEquals(1, result[0])
        assertEquals(5, result[1])
    }

//    @Test
//    fun `test find root`() {
//        val test = RedundantConnection2()
//        val input = arrayOf(intArrayOf(2, 1), intArrayOf(3, 1), intArrayOf(4, 2), intArrayOf(1, 4))
////        val input = arrayOf(intArrayOf(3, 1), intArrayOf(1, 4), intArrayOf(3, 5), intArrayOf(1, 2), intArrayOf(1, 5))
//
//        val result = test.findRedundantDirectedConnection(input)
//
//        assertEquals(1, result[0])
//        assertEquals(5, result[1])
//    }
}