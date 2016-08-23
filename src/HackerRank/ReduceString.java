package HackerRank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by AMAN on 8/11/2016.
 */
public class ReduceString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        if(len<=0){
            System.out.println("");
            return;
        }
        Stack<Character> characterStack = new Stack<Character>();
        for(int i=0;i<len;i++){
            char c = str.charAt(i);
            if(characterStack.empty()){
                characterStack.push(c);
            }else{
                if(characterStack.peek() == c){
                    characterStack.pop();
                }else{
                    characterStack.push(c);
                }

            }

        }

        String result ="";
        if(characterStack.empty()){
            System.out.println("Empty String");
        }else{
            while(!characterStack.empty()){
                result =characterStack.pop() +result;
            }
          /*  int l=result.length()-1;
            String reverse ="";
            for(int j=l;j>=0;j--){
                reverse = reverse + result.charAt(j);
            }*/
            System.out.print(result);
        }





    }
}
