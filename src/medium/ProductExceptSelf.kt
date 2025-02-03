package medium

/**
 * Given an integer array nums, return an array answer such that answer[i]
 * is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * https://leetcode.com/problems/product-of-array-except-self
 */
class ProductExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val prefix = IntArray(n) { 1 }
        val suffix = IntArray(n) { 1 }
        val answers = IntArray(n) { 1 }

        for (i in 1 until n) {
            val prevIndex = i - 1
            prefix[i] = prefix[prevIndex] * nums[prevIndex]
        }

        // minus 2 because we are also skipping the last index
        for (i in n - 2 downTo 0) {
            val nextIndex = i + 1
            suffix[i] = suffix[nextIndex] * nums[nextIndex]
        }


        for (i in 0 until n) {
            answers[i] = prefix[i] * suffix[i]
        }

        return answers
    }
}
