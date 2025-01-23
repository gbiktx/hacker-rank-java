package easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MergeArraysTest {

    @Test
    fun merge() {
        val test = MergeArrays()
        val result = test.merge(arrayOf(0,3,4,31), arrayOf(4, 6, 30))

        print(result.joinToString())
        assertArrayEquals(result, arrayOf(0, 3, 4, 4, 6, 30, 31))
    }
}