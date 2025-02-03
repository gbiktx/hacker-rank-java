package easy

import datatypes.TreeNode
import kotlin.math.max

/**
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along
 * the longest path from the root node down to the farthest leaf node.
 *
 * https://leetcode.com/problems/maximum-depth-of-binary-tree
 */
class MaxDepthBTree {

    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0

        val left = checkDepth(root.left, 1)
        val right = checkDepth(root.right, 1)

        return max(left, right)
    }

    private fun checkDepth(node: TreeNode?, level: Int): Int {
        if (node == null) {
            return level
        }

        val left = checkDepth(node.left, level + 1)
        val right = checkDepth(node.right, level + 1)

        return max(left, right)
    }
}
