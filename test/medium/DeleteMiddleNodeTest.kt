package medium

import datatypes.ListNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DeleteMiddleNodeTest {

    @Test
    fun case0() {
        val test = DeleteMiddleNode()
        val head = ListNode.fromArray(intArrayOf(1, 3, 4, 7, 1, 2, 6))
        val actual = test.deleteMiddle(head)?.toArray()

        assertArrayEquals(intArrayOf(1, 3, 4, 1, 2, 6), actual)
    }

    @Test
    fun case1() {
        val test = DeleteMiddleNode()
        val head = ListNode.fromArray(intArrayOf(1, 2, 3, 4))
        val actual = test.deleteMiddle(head)?.toArray()

        assertArrayEquals(intArrayOf(1, 2, 4), actual)
    }

    @Test
    fun case2() {
        val test = DeleteMiddleNode()
        val head = ListNode.fromArray(intArrayOf(2, 1))
        val actual = test.deleteMiddle(head)?.toArray()

        assertArrayEquals(intArrayOf(2), actual)
    }

    @Test
    fun case3() {
        val test = DeleteMiddleNode()
        val head = ListNode.fromArray(intArrayOf(1))
        val actual = test.deleteMiddle(head)?.toArray() ?: intArrayOf()

        assertArrayEquals(intArrayOf(), actual)
    }

}