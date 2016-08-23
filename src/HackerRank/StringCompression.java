package HackerRank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by AMAN on 8/11/2016.
 */
public class StringCompression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        if(str== null || str.isEmpty()){
            System.out.print("Empty String");
        }else{
            Stack<Character> characterStack = new Stack<Character>();
            StringBuilder stringBuiler = new StringBuilder("");
            stringBuiler.append(str.charAt(0));


            int len =str.length();
            int count =1;
            for(int i=1 ;i<len;i++){
                char ch = stringBuiler.charAt(stringBuiler.length()-1);
                if(ch == str.charAt(i)){
                    count++;
                }else{
                    if(count>1){
                    stringBuiler.append(count+"");
                    count=1;
                }
                    stringBuiler.append(str.charAt(i));

                }

            }
            if(count>1){
                stringBuiler.append(count+"");
            }

            System.out.print(stringBuiler.toString());
        }




    }
}
