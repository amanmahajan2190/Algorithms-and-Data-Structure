package Graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AMAN on 6/12/2016.
 */
public class Solution {

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
    boolean connected = true;
    public Solution(){
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
            n2.neighbors.add(n1);

        }
        DFS(graphNodesList);
        if(cycleDetected){
            return false;
        }else {
            for (int i = 0; i < graphNodesList.size(); i++) {
                graphNodesList.get(i).isVisited = false;
            }

                doDFS(graphNodesList.get(0));
                for (int i = 0; i < graphNodesList.size(); i++) {
                    if (graphNodesList.get(i).isVisited == false) {
                        System.out.print("Graph not connected");
                        connected = false;
                    }
                }
                return connected;
            }
        }





    public void DFS(List<Node> graphNodes){
        for(Node n : graphNodes){
            if(cycleDetected){
                break;
            }
            if(n.isVisited == false){
                doDFS(n);
            }
        }

    }

    public void doDFS(Node node){
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

    }

}
