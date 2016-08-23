package Graphs;

/**
 * Created by AMAN on 8/23/2016.
 */
public class NumberOfIslands {
    int NUMBER_ISLANDS=0;
    UnionFindApi unionFind;
    int row_len=0;
    int col_len =0;

    public int numIslands(char[][] grid) {
        row_len = grid.length;
        col_len = grid[0].length;
        if(row_len<=0 || col_len<0){
            return 0;
        }



        unionFind = new UnionFindApi(row_len*col_len);
        unionFind.initialize();
        for(int i=0;i<row_len;i++){
            for(int j=0;j<col_len;j++){
                if(checkForNoParent(i,j) && grid[i][j] != '0'){
                    findIslands(i,j,grid);
                    NUMBER_ISLANDS++;
                }
            }

        }

        return NUMBER_ISLANDS;




    }

    public int getPos(int i , int j){
        return i*(col_len) +j;
    }
    public boolean checkForNoParent(int i , int j){
        if(unionFind.root(getPos(i,j))==getPos(i,j)){
            return true;
        }
        return false;
    }

    public void findIslands(int i, int j,char[][] grid){
        if(i>0 && grid[i-1][j] =='1' && !unionFind.areConnected(getPos(i-1,j),getPos(i,j))){
            unionFind.unionRoot(getPos(i-1,j),getPos(i,j));
            findIslands(i-1,j,grid);
        }
        if(j>0 && grid[i][j-1] =='1' && !unionFind.areConnected(getPos(i,j-1),getPos(i,j))){
            unionFind.unionRoot(getPos(i,j-1),getPos(i,j));
            findIslands(i,j-1,grid);

        }
        if(i<row_len-1 && grid[i+1][j] =='1' && !unionFind.areConnected(getPos(i+1,j),getPos(i,j))){
            unionFind.unionRoot(getPos(i+1,j),getPos(i,j));
            findIslands(i+1,j,grid);

        }
        if(j<col_len-1 && grid[i][j+1] =='1' && !unionFind.areConnected(getPos(i,j+1),getPos(i,j))){
            unionFind.unionRoot(getPos(i,j+1),getPos(i,j));
            findIslands(i,j+1,grid);

        }

    }

    public static void main(String [] args){
        char[][] grid = new char[][]{{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        System.out.print(new NumberOfIslands().numIslands(grid));
    }


}
