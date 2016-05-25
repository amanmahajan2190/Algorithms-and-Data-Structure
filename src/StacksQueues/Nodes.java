package StacksQueues;

/**
 * Created by AMAN on 4/27/2016.
 */
public class Nodes {
    Nodes next;
    Nodes prev;
    int value;
    Nodes(int x){
        value = x;
        next = null;
        prev=null;
    }
}
