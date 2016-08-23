package LinkedList;

/**
 * Created by AMAN on 7/31/2016.
 */
public class MergeTwoLinkedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null ||l2 ==null){
            return null;
        }
        ListNode newNode = null;
        ListNode head =null;
        while(l1 !=null  && l2 !=null){
            if(l1.val<=l2.val){
                if(newNode== null){
                    newNode = l1;
                    head= newNode;

                }else{
                    newNode.next = l1;
                    newNode = newNode.next;

                }
                l1 = l1.next;
            }else{
                if(newNode==null){
                    newNode =l2;
                    head = newNode;
                }else{
                    newNode.next = l2;
                    newNode = newNode.next;
                }
                l2= l2.next;
            }
        }

        while(l1 != null){
            newNode.next = l1;
            newNode = newNode.next;
            l1 = l1.next;
        }

        while(l2 != null){
            newNode.next =l2;
            newNode = newNode.next;
            l2 = l2.next;
        }

        return head;


    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l3;
        l3.next = l5;
        l2.next =l4;
        l4.next =l6;

        MergeTwoLinkedList list = new MergeTwoLinkedList();
        list.mergeTwoLists(l1,l2);

    }
}
