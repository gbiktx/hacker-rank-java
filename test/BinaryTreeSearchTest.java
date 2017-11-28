import datatypes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeSearchTest {

    @Test
    public void checkBST() throws Exception {
        Node node1 = new Node(1, null, null);
        Node node3 = new Node(3, null, null);
        Node node2 = new Node(2, node1, node3);

        Node node5 = new Node(1, null, null);
        Node node7 = new Node(7, null, null);
        Node node6 = new Node(6, node5, node7);

        Node node4 = new Node(4, node2, node6);

        BinaryTreeSearch bst = new BinaryTreeSearch();

        assertEquals(true, bst.checkBST(node4));
    }

}