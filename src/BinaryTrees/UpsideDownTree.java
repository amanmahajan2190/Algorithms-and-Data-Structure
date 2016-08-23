package BinaryTrees;

import java.util.Stack;

/**
 * Created by AMAN on 8/5/2016.
 */
public class UpsideDownTree {
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        traverseBT(root,nodeStack);

        while (!nodeStack.isEmpty()){
            if(nodeStack.peek() == null){
                nodeStack.pop();
            }else{
                break;
            }
        }
        TreeNode r = nodeStack.pop();
        r = createBT(r,nodeStack);
        return r;



    }

    public void traverseBT(TreeNode root, Stack<TreeNode> nodeStack){
        if(root == null){
            return;
        }
        nodeStack.push(root);
        traverseBT(root.right,nodeStack);
        traverseBT(root.left,nodeStack);
    }

    public TreeNode createBT(TreeNode root, Stack<TreeNode> nodeStack){
        if(root!=null && !nodeStack.isEmpty()){
            root.left = nodeStack.pop();
            root.right = nodeStack.pop();

            createBT(root.left,nodeStack);
            createBT(root.right,nodeStack);

        }
        return root;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        new UpsideDownTree().upsideDownBinaryTree(root);
    }

}
