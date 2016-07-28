package Arrays;

import java.util.*;

/**
 * Created by AMAN on 6/20/2016.
 */
class NumberFrequency implements Comparable<NumberFrequency>{
    int number;
    int freq;
    NumberFrequency(int i , int f){
        number = i;
        freq=f;
    }
    NumberFrequency(){}




    @Override
    public int compareTo(final NumberFrequency o) {
        return Integer.compare(this.freq,o.freq);
    }
}
public class HighestFrequencyElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<Integer, Integer>();
        PriorityQueue<NumberFrequency> queue = new PriorityQueue<NumberFrequency>(k);
        for(int i: nums){
            if (freqMap.containsKey(i)){
                freqMap.put(i, freqMap.get(i)+1);
            }else{
                freqMap.put(i,1);
            }
        }

        for(int number : freqMap.keySet()){
            if(queue.size()<k){
                queue.add(new NumberFrequency(number,freqMap.get(number)));
            }else{
                if(freqMap.get(number)>queue.peek().freq){
                    queue.remove();
                    queue.add(new NumberFrequency(number,freqMap.get(number)));
                }
            }


        }
        List<Integer> integerList = new ArrayList<Integer>();
        while(!queue.isEmpty()){
            integerList.add(queue.remove().number);
        }
        return integerList;

    }

    public static void main(String[] args){
        HighestFrequencyElements elements = new HighestFrequencyElements();
        int[] array = new int[]{1,1,1,2,2,3,3,3,3,3,3,3,3,5,5,5,5,5,4,4,4,1,1,1,1};
        elements.topKFrequent(array,3);
    }





}


