package Arrays;
/**
 * Maximum difference between two elements such that larger element appears after the smaller number
 Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2).
 If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff between 7 and 9)
 */



//Trick:
//Kepp the track of Min Element so far and maximum difference so far.

/**
 * Created by AMAN on 11/2/2015.
 */
public class MaxDifference {

    int maxDifference=0;
    int minElement=0;

    public int getMaxDifference(int[] arr){
        if(arr.length<=0){
            return 0;
        }
         maxDifference = arr[1]-arr[0];
         minElement = arr[0];

        for(int i=1;i<arr.length;i++){
            if(maxDifference<arr[i]-minElement){
                maxDifference = arr[i]-minElement;
            }
            if(minElement>arr[i]){
                minElement=arr[i];
            }
        }
        return  maxDifference;

    }

    public static void main(String[] args){
        int[] a ={1, 2, 90, 10, 110};
        MaxDifference max = new MaxDifference();
        System.out.print(max.getMaxDifference(a));

    }
}
