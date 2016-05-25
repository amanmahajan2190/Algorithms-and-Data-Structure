package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AMAN on 5/24/2016.
 */
public class PathSum {

    public PathSum(){

    }
    public void createTree(Node root){
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
    }

    public void checkPathSum(Node root , int sum , ArrayList<Node> path){
        if(root == null) return;

        sum = sum-root.data;
        path.add(root);
        if(root.left == null && root.right == null){
            if(sum ==0){
                printPath(path);
            }else{
                sum =10;
            }
        }
        checkPathSum(root.left,sum,new ArrayList<Node>(path));
        checkPathSum(root.right,sum,new ArrayList<Node>(path));

    }

    private void printPath(ArrayList<Node> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i).data);
        }
    }

    public static void main(String[] args){
        PathSum sum = new PathSum();
        Node root = new Node(1);
        sum.createTree(root);
        sum.checkPathSum(root,10,new ArrayList<Node>());

    }
}
