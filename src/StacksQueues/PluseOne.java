package StacksQueues;

import java.util.Stack;

/**
 * Created by AMAN on 7/3/2016.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class PluseOne {

        public ListNode plusOne(ListNode head) {
            if(head == null){
                return head;
            }
            Stack<ListNode> listNodeStack = new Stack<ListNode>();

            ListNode temp = head;
            while(temp!= null){
                listNodeStack.push(temp);
                temp = temp.next;
            }
            int carry =1;
            while (!listNodeStack.isEmpty() && carry !=0){
                temp= listNodeStack.peek();
                temp.val = temp.val +1;
                if(temp.val ==10){
                    carry =1;
                    temp.val=0;
                }else{
                    carry =0;
                }
                listNodeStack.pop();
            }
            if(carry ==1){
                ListNode newNode = new ListNode(1);
                newNode.next = head;
                head = newNode;
            }
            return head;



        }
}
