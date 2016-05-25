package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AMAN on 5/3/2016.
 */
public class CountPairs {
    Map<Integer,Integer> mapReduce;
    int count=0;
    CountPairs(){
        mapReduce = new HashMap<Integer, Integer>();
    }

    public void countPairs(int[] arr,int K){
       //Best Approach,Just Save the pairs
        for(int i=0;i<arr.length;i++){
            if(mapReduce.containsKey(arr[i])){
                count++;
            }else{
                mapReduce.put(K-arr[i],arr[i]);
            }
        }

    }

    public static void main(String[] args){
        CountPairs pairs = new CountPairs();
        int[] arr = new int[]{1,1,1,1};
        pairs.countPairs(arr,2);
        System.out.print(pairs.count);
    }
}
