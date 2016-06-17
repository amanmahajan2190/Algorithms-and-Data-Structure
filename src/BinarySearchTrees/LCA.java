package BinarySearchTrees;

/**
 * Created by AMAN on 6/7/2016.
 */
public class LCA {

    public Node findLCA(Node root, Node n1, Node n2){
        if(root == null) return root;
        if(n1.data<root.data && n2.data < root.data){
            return findLCA(root,n1,n2);
        }else if(n1.data>root.data && n2.data > root.data){
            return findLCA(root,n1,n2);
        }
        else return  root;

    }
}
