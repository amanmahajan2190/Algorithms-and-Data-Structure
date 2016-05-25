package BinaryTrees;

import java.util.Stack;

/**
 * Created by AMAN on 5/25/2016.
 */
public class PreOrder {
    Stack<Node> stack;
    PreOrder(){
        stack = new Stack<Node>();
    }
    public void doPreOrderTraversal(Node root){
        while (true){
            while (root!=null){
                System.out.print(root.data);
                stack.push(root);
                root = root.left;
            }
            if(stack.isEmpty()){
                return;
            }
            root= stack.pop();
            root =root.right;
        }
    }
}
