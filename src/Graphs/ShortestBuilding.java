package Graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by AMAN on 8/18/2016.
 */

class ShortestBuilding{
    public int shortestDistance(int[][] grid) {
        int total_Houses =0;
        if(grid.length<=0){
            return -1;
        }
        int[][] reachable = new int[grid.length][grid[0].length];
        Queue<int[]> queue = new LinkedList<int[]>();
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    grid[i][j] =-1;
                    total_Houses++;

                }else{
                    if(grid[i][j] == 2){
                        grid[i][j] =-2;
                    }
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == -1){
                    Queue<int[]> q = new LinkedList<int[]>();
                    q.add(new int[]{i,j});
                    int[][] vis = new int[grid.length][grid[0].length];
                    doBFS(q,vis,grid,reachable);

                }
            }

        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0 && min>grid[i][j] && reachable[i][j] == total_Houses){
                    min =grid[i][j];
                }
            }


        } if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }

    public void doBFS(Queue<int[]> queue,int[][] visited,int[][]grid,int[][] reachable){
        int dist =0;
        while (!queue.isEmpty()){
            int size =queue.size();
            dist++;
            while(size>0){
                int[] point = queue.poll();
                int row =point[0];
                int col =point[1];
                if(row>0 && grid[row-1][col] !=-2 && grid[row-1][col] !=-1 && visited[row-1][col] ==0){
                    queue.add(new int[]{row-1,col});
                    visited[row-1][col]=1;
                    reachable[row-1][col] += 1;

                    grid[row-1][col] =grid[row-1][col]+dist;

                }
                if(col>0 && grid[row][col-1] !=-2 && grid[row][col-1] !=-1 && visited[row][col-1] ==0){
                    queue.add(new int[]{row,col-1});
                    visited[row][col-1]=1;
                    reachable[row][col-1] += 1;
                    grid[row][col-1] =grid[row][col-1]+dist;

                }
                if(row<grid.length-1 && grid[row+1][col] !=-2 && grid[row+1][col] !=-1 && visited[row+1][col] ==0){
                    queue.add(new int[]{row+1,col});
                    visited[row+1][col]=1;
                    reachable[row+1][col] += 1;
                    grid[row+1][col] = grid[row+1][col]+dist;

                }
                if(col<grid[0].length-1 && grid[row][col+1] !=-2 && grid[row][col+1] !=-1 && visited[row][col+1] ==0){
                    queue.add(new int[]{row,col+1});
                    visited[row][col+1]=1;
                    reachable[row][col+1] += 1;
                    grid[row][col+1] =grid[row][col+1]+dist;


                }
                size--;
            }

        }

    }
    public static void main(String[] args){
        int[][] grid = new int[][]{{1,0,2,0,1},{0,0,0,0,0},{0,0,1,0,0}};
        ShortestBuilding b = new ShortestBuilding();
        System.out.print(b.shortestDistance(grid));

    }

}

