package BinarySearchTrees;

import java.util.Stack;

/**
 * Created by AMAN on 7/1/2016.
 */
public class isValidBST {
    public void createTree(Node root){
        root.left = new Node(1);
        root.right = new Node(2);
       /* root.left.left = new Node(5);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(6);*/
    }

    public boolean isValidBST(Node root){
        if(root == null){
            return true;
        }
        Node lastNode =null;
        Stack<Node> nodeStack = new Stack<Node>();
        while(true){
            while (root!= null){
                nodeStack.push(root);
                root = root.left;
            }
            if(nodeStack.isEmpty()){
                break;
            }
            root = nodeStack.pop();
            if(lastNode == null){
                lastNode=root;
            }else{

                if(lastNode.data>root.data){
                    return false;
                }else{
                    lastNode=root;
                }
            }
            if(root !=null){
            root = root.right;
        }
        }
        return true;
    }

    public static void main(String[] args){
        isValidBST bst = new isValidBST();
        Node root = new Node(3);
        bst.createTree(root);
        System.out.print(bst.isValidBST(root));
    }

}
