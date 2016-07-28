package Arrays;

import java.util.*;

/**
 * Created by AMAN on 6/29/2016.
 */

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        Stack<Interval> intervalStack = new Stack<Interval>();
        for(Interval interval : intervals){
            if(intervalStack.isEmpty()){
                intervalStack.push(interval);
            }else{
                Interval top = intervalStack.peek();
                if(top.end>= interval.start){
                    Interval newInterval = new Interval();
                    newInterval.start = top.start;
                    if(top.end<interval.end){
                        newInterval.end = interval.end;
                    }else{
                        newInterval.end = top.end;
                    }

                    intervalStack.pop();
                    intervalStack.push(newInterval);

                }else{intervalStack.push(interval);
                }

            }
        }

        intervals.clear();
        Stack<Interval> tempStack = new Stack<Interval>();

        while (!intervalStack.isEmpty()){
            tempStack.push(intervalStack.pop());

        }
        while (!tempStack.isEmpty()){
            intervals.add(tempStack.pop());
        }
        return intervals;


    }

    public static void main (String[] args){
        MergeIntervals intervals = new MergeIntervals();
        Interval interval  = new Interval(2,6);
        Interval interval2  = new Interval(1,3);
        Interval interval3  = new Interval(8,10);
        Interval interval4  = new Interval(15,20);
        Interval interval5  = new Interval(17,18);
        List<Interval> intervals1 = new ArrayList<Interval>();
        intervals1.add(interval);
        intervals1.add(interval2);
        intervals1.add(interval3);
        intervals1.add(interval4);
        intervals1.add(interval5);
        intervals.merge(intervals1);
    }

}
