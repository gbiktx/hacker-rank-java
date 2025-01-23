package easy

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var last = 0
        for (i in nums.indices) {
           if (nums[i] != `val`) {
               nums[last] = nums[i]
               last++
           }
        }

        return last
    }
}