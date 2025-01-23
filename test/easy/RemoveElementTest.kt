package easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RemoveElementTest {

  @Test
  fun case1() {
   val test = RemoveElement()
   val input = intArrayOf()
   val expect = intArrayOf()
   val k = test.removeElement(input, 1)
   val actual = input.take(k).toIntArray()

   assertEquals(0, k)
   assertArrayEquals(expect, actual)
  }

 @Test
 fun case2() {
  val test = RemoveElement()
  val input = intArrayOf(3,2,2,3)
  val expect = intArrayOf(2,2)
  val k = test.removeElement(input, 3)
  println(input.joinToString(","))
  val actual = input.take(k).toIntArray()
  println(actual.joinToString(","))

  assertEquals(2, k)
  assertArrayEquals(expect, actual)
 }

 @Test
 fun case3() {
  val test = RemoveElement()
  val input = intArrayOf(0,1,2,2,3,0,4,2)
  val expect = intArrayOf(0,1,4,0,3)
  val k = test.removeElement(input, 2)
  val actual = input.take(k).toIntArray()
  println(actual.joinToString(","))

  assertEquals(5, k)
  assertArrayEquals(expect, actual)
 }
 }