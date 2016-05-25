package BinarySearch;

/**
 * Created by AMAN on 5/11/2016.
 */
public class BinarySearchAlmostSorted {
    int[] arr;
    public BinarySearchAlmostSorted(int[] values){
        this.arr = values;
    }

    public int BinarySearch( int K,int low , int high){
        if(low < high){
            int mid = low +(high-low)/2;

            if(arr[mid] == K ){
                return mid;
            }else if(arr[mid+1] == K){
                return mid+1;
            }else if(arr[mid-1] == K){
                return mid-1;
            }

            if(K<arr[mid]){
                return BinarySearch(K,low,mid-2);
            }else{
                return BinarySearch(K,mid+2, high);
            }
        }return -1;
    }


}
