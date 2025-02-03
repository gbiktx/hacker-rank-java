package easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ContainsDuplicateTest {

    @Test
    fun case0() {
        val duplicate = ContainsDuplicate().solution(intArrayOf(1,2,3,1))

        assertEquals(true, duplicate)
    }
    @Test
    fun case1() {
        val duplicate = ContainsDuplicate().solution(intArrayOf(1,2,3,4))

        assertEquals(false, duplicate)
    }
    @Test
    fun case2() {
        val duplicate = ContainsDuplicate().solution(intArrayOf(1,1,1,3,3,4,3,2,4,2))

        assertEquals(true, duplicate)
    }
    @Test
    fun case3() {
        val duplicate = ContainsDuplicate().solution(intArrayOf(1))

        assertEquals(false, duplicate)
    }
    @Test
    fun case4() {
        val duplicate = ContainsDuplicate().solution(intArrayOf(-1,2,3,-4,-1))

        assertEquals(true, duplicate)
    }
}