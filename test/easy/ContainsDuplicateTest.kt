package easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ContainsDuplicateTest {

    @Test
    fun solution() {
        val duplicate = ContainsDuplicate().solution(intArrayOf(1,2,3,1))

        assertEquals(true, duplicate)
    }
}