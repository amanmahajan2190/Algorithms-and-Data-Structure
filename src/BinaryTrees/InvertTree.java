package BinaryTrees;

/**
 * Created by AMAN on 7/1/2016.
 */
public class InvertTree {

    public void createTree(Node root){
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
    }


    public Node InvertTree(Node root) {
        if (root == null) {
            return root;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        InvertTree(root.left);
        InvertTree(root.right);
        swapLeaves(root);
        return root;
    }


    private void swapLeaves(Node root) {
        Node temp = root.left ;
        root.left =root.right;
        root.right =temp;
    }

    public static void main(String[] args){
        InvertTree tree = new InvertTree();


        Node root = new Node(1);
        tree.createTree(root);
        tree.Inorder(root);
        tree.InvertTree(root);
        tree.Inorder(root);

    }

    private void Inorder(Node root){
        if(root != null){
            Inorder(root.left);
            System.out.print(root.data);

            Inorder(root.right);
        }
    }
}