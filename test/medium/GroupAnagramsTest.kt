package medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GroupAnagramsTest {

    @Test
    fun case0() {
        val test = GroupAnagrams()
        val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
        val actual = test.groupAnagrams(input)

        assertIterableEquals(listOf(listOf("bat"), listOf("nat", "tan"), listOf("ate", "eat", "tea")), actual)
    }

    @Test
    fun case1() {
        val test = GroupAnagrams()
        val input = arrayOf("")
        val actual = test.groupAnagrams(input)

        assertIterableEquals(listOf(listOf("")), actual)
    }

    @Test
    fun case2() {
        val test = GroupAnagrams()
        val input = arrayOf("a")
        val actual = test.groupAnagrams(input)

        assertIterableEquals(listOf(listOf("")), actual)
    }
}