package StacksQueues;

/**
 * Created by AMAN on 4/23/2016.
 */
public class QUsingStack  {
    Stackops stack1;
    Stackops stack2;

    QUsingStack(){
        stack1 = new Stackops();
        stack2 = new Stackops();
    }


    public  void Enque(Node node){
        stack1.push(node);
    }
    public Node deque(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            return null;
        }else if(!stack1.isEmpty() && stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());

            }
            return stack2.pop();
        }else{
           return stack2.pop();
        }

    }

    public static void main(String[] args){
        QUsingStack que = new QUsingStack();
        que.Enque(new Node(1));
        que.Enque(new Node(2));
        que.Enque(new Node(3));
        que.Enque(new Node(4));
        que.Enque(new Node(5));

        System.out.print(que.deque().value);
        System.out.print(que.deque().value);
    }


}
