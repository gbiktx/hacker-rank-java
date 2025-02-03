package medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidSudokuTest {
    @Test
    fun case0() {
        val test = ValidSudoku()
        val input = arrayOf(
            charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )
        val actual = test.isValidSudoku(input)

        assertEquals(true, actual)
    }

    @Test
    fun case1() {
        val test = ValidSudoku()
        val input = arrayOf(
            charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )
        val actual = test.isValidSudoku(input)

        assertEquals(false, actual)
    }

    @Test
    fun case2() {
        val test = ValidSudoku()
        val input = arrayOf(
            charArrayOf('.', '.', '4', '.', '.', '.', '6', '3', '.'),
            charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
            charArrayOf('5', '.', '.', '.', '.', '.', '.', '9', '.'),
            charArrayOf('.', '.', '.', '5', '6', '.', '.', '.', '.'),
            charArrayOf('4', '.', '3', '.', '.', '.', '.', '.', '1'),
            charArrayOf('.', '.', '.', '7', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '5', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.')
        )
        val actual = test.isValidSudoku(input)

        assertEquals(false, actual)
    }
}