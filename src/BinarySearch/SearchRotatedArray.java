package BinarySearch;

/**
 * Created by AMAN on 5/7/2016.
 */
public class SearchRotatedArray {
    int [] arr;
    public SearchRotatedArray(int[] values){
        this.arr = values;
    }
    public boolean SearchRotated(int K , int low , int high){
        if(low<high){
            int mid = low +(high-low)/2;
            if(arr[mid] == K){
                return true;
            }
            if(arr[mid]>arr[low]){
                if(K>=arr[low] && K<arr[mid]){
                    return SearchRotated(K,low,mid-1);
                }else{
                    return SearchRotated(K,mid+1,high);
                }
            }if(arr[mid]<arr[high]){
                if(K>arr[mid] && K<=arr[high]){
                    return SearchRotated(K,mid+1,high);
                }else{
                    return SearchRotated(K,low,mid-1);
                }
            }
        }return false;
    }
}
