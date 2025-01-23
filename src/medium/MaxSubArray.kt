package medium

class MaxSubArray {

    fun solution(nums: IntArray): Int {
        var max = nums[0]
        var result = nums[0]

        for (i: Int in 1 until nums.size) {
            val n = nums[i]
            result += n

            if (n > result) {
                result = n
            }

            if (result > max) {
                max = result
            }

        }

        return max
    }

}