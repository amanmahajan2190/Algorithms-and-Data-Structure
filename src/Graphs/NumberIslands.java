package Graphs;


/**
 * Created by AMAN on 7/10/2016.
 */
public class NumberIslands {
    public int numIslands(char[][] grid) {

        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                isVisited[i][j] = false;
            }
        }
        int total_isLands=0;


        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                int count=0;
                if(!isVisited[i][j] && grid[i][j] !='0'){
                    count =dfs(grid,isVisited,i,j,0);
                    if(count>=1){
                        total_isLands++;
                    }

                }
            }
        }


        return total_isLands;

    }

    public int dfs(char[][] grid,boolean[][] booleansgrid,int i , int j , int count){
        if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1){
            return 0;
        }
        if(booleansgrid[i][j] == true){
            return 0;
        }
        if(grid[i][j] =='0'){
            return 0;
        }
        if(!booleansgrid[i][j] && grid[i][j] =='1'){
            booleansgrid[i][j] =true;
            count++;


        }

        dfs(grid,booleansgrid,i+1,j,count);
        dfs(grid,booleansgrid,i-1,j,count);
        dfs(grid,booleansgrid,i,j+1,count);
        dfs(grid,booleansgrid,i,j-1,count);

        return count;



    }

    public static  void main(String[] args){
        char[][] grid = new char[][]{{'1','1','0','0','0'},{'1','1','0','1','0'}
                ,{'1','1','0','0','0'},{'0','0','0','0','0'}};
        char[][] grid2 = new char[][]{{'1','1','0'},{'0','0','0'},{'0','0','1'}};


        NumberIslands islands = new NumberIslands();
        islands.numIslands(grid2);
    }



}
