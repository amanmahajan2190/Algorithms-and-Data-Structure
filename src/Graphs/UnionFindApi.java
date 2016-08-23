package Graphs;

import DynamicProgramming.UniqueBST;

/**
 * Created by AMAN on 8/22/2016.
 */
public class UnionFindApi {
    int[] Graph;
    int length;
    int[] size;
    UnionFindApi(int n){
        Graph = new int[n];
        size = new int[n];
        length =n;
    }

    public void initialize(){
        for(int i=0;i<length;i++){
            Graph[i] = i;
            size[i] =1;
        }
    }

    public void unionSlow(int p , int q){
        for(int i=0;i<length;i++){
            if(Graph[i]==p){
                Graph[i] =q;
            }
        }
    }
    public boolean areConnected(int p , int q){
        return Graph[p] == Graph[q];
    }

    public int root(int p){
        while(p != Graph[p]){
            Graph[p] = Graph[Graph[p]];
            p = Graph[p];
        }
        return p;
    }
    public void unionRoot(int p , int q){
        int p_root = root(p);

        int q_root = root(q);
        if(p_root ==    q_root){
            return;
        }
        if(size[p_root]<size[q_root]){
            Graph[p_root] =q_root;
            size[q_root] += size[p_root];
        }else{
            Graph[q_root] = p_root;
            size[p_root] += size[q_root];

        }
    }

}
