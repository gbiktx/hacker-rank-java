package easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MajorityElementTest {

  @Test
  fun case0() {
   val test = MajorityElement()
   val input = intArrayOf(3, 2 ,3)
   val k = test.majorityElement(input)

   assertEquals(3, k)
  }

 @Test
 fun case1() {
  val test = MajorityElement()
  val input = intArrayOf(2,2,1,1,1,2,2)
  val k = test.majorityElement(input)

  assertEquals(2, k)
 }

 @Test
 fun case2() {
  val test = MajorityElement()
  val input = intArrayOf(2)
  val k = test.majorityElement(input)

  assertEquals(2, k)
 }

 @Test
 fun case3() {
  val test = MajorityElement()
  val input = intArrayOf(6, 5, 5)
  val k = test.majorityElement(input)

  assertEquals(5, k)
 }
 }