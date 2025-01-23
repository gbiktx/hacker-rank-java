package easy

/**
 * When merging two sorted arrays, the key is to take advantage of their sorted nature.
 * Start comparing elements from the end of both arrays and place the larger one at the last
 * position of the first array (nums1).
 * This avoids unnecessary sorting and efficiently fills nums1 in place.
 *
 * https://leetcode.com/problems/merge-sorted-array/
 */
class MergedSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        if (n == 0) {
            return
        }
        val nums3 = IntArray(m){0}
        for (i in 0 until m) {
            nums3[i] = nums1[i]
            nums1[i] = 0
        }
        var i1 = 0
        var i2 = 0
        var i3 = 0

        while (i3 < m || i2 < n) {
            if (i3 >= m) {
                nums1[i1] = nums2[i2]
                i2++
                i1++
               continue
            }
            if (i2 >= n) {
                nums1[i1] = nums3[i3]
                i3++
                i1++
                continue
            }
             val n1 = nums3[i3]
             val n2 = nums2[i2]
            if (n1 < n2) {
                nums1[i1] = n1
                i3++
            } else {
                nums1[i1] = n2
                i2++
            }
            i1++
        }
    }
}