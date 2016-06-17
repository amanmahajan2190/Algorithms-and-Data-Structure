package Graphs;

import BinaryTrees.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by AMAN on 6/10/2016.
 */

//Basically you have to check if there is a cycle or not using DFS/BFS
public class ValidTree {
    class Node{
        int data;
        Node parent;
        List<Node> neighbors;
        boolean isVisited;
        Node(int d){
            this.data = d;
            parent = null;
            isVisited = false;
            neighbors = new ArrayList<Node>();
        }
    }
    private List<Node> graphNodesList;
    boolean cycleDetected = false;
    public ValidTree(){
        graphNodesList = new ArrayList<Node>();
    }


    public boolean validTree(int n, int[][] edges) {
      for(int[] e : edges){
          Node n1 = null;
          Node n2 = null;

          for(Node node : graphNodesList){
              if(node.data == e[0]){
                  n1 = node;
                  break;
              }
          }
          if(n1 == null){
              n1 = new Node(e[0]);
              graphNodesList.add(n1);
          }
          for(Node node : graphNodesList){
              if(node.data == e[1]){
                  n2 = node;
                  break;
              }
          }
          if(n2 == null){
              n2 = new Node(e[1]);
              graphNodesList.add(n2);
          }
          n1.neighbors.add(n2);

      }
        if(graphNodesList.isEmpty()){
            return true;
        }
        if(doDFS(graphNodesList.get(0))){
            for (int i =0 ;i<graphNodesList.size();i++){
                if(graphNodesList.get(i).isVisited==false){
                    return false;
                }

            }
        }else {
            return false;
        }
        return true;

    }


    public boolean doDFS(Node node){
        node.isVisited = true;
        for(Node n :node.neighbors){
            if(n.isVisited && !(node.parent==n)){
                System.out.print("Cycle detected");
                cycleDetected = true;
                break;

            }else{
                if(!n.isVisited){
                    n.parent = node;
                    doDFS(n);
                }
            }

        }
        return !cycleDetected;

    }


    public static void main(String[] args){
        int[][] graphArray = new int[][]{{5,2},{5,0},{4,0},{4,1},{2,3},{3,1}};
        ValidTree tree = new ValidTree();
        System.out.print(tree.validTree(5,graphArray));
    }
}


