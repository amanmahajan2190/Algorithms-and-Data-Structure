package LinkedList;

/**
 * Created by AMAN on 6/29/2016.
 */
 class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }

//1-2-3-4-5-6
//1-3-2-4-5-6

//1-3-2-4
public class OddEvenLinked {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p1 = head, p2 = head.next, pre = p2;
        while (p2 != null && p2.next != null) {
            p1.next = p2.next;
            p1 = p1.next;
            p2.next = p1.next;
            p2 = p2.next;
        }
        p1.next = pre;
        return head;
}}
