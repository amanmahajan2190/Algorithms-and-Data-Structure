package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AMAN on 5/23/2016.
 */
public class RootToLeef {
    List<Node> nodeList;
    RootToLeef(){
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
    public void findPath(Node root,ArrayList<Node> path){

        if (root == null) {
            return;
        }
        path.add(root);

        if(root.left==null && root.right==null){
            if(!path.isEmpty()){
                System.out.println("");
                printPath(path);

            }
            return;
        }

        findPath(root.left, new ArrayList<Node>(path));
        findPath(root.right,new ArrayList<Node>(path));


    }

    public void printPath(List<Node> nodes){
        for(int i=0;i<nodes.size();i++){
            System.out.print(nodes.get(i).data);
        }
    }

    public static void main(String[] args){
        RootToLeef leef = new RootToLeef();
        Node root = new Node(1);
        leef.createTree(root);
        leef.findPath(root,new ArrayList<Node>());
    }
}
