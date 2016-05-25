package Arrays;

/**
 * Created by AMAN on 5/3/2016.
 */
public class BInarySearchUtil {
    public int binarySearch(int[] arr , int K, int low ,int high){
        if(low>=high){
            return -1;
        }else{
            int mid = low +(high-low)/2;
            if(arr[mid]==K){
                return mid;
            }else if(arr[mid]>K){
               return binarySearch(arr,K,low,mid-1);
            }else{
               return binarySearch(arr,K,mid+1,high);
            }
        }

    }
}
