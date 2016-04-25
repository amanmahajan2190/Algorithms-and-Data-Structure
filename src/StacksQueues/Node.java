package StacksQueues;

/**
 * Created by AMAN on 4/7/2016.
 */
public class Node {
    int value;
    String name;
    Node next;

    public Node(int x){
        this.value=x;
        next=null;
    }
    public Node(String x){
        this.name = x;
        next=null;
    }
}
