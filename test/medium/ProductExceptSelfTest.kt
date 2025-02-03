package medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ProductExceptSelfTest {
    @Test
    fun case0() {
        val test = ProductExceptSelf()
        val input = intArrayOf(1, 2, 3, 4)
        val actual = test.productExceptSelf(input)

        assertArrayEquals(intArrayOf(24, 12, 8, 6), actual)
    }

    @Test
    fun case1() {
        val test = ProductExceptSelf()
        val input = intArrayOf(-1,1,0,-3,3)
        val actual = test.productExceptSelf(input)

        assertArrayEquals(intArrayOf(0,0,9,0,0), actual)
    }
}