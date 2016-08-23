package Arrays;

/**
 * Created by AMAN on 8/1/2016.
 */
public class MinSubArraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        if(len<=0){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int sum =0;
        int j=0;

        for(int i=0;i<len;i++){
            sum =sum + nums[i];


            while(sum>=s){
                min = Math.min(min,i-j);
                sum =sum-nums[j];
                j++;
            }

        }

        return min;

    }

    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5};
        new MinSubArraySum().minSubArrayLen(11,a);
    }
}
