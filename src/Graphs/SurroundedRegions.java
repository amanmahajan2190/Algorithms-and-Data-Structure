package Graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by AMAN on 8/4/2016.
 */

public class SurroundedRegions {
    public void solve(char[][] board) {
        if(board==null ||(board.length<=0 && board[0].length<=0)){
            return;
        }
        int row_len = board.length;
        int col_len = board[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        for(int i=0 ; i<col_len;i++){
            if(board[0][i] =='O'){
                doBFS(board,0,i,queue);
            }
        }
        for(int i=0;i<row_len;i++){
            if(board[i][0] == 'O'){
                doBFS(board,i,0,queue);
            }
        }

        for(int i= col_len-1;i>=0;i--){
            if(board[row_len-1][i] =='O'){
                doBFS(board,row_len-1 , i,queue);
            }
        }

        for(int i= row_len-1;i>=0;i--){
            if(board[i][col_len-1] =='O'){
                doBFS(board,i , col_len-1,queue);
            }
        }

        for(int row=0;row<row_len;row++){
            for(int col=0;col<col_len;col++){
                if(board[row][col] == 's'){
                    board[row][col] ='O';
                }else{
                    if(board[row][col] == 'O'){
                        board[row][col] ='X';
                    }
                }
            }
        }

    }

    public void doBFS(char[][] board , int i , int j, Queue<int[]> cordinateQuue){

        cordinateQuue.add(new int[]{i,j});
        while (!cordinateQuue.isEmpty()){
            int[] p = cordinateQuue.poll();
            int m = p[0];
            int n = p[1];
            board[m][n] = 's';
            if(m+1<board.length && board[m+1][n] == 'O'){
                cordinateQuue.add(new int[]{m+1,n});
            }
            if(m-1>=0 && board[m-1][n] == 'O'){
                cordinateQuue.add(new int[]{m-1,n});
            }
            if(n+1<board[0].length && board[m][n+1] == 'O'){
                cordinateQuue.add(new int[]{m,n+1});
            }
            if(n-1>=0 && board[m][n-1] == 'O'){
                cordinateQuue.add(new int[]{m,n-1});
            }

        }

    }

    public static void main(String[] args){
        char[][] board = new char[][]{{'X','O','X','X'},
                {'O','X','O','X'},{'X','O','X','O'},{'O','X','O','X'},
                {'X','O','X','O'},{'O','X','O','X'}
        };

        new SurroundedRegions().solve(board);
    }
}
