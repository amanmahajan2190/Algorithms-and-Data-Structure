package Arrays;


/*Given an array of integers, find the next largest permutation when the permutations are dictionary ordered.
[1,0,3,2] => [1,2,0,3]*/

/**
Solution
Start from end
Find the element such that a[i]<a[i+1]
Swap i with arr.length -1
Sort i+1 to end*/
/**
 * Created by AMAN on 11/5/2015.
 */
public class NextGreaterNumber {
    //Using simple Bubble sort.Shame on me.
    public static void sort(int[] arr , int i , int j){
        for(int k =i;k<=j-1;k++){
            if(arr[k]>arr[k+1] ){
                swap(arr,k,k+1);
            }
        }
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

    public static void main(String[] args){
        int[] arr = {1,0,3};
        int start=0;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                start=i;
                swap(arr,i,arr.length-1);
                break;
            }
        }
        sort(arr,start+1,arr.length-1);
        printAray(arr);
    }
}
