package Arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by AMAN on 11/2/2015.
 */
public class Twosum {

    Set<Integer> numberSet = new HashSet<Integer>();

    public void getPair(int[] arr,int sum){
        for(int i=0;i< arr.length;i++){
            numberSet.add(arr[i]);
        }
        for (int i=0; i<arr.length;i++){
            if(numberSet.contains(sum-arr[i])) {
                System.out.print("Pairs are : " +  arr[i] + " and "  + (sum - arr[i]));
                break;
            }

        }
    }
    public static void main(String[] args){
        int[] arr = {1,5,4,7,12,100};
        int requiredSum = 17;
        Twosum sum = new Twosum();
        sum.getPair(arr, requiredSum);


    }
}
