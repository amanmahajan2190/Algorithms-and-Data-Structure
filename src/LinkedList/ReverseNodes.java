package LinkedList;

import java.util.List;

/**
 * Created by AMAN on 7/19/2016.
 */
public class ReverseNodes {

     class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }



    public ListNode reverseKGroup(ListNode head, int k) {
        int i=0;
        int j=1;
        ListNode current = head;
        while(current !=null){
            current =current.next;
            j++;
            if(j<=k && current ==null){
                return head;
            }
        }
        ListNode prev = null;
        ListNode next = null;
        ListNode temp = head;

        while (temp != null){
            next = temp.next;
            temp.next =prev;
            prev = temp;
            temp = next;
            i++;
        }

        if(next != null){
            head.next = reverseKGroup(next,k);
        }
        return prev;




    }

    public ListNode creatList(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }

    public static void main(String[] args){
        ReverseNodes n = new ReverseNodes();
        ListNode head = n.creatList();
        head = n.reverseKGroup(head,6);
        while (head != null){
            System.out.print(head.val);
            head = head.next;
        }

    }
}
