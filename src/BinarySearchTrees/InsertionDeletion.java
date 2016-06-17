package BinarySearchTrees;

/**
 * Created by AMAN on 6/6/2016.
 */

//Search ,Insert and Delete a node in BST
public class InsertionDeletion {

    public Node search(Node root , int key){
        if(root == null || root.data == key){
            return root;
        }
        if(root.data<key){
            return search(root.right,key);
        }
        return search(root.left,key);
    }


    public void insertNode(Node root, Node insert ){
        if(root == null){
            root = insert;
        }
        if(root.data<insert.data){
            insertNode(root.right,insert);
        }else{
            insertNode(root.left,insert);
        }


    }

}
