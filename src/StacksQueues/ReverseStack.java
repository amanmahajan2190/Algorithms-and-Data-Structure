package StacksQueues;

/**
 * Created by AMAN on 4/23/2016.
 */
public class ReverseStack {
    Stackops ops;
    ReverseStack(){
        ops= new Stackops();
    }
    public void createStack(){
        ops.push(new Node(1));
        ops.push(new Node(2));
        ops.push(new Node(3));
        ops.push(new Node(4));

    }

    public void insertAtBottom(Node node){
        if(ops.isEmpty()){
            ops.push(node);
        }else{
            Node temp = ops.pop();
            insertAtBottom(node);
            ops.push(temp);
        }


    }

    public void reverse(){
        if(!ops.isEmpty()){
            Node temp =ops.pop();
            reverse();
            insertAtBottom(temp);
        }

    }


}
