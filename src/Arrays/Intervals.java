package Arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by AMAN on 7/30/2016.
 */




class IntervalComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval o1, Interval o2) {
        return o1.start - o2.start;
    }
}
public class Intervals {
    public boolean canAttendMeetings(Interval[] intervals) {
        int length = intervals.length;
        if(length<=0){
            return true;
        }
        Arrays.sort(intervals,new IntervalComparator());
        for(int i=0;i<length-1;i++){
            if(intervals[i].end>intervals[i].start){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args){
        Interval i1 = new Interval(7,10);
        Interval i2 = new Interval(2,4);
        Intervals s = new Intervals();
        Interval[] arr = new Interval[]{i1,i2};
        s.canAttendMeetings(arr);
    }
}


