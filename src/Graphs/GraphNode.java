package Graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AMAN on 6/9/2016.
 */
public class GraphNode {
    int Data;
    String color;
    boolean isVisited;
    GraphNode predecessor;
    int startTime=0;
    int endTime =0;
    List<GraphNode> neighbors;

    public GraphNode(int d,String c , boolean isV,GraphNode n){
        this.Data =d;
        this.color = c;
        this.isVisited = isV;
        this.predecessor = n;
        neighbors = new ArrayList<GraphNode>();
    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public GraphNode getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(GraphNode predecessor) {
        this.predecessor = predecessor;
    }

    public List<GraphNode> getAllNeighbors(){
        return neighbors;
    }



}
