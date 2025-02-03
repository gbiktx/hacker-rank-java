package medium

import kotlin.collections.LinkedHashMap


/**
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 *
 * Implement the LRUCache class:
 *
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * The functions get and put must each run in O(1) average time complexity.
 *
 * https://leetcode.com/problems/lru-cache
 */
class LRUCache(val capacity: Int) {
    val map = hashMapOf<Int, Node>()
    val list = DoubleLinkedList()

    // we could use a built-in LinkedHashMap
    val cache = object : LinkedHashMap<Int, Int>(capacity, 0.75f, true) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, Int>?): Boolean {
            return size > capacity
        }
    }

    fun get(key: Int): Int {
        val node = map[key] ?: return -1
        list.remove(node)
        list.append(node)
        return node.value
    }

    fun put(key: Int, value: Int) {
        if (map.contains(key)) {
            list.remove(map[key]!!)
        }
        val new = Node(key, value)
        list.append(new)
        map[key] = new

        if (map.size > capacity) {
            val removedKey = list.pop()
            map.remove(removedKey)
        }
    }

    data class Node(var key: Int, var value: Int, var next: Node? = null, var prev: Node? = null)
    class DoubleLinkedList(val head: Node = Node(0, 0), val tail: Node = Node(0, 0)) {
        init {
            head.next = tail
            tail.prev = head
        }

        fun pop(): Int {
            val next = head.next
            return next?.let {
                remove(next)
                next.key
            } ?: -1
        }

        fun remove(node: Node) {
            val prev = node.prev
            val next = node.next
            prev?.next = next
            next?.prev = prev
        }

        fun append(new: Node) {
            val last = tail.prev
            last?.next = new
            tail.prev = new

            new.prev = last
            new.next = tail
        }
    }
}

