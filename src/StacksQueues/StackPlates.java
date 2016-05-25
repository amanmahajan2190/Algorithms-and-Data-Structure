package StacksQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by AMAN on 4/26/2016.
 */
//Create a new stack if it exceeds the limit
//Remove the stack if it is empty
public class StackPlates {
    List<Stackops> stackList;

    static final int CAPACITY=3;
    public StackPlates(){
        stackList = new Stack<Stackops>();
    }
    public void push(Node node){
        if(stackList.isEmpty()){
            Stackops ops = new Stackops();
            stackList.add(ops);
            ops.push(node);
        }else{
            Stackops ops = stackList.get(stackList.size()-1);
            if(ops.getSize()==CAPACITY){
                System.out.println("Creating new Stack");
                Stackops newStack = new Stackops();
                stackList.add(newStack);
                newStack.push(node);
            }else{
                ops.push(node);
            }

        }
    }

    public Node pop(){
        Node returnNode =null;
        if(stackList.isEmpty()){
            return null;
        }else{
            while (!stackList.isEmpty()){
                Stackops ops = stackList.get(stackList.size()-1);
                if(ops.isEmpty()){
                    System.out.println("Removing empty Stack");
                    stackList.remove(ops);
                }else{
                    returnNode = ops.pop();
                    break;
                }
            }
        }return  returnNode;
    }

    public static void main(String[] args){
        StackPlates plate = new StackPlates();
        plate.push(new Node(1));
        plate.push(new Node(2));
        plate.push(new Node(3));
        plate.push(new Node(4));
        plate.push(new Node(5));
        plate.push(new Node(7));
        plate.push(new Node(8));
        plate.push(new Node(9));
        plate.push(new Node(10));
        plate.push(new Node(11));
        plate.push(new Node(12));

        System.out.println(plate.pop().value);
        System.out.println(plate.pop().value);
        System.out.println(plate.pop().value);
        System.out.println(plate.pop().value);
        System.out.println(plate.pop().value);
        System.out.println(plate.pop().value);


    }
}
