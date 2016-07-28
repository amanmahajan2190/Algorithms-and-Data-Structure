package Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by AMAN on 7/13/2016.
 */
public class MaxPair {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Pair> queue = new PriorityQueue<Pair>(k,new PairComparator());
        List<int[]> ksmall = new ArrayList<int[]>();
        for(int i=0;i <nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                Pair p = new Pair(nums1[i],nums2[j]);
                queue.add(p);
            }
        }

        int i=0;
        while (i<k && !queue.isEmpty()){
            Pair p =queue.poll();
            int[] a = new int[2];
            a[0] = p.i;
            a[1] = p.j;
            ksmall.add(a);
            i++;
        }
        return ksmall;
    }
    public static void main(String[] args){
        MaxPair p = new MaxPair();
        int[] num1 = new int[]{1,1,1};
        int[] num2 = new int[]{2,3,4};
        p.kSmallestPairs(num1,num2,9);
    }
}

class Pair{
    int i;
    int j;
    Pair(int m,int n){
        this.i =m;
        this.j = n;
    }
}

class PairComparator implements Comparator<Pair>{

    @Override
    public int compare(Pair o1, Pair o2) {
        int sum1 = o1.i + o1.j;
        int sum2 = o2.i + o2.j;
        if(sum1>sum2){
            return 1;
        }else if(sum1<sum2){
            return -1;
        }else{
            return 0;
        }

    }
}
