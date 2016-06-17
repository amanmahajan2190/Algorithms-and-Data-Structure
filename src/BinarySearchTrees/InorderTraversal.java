package BinarySearchTrees;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by AMAN on 6/7/2016.
 */
public class InorderTraversal {
    Stack<Node> nodesStack;
    InorderTraversal(){
        nodesStack = new Stack<Node>();

    }
    public void createTree(Node root){
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
    }
    public void inOrderTraversal(Node root){
        if(root == null)
            return;
        nodesStack.add(root);
        while (!nodesStack.isEmpty()){
            while (root.left!=null){
                nodesStack.push(root.left);
                root = root.left;
            }

            root= nodesStack.pop();
            System.out.print(root.data);

            if(root.right !=null){
                nodesStack.push(root.right);
                root = root.right;

            }

        }

    }

    public static void main(String[] args){
        InorderTraversal traversal = new InorderTraversal();
        Node root = new Node(1);
        traversal.createTree(root);
        traversal.inOrderTraversal(root);
    }



}
