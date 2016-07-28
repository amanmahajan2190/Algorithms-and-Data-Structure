package BinarySearch;

/**
 * Created by AMAN on 7/4/2016.
 */
public class Solution {
    public boolean search(int[] nums, int target) {
        return SearchRotated(target,0, nums.length-1,nums);
    }

    private boolean SearchRotated(int K , int low , int high ,int[] arr){
        if(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid] == K){
                return true;
            }

            if(arr[low]<= arr[mid]){
                if(K>=arr[low] && K < arr[mid]){
                    return SearchRotated(K , low, mid-1, arr);
                }
                return SearchRotated(K,mid+1, high, arr);
            }else{
                if(K>arr[mid] && K<=arr[high]){
                    return  SearchRotated(K,mid+1, high, arr);
                }
                return  SearchRotated(K , low, mid-1, arr);
            }

        }
        return false;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.print(s.search(new int[]{3,4,5,1,2},2));
    }
}
