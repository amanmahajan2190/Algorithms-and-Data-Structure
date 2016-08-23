/*
package HackerRank;

import java.util.Scanner;

*/
/**
 * Created by AMAN on 8/11/2016.
 *//*

class AdditionOps{
    int start ;
    int end ;
    int add;

    public AdditionOps(int i , int j ,int k){
        start=i;
        end =j;
        add =k;
        public static long doOperation(int N , int M , AdditionOps[] ops){
            long[] arr = new long[N+1];
            for(int i=0;i<arr.length;i++){
                arr[i]=0;
            }

            for(int i=0;i<M;i++){
                arr[ops[i].start-1] += ops[i].add;
                arr[ops[i].end] -= ops[i].add;
            }

            long max =arr[0];
            long sum =max;

            for(int i =1;i<N;i++){
                sum =sum+arr[i];
                if(sum>max){
                    max =sum;
                }
            }
            return max;


        }
    }
public class List {




     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int M = sc.nextInt();

         AdditionOps[] ops = new AdditionOps[M];
         for(int i=0;i<M;i++){
             int a = sc.nextInt();
             int b = sc.nextInt();
             int k = sc.nextInt();
             ops[i] = new AdditionOps(a,b,k);

         }
         System.out.println(doOperation(N,M,ops));


     }}



}*/
