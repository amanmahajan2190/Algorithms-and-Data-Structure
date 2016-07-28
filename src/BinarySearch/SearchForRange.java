package BinarySearch;

/**
 * Created by AMAN on 7/4/2016.
 */
/** Given [5, 7, 7, 8, 8,8,8,8, 10] and target value 8,return [3, 4].*/

public class SearchForRange {
    public int[] searchRange(int[] A, int target) {
        int start = findPosition(A, target, false);
        int end = findPosition(A, target, true);
        return new int[]{start, end};
    }

    private int findPosition(int[] A, int target, boolean isLast) {
        int low = 0, high = A.length-1, index = -1;
        while (low <= high) {
            int mid = low + ((high - low)/2 );
            if(isLast){
                if (A[mid] <= target) low = mid + 1;
                else high = mid-1;
            } else{
                if (A[mid] < target) low = mid + 1;
                else high = mid-1;
            }
            if(A[mid] == target) index = mid; /** update index */
        }
        return index;
    }

    public static void main(String[] args){
        SearchForRange range = new SearchForRange();
        range.searchRange(new int[]{5, 7, 7, 8, 8,8,8,8, 10},8);
    }
}
