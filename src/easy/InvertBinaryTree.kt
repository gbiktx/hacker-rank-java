package easy

import datatypes.TreeNode

/**
 * Given the root of a binary tree, invert the tree, and return its root.
 *
 * https://leetcode.com/problems/invert-binary-tree
 */
class InvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return null
        invert(root)
        return root
    }

    private fun invert(node: TreeNode?) {
        if (node == null || node.left == null && node.right == null) {
            return
        }
        val temp = node.left
        node.left = node.right
        node.right = temp
        invert(node.left)
        invert(node.right)
    }
}