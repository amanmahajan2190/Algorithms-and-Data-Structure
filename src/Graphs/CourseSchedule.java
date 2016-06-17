package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by AMAN on 6/13/2016.
 */
public class CourseSchedule {
    class Node{
        int data;
        Node parent;
        int color;
        List<Node> neighbors;
        boolean isVisited;
        Node(int d){
            this.data = d;
            color = -1;
            parent = null;
            isVisited = false;
            neighbors = new ArrayList<Node>();
        }
    }

    private List<Node> graphNodesList;
    Stack<Node> nodesStack;
    boolean cycleDetected = false;

    public CourseSchedule(){
        nodesStack = new Stack<Node>();
        graphNodesList = new ArrayList<Node>();

    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        for(int[] e : prerequisites){
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
            n2.neighbors.add(n1);

        }
        DFS();
        if(cycleDetected){
            return new int[numCourses];
        }else {
            int[] courses = new int[numCourses];
            if(!nodesStack.isEmpty()){
                int size = nodesStack.size();
                for(int i =0 ;i<size;i++){
                    courses[i] = nodesStack.pop().data;
                }
            }
            return courses;
        }
    }

    public void DFS(){
        for(Node nodes: graphNodesList){
            if(cycleDetected){
                break;
            }
            if(nodes.color ==-1){
                doDFS(nodes);
            }
        }

    }
    private void doDFS(Node root){
        root.color =0;
        for(Node n : root.neighbors){
            if(n.color ==0){
                cycleDetected =true;
                System.out.println("Cycle has been detected");
                break;
            }else{
                if(n.color ==-1){
                    n.parent = root;
                    doDFS(n);
                }
            }
        }
        root.color =   1;
        nodesStack.push(root);


    }

    public static void main(String[] args){
        int[][] graphArray = new int[][]{{1,0},{2,0},{3,1},{3,2}};
        CourseSchedule schedule = new CourseSchedule();
        int[] a = schedule.findOrder(4,graphArray);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
