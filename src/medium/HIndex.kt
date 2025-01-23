package medium

import kotlin.math.ceil
import kotlin.math.round

/**
 * Given an array of integers citations where citations[i] is the number
 * of citations a researcher received for their ith paper, return the researcher's h-index.
 *
 * According to the definition of h-index on Wikipedia: The h-index is defined as
 * the maximum value of h such that the given researcher
 * has published at least h papers that have each been cited at least h times.
 *
 * https://leetcode.com/problems/h-index?envType=study-plan-v2&envId=top-interview-150
 */
class HIndex {
    fun hIndex(citations: IntArray): Int {
        citations.sort()
        val size = citations.size
        for (i in 0 until size) {
            if (citations[i] >= size - i) return size - i
        }

        return 0
    }
}