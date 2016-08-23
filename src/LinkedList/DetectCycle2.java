package LinkedList;

/**
 * Created by AMAN on 7/31/2016.
 */
public class DetectCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode entry = head;
        boolean cycleDetected = false;

        while(fast != null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycleDetected =true;
                break;
            }
        }
        if(cycleDetected){
            while(entry != slow){
                entry = entry.next;
                slow = slow.next;
            }
        }else{
            return null;
        }

        return entry;
    }
}
