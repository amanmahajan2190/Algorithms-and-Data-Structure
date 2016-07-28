package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by AMAN on 11/2/2015.
 */
public class Twosum {

    Set<Integer> numberSet = new HashSet<Integer>();

    public void getPair(int[] arr,int sum){
        for(int i=0;i< arr.length;i++){
            numberSet.add(arr[i]);
        }
        for (int i=0; i<arr.length;i++){
            if(numberSet.contains(sum-arr[i])) {
                System.out.print("Pairs are : " +  arr[i] + " and "  + (sum - arr[i]));
                break;
            }

        }
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numberMap = new HashMap<Integer,Integer>();
        for(int i=0;i< nums.length;i++){
            numberMap.put(nums[i],i);
        }
        int[] result = new int[2];

        for (int i=0; i<nums.length;i++){
            int other = target-nums[i];
            if(numberMap.containsKey(other) &&
                    (numberMap.get(other) !=i)) {
                result[0] = i;
                result[1] = numberMap.get(target-nums[i]);
                break;
            }
        }
            return result;
    }
    public static void main(String[] args){
        int[] arr = {3,2,4};
        int requiredSum = 6;
        Twosum sum = new Twosum();
        sum.twoSum(arr,6);
        sum.getPair(arr, requiredSum);


    }
}
