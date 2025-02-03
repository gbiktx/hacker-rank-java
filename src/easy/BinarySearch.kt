package easy

/**
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * https://leetcode.com/problems/binary-search
 */
class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> left = mid + 1
                else -> right = mid - 1
            }
        }
        return -1
    }
}
