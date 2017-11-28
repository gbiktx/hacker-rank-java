import datatypes.Node;

import java.util.ArrayList;

/**
 * For the purposes of this challenge, we define a binary search tree
 * to be a binary tree with the following ordering properties:
 * The value of every node in a node's left subtree is less than the data value of that node.
 * The value of every node in a node's right subtree is greater than the data value of that node.
 *
 * Given the root node of a binary tree, can you determine if it's also a binary search tree?
 * Complete the function in your editor below, which has parameter: a pointer to the root of a binary tree.
 * It must return a boolean denoting whether or not the binary tree is a binary search tree.
 * You may have to write one or more helper functions to complete this challenge.

 Note: We do not consider a binary tree to be a binary search tree if it contains duplicate values.
 */
public class BinaryTreeSearch {

    public static void main(String[] args) {
        Node node1 = new Node(1, null, null);
        Node node3 = new Node(3, null, null);
        Node node2 = new Node(2, node1, node3);

        Node node5 = new Node(5, null, null);
        Node node7 = new Node(7, null, null);
        Node node6 = new Node(6, node5, node7);

        Node node4 = new Node(4, node2, node6);

        BinaryTreeSearch bst = new BinaryTreeSearch();

        System.out.print(bst.checkBST(node4));
    }

    boolean checkBST(Node root) {
        ArrayList<Integer> values = new ArrayList<>();
        inOrder(root, values);

        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) <= values.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    void inOrder(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }
        inOrder(node.left, list);
        list.add(node.data);
        inOrder(node.right, list);
    }
}
