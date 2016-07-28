package LinkedList;

/**
 * Created by AMAN on 6/27/2016.
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(Node head){
        int size =0;
        Node temp = head;
        while(temp !=null){
            temp = temp.next;
            size++;
        }

        return true;
    }

    private void reverseOddSizeLinkedList(Node head){

    }

    private Node reverseEvenSizelinkedList(int size, Node head){
        Node temp1 = head;
        int length  = size/2;
        while (length>=0){
            temp1 = temp1.next;
        }
        Node temp2 = temp1.next;
        temp1.next = null;
        head = reverse(head);
        temp1 = head;
        while (temp1 != null){
            temp1 = temp1.next;
        }
        temp1.next = temp2;
        return head;


    }

    private Node reverse(Node head){
        if(head == null){
            return head;
        }
        Node first = head;
        Node second = head.next;
        Node rest = reverse(second);
        second.next = first;
        return rest;
    }
}
