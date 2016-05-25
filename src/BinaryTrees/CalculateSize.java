package BinaryTrees;

/**
 * Created by AMAN on 5/23/2016.
 */
public class CalculateSize {

    public void createTree(Node root){
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
    }

    public int calculateSize(Node root){
        if(root == null){
            return 0;
        }
        int left = calculateSize(root.left);
        int right = calculateSize(root.right);
        return left+right+1;
    }

    public static void main(String[] args){
        CalculateSize size = new CalculateSize();
        Node root = new Node(1);
        System.out.print(size.calculateSize(root));
    }


}
