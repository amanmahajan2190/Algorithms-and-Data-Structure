package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AMAN on 6/3/2016.
 */
public class MaxPathSum {
    static int maxSum=0;
    List<Node> nodeList;

    MaxPathSum(){
        nodeList = new ArrayList<Node>();
    }

    public void createTree(Node root){
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
    }

    public void findRootToLeafSum(Node root, List<Node> arrayNodes){
        if(root == null){
            return;
        }
        arrayNodes.add(root);

        if(root.left == null && root.right == null){

            setSum(arrayNodes);
        }


        findRootToLeafSum(root.left,new ArrayList<Node>(arrayNodes));
        findRootToLeafSum(root.right,new ArrayList<Node>(arrayNodes));

    }

    public void setSum(List<Node> nodes){
        int sum =0;
        for(int i=0;i<nodes.size();i++){
            sum = sum + nodes.get(i).data;
        }
        if(sum>maxSum){
            maxSum = sum;
        }
    }

    public static void main(String[] args){
        MaxPathSum sum = new MaxPathSum();
        Node root = new Node(1);
        sum.createTree(root);
        sum.findRootToLeafSum(root,new ArrayList<Node>());
        System.out.print(maxSum);

    }


}
