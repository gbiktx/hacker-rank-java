package medium

/**
 * You are given an integer array nums.
 *
 * You are initially positioned at the array's first index, and each element in
 * the array represents your maximum jump length at that position.
 *
 * Return true if you can reach the last index, or false otherwise.
 *
 * https://leetcode.com/problems/jump-game?envType=study-plan-v2&envId=top-interview-150
 */
class JumpGame {
    fun canJump(nums: IntArray): Boolean {
        var limit = nums[0]
        for (i in nums.indices) {
            if (i > limit) {
                return false
            }
            val jump = nums[i]
            val end = nums.size - (i + 1)
            if (jump >= end) {
                return true
            }
           val nLimit = i + jump
            if (nLimit > limit) {
                limit = nLimit
            }
        }

        return false
    }
}