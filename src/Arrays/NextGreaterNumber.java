package Arrays;


/*Given an array of integers, find the next largest permutation when the permutations are dictionary ordered.
[1,0,3,2] => [1,2,0,3]*/

/**
Solution
Start from end
Find the element such that a[i]<a[i+1]
Swap i with arr.length -1
Sort i+1 to end*/

import java.util.Arrays;

/**
 * Created by AMAN on 11/5/2015.
 */
public class NextGreaterNumber {
    //Using simple Bubble sort.Shame on me.
    public static void sort(int[] arr , int i , int j){
        Arrays.sort(arr, i, j+1);

    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    public static void printAray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    private static  boolean startGreaterEnd(int[] a , int start , int end){
        if(a[start]<a[end]){
            swap(a,start,end);
            sort(a,start+1, end);
            return true;
        }else{
            return false;
        }
    }

    private static int findMin(int a[] , int start , int end , int target){
        int min = Integer.MAX_VALUE;
        int index=0;
        for(int i =start ; i<=end;i++){
            if(a[i]>target && a[i]<min){
                index = i;
                min =a[i];
            }



        }
        return index;

    }



    public static void main(String[] args){
        int[] arr = {1,3,2};
        int end = arr.length-1;
        int start =end-1;
        while(start>=0){
            if(arr[start]<arr[end]){
                int index = findMin(arr,start+1,arr.length-1,arr[start]);
                swap(arr,start,index);
                Arrays.sort(arr,start+1,arr.length);
                break;
            }
            start--;
            end--;
        }
        if(start<0){
            Arrays.sort(arr,0,arr.length);
        }

          //  sort(arr,start+1,arr.length-1);
        printAray(arr);
    }
}
