package StacksQueues;

/**
 * Created by AMAN on 4/24/2016.
 */
public class SortStack {
    static Stackops ops;
    SortStack(){
        ops = new Stackops();
    }
    public void createStack(){
        ops.push(new Node(5));
        ops.push(new Node(3));
        ops.push(new Node(1));
        ops.push(new Node(2));
    }

    public void insertSort(Node node){
        if(ops.isEmpty()|| node.value>ops.getTop().value){
            ops.push(node);
        }else{
            Node temp = ops.pop();
            insertSort(node);
            ops.push(temp);
        }

    }

    public void reverse(){
        if(ops.isEmpty()){
            return;
        }
        Node temp = ops.pop();
        reverse();
        insertSort(temp);
    }

    public static void main(String[] args){
        SortStack s = new SortStack();
        s.createStack();
        s.reverse();
        while(!ops.isEmpty()){
            System.out.print(ops.pop().value);
        }
    }


}
