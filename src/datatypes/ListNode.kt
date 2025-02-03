package datatypes

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    fun toArray(): IntArray {
        var current = next
        val list = mutableListOf<Int>()
        list.add(`val`)
        while (current != null) {
            list.add(current.`val`)
            current = current.next
        }

        return list.toIntArray()
    }

    companion object {

        fun fromArray(intArray: IntArray): ListNode {
            val head = ListNode(intArray[0])
            var current = head
            for (i in 1 until intArray.size) {
                current.next = ListNode(intArray[i])
                val next = current.next
                if (next != null) {
                    current = next
                }
            }
            return head
        }
    }
}
