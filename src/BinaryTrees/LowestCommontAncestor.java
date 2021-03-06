package BinaryTrees;

import java.util.*;

/**
 * Created by AMAN on 6/4/2016.
 */
public class LowestCommontAncestor {

    public void createTree(Node root){
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.left.left = new Node(11);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.left.right = new Node(12);

        root.right.right = new Node(6);
    }

    public Node LCA(Node root, Node n1 , Node n2){
        if(root == null) return root;
        if(root.data == n1.data || root.data == n2.data){
            return root;
        }
        Node left = LCA(root.left,n1,n2);
        Node right = LCA(root.right,n1,n2);
        if(left.data == n1.data && right.data == n2.data){
            return root;
        }
        if(left!=null && right== null){
            return left;
        }

        if(right!=null && left== null){
            return right;
        }
        return null;


    }

    public Node LCAIterative(Node root, Node left, Node right){
        Map<Node ,Node> childParentMap = new HashMap<Node, Node>();
        Queue<Node> nodeQueue = new LinkedList<Node>();
        nodeQueue.add(root);
        childParentMap.put(root,null);
        while((!childParentMap.containsKey(left) || !childParentMap.containsKey(right)) && nodeQueue.size()>0){
            Node temp =nodeQueue.poll();
            if(temp !=null){
                if(temp.left !=null){
                    childParentMap.put(temp.left,temp);
                    nodeQueue.add(temp.left);
                }
                if(temp.right !=null){
                    childParentMap.put(temp.right,temp);
                    nodeQueue.add(temp.right);
                }


        }
        }

        Set<Node> nodeSet = new HashSet<Node>();
        while(left!=null){
            left = childParentMap.get(left);
        }
        while (!nodeSet.contains(right)){
            right = childParentMap.get(right);
        }
        return right;
        }



    public static void main(String[] args){
        LowestCommontAncestor ancestor = new LowestCommontAncestor();
        Node root = new Node(1);
        ancestor.createTree(root);
        Node node = ancestor.LCAIterative(root,new Node(7),new Node(5));
        if(node == null){
            System.out.print("Ancestor not found");
        }else{
            System.out.print(node.data);
        }

    }
}
/* if(root == null ){

            return null;
        }
        if(root.data == n1.data || root.data == n2.data){
            return  root;
        }
        Node left = LCA(root.left,n1, n2);
        Node right = LCA(root.right, n1,n2);
        if(left !=null &&  right != null){

            return root;
        }
        if(left !=null && right == null){
            return left;
        }else if(left == null && right !=null){
            return right;
        }
        return null;*/