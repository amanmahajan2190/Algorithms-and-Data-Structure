package BinarySearchTrees;

import java.util.Stack;

/**
 * Created by AMAN on 7/13/2016.
 */


public class BSTIterator {
    Stack<TreeNode> nodeStack = new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
        pushLeftElement(root);

    }
    public boolean hasNext() {
        return false;

    }

    private void pushLeftElement(TreeNode node){
        while (node !=null){
            nodeStack.push(node);
            node = node.left;

        }
    }

    public int next() {
        TreeNode temp = nodeStack.pop();
        pushLeftElement(temp.right);
        return temp.val;


    }

}
