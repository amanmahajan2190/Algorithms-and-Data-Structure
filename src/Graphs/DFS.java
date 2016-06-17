package Graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AMAN on 6/9/2016.
 */
public class DFS {
    List<GraphNode> allNodes;
    int time =0;

    public void createGraph(){

        GraphNode node1 = new GraphNode(1,"White",false,null);
        GraphNode node2 = new GraphNode(2,"White",false,null);
        GraphNode node3 = new GraphNode(3,"White",false,null);
        GraphNode node4 = new GraphNode(4,"White",false,null);
        GraphNode node5 = new GraphNode(5,"White",false,null);
        GraphNode node6 = new GraphNode(6,"White",false,null);
        GraphNode node7 = new GraphNode(7,"White",false,null);
        GraphNode node8 = new GraphNode(8,"White",false,null);
        allNodes = new ArrayList<GraphNode>();
        allNodes.add(node1);
        allNodes.add(node2);
        allNodes.add(node3);
        allNodes.add(node4);
        allNodes.add(node5);
        allNodes.add(node6);
        allNodes.add(node7);
        allNodes.add(node8);
    }

    public void DFSimplemntation(){
        for(GraphNode node : allNodes ){
            if(node.getColor().equalsIgnoreCase("White")){
                DfsVisit(node);

            }
        }

    }

    private void DfsVisit(GraphNode node){
        time =time+1;
        node.startTime = time;
        node.color = "Gray";
        for(GraphNode n : node.getAllNeighbors()){
            if(n.getColor().equalsIgnoreCase("White")){
                n.setPredecessor(node);
                DfsVisit(n);
            }
        }
        node.color = "Black";
        time = time+1;
        node.endTime = time;

    }
}
