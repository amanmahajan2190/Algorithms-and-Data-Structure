package Strings;

import java.util.Stack;

/**
 * Created by AMAN on 6/17/2016.
 */
public class ValidParentheses {
    public boolean isValid(String str){
        Stack<Character> characterStack = new Stack<Character>();
        if(str == null){
            return false;
        }
        if(str.length()<=1){
            return false;
        }
        int length = str.length();
        for(int i=0;i<length;i++){
            char c =str.charAt(i);
            if(characterStack.isEmpty()){
                characterStack.push(c);
            }else{
                char top =characterStack.peek();
                if((top =='(' && c==')') || (top == '{' && c == '}') || (top == '[' && c == ']') ){
                    characterStack.pop();
                }else{
                    characterStack.push(c);
                }
            }
        }
        if(characterStack.isEmpty()){
            return true;
        }
        return false;
    }
}
