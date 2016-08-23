package Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by AMAN on 8/13/2016.
 */
public class KthLargest2D {
    class Tuple{
        int row;
        int col;
        int val;
        Tuple(int x ,int y, int v){
            this.row =x;
            this.col =y;
            this.val =v;
        }
    }

    class TupleComparator implements Comparator<Tuple>{

        @Override
        public int compare(Tuple o1, Tuple o2) {
            return o1.val-o2.val;
        }
    }

    public int kthSmallest(int[][] matrix, int k) {
        if(matrix.length<=0){
            return 0;
        }
        PriorityQueue<Tuple> queue = new PriorityQueue<Tuple>(k, new TupleComparator());
        for(int i=0;i<matrix.length;i++){
            queue.offer(new Tuple(i,0,matrix[i][0]));
        }
        for(int i=0;i<k-1;i++){
            Tuple t = queue.poll();
            if(t.col== matrix[0].length-1){
                continue;
            }
            queue.offer(new Tuple(t.row,t.col+1,matrix[t.row][t.col+1]));
        }
        return queue.poll().val;

    }
    public static void main(String[] args){
        int[][] a = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(new KthLargest2D().kthSmallest(a,3));
    }
}
