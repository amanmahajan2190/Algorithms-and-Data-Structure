package Arrays;

import java.util.TreeSet;

/**
 * Created by AMAN on 7/28/2016.
 */
public class ContainsDuplicates3 {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k<=0 || t<=0||nums.length<=0){
            return false;
        }

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        int length=nums.length;
        for(int i=0;i<length;i++){
            int val = nums[i];
            if(treeSet.ceiling(val)!=null && (treeSet.ceiling(val)-val)<=t){
                return true;
            }
            if(treeSet.floor(val)!=null && (val -treeSet.floor(val))<=t){
                return true;
            }
            treeSet.add(val);
            if(i>=k){
                treeSet.remove(nums[i-k]);
            }

        }
        return false;
    }
}
