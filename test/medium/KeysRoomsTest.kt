package medium

import easy.MergeArrays
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class KeysRoomsTest {

    @Test
    fun case0() {
        val test = KeysRooms()
        val input = listOf(listOf(1), listOf(2), listOf(3), listOf())
        val actual = test.canVisitAllRooms(input)

        assertEquals(true, actual)
    }

    @Test
    fun case1() {
        val test = KeysRooms()
        val input = listOf(listOf(1, 3), listOf(3, 0, 1), listOf(2), listOf(0))
        val actual = test.canVisitAllRooms(input)

        assertEquals(false, actual)
    }

    @Test
    fun case2() {
        val test = KeysRooms()
        val input = listOf(listOf(2, 3), listOf(3, 0), listOf(2), listOf(0))
        val actual = test.canVisitAllRooms(input)

        assertEquals(false, actual)
    }
}