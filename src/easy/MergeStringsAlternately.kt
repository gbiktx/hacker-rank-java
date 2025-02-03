package easy

/**
 * You are given two strings word1 and word2.
 * Merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 * https://leetcode.com/problems/merge-strings-alternately?envType=study-plan-v2&envId=leetcode-75
 */
class MergeStringsAlternately {
    fun mergeAlternately(word1: String, word2: String): String {
        val newWord = StringBuilder()
        var n = word1.length
        if (n < word2.length) {
            n = word2.length
        }
        for (i in 0 until n) {
            if (i < word1.length) {
                newWord.append(word1[i])
            }
            if (i < word2.length) {
                newWord.append(word2[i])
            }
        }

        return newWord.toString()
    }
}
