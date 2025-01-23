package medium

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GasStationTest {

    @Test
    fun case0() {
        val test = GasStation()
        val gas = intArrayOf(1, 2, 3, 4, 5)
        val cost = intArrayOf(3, 4, 5, 1, 2)
        val start = test.canCompleteCircuit(gas, cost)

        assertEquals(3, start)
    }

    @Test
    fun case1() {
        val test = GasStation()
        val gas = intArrayOf(2, 3, 4)
        val cost = intArrayOf(3, 4, 3)
        val start = test.canCompleteCircuit(gas, cost)

        assertEquals(-1, start)
    }

    @Test
    fun case2() {
        val test = GasStation()
        val gas = intArrayOf(5, 8, 2, 8)
        val cost = intArrayOf(6, 5, 6, 6)
        val start = test.canCompleteCircuit(gas, cost)

        assertEquals(3, start)
    }

    @Test
    fun case3() {
        val test = GasStation()
        val gas = intArrayOf(5, 5, 1, 3, 4)
        val cost = intArrayOf(8, 1, 7, 1, 1)
        val start = test.canCompleteCircuit(gas, cost)

        assertEquals(3, start)
    }

    @Test
    fun case4() {
        val test = GasStation()
        val gas = intArrayOf(1, 2, 3, 4, 5, 5, 70)
        val cost = intArrayOf(2, 3, 4, 3, 9, 6, 2)
        val start = test.canCompleteCircuit(gas, cost)

        assertEquals(6, start)
    }

    @Test
    fun case5() {
        val test = GasStation()
        val gas = intArrayOf(6, 1, 4, 3, 5)
        val cost = intArrayOf(3, 8, 2, 4, 2)
        val start = test.canCompleteCircuit(gas, cost)

        assertEquals(2, start)
    }
}