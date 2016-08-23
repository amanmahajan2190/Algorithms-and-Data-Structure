package BinarySearchTrees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by AMAN on 7/29/2016.
 */
/**Given nums = [5, 2, 6, 1]
* Return the array [2, 1, 1, 0].*/


public class CountSmallerNumbers {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> returnList = new ArrayList<Integer>();
        returnList.add(0);
        int length = nums.length;
        TreeNode root = new TreeNode(nums[length-1]);
        for(int i=nums.length-2;i>=0;i--){
            int res = createTree(root, nums[i]);
            returnList.add(res);

        }
        Collections.reverse(returnList);
        return  returnList;
    }


    public int createTree(TreeNode root, int value){
        TreeNode node = new TreeNode(value);
        int count =0;
        while (true){
            if(root.val<value){
                count = count + root.count;
                if(root.right == null){
                    root.right = node;
                    break;
                }else {
                    root = root.right;

                }

            }else{
                root.count++;
                if(root.left == null){
                    root.left =node;
                    break;

                }else{
                    root = root.left;
                }

            }
        }
        return count;


    }
}
