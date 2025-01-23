package easy

class TwoSum {
//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        var i = 0
//        var j = 1
//        while (j != nums.size) {
//            if (nums[i] + nums[j] == target) {
//                return intArrayOf(i, j)
//            }
//            j++
//            if (j == nums.size) {
//                i++
//                j = i + 1
//            }
//        }
//
//        return intArrayOf()
//    }

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