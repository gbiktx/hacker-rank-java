package easy

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * https://leetcode.com/problems/valid-palindrome
 */
class ValidPalindrome {
    // language assist
//    fun isPalindrome(s: String): Boolean {
//        val word = s.filter { c -> c.isLetter() || c.isDigit() }.lowercase()
//        return word == word.reversed()
//    }

    fun isPalindrome(s: String): Boolean {
        if (s.isEmpty()) return false
        val newWord = StringBuilder()
        for (c in s) {
            if (c.isLetterOrDigit()) {
                newWord.append(c.lowercase())
            }
        }
        var start = 0
        var end = newWord.length - 1
        while (start <= end) {
            if (newWord[start] != newWord[end]) {
                return false
            }
            start++
            end--
        }
        return true
    }
}