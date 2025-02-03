package easy

import java.util.Stack

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * https://leetcode.com/problems/valid-parentheses
 */
class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (c in s) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c)
            } else {
                if (stack.isEmpty()) {
                    return false
                }
               val opening = stack.pop()
                if (c == ']' && opening != '[') {
                    return false
                }
                if (c == ')' && opening != '(') {
                    return false
                }
                if (c == '}' && opening != '{') {
                    return false
                }
            }
        }

        return stack.isEmpty()
    }
}
