package easy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class MergedSortedArrayTest {

  @Test
  fun case1() {
   val test = MergedSortedArray()
   val nums1 = intArrayOf(1,2,3,0,0,0)
    test.merge(nums1, 3, intArrayOf(2,5,6), 3)

   assertArrayEquals(intArrayOf(1,2,2,3,5,6), nums1)
  }

  @Test
  fun case2() {
   val test = MergedSortedArray();
   var nums1 = intArrayOf(1)
   test.merge(nums1, 1, intArrayOf(), 0)

   assertArrayEquals(intArrayOf(1), nums1)
  }

  @Test
  fun case3() {
   val test = MergedSortedArray()
   val nums1 = intArrayOf(0)
   test.merge(nums1, 0, intArrayOf(1), 1)

   assertArrayEquals(intArrayOf(1), nums1)
  }

  @Test
  fun case4() {
   val test = MergedSortedArray()
   val nums1 = intArrayOf(4,5,6,0,0,0)
   test.merge(nums1, 3, intArrayOf(1,2,3), 3)

   assertArrayEquals(intArrayOf(1,2,3,4,5,6), nums1)
  }

  @Test
  fun case5() {
   val test = MergedSortedArray()
   val nums1 = intArrayOf(-1,0,0,3,3,3,0,0,0)
   test.merge(nums1, 6, intArrayOf(1,2,2), 3)

   assertArrayEquals(intArrayOf(-1,0,0,1,2,2,3,3,3), nums1)
  }

  @Test
  fun case6() {
   val test = MergedSortedArray()
   val nums1 = intArrayOf(1,0)
   test.merge(nums1, 1, intArrayOf(2), 1)

   assertArrayEquals(intArrayOf(1,2), nums1)
  }

  @Test
  fun case7() {
   val test = MergedSortedArray()
   val nums1 = intArrayOf(0,0,0,0,0)
   test.merge(nums1, 0, intArrayOf(1,2,3,4,5), 5)

   assertArrayEquals(intArrayOf(1,2,3,4,5), nums1)
  }

  @Test
  fun case8() {
   val test = MergedSortedArray()
   val nums1 = intArrayOf(-1,3,0,0,0,0,0)
   test.merge(nums1, 2, intArrayOf(0,0,1,2,3), 5)

   assertArrayEquals(intArrayOf(-1,0,0,1,2,3,3), nums1)
  }
}