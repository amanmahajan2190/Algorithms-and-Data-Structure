package LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by AMAN on 7/31/2016.
 */
public class MergeKList {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length<=0){
            return null;
        }

        ListNode head = new ListNode(0);

        ListNode tail = head;
        PriorityQueue<ListNode> queue = new PriorityQueue(lists.length,new Comparator<ListNode>(){

            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val<o2.val)
                    return -1;
                else if (o1.val==o2.val)
                    return 0;
                else
                    return 1;

            }
        } );

        for(ListNode node : lists){
            if(node != null){
                queue.add(node);
            }
        }
        while (!queue.isEmpty()){

            if(tail == null){
                tail =  queue.poll();

            }else{
                tail.next = queue.poll();
                tail = tail.next;
            }
            if(tail.next != null){
                queue.add(tail.next);
            }
        }
        return head.next;



    }

    public  static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);

        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(8);

        l1.next = l3;
        l3.next = l5;
        l2.next = l8;
        l4.next =l6;
        l6.next = l7;

        ListNode[] listNodes = new ListNode[]{l1,l2,l4};
        MergeKList k = new MergeKList();
        k.mergeKLists(listNodes);
    }
}
