package BinarySearch;

import java.util.Stack;

/**
 * Created by AMAN on 5/12/2016.
 */
public class NearestSmallerNo {
    Stack<Integer> stack;
    int[] arr;

    public NearestSmallerNo(int[] values){
        this.arr =values;
        stack = new Stack<Integer>();
    }

    public void printnearSmallestNo(){
        for(int i =0;i<arr.length;i++){
            if(stack.isEmpty()){
                System.out.print("_"+",");
                stack.push(arr[i]);
            }else{
                while (!stack.isEmpty()){
                    if(stack.peek() < arr[i]){
                        System.out.print(stack.peek()+",");
                        stack.push(arr[i]);
                        break;
                    }else {
                        stack.pop();
                    }
                }
                if(stack.isEmpty()){
                    System.out.print("_"+",");
                    stack.push(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr =  new int[]{1, 3, 0, 2, 5};

        NearestSmallerNo smallerNo = new NearestSmallerNo(arr);
        smallerNo.printnearSmallestNo();
    }
}
