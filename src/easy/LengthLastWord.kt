package easy

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 */
class LengthLastWord {
    fun lengthOfLastWord(s: String): Int {
        var word = ""
        val n = s.length - 1

        for (i in n downTo 0) {
            if (s[i] == ' ' && word.isNotBlank()) {
                return word.length
            } else if (s[i] != ' ') {
                word += s[i]
            }
        }

        return word.length
    }
}