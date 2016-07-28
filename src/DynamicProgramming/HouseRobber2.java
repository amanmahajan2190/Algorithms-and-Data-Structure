package DynamicProgramming;

/**
 * Created by AMAN on 7/14/2016.
 */
public class HouseRobber2 {
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
        if(nums[0]>nums[1]){
            for(int i=2;i<length-1;i++){
                arr[i] = Math.max(arr[i-1],(arr[i-2]+nums[i]));
            }
        }else{
            for(int i=2;i<length;i++){
                arr[i] = Math.max(arr[i-1],(arr[i-2]+nums[i]));
            }

        }
        return arr[length-1];
}}
