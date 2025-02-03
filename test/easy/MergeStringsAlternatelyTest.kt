package easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MergeStringsAlternatelyTest {

    @Test
    fun case0() {
        val test = MergeStringsAlternately()
        val word1 = "abc"
        val word2 = "pqr"
        val actual = test.mergeAlternately(word1, word2)

        assertEquals("apbqcr", actual)
    }

    @Test
    fun case1() {
        val test = MergeStringsAlternately()
        val word1 = "ab"
        val word2 = "pqrs"
        val actual = test.mergeAlternately(word1, word2)

        assertEquals("apbqrs", actual)
    }

    @Test
    fun case2() {
        val test = MergeStringsAlternately()
        val word1 = "abcd"
        val word2 = "pq"
        val actual = test.mergeAlternately(word1, word2)

        assertEquals("apbqcd", actual)
    }

    @Test
    fun case3() {
        val test = MergeStringsAlternately()
        val word1 = "a"
        val word2 = "p"
        val actual = test.mergeAlternately(word1, word2)

        assertEquals("ap", actual)
    }
}