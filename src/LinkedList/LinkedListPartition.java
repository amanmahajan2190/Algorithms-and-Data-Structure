package LinkedList;

/**
 * Created by AMAN on 4/9/2016.
 */


/**
For example,
Given 1->4->3->2->5->2 and x = 3,
 return 1->2->2->4->3->5*/


public class LinkedListPartition {
    LinkedListOps ops;
    public LinkedListPartition(){
        ops=new LinkedListOps();
    }
    public void createList(){

        ops.addNode(new Node(1));
        ops.addNode(new Node(4));
        ops.addNode(new Node(3));
        ops.addNode(new Node(2));
        ops.addNode(new Node(5));
        ops.addNode(new Node(2));


     //   ops.printLinkedList();

    }

    public void partition(int value){
        Node fast = ops.top;
        int i=0;
        while(fast!=null && i<ops.getSize() ){
            if(fast.value>=value){
                Node temp = fast;
                fast = fast.next;
                Node temp2 =temp;
                ops.deleteAny(temp);
                temp2.next=null;
                ops.addNode(temp2);
            }else{
                fast=fast.next;
            }
            i++;

        }




        ops.printLinkedList();

    }

    public  static void main(String[] args){
        LinkedListPartition partition = new LinkedListPartition();
        partition.createList();
        partition.partition(3);
    }
}
