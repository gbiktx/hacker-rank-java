package medium

class Rotate {

    fun solution(nums: IntArray, k: Int): Unit {
        for (t: Int in 0 until k) {
            val copy = nums.copyOf()

            nums[0] = copy[copy.size - 1]
            for (i: Int in 1 until copy.size) {
                nums[i] = copy[i - 1]
            }
        }
    }
}