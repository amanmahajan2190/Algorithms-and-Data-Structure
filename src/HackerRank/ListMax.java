package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by AMAN on 8/11/2016.
 */
public class ListMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        while(sc.hasNextLine()){
           int start = sc.nextInt();
            int end = sc.nextInt();
            int addition = sc.nextInt();
            if(start>=1 && start<=end && end<=N){
                for(int i=start-1;i<end;i++){
                    arr[i] =arr[i] + addition;
                }
            }


        }

     /*   int max =0;
        for(int i=0;i<N;i++){
            if(max>arr[i]){
                max =arr[i];
            }
        }*/
        Arrays.sort(arr);

        System.out.println(arr[N-1]);

    }
}
