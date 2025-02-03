package medium

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 *
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 *
 * https://leetcode.com/problems/valid-sudoku
 */
class ValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array<HashMap<Int, Int>>(9) { hashMapOf() }
        val columns = Array<HashMap<Int, Int>>(9) { hashMapOf() }
        val boxes = Array<HashMap<Int, Int>>(9) { hashMapOf() }

        var boxIndex = 0
        for (i in board.indices) {
            val row = board[i]
            val rowMap = rows[i]
            var boxCount = 0
            boxIndex = if (i <= 2) {
                0
            } else if (i <= 5) {
                3
            } else {
                6
            }
            for (j in row.indices) {
                val char = row[j]
                val columnMap = columns[j]
                if (boxCount > 2) {
                    boxCount = 0
                    boxIndex += 1
                }
                val boxMap = boxes[boxIndex]
                if (char != '.') {
                    val num = char.code
                    rowMap[num] = rowMap.getOrDefault(num, 0) + 1
                    columnMap[num] = columnMap.getOrDefault(num, 0) + 1
                    boxMap[num] = boxMap.getOrDefault(num, 0) + 1

                    val rowValue = rowMap[num] ?: 0
                    val columnValue = columnMap[num] ?: 0
                    val boxValue = boxMap[num] ?: 0

                    if (rowValue > 1 || columnValue > 1 || boxValue > 1) {
                        return false
                    }
                }

                boxCount++
            }
        }

        return true
    }
}
