package easy

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * https://leetcode.com/problems/roman-to-integer?envType=study-plan-v2&envId=top-interview-150
 */
class RomanToInteger {
    val map = hashMapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)

    fun romanToInt(s: String): Int {
        var total = 0
        for (i in s.indices) {
            val c = s[i]
            val nextC = s.getOrNull(i + 1)
            total += conditions(c, nextC)
        }

        return total
    }

    fun conditions(c: Char, nextChar: Char?): Int {
        return if (c == 'I') {
            if (nextChar == 'V' || nextChar == 'X') -1 else 1
        } else if (c == 'X') {
            if (nextChar == 'L' || nextChar == 'C') -10 else 10
        } else if (c == 'C') {
            if (nextChar == 'D' || nextChar == 'M') -100 else 100
        } else {
            map.getValue(c)
        }
    }
}