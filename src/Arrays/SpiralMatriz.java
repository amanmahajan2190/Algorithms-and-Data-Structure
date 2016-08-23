package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AMAN on 8/2/2016.
 */
public class SpiralMatriz {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> integerList = new ArrayList<Integer>();
        if(matrix== null || matrix.length<=0){
            return integerList;
        }
        int left =0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1 ;
        int len = matrix[0].length*matrix.length;
        int k=0;

        while(k<len) {
            for (int i = left; i <= right && k < len; i++) {
                integerList.add(matrix[top][i]);
                k++;
            }
            top++;


            for (int j = top; j <= bottom && k < len; j++) {
                integerList.add(matrix[j][right]);
                k++;
            }
            right--;


            for (int i = right; i >= left && k < len; i--) {
                integerList.add(matrix[bottom][i]);
                k++;
            }
            bottom--;

            for (int i = bottom; i >= top && k < len; i--) {
                integerList.add(matrix[i][left]);
                k++;
            }
            left++;


        }
        return integerList;




    }

    public static void main(String[] args){
        int [][] a = new int[][]{{1,2,3},{5,6,7},{9,10,11},{13,14,15}};
        SpiralMatriz m = new SpiralMatriz();
        m.spiralOrder(a);
    }
}
