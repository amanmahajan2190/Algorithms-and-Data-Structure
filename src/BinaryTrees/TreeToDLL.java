package BinaryTrees;

/**
 * Created by AMAN on 5/26/2016.
 */

//hard problem
public class TreeToDLL {

   static class Context{
        public Node head;
        public Node lastNode;
    }

    public void createTree(Node root){
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }

    public void treeToList(Node root ,Context context){
        if(root == null){
            return;
        }
        if(root.left!=null){
            treeToList(root.left,context);
        }

        if(context.head == null){
            context.head = root;
            context.lastNode = root;
        }else{
            root.left =context.lastNode;
            context.lastNode.right = root;
            context.lastNode = root;
        }




        if(root.right != null){
            treeToList(root.right,context);
        }

    }

    public static void main(String[] args){
        TreeToDLL dll = new TreeToDLL();
        Node root = new  Node(1);
        Context context = new Context();
        dll.createTree(root);
        dll.treeToList(root,context);
        while (context.head !=null){
            System.out.print(context.head.data);
            context.head = context.head.right;
        }
    }
}
