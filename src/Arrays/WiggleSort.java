package Arrays;

/**
 * Created by AMAN on 7/22/2016.
 */

/**For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].
 * Just check if i is even then num[i]>= num[i-1] and if i is odd num[i] <= num[i-1]*/
public class WiggleSort {

    public void wiggleSort(int[] nums) {
        if(nums.length<=0){
            return;
        }
        for(int i=1 ; i<nums.length;i++){
            if(i%2==0){
                if(nums[i]>=nums[i-1]){
                    swap(nums,i,i-1);
                }
            }else{
                if(nums[i]<=nums[i-1]){
                    swap(nums,i,i-1);
                }
            }
        }
    }


    public void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        int[] a = new int[]{1,2,2,1,2,1,1,1,1,2,2,2};
        WiggleSort s = new WiggleSort();
        s.wiggleSort(a);
    }


}

