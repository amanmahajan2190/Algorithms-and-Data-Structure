package LinkedList;

/**
 * Created by AMAN on 4/12/2016.
 */
public class Reverse {
    static  LinkedListOps ops;
    public static Node newTop;
    public Reverse(){
        ops=new LinkedListOps();
    }
    public void createList(){

        ops.addNode(new Node(1));
        ops.addNode(new Node(2));
       ops.addNode(new Node(3));
   /*     ops.addNode(new Node(4));
        ops.addNode(new Node(5));*/


         ops.printLinkedList();

    }



    public Node Reverse(Node temp){
        if(temp.next==null){
            newTop =temp;
            return  temp;
        }
        Node second = temp.next;
        temp.next = null;
        Node rest = Reverse(second);
        second.next = temp;
        return rest;



    }

    public static void main(String[] args){
        Reverse r = new Reverse();
        r.createList();
        Node top=r.Reverse(ops.top);
        while (newTop!=null){
            System.out.print(newTop.value+"-");
            newTop=newTop.next;
        }
    }
}
