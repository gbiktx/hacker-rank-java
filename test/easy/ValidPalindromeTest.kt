package easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidPalindromeTest {
    @Test
    fun case0() {
        val test = ValidPalindrome()
        val input = "A man, a plan, a canal: Panama"
        val actual = test.isPalindrome(input)

        assertEquals(true, actual)
    }

    @Test
    fun case1() {
        val test = ValidPalindrome()
        val input = "race a car"
        val actual = test.isPalindrome(input)

        assertEquals(false, actual)
    }

    @Test
    fun case2() {
        val test = ValidPalindrome()
        val input = " "
        val actual = test.isPalindrome(input)

        assertEquals(true, actual)
    }

    @Test
    fun case3() {
        val test = ValidPalindrome()
        val input = "0P"
        val actual = test.isPalindrome(input)

        assertEquals(false, actual)
    }
}