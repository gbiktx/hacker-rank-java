package easy

import datatypes.ListNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LinkedListCycleTest {

    @Test
    fun case0() {
        val test = LinkedListCycle()
        val input = ListNode.fromArray(intArrayOf(3, 2, 0, -4))
        val actual = test.hasCycle(input)

        assertEquals(true, actual)
    }

    @Test
    fun case1() {
        val test = LinkedListCycle()
        val input = ListNode.fromArray(intArrayOf(1,2))
        val actual = test.hasCycle(input)

        assertEquals(true, actual)
    }

    @Test
    fun case2() {
        val test = LinkedListCycle()
        val input = ListNode.fromArray(intArrayOf(1))
        val actual = test.hasCycle(input)

        assertEquals(false, actual)
    }

    @Test
    fun case3() {
        val test = LinkedListCycle()
        val input = ListNode.fromArray(intArrayOf(1,3,2,4))
        val actual = test.hasCycle(input)

        assertEquals(true, actual)
    }
}