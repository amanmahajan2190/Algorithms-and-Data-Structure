package LinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by AMAN on 4/9/2016.
 */
public class RemoveDups {
    LinkedListOps ops =null;

    public RemoveDups(){
        ops = new LinkedListOps();
    }
    public void createList(){

        ops.addNode(new Node(1));
        ops.addNode(new Node(2));
        ops.addNode(new Node(2));
        ops.addNode(new Node(2));
        ops.addNode(new Node(3));
        ops.addNode(new Node(4));
        ops.addNode(new Node(2));
        ops.addNode(new Node(2));
        ops.addNode(new Node(3));
        ops.addNode(new Node(1));
        ops.addNode(new Node(2));
        ops.addNode(new Node(2));
        ops.addNode(new Node(2));
        ops.addNode(new Node(3));
        ops.addNode(new Node(4));
        ops.addNode(new Node(2));
        ops.addNode(new Node(2));
        ops.addNode(new Node(3));

        ops.printLinkedList();

    }
    public void removeDuplicates(){
        Node temp= ops.top;
        Set<Integer> nodeSet= new HashSet<Integer>();
        while(temp !=null){

                if(nodeSet.isEmpty()){
                    nodeSet.add(temp.value);
                }else{
                    if(nodeSet.contains(temp.value)){
                        ops.deleteAny(temp);
                        System.out.println("");
                        ops.printLinkedList();
                    }else{
                        nodeSet.add(temp.value);

                    }
                } temp=temp.next;
        }
        nodeSet.clear();
    }

    public static void main(String[] args){
        RemoveDups duplicates = new RemoveDups();
        duplicates.createList();
        duplicates.removeDuplicates();
    }

}
