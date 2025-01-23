package easy

/**
 * given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 *
 */

class SmallestInt {
    fun solution(input: IntArray): Int {
        var num = 1
        var end = 0
        val map = hashMapOf<Int, Boolean>()
        input.forEach { n ->
            map[n] = true
            if (n > end) {
                end = n
            }
        }
        for (i in 1 .. end) {
            if(map[i] == true) {
                num += 1
            } else {
                return num
            }
        }

        return num
    }
}