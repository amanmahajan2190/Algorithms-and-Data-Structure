package BinaryTrees;

import java.util.Stack;

/**
 * Created by AMAN on 5/25/2016.
 *
 * Logic : Use Stack.Push all the left nodes AND then push right
 */
public class InorderTraversal {

    Stack<Node> nodeStack;
    InorderTraversal(){
        nodeStack = new Stack<Node>();
    }

    public void inOrderTraversal(Node root){
        while(true){

            while (root!=null){
                nodeStack.push(root);
                root =root.left;
            }
            if(nodeStack.isEmpty()){
                return;
            }
            Node temp =nodeStack.pop();
            System.out.print(temp.data);
            root =root.right;
        }
    }
}
