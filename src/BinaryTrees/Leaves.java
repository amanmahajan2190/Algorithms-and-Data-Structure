package BinaryTrees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by AMAN on 8/3/2016.
 */
public class Leaves {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root ==null){
            return null;

        }
        Set<TreeNode> leavesSet = new HashSet<TreeNode>();


        while(!isLeaf(leavesSet,root)){
            result.add(leavesFinder(new ArrayList<Integer>(),leavesSet,root));

        }
        if(isLeaf(leavesSet,root)) {
            List<Integer> rootList = new ArrayList<Integer>();
            rootList.add(root.val);
            result.add(rootList);

        }

        return result;






    }

    public List<Integer> leavesFinder(List<Integer> leaves,Set<TreeNode> leavesSet, TreeNode root){
        if(root == null || leavesSet.contains(root)){
            return leaves;
        }
        if(isLeaf(leavesSet,root)){
            leaves.add(root.val);
            leavesSet.add(root);
        }else{
            leavesFinder(leaves,leavesSet,root.left);
            leavesFinder(leaves,leavesSet,root.right);
        }
        return leaves;
    }

    public boolean isLeaf( Set<TreeNode> leavesSet,TreeNode root){
        if((root.left==null||leavesSet.contains(root.left)) && (root.right == null||leavesSet.contains(root.right))){
            return true;
        }
        return false;
    }



    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
       /* root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);*/
        new Leaves().findLeaves(root);
    }
}
