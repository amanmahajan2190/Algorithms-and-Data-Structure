package LinkedList;

/**
 * Created by AMAN on 4/16/2016.
 */
public class AlternateMiddleNodes {
    LinkedListOps ops;
    AlternateMiddleNodes(){
        ops = new LinkedListOps();
    }
    public void createLL(){
        ops.addNode(new Node(1));
        ops.addNode(new Node(2));
        ops.addNode(new Node(3));
        ops.addNode(new Node(4));
        ops.addNode(new Node(5));
        ops.addNode(new Node(6));
    }

    public void makeAlternate(){
        LinkedListOps even = new LinkedListOps();
        LinkedListOps odd =  new LinkedListOps();
        Node first = ops.top;
        int size =ops.getSize();
        for(int i=1;i<=size;i++){
           if(i%2==0){
               Node temp = first;
               first = first.next;
               ops.deleteFromFront();
               even.addNodeFromFront(temp);
           }else{
               Node temp = first;
               first = first.next;
               ops.deleteFromFront();
               odd.addNode(temp);
           }
        }
        odd.end.next = even.top;
        odd.printLinkedList();

    }

    public static void main(String[] args){
        AlternateMiddleNodes middle = new AlternateMiddleNodes();
        middle.createLL();
        middle.makeAlternate();
    }
}
