package BinaryTrees;

import java.util.Stack;

/**
 * Created by AMAN on 5/23/2016.
 */
public class SpiralPrint {
    Stack<Node> stack1;
    Stack<Node> stack2;
    SpiralPrint(){
        stack1 = new Stack<Node>();
        stack2 = new Stack<Node>();
    }

    public void createTree(Node root){
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
    }

    public void makeSpiralTree(Node root){
        if(root == null){
            return;
        }
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            while (!stack1.isEmpty()){

                Node t = stack1.pop();
                System.out.print(t.data);
                if(t.left!= null){
                    stack2.push(t.left);
                }
                if(t.left!=null){
                    stack2.push(t.right);
                }
            }

            while (!stack2.isEmpty()){
                Node t = stack2.pop();
                System.out.print(t.data);
                if(t.left!= null){
                    stack1.push(t.left);
                }
                if(t.left!=null){
                    stack1.push(t.right);
                }
            }
        }



    }

    public static void main(String[] args){
        SpiralPrint print = new SpiralPrint();
        Node root = new Node(1);
        print.createTree(root);
        print.makeSpiralTree(root);

    }



}
