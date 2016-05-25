package StacksQueues;

/**
 * Created by AMAN on 4/27/2016.
 */

//Return middle element in O(1)
public class FindMiddle {

    DoublyLinkedListOps ops;
    Nodes middleElement;
    FindMiddle(){
        ops = new DoublyLinkedListOps();
    }

    public void push(Nodes node){
        ops.addNodeinFront(node);
        if(ops.getSize()==1){
            middleElement = ops.end;
        }else{
            if(ops.getSize()%2!=0){
                middleElement = middleElement.prev;
            }
        }

    }

    public Nodes pop(){
       if(ops.getSize()==0){
           middleElement=null;
           return null;
       }else{
           if(ops.getSize()==1){

               middleElement=null;
               return ops.removeFromFront();
           }else{
               Nodes node =ops.removeFromFront();
               if(ops.getSize()%2==0){
                   middleElement =middleElement.next;
               }
               return node;
           }
       }

    }

    public Nodes getMiddleElement(){
        return middleElement;
    }

    public static void main(String[] args){
        FindMiddle middle = new FindMiddle();
        middle.push(new Nodes(1));
        middle.push(new Nodes(2));
        middle.push(new Nodes(3));
        middle.push(new Nodes(4));

        System.out.println(middle.getMiddleElement().value);
        middle.push(new Nodes(5));
        middle.push(new Nodes(6));
        middle.push(new Nodes(7));

        System.out.println(middle.getMiddleElement().value);
        middle.push(new Nodes(8));
        System.out.println(middle.getMiddleElement().value);
        middle.pop();
        middle.pop();
        middle.pop();
        System.out.println(middle.getMiddleElement().value);

    }

}
