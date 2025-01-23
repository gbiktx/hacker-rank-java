package easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RomanToIntegerTest {

    @Test
    fun case0() {
        val test = RomanToInteger()
        val input = "III"
        val value = test.romanToInt(input)

        assertEquals(3, value)
    }

    @Test
    fun case1() {
        val test = RomanToInteger()
        val input = "LVIII"
        val value = test.romanToInt(input)

        assertEquals(58, value)
    }

    @Test
    fun case2() {
        val test = RomanToInteger()
        val input = "MCMXCIV"
        val value = test.romanToInt(input)

        assertEquals(1994, value)
    }
}