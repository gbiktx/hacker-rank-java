package medium

import datatypes.ListNode
import kotlin.math.round

/**
 * You are given the head of a linked list.
 * Delete the middle node, and return the head of the modified linked list.
 *
 * The middle node of a linked list of size n is the ⌊n / 2⌋th node
 * from the start using 0-based indexing,
 * where ⌊x⌋ denotes the largest integer less than or equal to x.
 *
 * For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 *
 * https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list?envType=study-plan-v2&envId=leetcode-75
 */
class DeleteMiddleNode {
    fun deleteMiddle(head: ListNode?): ListNode? {
        if (head == null || head.next == null) return null

        var slow: ListNode? = head
        var fast: ListNode? = head.next?.next
        while (fast != null && fast.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }

        slow?.next = slow?.next?.next
        return head
    }

}