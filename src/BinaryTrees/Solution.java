package BinaryTrees;

import com.sun.scenario.effect.impl.prism.PrImage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AMAN on 7/10/2016.
 */
class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder("");
        List<String> pathStr = new ArrayList<String>();
        List l = paths(root,stringBuilder,pathStr);
        return l;


    }

    private List<String> paths(TreeNode root,StringBuilder str, List<String> pathString){
        if(root==null){
            return pathString;
        }
        if(root.left == null && root.right == null){
            str.append(root.val);
            pathString.add(str.toString());
            return pathString;
        }
        str.append(root.val);
        str.append("->");
        paths(root.left,new StringBuilder(str),pathString);
        paths(root.right, new StringBuilder(str),pathString);
        return pathString;
    }

    public static void main(String [] args){
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
    //    root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        s.binaryTreePaths(root);
    }
}
