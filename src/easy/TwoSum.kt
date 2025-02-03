package easy

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * https://leetcode.com/problems/two-sum
 */
class TwoSum {
    // O(n^2) solution
//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        for (i in nums.indices) {
//            for (j in (i + 1) until nums.size) {
//                if (nums[i] + nums[j] == target) {
//                    return intArrayOf(i, j)
//                }
//            }
//        }
//
//        return intArrayOf(0,1)
//    }
    // O(n) solution: looking for the complement
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for (i: Int in nums.indices) {
            val n = nums[i]
            map[target - n] = i
        }

        for (i: Int in nums.indices) {
            val n = nums[i]
            val j = map[n]
           if (j != null && i != j) {
              return intArrayOf(i, j)
           }
        }

        return intArrayOf()
    }
}