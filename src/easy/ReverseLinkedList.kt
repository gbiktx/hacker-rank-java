package easy

import datatypes.ListNode

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * https://leetcode.com/problems/reverse-linked-list
 */
class ReverseLinkedList {
    fun reverseList(head: ListNode?): ListNode? {
        var current: ListNode? = head
        var prev: ListNode? = null
        while (current != null) {
            val next = current.next
            current.next = prev
            prev = current
            current = next
        }

        return prev
    }

    fun reverseListRecursive(head: ListNode?): ListNode? {
        return checkNext(head, null)
    }

    private fun checkNext(current: ListNode?, prev: ListNode?): ListNode? {
        if (current == null) {
            return prev
        } else {
            val next = current.next
            current.next = prev
            return checkNext(next, current)
        }
    }
}
