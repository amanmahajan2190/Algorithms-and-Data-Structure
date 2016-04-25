package StacksQueues;

/**
 * Created by AMAN on 4/23/2016.
 */
public class GetMinimum {
    Stackops actualStack;
    Stackops auxillary;

    GetMinimum(){
        actualStack = new Stackops();
        auxillary = new Stackops();
    }

    public void  push(Node node){
        if(actualStack.isEmpty() && auxillary.isEmpty()){
            actualStack.push(node);
            auxillary.push(node);
        }else if(auxillary.isEmpty()){
            actualStack.push(node);
            auxillary.push(node);
        }else{
            actualStack.push(node);
            if(auxillary.getTop().value>node.value){
                auxillary.push(node);
            }
        }
    }

    public Node getMin(){
        Node node = auxillary.pop();
        auxillary.push(node);
        return node;
    }

    public Node pop(){
        if(actualStack.isEmpty()){
            return null;
        }
        Node node = actualStack.pop();
        if(node != auxillary.pop()){
            auxillary.push(node);
        }
        return node;
    }


    public static void main(String[] args){
        GetMinimum min = new GetMinimum();
        min.push(new Node(12));
        min.push(new Node(7));
        min.push(new Node(14));
        min.push(new Node(5));
        min.push(new Node(11));
        min.push(new Node(6));
        System.out.println(min.getMin().value);
        System.out.println(min.getMin().value);
        System.out.println(min.pop().value);
        System.out.println(min.getMin().value);
        System.out.println(min.pop().value);
        System.out.println(min.getMin().value);
        System.out.println(min.pop().value);
        System.out.println(min.getMin().value);
        System.out.println(min.pop().value);
        System.out.println(min.getMin().value);
    }
}
