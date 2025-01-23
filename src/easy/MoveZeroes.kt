package easy

class MoveZeroes {
//    fun solution(nums: IntArray) {
//        val size = nums.size - 1
//        for (i: Int in size downTo 0) {
//            val n = nums[i]
//            if (n == 0) {
//                for (j: Int in i + 1 .. size) {
//                    nums[j - 1] = nums[j]
//                    nums[j] = 0
//                }
//            }
//        }
//    }

    fun solution(nums: IntArray) {
        var nonZeroIndex = 0
        for (i: Int in nums.indices) {
            val n = nums[i]
            if (n != 0) {
                if (nonZeroIndex == i) {
                    nonZeroIndex++
                    continue
                }
                nums[nonZeroIndex] = n
                nums[i] = 0
                nonZeroIndex++
            }
        }
    }
}