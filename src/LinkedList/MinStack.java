package LinkedList;

import java.util.Stack;

/**
 * Created by AMAN on 7/31/2016.
 */
public class MinStack {
    NodeStack front =null;
    NodeStack end = null;
    int currentMin =Integer.MAX_VALUE;
    public MinStack() {
        end = new NodeStack(currentMin,null,currentMin);
        front = end;
    }

    public void push(int x) {

        NodeStack node = new NodeStack(x,front,Math.min(x,front.min));
        front =node;
        System.out.println("Pushing " + x);
    }

    public void pop() {

        System.out.println("Popped " +front.x );
        front =front.next;

    }

    public int top() {
        System.out.println("Top Val " +front.x );
        return front.x;

    }

    public int getMin() {
        System.out.print("MinVal " +front.min );
        return front.min;
    }

    public static void main(String[] args){
        MinStack m = new MinStack();
        m.push(9);
        m.push(10);
        m.push(4);
        m.push(7);
        m.push(6);
        m.push(5);
        m.push(1);
        m.push(3);
        m.push(2);

        m.getMin();
        m.pop();

        m.pop();

        m.pop();
        m.getMin();
    }


}

class  NodeStack{
    int x;
    NodeStack next;
    int min=0;

    NodeStack(int val, NodeStack next , int min){
        this.x = val;
        this.next = next;
        this.min = min;

    }



}


