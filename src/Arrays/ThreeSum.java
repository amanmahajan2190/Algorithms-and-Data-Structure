package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by AMAN on 7/7/2016.
 */
public class ThreeSum {
    List<List<Integer>> integerList = new ArrayList<List<Integer>>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(i>0){
                if(nums[i] == nums[i-1]){
                    continue;
                }
            }


            for(int j=i+1;j<nums.length;j++) {
                int one = nums[i];
                int two = nums[j];
                int target = -(one +two);

                int index = BinarySearch(nums,j+1,nums.length-1,target);
                if(index != -1){
                    List<Integer> singleList = new ArrayList<Integer>();
                    singleList.add(one);
                    singleList.add(two);
                    singleList.add(nums[index]);
                    integerList.add(singleList);
                }
                while (j<nums.length-1){
                    if(nums[j] == nums[j+1]){
                        j++;
                    }else{
                        break;
                    }
                }

            }

        }



        return integerList;

    }

    private int BinarySearch(int[] a, int low , int high, int target){
        if(low<=high){
            int mid = low + (high-low)/2;
            if(a[mid] == target){
                return mid;
            }
            if(a[mid]<target){
                return BinarySearch(a, low+1,high,target);
            }else{
                return BinarySearch(a,low,high-1,target);
            }

        }
        return -1;
    }

    public static void main(String[] args){
        ThreeSum sum = new ThreeSum();
        int[] a = new int[]{-1,0,1,2,-1,-4};
        sum.threeSum(a);
    }
}
