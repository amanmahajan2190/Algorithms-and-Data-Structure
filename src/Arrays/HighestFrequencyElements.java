package Arrays;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by AMAN on 6/20/2016.
 */
class NumberFrequency implements Comparator<NumberFrequency>{
    int number;
    int freq;
    NumberFrequency(int i){
        number = i;
        freq=0;
    }

    @Override
    public int compare(NumberFrequency o1, NumberFrequency o2) {
        if(o1.freq>o2.freq){
            return 1;
        }else if(o2.freq>o1.freq){
            return -1;
        }
        return 0;
    }




}public class HighestFrequencyElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Comparator<NumberFrequency> frequencyComparator = new NumberFrequency(nums.length);
        PriorityQueue<NumberFrequency> queue = new PriorityQueue<NumberFrequency>(nums.length,frequencyComparator);
        for(int i=0;i<nums.length;i++){
            if(queue.contains(new NumberFrequency()))
        }


    }

}


