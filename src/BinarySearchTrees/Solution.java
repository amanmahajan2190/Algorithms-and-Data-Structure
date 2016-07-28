package BinarySearchTrees;

/**
 * Created by AMAN on 7/6/2016.
 */
 class TreeNode {
         int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
}

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree( nums , 0 , nums.length-1);
    }

    public TreeNode createTree(int[] nums , int low , int high){
        if(low<=high){
            int mid =  (low+high)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = createTree(nums, low, mid-1);
            root.right = createTree(nums,mid+1, high);
            return root;

        }
        return null;
    }

    public static void main(String[] args){
        int[] arr = new int[]{0};
        Solution s = new Solution();
        TreeNode node =s.sortedArrayToBST(arr);
        System.out.print(node.val);
    }


}