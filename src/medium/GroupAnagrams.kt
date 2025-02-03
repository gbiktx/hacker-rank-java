package medium

/**
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 *
 * https://leetcode.com/problems/group-anagrams
 */
class GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val maps = hashMapOf<String, MutableList<String>>()

        for (string in strs) {
            val sorted = string.toCharArray().sorted().joinToString("")
            if (!maps.contains(sorted)) {
               maps[sorted] = mutableListOf()
            }
            maps[sorted]?.add(string)
        }

        return maps.values.toList()
    }
}