package easy

class RemoveDuplicatedSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 0
        val visited = hashMapOf<Int,Boolean>()
        for (i in nums.indices) {
            val num = nums[i]
            if (visited[num] != true) {
                nums[k] = num
                k++
            }
            visited[num] = true
        }

        return k
    }
}