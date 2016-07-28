package DynamicProgramming;

import java.util.HashSet;

/**
 * Created by AMAN on 7/14/2016.
 */
public class HouseRobber {

    public int rob(int[] nums) {
        int length = nums.length;
        if(length<=0){
            return 0;
        }
        if(length==1){
            return nums[0];
        }
        int[] arr = new int[length];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[1],nums[0]);
        for(int i=2;i<length;i++){
            arr[i] = Math.max(arr[i-1],(arr[i-2]+nums[i]));
        }
        return arr[length-1];

    }
    public static void main(String[] args){
        HouseRobber robber = new HouseRobber();
        int[] a = new int[]{2,1,1,2};
        robber.rob(a);
    }
}
