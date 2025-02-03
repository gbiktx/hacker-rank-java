package easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidAnagramTest {
    @Test
    fun case0() {
        val test = ValidAnagram()
        val s = "anagram"
        val t = "nagaram"
        val actual = test.isAnagram(s, t)

        assertEquals(true, actual)
    }
    @Test
    fun case1() {
        val test = ValidAnagram()
        val s = "rat"
        val t = "car"
        val actual = test.isAnagram(s, t)

        assertEquals(false, actual)
    }

    @Test
    fun case2() {
        val test = ValidAnagram()
        val s = "t"
        val t = "t"
        val actual = test.isAnagram(s, t)

        assertEquals(true, actual)
    }

    @Test
    fun case3() {
        val test = ValidAnagram()
        val s = "w"
        val t = "q"
        val actual = test.isAnagram(s, t)

        assertEquals(false, actual)
    }
}