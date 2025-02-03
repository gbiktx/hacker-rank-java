package medium

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class TopKFrequentTest {
    @Test
    fun case0() {
        val test = TopKFrequent()
        val input = intArrayOf(1,1,1,2,2,3)
        val k = 2
        val actual = test.topKFrequent(input, k)

        assertArrayEquals(intArrayOf(1,2), actual)
    }

    @Test
    fun case1() {
        val test = TopKFrequent()
        val input = intArrayOf(1)
        val k = 1
        val actual = test.topKFrequent(input, k)

        assertArrayEquals(intArrayOf(1), actual)
    }

}