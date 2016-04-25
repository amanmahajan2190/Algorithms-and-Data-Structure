package LinkedList;

/**
 * Created by AMAN on 4/16/2016.
 */
//1-2-3-4-5-6
//2-1-4-3-6-5
//Idea-Swap the data instead of swaping nodes
public class SwapElements {

    static LinkedListOps ops;
    public SwapElements(){
        ops= new LinkedListOps();
    }
    public void createLL(){
        ops.addNode(new Node(1));
        ops.addNode(new Node(2));
        ops.addNode(new Node(3));
        ops.addNode(new Node(4));
        ops.addNode(new Node(5));
        ops.addNode(new Node(6));
    }

    public void swapElements(){
        Node temp = ops.top;
        while(temp!=null && temp.next!=null){
            swap(temp,temp.next);
            temp= temp.next.next;
        }
    }


    private void swap(Node a, Node b){
        int temp =a.value;
        a.value= b.value;
        b.value =temp;
    }
    public static void main(String[] args){
        SwapElements swapElements = new SwapElements();
        swapElements.createLL();
        swapElements.swapElements();
        ops.printLinkedList();
    }




}
