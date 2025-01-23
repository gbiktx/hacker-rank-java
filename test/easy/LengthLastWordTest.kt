package easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LengthLastWordTest {

    @Test
    fun case0() {
        val test = LengthLastWord()
        val word = "Hello World"
        val length = test.lengthOfLastWord(word)

        assertEquals(5, length)
    }

    @Test
    fun case1() {
        val test = LengthLastWord()
        val word = "   fly me   to   the moon  "
        val length = test.lengthOfLastWord(word)

        assertEquals(4, length)
    }

    @Test
    fun case2() {
        val test = LengthLastWord()
        val word = "luffy is still joyboy"
        val length = test.lengthOfLastWord(word)

        assertEquals(6, length)
    }

    @Test
    fun case3() {
        val test = LengthLastWord()
        val word = "a"
        val length = test.lengthOfLastWord(word)

        assertEquals(1, length)
    }

    @Test
    fun case4() {
        val test = LengthLastWord()
        val word = "day"
        val length = test.lengthOfLastWord(word)

        assertEquals(3, length)
    }
}