package Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by AMAN on 6/26/2016.
 */
public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(2 ,new IntegerComparater());
        for(int i=0 ; i<nums.length;i++){
           if(queue.size()<k){
               queue.add(nums[i]);
           }else{
               if(queue.peek()< nums[i]){
                   queue.remove();
                   queue.add(nums[i]);
               }
           }
        }
        return queue.peek();

    }
    public static void main(String[] args){
        KthLargest largest = new KthLargest();
        System.out.print(largest.findKthLargest(new int[]{3,4,3,1,3,2,5,3,1,2},3));
    }


}

    class IntegerComparater implements Comparator<Integer> {


        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1<o2){
                return -1;
            }
            if(o1>o2){
                return 1;
            }
            return 0;
        }}





