package Arrays;

/**
 * Created by AMAN on 5/11/2016.
 */
/*
Input:  arr[] = {10, 12, 11};
Output: Length of the longest contiguous subarray is 3*/


public class ContiguousSubarray {
    public int[] arr;
    public int max_length=0;
    ContiguousSubarray(int[] values){
        this.arr = values;
    }

    public void findMaxLength(){

        for(int i=0;i<arr.length;i++){
            int min =arr[i];
            int max = arr[i];
            for(int j=i+1; j<arr.length;j++){
                min = Math.min(min,arr[j]);
                max = Math.max(max,arr[j]);

                if((j-i) == max-min){
                max_length = Math.max((max-min+1),max_length);
                }
            }

        }
    }
}
