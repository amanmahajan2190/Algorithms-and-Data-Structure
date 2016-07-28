package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by AMAN on 5/25/2016.
 */
public class LevelOrderTraversal {
    Queue<Node> queue;
    int level =0;

    public void createTree(Node root){

        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
    }

    LevelOrderTraversal(){
        queue = new LinkedList<Node>();
    }

    public void printLevelOrderTraversal(Node root){
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            while (size>0){
                Node temp = queue.remove();
                System.out.print(temp.data);
                if(temp.left!=null){
                    queue.add(temp.left);
                } if(temp.right!=null){
                    queue.add(temp.right);
                }
                size--;
            }
            System.out.println("");
        }

    }

    public static  void main(String[] args){
        LevelOrderTraversal traversal = new LevelOrderTraversal();
        Node root = new Node(1);
        traversal.createTree(root);
        traversal.printLevelOrderTraversal(root);

    }
}
