package StacksQueues;

import LinkedList.*;

/**
 * Created by AMAN on 4/27/2016.
 */
public class DoublyLinkedListOps {
    Nodes top;
    Nodes end;
    int elementCount =0;

    public DoublyLinkedListOps(){
        top = null;
        end = null;
    }

    public void addNodeInBack(Nodes node){
        if(top==null){
            top = node;
            end = node;
        }else{
            end.next = node;
            node.prev = end;
            end = end.next;
        }
        elementCount++;
    }

    public  void addNodeinFront(Nodes node){
        if(top==null){
            top = node;
            end = node;
        }else{
            node.next = top;
            top.prev = node;
            top= top.prev;
        }
        elementCount++;
    }
    public  Nodes removeFromBack(){
        if(end==null){
            return  end;
        }else if(end.prev == null){
            Nodes temp = end;
            end = null;
            elementCount--;
            return temp;
        }else {
            Nodes temp = end;
            end = end.prev;
            end.next =null;
            temp.prev=null;
            elementCount--;
            return temp;

        }
    }


    public Nodes removeFromFront(){
        if(top== null){
            return top;
        }else if(top.next == null){
            Nodes temp = null;
            temp = top;
            top =null;
            elementCount--;
            return temp;
        }else{
            Nodes temp = top;
            top = top.next;
            top.prev =null;
            temp.next = null;
            elementCount--;
            return  temp;

        }

    }

    public int getSize(){
        return elementCount;
    }


   /* public Nodes removeAnyElement(Nodes node){
        if(top == null){
            return top;
        }else{
            Nodes temp = top;
            while(temp != null){
                if(temp == node){
                    Nodes temp = t
                }
            }
        }
    }*/

}
