package Graphs;

/**
 * Created by AMAN on 7/25/2016.
 */
public class LongestIncreasingOrder {
    int len=0;
    int count =1;
    public int longestIncreasingPath(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0 ; j<matrix[0].length ;j++){
                count=1;
                maximum = 0;
                int max = dfs(matrix,i,j,count);


                if(max>len){
                    len =max;
                }
            }
        }
        return len;

    }

    int maximum =0;


    public int dfs(int[][] matrix , int i , int j,int count){
        if(maximum <count){
            maximum =count;
        }
        if(i<matrix.length-1 && matrix[i+1][j]>matrix[i][j]){
            dfs(matrix,i+1 ,j ,++count);
        }
        if(i>=1 && matrix[i-1][j]>matrix[i][j]){
            dfs(matrix,i-1,j,++count);
        }
        if(j<matrix[0].length-1 && matrix[i][j+1]>matrix[i][j]){
            dfs(matrix,i ,j+1 ,++count);
        }
        if(j>=1 && matrix[i][j-1]>matrix[i][j]){
            dfs(matrix,i,j-1,++count);
        }
        return maximum;

    }

    public static void main(String[] args){
        int[][] a = new int[][]{{3,4,5},{3,2,6},{2,2,1}};
        LongestIncreasingOrder  order = new LongestIncreasingOrder();
        order.longestIncreasingPath(a);
    }


}
