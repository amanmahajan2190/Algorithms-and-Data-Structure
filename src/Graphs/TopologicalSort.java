package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by AMAN on 6/12/2016.
 */
//Topological sort can only be done in Directed Acyclic Graph
public class TopologicalSort {
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
    Stack<Node> nodesStack;
    public TopologicalSort(){
        graphNodesList = new ArrayList<Node>();
        nodesStack = new Stack<Node>();
    }

    public void topology(int[][] edges){
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



    }

    void DFS(List<Node> nodeList){
        for(Node n : nodeList){
            if(!n.isVisited){
                doDFS(n);

            }
        }
        if(!nodesStack.isEmpty()){
            int size = nodesStack.size();
            for(int i=0;i<size;i++){
                System.out.print(nodesStack.pop().data);
            }
        }

    }

    void doDFS(Node node){
        node.isVisited = true;
        for(Node neighbour : node.neighbors){
            if(!neighbour.isVisited){
                doDFS(neighbour);
            }
        }
        nodesStack.push(node);
    }
    public static void main(String[] args){
        int[][] graphArray = new int[][]{{5,0},{5,2},{4,0},{4,1},{2,3},{3,1}};
        TopologicalSort sort = new TopologicalSort();
        sort.topology(graphArray);
    }
}
