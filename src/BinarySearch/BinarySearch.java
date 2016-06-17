package BinarySearch;

/**
 * Created by AMAN on 5/7/2016.
 */
public class BinarySearch {
    int[] arr;
    public BinarySearch(int[] values){
        this.arr = values;
    }

    public boolean search(int K , int low , int high){
        int mid = low + (high-low)/2;
        if(low<high){
            if(arr[mid]== K){
                return true;
            }else if(arr[mid]<K){
                return search(K,mid+1,high);
            }else{
                return search(K,low,mid);
            }
        }
        return false;
    }
}
