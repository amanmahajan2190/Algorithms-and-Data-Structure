package Arrays;

/**
 * Created by AMAN on 5/13/2016.
 *
 *Equilibrium index of an array is an index such that the sum of elements
 *  at lower indexes is equal to the sum of elements at higher indexes.
 */


public class Equilibrium {
    int[] arr;
    Equilibrium(int[] values){
        this.arr =values;
    }


    public void findEquilibrium(){
        int sum=0;
        int index =-1;
        int left_sum=0;
        for(int i=0 ;i<arr.length;i++){
            sum = sum + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            sum = sum-arr[i];
            if(left_sum == sum){
                System.out.print("Equilibrium at - " + i);
            }else{
                left_sum = left_sum +arr[i];
            }
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{-7, 1, 5, 2, -4, 3, 0};
        Equilibrium e = new Equilibrium(arr);
        e.findEquilibrium();
    }
}
