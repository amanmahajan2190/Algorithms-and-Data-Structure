package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by AMAN on 8/2/2016.
 */

class Node{
    int val;
    boolean isVisited;
    List<Node> neighbor;
    Node(int x){
        this.isVisited = false;
        this.val =x;
        this.neighbor = new ArrayList<Node>();
    }
}

public class CountComponents {
    Map<Integer,Node>  nodeMap= new HashMap<Integer, Node>();
    List<Node> nodeList = new ArrayList<Node>();
    public int countComponents(int n, int[][] edges) {
        for(int i=0;i<edges.length;i++){
            int src = edges[i][0];
            int dest = edges[i][1];
            Node s = null;
            Node d = null;
            if(nodeMap.containsKey(src)){
                s = nodeMap.get(src);
            }else{
                s= new Node(src);
                nodeMap.put(src,s);
                nodeList.add(s);
            }
            if(nodeMap.containsKey(dest)){
                d = nodeMap.get(dest);
            }else{
                d= new Node(dest);
                nodeMap.put(dest,d);
                nodeList.add(d);
            }
            s.neighbor.add(d);
            d.neighbor.add(s);


        }
        int count =0;

        for(int i=0;i<nodeList.size();i++){
            Node node  = nodeList.get(i);
            if(!node.isVisited){
                count++;
                doDFS(node);
            }
        }
        return count;

    }


    public void doDFS(Node node){
        if(node==null){
            return;
        }else{
            if(!node.isVisited){
                node.isVisited = true;
                for(Node n : node.neighbor){
                    doDFS(n);
                }
            }
        }
    }

    public static void main(String[] args){
        int[][] e = new int[][]{{0, 1}, {1, 2}, {0,2}, {3, 4}};
        CountComponents c = new CountComponents();
        System.out.print(c.countComponents(5,e));

    }


}
