package easy

import datatypes.ListNode

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 * https://leetcode.com/problems/merge-two-sorted-lists
 */
class MergeTwoList {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null && list2 == null) return null

        val dummy = ListNode(Int.MAX_VALUE)
        var current: ListNode? = dummy
        var current1: ListNode? = list1
        var current2: ListNode? = list2

        while (current1 != null || current2 != null) {
            val val1 = current1?.`val` ?: Int.MAX_VALUE
            val val2 = current2?.`val` ?: Int.MAX_VALUE
            if (val1 < val2) {
                current?.next = current1
                current1 = current1?.next
            } else {
                current?.next = current2
                current2 = current2?.next
            }
            current = current?.next
        }

        return dummy.next
    }
}
