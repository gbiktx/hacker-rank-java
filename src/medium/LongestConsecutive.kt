package medium

import kotlin.math.max

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 * https://leetcode.com/problems/longest-consecutive-sequence
 */
class LongestConsecutive {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var max = Int.MIN_VALUE
        var min = Int.MAX_VALUE
        val lookup = hashMapOf<Int,Boolean>()
        var count = 1
        var maxCount = 1

        for (n in nums) {
           lookup[n - 1] = true
        }

        for (n in nums) {
            if (lookup.contains(n)) {
                if (n > max) {
                    max = n
                }
                if (n < min) {
                    min = n
                }
            }
        }

        for (c in min ..max) {
            if (lookup.contains(c)) {
                count++
                if (count > maxCount) {
                    maxCount = count
                }
            } else {
                count = 0
            }
        }

        return maxCount
    }

}