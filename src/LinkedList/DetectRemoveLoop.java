package LinkedList;

/**
 * Created by AMAN on 4/21/2016.
 */
public class DetectRemoveLoop {
    LinkedListOps ops;
    Node head;
    Node insideLoop =null;
    public DetectRemoveLoop(){
        ops= new LinkedListOps();
        head=null;
    }
    public void createLL(){

        ops.addNode(head=new Node(1));
        Node n2 = new Node(2);
        ops.addNode(n2);
        ops.addNode(new Node(3));
        ops.addNode(new Node(4));
        ops.addNode(new Node(5));
        ops.addNode(new Node(6));
        Node n7= new Node(7);
        ops.addNode(n7);
        n7.next = n2;//Circular
    }

    public boolean detectLoop(){
        Node fast = new Node(0);
        Node slow = new Node(0);
        fast.next = head;
        slow.next = head;
        while(fast !=null && fast.next!=null ){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                insideLoop =slow;
                return true;
            }


        }
        return false;
    }

    public void removeLoop(){
        Node top = ops.top;
        Node inside = insideLoop;

        while (true){

            while(inside.next !=top || inside.next != insideLoop){
                inside = inside.next;
            }
            if(inside.next == top){
                break;
            }
            top = top.next;

        }
        inside.next=null;

    }

    public static void main(String[] args){
        DetectRemoveLoop loop= new DetectRemoveLoop();
        loop.createLL();
        System.out.print(loop.detectLoop());
    }
}
