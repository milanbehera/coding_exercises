package practice.coding.trees;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinaryTree {

    Node root;

    public void add(int value) {
        root = addRecursive(root,value);
    }

    public boolean containsNode(int value) {
        return recursiveContainsNode(root, value);
    }

    private boolean recursiveContainsNode(Node current, int value) {
        if(current == null) {
            return false;
        }
        if(value == current.value) {
            return true;
        }
        return value < current.value ? recursiveContainsNode(current.left, value):recursiveContainsNode(current.right, value);
    }

    private Node addRecursive(Node current, int value) {
        if(current == null) {
            return new Node(value);
        }
        if(value < current.value) {
            addRecursive(current.left, value);
        } else if(value > current.value) {
            addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

    private void insertNode(int val) {
        if(root == null) {
            Node n = new Node(val);
            this.root = n;
        } else {
            Node currentNode = this.root;
            while (true) {
            if (val < currentNode.value) {
                    if (currentNode.left == null) {
                        currentNode.left = new Node(val);
                        return;
                    } else {
                        currentNode = currentNode.left;
                    }
            } else {
                if (val > currentNode.value) {
                        if (currentNode.right == null) {
                            currentNode.right = new Node(val);
                            return;
                        } else {
                            currentNode = currentNode.right;
                        }
                }
            }
        }
        }
    }

    private List<Integer> inOrderTraversal() {
        BinaryTree bt = new BinaryTree();
        bt.insertNode(9);
        bt.insertNode(4);
        bt.insertNode(6);
        bt.insertNode(20);
        bt.insertNode(170);
        bt.insertNode(15);
        bt.insertNode(1);

        List<Integer> results = new ArrayList<>();
        if(bt.root != null)
            helpTraverse(bt.root,results);

        return results;

    }

    private void helpTraverse(Node root, List<Integer> results) {
        if(root == null)
                return;
                helpTraverse(root.left,results);
            results.add(root.value);
                helpTraverse(root.right, results);
    }

    @Test
    public void testInorderTraversal() {
        List<Integer> traversal = inOrderTraversal();
        for(Integer nodeVal : traversal) {
            System.out.println(nodeVal);
        }
    }

    @Test
    public void check_if_tree_contains_nodes() {
        BinaryTree tree = createBinaryTree();
        assertTrue(tree.containsNode(6));
        assertFalse(tree.containsNode(2));
    }
}
