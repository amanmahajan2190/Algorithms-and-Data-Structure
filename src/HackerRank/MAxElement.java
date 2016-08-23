package HackerRank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by AMAN on 8/9/2016.
 */
public class MAxElement {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> normal_Stack = new Stack<Integer>();
        Stack<Integer> max_stack = new Stack<Integer>();
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            if(str.length()>1){
                String[] insert_Arr = str.split("\\s+");
                int element = Integer.parseInt(insert_Arr[1]);
                normal_Stack.push(element);
                if(max_stack.isEmpty()){
                    max_stack.push(element);
                }else{
                    if(element>max_stack.peek()){
                        max_stack.push(element);
                    }else{
                        max_stack.push(max_stack.peek());
                    }
                }

            }else if(str.length()==1){
                int ops = Integer.parseInt(str);
                if(ops ==2){
                    max_stack.pop();
                    normal_Stack.pop();
                }else if(ops ==3){
                    System.out.print(max_stack.peek());
                }

            }
        }

    }
}
