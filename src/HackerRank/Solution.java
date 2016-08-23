package HackerRank;

/**
 * Created by AMAN on 8/10/2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public static void main(String args[] ) throws Exception {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        s.initalize(N);

        while(sc.hasNextInt()){
            s.addElems(sc.nextInt());
            s.printElems();
        }


    }
    void initalize(int N){
        min = new PriorityQueue<Integer>();
        max = new PriorityQueue<Integer>(N, Collections.<Integer>reverseOrder());
    }


    void addElems(int n){
        max.offer(n);
        min.offer(max.poll());
        if(max.size()<min.size()){
            max.offer(min.poll());
        }
    }

    void printElems(){
        if(max.size()== min.size()){
            System.out.println((max.peek()+min.peek())/2.0);

        }else{
            System.out.println(max.peek());
        }
    }
}
