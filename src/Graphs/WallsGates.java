package Graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by AMAN on 8/14/2016.
 */
public class WallsGates {
    int INF = Integer.MAX_VALUE;
    public void wallsAndGates(int[][] rooms) {
        if(rooms.length<=0){
            return;
        }
        int rows = rooms.length-1;
        int col = rooms[0].length-1;
        Queue<int[]> queue = new LinkedList<int[]>();

        for(int i=0 ;i<=rows;i++){
            for(int j=0;j<=col;j++){
                if(rooms[i][j] ==0){
                    queue.add(new int[]{i,j});
                }
            }
        }
        doBFS(rooms,queue);

    }

    private void  doBFS(int[][] rooms, Queue<int[]> queue){
        int[] top = queue.remove();
        int row = top[0];
        int col = top[1];

        if(row>0 && rooms[row-1][col] == INF){
            rooms[row-1][col] = rooms[row][col]+1;
            queue.add(new int[]{row-1,col});
        }
        if(col>0 && rooms[row][col-1] == INF){

            rooms[row][col-1] = rooms[row][col]+1;
            queue.add(new int[]{row,col-1});
        }

        if(row<rooms.length-1 && rooms[row+1][col] == INF){
            rooms[row+1][col] = rooms[row][col]+1;
            queue.add(new int[]{row+1,col});
        }

        if(col<rooms[0].length-1 && rooms[row][col+1] ==INF){
            rooms[row][col+1] = rooms[row][col]+1;
            queue.add(new int[]{row,col+1});
        }

    }
}
