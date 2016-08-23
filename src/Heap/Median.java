package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by AMAN on 8/10/2016.
 */
public class Median {
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();//heap is a minimal heap by default
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(10,Collections.reverseOrder());//change to a maximum heap

    // Adds a number into the data structure.
    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if (maxHeap.size() < minHeap.size())
            maxHeap.offer(minHeap.poll());
    }

    // Returns the median of current data stream
    public double findMedian() {
        if (maxHeap.size() == minHeap.size())
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        else
            return maxHeap.peek();
    }

    public static void main(String[] args){
        Median m = new Median();
        m.addNum(1);
        m.addNum(2);
        m.addNum(3);
        m.addNum(4);
        m.addNum(5);
        m.addNum(6);
        m.addNum(7);
        m.addNum(8);
        m.addNum(9);
        m.addNum(10);
        System.out.print(m.findMedian());
    }
}
