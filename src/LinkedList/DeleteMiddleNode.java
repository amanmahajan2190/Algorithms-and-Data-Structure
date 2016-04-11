package LinkedList;

/**
 * Created by AMAN on 4/9/2016.
 */
public class DeleteMiddleNode {
    LinkedListOps ops;
    public DeleteMiddleNode(){
        ops= new LinkedListOps();
    }
    public void createList(){

        ops.addNode(new Node(1));
        ops.addNode(new Node(2));
        ops.addNode(new Node(3));
        ops.addNode(new Node(4));
       // ops.addNode(new Node(5));


        ops.printLinkedList();

    }

    public void deleteMiddleNode(){
        Node fast = ops.top;
        Node slow = ops.top;
        while(fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ops.deleteAny(slow);
        System.out.println("");
        ops.printLinkedList();
    }

    public static void main(String[] args){
        DeleteMiddleNode deleteMiddleNode = new DeleteMiddleNode();
        deleteMiddleNode.createList();
        deleteMiddleNode.deleteMiddleNode();
    }
}
