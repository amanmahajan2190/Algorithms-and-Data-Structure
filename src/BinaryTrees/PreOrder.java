package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by AMAN on 5/25/2016.
 */
public class PreOrder {
    List<Integer> integerList = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return integerList;
        doPreorder(root);
        return integerList;



    }

    public void doPreorder(TreeNode root){
        Stack<TreeNode> integerStack = new Stack<TreeNode>();
        while(true){
            while(root != null){
                integerList.add(root.val);
                integerStack.push(root);
                root =root.left;
            }

            if(integerStack.isEmpty()){
                return;
            }

            TreeNode temp = integerStack.pop();
            if(temp!=null){
                root = temp.right;
            }
        }
    }
}
