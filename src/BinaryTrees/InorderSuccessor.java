/*
package BinaryTrees;

import javax.swing.tree.TreeNode;
import java.util.Stack;

*/
/**
 * Created by AMAN on 7/25/2016.
 *//*

public class InorderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root ==null){
            return null;
        }

        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        TreeNode successor = null;
        nodeStack.push(root);
        boolean findNext = false;
        while (!nodeStack.isEmpty()){

            while (root.left != null){
                nodeStack.push(root.left);
                root=root.left;

            }


            root = nodeStack.pop();
            if(root.val == p.val){
                findNext = true;
            }
            if(root.val != p.val && findNext && root !=null){
                successor =root;
                break;
            }
            if(root.right != null){
                root =root.right;
                nodeStack.push(root);
            }


        }
        return successor;


    }

    public TreeNode createTree(TreeNode root){
        root.left = new TreeNode(1);
       root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        return root;
    }

    public static void main(String[] args){
        InorderSuccessor successor = new InorderSuccessor();
        TreeNode root = successor.createTree(new TreeNode(2));
        System.out.print(successor.inorderSuccessor(root,new TreeNode(2)).val);
    }
}
*/
