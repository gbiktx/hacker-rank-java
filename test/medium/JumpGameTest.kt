package medium

import easy.BestTimeToBuySellStock
import easy.RomanToInteger
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class JumpGameTest {

    @Test
    fun case0() {
        val test = JumpGame()
        val input = intArrayOf(2, 3, 1, 1, 4)
        val profit = test.canJump(input)

        assertEquals(true, profit)
    }

    @Test
    fun case1() {
        val test = JumpGame()
        val input = intArrayOf(3, 2, 1, 0, 4)
        val profit = test.canJump(input)

        assertEquals(false, profit)
    }

    @Test
    fun case2() {
        val test = JumpGame()
        val input = intArrayOf(3)
        val profit = test.canJump(input)

        assertEquals(true, profit)
    }

    @Test
    fun case3() {
        val test = JumpGame()
        val input = intArrayOf(0)
        val profit = test.canJump(input)

        assertEquals(true, profit)
    }

    @Test
    fun case4() {
        val test = JumpGame()
        val input = intArrayOf(3, 2, 1, 0)
        val profit = test.canJump(input)

        assertEquals(true, profit)
    }

    @Test
    fun case5() {
        val test = JumpGame()
        val input = intArrayOf(0,2,3)
        val profit = test.canJump(input)

        assertEquals(false, profit)
    }
}