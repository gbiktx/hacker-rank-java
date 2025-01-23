package easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BaseballTest {

    @Test
    fun `result is 30`() {
        val test = Baseball()
        val result = test.calPoints(arrayOf("5","2","C","D","+"))

        assertEquals(30, result)
    }

    @Test
    fun `result is 27`() {
        val test = Baseball()
        val result = test.calPoints(arrayOf("5","-2","4","C","D","9","+","+"))

        assertEquals(27, result)
    }

    @Test
    fun `result is 0`() {
        val test = Baseball()
        val result = test.calPoints(arrayOf("1","C"))

        assertEquals(0, result)
    }
}