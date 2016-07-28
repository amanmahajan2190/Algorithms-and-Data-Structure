package Arrays;

/**
 * Created by AMAN on 7/24/2016.
 */
public class MatrixRotation {
    public void rotate(int[][] matrix) {
        if(matrix.length<=1){
            return;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int j =matrix[0].length-1;
        for(int i=0 ;i<j; i++){
            swapColumn(matrix,i,j);
            j--;
        }


    }

    public void swapColumn(int[][] matrix, int c1 , int c2){
        for(int i=0;i<matrix.length;i++){
            int temp = matrix[i][c1];
            matrix[i][c1] = matrix[i][c2];
            matrix[i][c2] = temp;
        }

    }

    public static void main(String[] args){
        int[][] a = new int[][]{{1,2},{3,4}};
        MatrixRotation r = new MatrixRotation();
        r.rotate(a);
    }
}
