package Strings;

import java.util.Stack;

/**
 * Created by AMAN on 8/17/2016.
 */
public class NextIntegerDemo {
    Stack<NestedInteger> stringStack = new Stack<NestedInteger>();
    public NestedInteger deserialize(String s) {
        insertStack(s);
        if(stringStack.isEmpty()){
            return new NestedInteger();
        }else{
            return stringStack.pop();
        }


    }

    public void insertStack(String s){
        int len =s.length()-1;
        int sign =1;
        for(int i=0;i<=len;i++){
            if(s.charAt(i)=='['){
                stringStack.push(new NestedInteger());
            }
            else if(s.charAt(i)=='-'){
                sign =-1;
            }else if(s.charAt(i)==']' && stringStack.size()>1){
                NestedInteger integer = stringStack.pop();
                stringStack.peek().add(integer);
            }

            else if(Character.isDigit(s.charAt(i))){
                int  num= s.charAt(i)-'0';
                i++;
                 while(i<len &&Character.isDigit(s.charAt(i))){
                    num = num*10 + s.charAt(i)-'0';
                     i++;
                }
                i--;
                if(!stringStack.isEmpty()){
                    stringStack.push(new NestedInteger());
                }else{
                    stringStack.peek().add(new NestedInteger(num*sign));
                    sign =1;
                }


            }

        }

    }


}
