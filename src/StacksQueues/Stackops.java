package StacksQueues;

/**
 * Created by AMAN on 4/23/2016.
 */
public class Stackops {

    Node top;
    int elementCount;

    public Stackops(){
        top = null;
    }

    public void push(Node node){
        if(top == null){
            top=node;
            top.next=null;
        }else{
            node.next = top;
            top=node;
        }
        elementCount++;
    }

    public  Node pop(){
        if(top==null){
            return top;
        }else if(top.next==null){
            Node temp = top;
            top=null;
            elementCount--;
            return temp;
        }else{
            Node temp = top;
            top = top.next;
            temp.next=null;
            elementCount--;
            return  temp;
        }
    }

    public Node getTop(){
        return this.top;
    }

    public int getSize(){
        return elementCount;
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }return false;
    }
}
