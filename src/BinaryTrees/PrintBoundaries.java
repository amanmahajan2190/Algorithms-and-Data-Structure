package BinaryTrees;

/**
 * Created by AMAN on 6/3/2016.
 */
public class PrintBoundaries {

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

    public void printLeftBoundary(Node root){
        if(root== null){
            return;
        }
        //Avoiding leafs
        if(root.left == null && root.right == null){
            return;
        }
        if(root.left != null){
            System.out.print(root.data);
            printLeftBoundary(root.left);
        }else if(root.right != null){
            System.out.print(root.data);
            printLeftBoundary(root.right);
        }

    }

    public void printLeafs(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null){
            System.out.print(root.data);
        }
        printLeafs(root.left);
        printLeafs(root.right);


    }

    public void printRightBoundary(Node root){
        if(root == null){
            return;
        }
        //Avoiding leafs
        if(root.left == null && root.right == null){
            return;
        }
        if(root.right != null){
            System.out.print(root.data);
            printRightBoundary(root.right);
        }else if(root.left != null){
            System.out.print(root.data);
            printLeftBoundary(root.left);
        }
    }

    public  static void main(String[] args){
        PrintBoundaries boundaries = new PrintBoundaries();
        Node root = new Node(1);
        System.out.print(root.data);
        boundaries.createTree(root);
        boundaries.printLeftBoundary(root.left);
        boundaries.printLeafs(root);
        boundaries.printRightBoundary(root.right);
    }
}
