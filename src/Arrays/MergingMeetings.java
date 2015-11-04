package Arrays;

/**Write a function condense_meeting_times() that takes an array of
  meeting time ranges and returns an array of condensed ranges.
* */


import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Created by AMAN on 11/3/2015.
 */


class Interval implements Comparable<Interval>{
    int startTime ;
    int endTime;

    public Interval(int s , int e){
        this.startTime=s;
        this.endTime=e;
    }
    public int getStartTime(){
        return startTime;
    }
    public  int getEndTime(){
        return endTime;
    }

    @Override
    public int compareTo(Interval o) {
        return Integer.compare(getStartTime(),o.getStartTime());
    }
    @Override
    public String toString(){
        return getStartTime() + " ," + getEndTime();
    }


}

public class MergingMeetings {

    public  static  void main(String[] args){
        Stack<Interval> intervalStack = new Stack<Interval>();
        PriorityQueue<Interval> queue = new PriorityQueue<Interval>();
        queue.offer(new Interval( 0,1));
        queue.offer((new Interval(3,5)));
        queue.offer(new Interval(9,10));
        queue.offer(new Interval(4,8));
        queue.offer(new Interval(10,12));


        while (!queue.isEmpty()){
            Interval interval1 = queue.poll();
            if(interval1== null){
                break;
            }
            intervalStack.push(interval1);
            Interval interval2 = queue.poll();
            if(interval2 == null){
                break;
            }

            if(interval1.getEndTime()>=interval2.getStartTime()){
                Interval newInterval = new Interval(interval1.getStartTime(),interval2.getEndTime());
                intervalStack.pop();

                queue.offer(newInterval);
            }else{
                queue.offer(interval2);
            }


         }

        while (!intervalStack.isEmpty()){
            Interval it = intervalStack.pop();
            System.out.println(it);
        }
    }



}
