package easy

class ContainsDuplicate {

    fun solution(nums: IntArray): Boolean {
        val map = hashMapOf<Int, Boolean>()

        for (n: Int in nums) {
            if (map[n] == true) {
                return true
            }
            map[n] = true
        }
        return false
    }
}