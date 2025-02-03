package easy

import datatypes.ListNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ReverseLinkedListTest {
    @Test
    fun case0() {
        val test = ReverseLinkedList()
        val head = ListNode.fromArray(intArrayOf(1,2,3,4,5))
        val actual = test.reverseListRecursive(head)?.toArray()

        assertArrayEquals(intArrayOf(5,4,3,2,1), actual)
    }

    @Test
    fun case1() {
        val test = ReverseLinkedList()
        val head = ListNode.fromArray(intArrayOf(1,2))
        val actual = test.reverseListRecursive(head)?.toArray()

        assertArrayEquals(intArrayOf(2,1), actual)
    }

    @Test
    fun case2() {
        val test = ReverseLinkedList()
        val head = null
        val actual = test.reverseListRecursive(head)?.toArray()

        assertEquals(null, actual)
    }
}