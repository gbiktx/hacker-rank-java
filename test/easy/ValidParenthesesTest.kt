package easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidParenthesesTest {
    @Test
    fun case0() {
        val test = ValidParentheses()
        val input = "()"
        val actual = test.isValid(input)

        assertEquals(true, actual)
    }

    @Test
    fun case1() {
        val test = ValidParentheses()
        val input = "()[]{}"
        val actual = test.isValid(input)

        assertEquals(true, actual)
    }

    @Test
    fun case2() {
        val test = ValidParentheses()
        val input = "(]"
        val actual = test.isValid(input)

        assertEquals(false, actual)
    }

    @Test
    fun case3() {
        val test = ValidParentheses()
        val input = "([])"
        val actual = test.isValid(input)

        assertEquals(true, actual)
    }

    @Test
    fun case4() {
        val test = ValidParentheses()
        val input = "("
        val actual = test.isValid(input)

        assertEquals(false, actual)
    }

    @Test
    fun case5() {
        val test = ValidParentheses()
        val input = "]()"
        val actual = test.isValid(input)

        assertEquals(false, actual)
    }

    @Test
    fun case6() {
        val test = ValidParentheses()
        val input = "([([[])])"
        val actual = test.isValid(input)

        assertEquals(false, actual)
    }

    @Test
    fun case7() {
        val test = ValidParentheses()
        val input = "([([])]))"
        val actual = test.isValid(input)

        assertEquals(false, actual)
    }
}