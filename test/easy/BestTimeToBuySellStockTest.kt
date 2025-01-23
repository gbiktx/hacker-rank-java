package easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class BestTimeToBuySellStockTest {

    @Test
    fun case0() {
        val test = BestTimeToBuySellStock()
        val input = intArrayOf(7, 1, 5, 3, 6, 4)
        val profit = test.maxProfit(input)

        assertEquals(5, profit)
    }

    @Test
    fun case1() {
        val test = BestTimeToBuySellStock()
        val input = intArrayOf(7, 6, 4, 3, 1)
        val profit = test.maxProfit(input)

        assertEquals(0, profit)
    }

    @Test
    fun case3() {
        val test = BestTimeToBuySellStock()
        val input = intArrayOf(7)
        val profit = test.maxProfit(input)

        assertEquals(0, profit)
    }

    @Test
    fun case4() {
        val test = BestTimeToBuySellStock()
        val input = intArrayOf(1, 7, 3, 3, 2)
        val profit = test.maxProfit(input)

        assertEquals(6, profit)
    }

    @Test
    fun case5() {
        val test = BestTimeToBuySellStock()
        val input = intArrayOf(2, 3, 1, 3, 2)
        val profit = test.maxProfit(input)

        assertEquals(2, profit)
    }

    @Test
    fun case6() {
        val test = BestTimeToBuySellStock()
        val input = intArrayOf(2, 4, 1)
        val profit = test.maxProfit(input)

        assertEquals(2, profit)
    }

    @Test
    fun case7() {
        val test = BestTimeToBuySellStock()
        val input = intArrayOf(3,3,5,0,0,3,1,4)
        val profit = test.maxProfit(input)

        assertEquals(4, profit)
    }

    @Test
    fun case8() {
        val test = BestTimeToBuySellStock()
        val input = intArrayOf(3,2,6,5,0,3)
        val profit = test.maxProfit(input)

        assertEquals(4, profit)
    }
}