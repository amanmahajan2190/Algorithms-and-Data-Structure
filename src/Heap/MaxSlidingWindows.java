package Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by AMAN on 8/2/2016.
 */
public class MaxSlidingWindows {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> integerList = new ArrayList<Integer>();
        int len = nums.length;
        if(len<=0 || len<k){
            return new int[0];
        }

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });


        for(int i=k-1;i<len;i++){

            integerList.add(getMAxElement(nums,i,queue));

        }

        int[] a = new int[integerList.size()];
        for(int i=0;i<integerList.size();i++){
            a[i]= integerList.get(i);
        }
        return a;
    }

    public int getMAxElement(int[] a , int j, PriorityQueue<Integer> queue){
        if(queue.isEmpty()){
            for(int i=0;i<=j;i++){
                    queue.add(a[i]);
            }
        }else{
            queue.add(a[j]);
        }
        return queue.peek();
    }

    public static void main(String[] args){
        MaxSlidingWindows windows = new MaxSlidingWindows();
        int[] a = new int[]{1,3,-1,-3,5,3,6,7};
        windows.maxSlidingWindow(a,3);
    }
}
