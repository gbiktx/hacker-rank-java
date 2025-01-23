package easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RemoveDuplicatedSortedArrayTest {

    @Test
    fun case0() {
        val test = RemoveDuplicatedSortedArray()
        val input = intArrayOf(1)
        val expect = intArrayOf(1)
        val k = test.removeDuplicates(input)
        val actual = input.take(k).toIntArray()

        assertEquals(1, k)
        assertArrayEquals(expect, actual)
    }

    @Test
    fun case1() {
        val test = RemoveDuplicatedSortedArray()
        val input = intArrayOf(1, 1, 2)
        val expect = intArrayOf(1, 2)
        val k = test.removeDuplicates(input)
        val actual = input.take(k).toIntArray()

        assertEquals(2, k)
        assertArrayEquals(expect, actual)
    }

    @Test
    fun case2() {
        val test = RemoveDuplicatedSortedArray()
        val input = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        val expect = intArrayOf(0,1,2,3,4)
        val k = test.removeDuplicates(input)
        val actual = input.take(k).toIntArray()

        assertEquals(5, k)
        assertArrayEquals(expect, actual)
    }
        @Test
    fun case3() {
        val test = RemoveDuplicatedSortedArray()
        val input = intArrayOf(-1,0,0,0,1,2)
        val expect = intArrayOf(-1,0,1,2)
        val k = test.removeDuplicates(input)
        val actual = input.take(k).toIntArray()

        assertEquals(4, k)
        assertArrayEquals(expect, actual)
    }
}