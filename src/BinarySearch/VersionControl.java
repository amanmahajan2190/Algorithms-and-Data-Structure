package BinarySearch;

/**
 * Created by AMAN on 7/3/2016.
 */
public class VersionControl {
    boolean isBadVersion(int version){
        return true;
    }
    public int firstBadVersion(int n) {
        if(n<0){
            return n;
        }
        int bad = BinarySearch(0,n);
        return bad;
    }

    public int BinarySearch(int low , int high){
        while(low<high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid) && !isBadVersion(mid-1)){
                return mid;
            }else  if(!isBadVersion(mid) && !isBadVersion(mid+1)){
                return BinarySearch(mid+1,high);
            }else{
                return BinarySearch(low,mid-1);
            }
        }
        return -1;
    }




}


