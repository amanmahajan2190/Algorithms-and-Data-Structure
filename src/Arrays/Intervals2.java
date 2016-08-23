package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by AMAN on 7/30/2016.
 */



public class Intervals2 {

    public int minMeetingRooms(Interval[] intervals) {

        int length = intervals.length;
        if(length<=0){
            return 0;
        }
        Arrays.sort(intervals,new IntervalComparator());

        PriorityQueue<Interval> queue = new PriorityQueue<Interval>(intervals.length, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.end-o2.end;
            }
        });
        queue.offer(intervals[0]);


        for(int i=1;i<length;i++){
            Interval interval = queue.poll();

            if(interval.end<intervals[i].start){
                interval.end = intervals[i].end;
            }else{
                queue.offer(intervals[i]);
            }
            queue.offer(interval);
        }

        return queue.size();
    }

}
