package Arrays;

/**
 * Created by AMAN on 5/9/2016.
 */

//Smallest subarray with sum greater than a given value

public class SmallestSubarray {
    int min_length;
    int[] arr;

    SmallestSubarray(int[] values){
        this.arr =values;
        min_length =arr.length;
    }

    public void findMinSubArray(int x){
        int start =0;
        int end =0;
        int count =0;
        while(end < arr.length){
            if(count<x){
                count += arr[end];
            }else{
                while(start<=end && count>=x){
                    count -= arr[start];
                    if(end-start<min_length){
                        min_length =end-start;
                    }
                    start++;
                }

            }end++;
        }
       // min_length = end-start;
        System.out.println("Min length:" + min_length);


    }

    public static void main(String[] args){
        int[] arr = new int[]{1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        SmallestSubarray sub = new SmallestSubarray(arr);
        sub.findMinSubArray(280);
    }

}
