package easy

/**
 * Given two strings s and t, return true if t is an
 * anagram of s, and false otherwise.
 *
 *  https://leetcode.com/problems/valid-anagram
 */
class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val smap = hashMapOf<Char, Int>()
        val tmap = hashMapOf<Char, Int>()
        for (i in s.indices) {
            val cs = s[i]
            val ct = t[i]
            smap[cs] = (smap[cs] ?: 0) + 1
            tmap[ct] = (tmap[ct] ?: 0) + 1
        }
        return smap == tmap
    }
}