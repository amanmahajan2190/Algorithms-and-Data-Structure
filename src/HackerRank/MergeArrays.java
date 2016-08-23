package HackerRank;

/**
 * Created by AMAN on 8/11/2016.
 */
public class MergeArrays {

    public static  int[] mergeArrays(int[] a, int[] b){
        int a_len =a.length;
        int b_len =b.length;

        if(a_len<=0 && b_len<=0){
            return new int[0];
        }

        int[] merge = new int[a_len+b_len];

        int i=0 ,j=0;
        int k=0;
        while(i<a_len && j<b_len){
            if(a[i] <b[j]){
                merge[k++] = a[i];
                i++;
            }else if(a[i] >b[j]){
                merge[k++] = b[j];
                j++;
            }else{
                merge[k++] = a[i];
                merge[k++] = b[j];
                i++;
                j++;
            }
        }

        while(i<a_len){
            merge[k++] = a[i];
            i++;
        }
        while(j<b_len){
            merge[k++] = b[j];
            j++;
        }
        return merge;

    }
}
