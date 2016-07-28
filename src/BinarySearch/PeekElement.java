package BinarySearch;

/**
 * Created by AMAN on 7/3/2016.
 */
public class PeekElement {
    public int findPeakElement(int[] nums) {
        int peekIndex =-1;
        peekIndex = BinarySearch(nums,0, nums.length-1);
        return peekIndex;



    }

    public int BinarySearch(int[] nums, int low , int high){
        if(low<high-1){
            int mid = low + (high-low)/2;
            if(nums[mid]>nums[mid-1] && nums[mid+1]<nums[mid]){
                return mid;
            }else if(nums[mid]>nums[mid-1] && nums[mid]<nums[mid+1]){
                return BinarySearch(nums,mid+1,high);
            }else return BinarySearch(nums,low,mid-1);
        }
        if(nums[low]>=nums[high]){
            return low;
        }else return high;
    }


    public static void main(String[] args){
        PeekElement pe = new PeekElement();
        pe.findPeakElement(new int[]{3,4,3,2,1});
    }
}
