package medium

/**
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 *
 * https://leetcode.com/problems/top-k-frequent-elements
 */
class TopKFrequent {
//    fun topKFrequent(nums: IntArray, k: Int): IntArray {
//        val map = hashMapOf<Int, Int>()
//        for (num in nums) {
//            map[num] = map.getOrDefault(num, 0) + 1
//        }
//        return map.keys.sortedByDescending { key -> map[key] }.take(k).toIntArray()
//    }
    // O(n)
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val count = HashMap<Int, Int>()
        val freq = List(nums.size + 1) { mutableListOf<Int>() }

        for (num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
        }
        for ((num, cnt) in count) {
            freq[cnt].add(num)
        }

        val res = mutableListOf<Int>()
        for (i in freq.size - 1 downTo 1) {
            for (num in freq[i]) {
                res.add(num)
                if (res.size == k) {
                    return res.toIntArray()
                }
            }
        }
        return res.toIntArray()
    }
}