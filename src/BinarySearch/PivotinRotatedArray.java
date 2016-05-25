package BinarySearch;

/**
 * Created by AMAN on 5/12/2016.
 */
public class PivotinRotatedArray {
    int [] arr;
    public PivotinRotatedArray(int[] values){
        this.arr =values;
    }
    public int findPivot(int low , int high){
        if(low<high){
            int mid  = low + (high-low)/2;
            if(arr[mid]<arr[mid-1]){
                return mid;
            }else  if(arr[mid]>arr[mid+1]){
                return  mid+1;
            }else if(mid>low && arr[mid]>arr[low]){
                return findPivot(mid+1,high);
            }else
                return findPivot(low,mid-1);
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {8,15,17,1,2,3,4,5,6,7,8,10};
        PivotinRotatedArray in = new PivotinRotatedArray(arr);
        System.out.print(in.findPivot(0,arr.length-1));
    }
}
