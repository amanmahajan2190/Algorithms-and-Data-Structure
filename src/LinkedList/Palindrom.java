package LinkedList;

import java.util.Stack;

/**
 * Created by AMAN on 4/12/2016.
 */
public class Palindrom {
    LinkedListOps ops;
    Stack<Node> stack;

    public Palindrom(){
        ops= new LinkedListOps();
        stack = new Stack<Node>();
    }
    public void createList(){

        ops.addNode(new Node(1));
        ops.addNode(new Node(2));
        ops.addNode(new Node(3));
        ops.addNode(new Node(4));
        // ops.addNode(new Node(5));


        ops.printLinkedList();

    }

    public  boolean palindromCheck(){
        Node fast = ops.top;
        Node slow = ops.top;

        while(fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            stack.push(slow);
        }
        if(fast!=null){
            slow=slow.next;
        }
        while(slow!=null){
            Node temp = stack.pop();
            if(temp!= null && temp.value!=slow.value){
                return false;
            }
            slow = slow.next;
        }
        return true;

    }
}
