package LinkedList;

/**
 * Created by AMAN on 4/19/2016.
 */

//1-9-9-9
//Add 1 to it
//2-0-0-0
public class AddOneToLL {
    static LinkedListOps ops;
    int carry=1;
    int sum=0;
    static Node head;

    public AddOneToLL(){
        ops= new LinkedListOps();

    }

    public void createLinkedList(){
        ops.addNode(new Node(1));
        ops.addNode(new Node(9));
        ops.addNode(new Node(9));
        ops.addNode(new Node(9));
    }
    //Reverse the list
    //Add one to head

    public void addOneToIt(){
        head = ops.top;
        reverseLL(head);
        ops.top = head;


        while (head !=null){
            sum = carry+head.value;
            if(sum>9){
                sum =sum%10;
                carry=1;
                head.value=sum;
            }else{
                head.value =sum;
                carry=0;
            }
            head = head.next;

       }
       if(carry ==1){
           ops.addNode(new Node(1));
       }
        head =ops.top;
        reverseLL(head);

    }

    public void reverseLL(Node node){
        if(node == null || node.next==null){
            head = node;
            return;
        }
        reverseLL(node.next);
        Node temp =node.next;
        temp.next = node;
        node.next =null;
        return;

    }

    public static void  main(String[] args){
        AddOneToLL ll = new AddOneToLL();
        ll.createLinkedList();
        ll.addOneToIt();
        while (head !=null){
            System.out.print(head.value+"-");
            head = head.next;
        }
    }
}
