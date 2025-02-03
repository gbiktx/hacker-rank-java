package medium

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 *
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 *
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 *
 * Your solution must use only constant extra space.
 *
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
 */
class TwoSum2 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for (i in numbers.indices) {
            val num = numbers[i]
            map[target - num] = i
        }

        for (i in numbers.indices) {
            val num = numbers[i]
            val j = map[num]
            if (j != null && j != i) {
                return intArrayOf(i + 1, j + 1)
            }
        }
        return intArrayOf()

    }
}
