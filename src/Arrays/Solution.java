package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AMAN on 6/28/2016.
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> duplicateMap = new HashMap<Integer,Integer>();
        int length = nums.length-1;
        for(int i=0;i<=length;i++){
            if(!duplicateMap.containsKey(nums[i])){
                duplicateMap.put(nums[i],i);
            }else{
                int num = duplicateMap.get(nums[i]);
                if((num-i)<=k){
                    return true;
                }else{
                    duplicateMap.put(nums[i],i);
                }
            }
        }
        return false;

    }

    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums = new int[]{1,2,1};
        s.containsNearbyDuplicate(nums,0);
    }
}
