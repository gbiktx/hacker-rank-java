package easy

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 * https://leetcode.com/problems/majority-element?envType=study-plan-v2&envId=top-interview-150
 */
class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        val half = nums.size / 2
        val map = hashMapOf<Int,Int>()

        var major = nums[0]
        for (i in nums.indices) {
            val num = nums[i]
            val prev = map[num] ?: 0
            val sum = prev + 1

            if (sum > half) {
                major = num
                break
            }
            map[num] = sum
        }

        return major
    }
}