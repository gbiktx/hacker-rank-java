package easy

/**
 * Given an integer array nums,
 * return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * https://leetcode.com/problems/contains-duplicate
 */
class ContainsDuplicate {

    fun solution(nums: IntArray): Boolean {
        val set = hashMapOf<Int, Boolean>()
        for (num in nums) {
            if (set.contains(num)) {
                return true
            }
            set[num] = true
        }

        return false
    }
}