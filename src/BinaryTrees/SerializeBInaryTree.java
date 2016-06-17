package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by AMAN on 6/5/2016.
 */
public class SerializeBInaryTree {
    StringBuffer serializedString ;
    Queue<Node> nodeQueue;
    public SerializeBInaryTree(){
        nodeQueue = new LinkedList<Node>();
        serializedString = new StringBuffer("");
    }


        public void createTree(Node root){
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(5);
            root.left.right = new Node(4);
            root.right.left = new Node(7);
            root.right.right = new Node(6);
        }



    public void serializeTree(Node root){
        if(root == null){
            return;
        }
        serializedString.append(root.data);
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()){
            Node temp = nodeQueue.remove();
            if(temp.left!=null){
                nodeQueue.add(temp.left);
                serializedString.append(temp.left.data);
            }else{
                serializedString.append("#");
            }
            if(temp.right!=null){
                nodeQueue.add(temp.right);
                serializedString.append(temp.right.data);
            }else{
                serializedString.append("#");
            }
        }


    }

    public void deserializeTree() {
        Queue<Node> desiarizeQueue = new LinkedList<Node>();
        Node root =null;

        for (int i = 0; i < serializedString.length(); i++) {
            if (i == 0) {
                root =new Node(getNumberFromStringHelper(serializedString.charAt(i)));
                desiarizeQueue.add(root);
            } else {
                if (!desiarizeQueue.isEmpty()) {
                    root = desiarizeQueue.remove();
                    int number = getNumberFromStringHelper(serializedString.charAt(i));
                    if (number == -1) {
                        root.left = null;
                    } else {
                        root.left = new Node(number);
                        i++;
                        desiarizeQueue.add(root.left);
                    }
                    number = getNumberFromStringHelper(serializedString.charAt(i));
                    if (number == -1) {
                        root.right = null;
                    } else {
                        root.right = new Node(number);
                        i++;
                        desiarizeQueue.add(root.left);
                    }


                }
            }
        }
        System.out.print(root.data);

    }



    public int getNumberFromStringHelper(Character c){
        if(c == '#'){
            return -1;
        }else{
            int i = Integer.parseInt(c+"");
            return i;
        }

    }

    public static  void main(String[] args){
        SerializeBInaryTree tree = new SerializeBInaryTree();
        Node root = new Node(1);
        tree.createTree(root);
        tree.serializeTree(root);
        tree.deserializeTree();
    }

}
