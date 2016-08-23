package LinkedList;

import java.util.List;

/**
 * Created by AMAN on 8/21/2016.
 */
public class SortLinkedList {
    public ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next ==null){
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode pre = head;

        while(p2 != null && p2.next != null){
            pre = p1;
            p1 = p1.next;
            p2 = p2.next.next;
        }
        //change pre next to null, make two sub list(head to pre, p1 to p2)
        pre.next = null;

        //handle those two sub list
        ListNode h1 = sortList(head);
        ListNode h2 = sortList(p1);
        return merge(h1,h2);


    }

    public ListNode setHEAD(ListNode head1 , ListNode head2){
        while (head2 != null && head2.next!=null){
            head1 = head1.next;
            head2= head2.next.next;
        }
        head2 = head1.next;
        head1.next=null;
        return head2;
    }

    public ListNode merge(ListNode head1 ,ListNode head2){
        ListNode result =null;
        if(head1.next == null){
            return head2;
        }
        if(head2.next == null){
            return head1;
        }
        if(head1.val<=head2.val){
            result = head1;
            result.next = merge(head1.next,head2);
        }else{
            result = head2;
            result.next = merge(head1,head2.next);
        }
        return result;


    }


    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(4);
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next= n5;
        ListNode h = new SortLinkedList().sortList(head);
        while (h != null){
            System.out.print(h.val);
            h =h.next;
        }

    }
}
