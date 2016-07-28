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

    public void createTree(Node root){
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
    }
}
