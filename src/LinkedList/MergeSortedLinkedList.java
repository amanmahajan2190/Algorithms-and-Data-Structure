package LinkedList;

/**
 * Created by AMAN on 4/15/2016.
 */
public class MergeSortedLinkedList {
    static LinkedListOps ops1;
    static LinkedListOps ops2;
    MergeSortedLinkedList(){
        ops1 = new LinkedListOps();
        ops2 = new LinkedListOps();
    }
    public void createLinkedList(){
        ops1.addNode(new Node(1));
        ops1.addNode(new Node(3));
        ops1.addNode(new Node(5));
        ops2.addNode(new Node(2));
        ops2.addNode(new Node(4));
        ops2.addNode(new Node(6));


    }

    public Node mergeSortLL(Node a , Node b){
        Node result=null;
        if(a==null){
            return  a;
        }
        if(b== null){
            return b;
        }
        if(a.value<=b.value){
            result=a;
            result.next= mergeSortLL(a.next,b);
        }else {
            result=b;
            result.next = mergeSortLL(a,b.next);
        }
        return result;
    }


    public static void main(String[] args){
        MergeSortedLinkedList ll = new MergeSortedLinkedList();
        ll.createLinkedList();
        Node top=ll.mergeSortLL(ops1.top,ops2.top);
        while (top !=null){
            System.out.print(top.value);
            top= top.next;
        }
    }
}
