package LinkedList;

/**
 * Created by AMAN on 4/7/2016.
 */
public class LinkedListOps {


    Node top=null;
    Node end =null;


    public void addNode(Node n){
        if(top==null||end==null){
            top=n;
            end=n;
        }else{
            end.next=n;
            end =end.next;
        }
    }

    public Node deleteFromEnd(){
        if(top==null||end==null){
            return null;
        }else if(top.next==null){
            Node deleted= top;
            top=null;
            end=null;
            return deleted;
        }else{
            Node temp = top;
            Node delete= end;
            while (temp.next != end){
                temp = temp.next;
            }
            temp.next = null;
            end = temp;
            return  delete;
        }
    }

    public Node  deleteFromFront(){
        if(top==null){
            return null;
        }else if(top.next==null){
            Node deleted= top;
            top=null;
            end=null;
            return deleted;
        }else{
            Node temp = top;
            top = top.next;
            temp.next=null;
            return temp;

        }
    }

    public int getSize(){
        Node temp = top;
        int i=0;
        while (temp!=null){
            i++;
            temp = temp.next;
        }
        return i;
    }

    public void deleteAny(Node n){
        if(top==null){
            return;
        }else if(top.next==null && top.value==n.value){
            top=null;
        }else{
            Node fast = top.next;
            Node slow = top;
            while (fast !=null){
                if(fast ==n){
                    slow.next = fast.next;
                    break;
                }
                fast=fast.next;
                slow=slow.next;
            }
        }

    }

    public void printLinkedList(){
        Node temp = top;
        while(temp !=null){
            System.out.print(temp.value+"-");
            temp= temp.next;
        }
    }




}
