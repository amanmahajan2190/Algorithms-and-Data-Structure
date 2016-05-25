package LinkedList;

import StacksQueues.Stackops;

import java.util.Stack;

/**
 * Created by AMAN on 4/26/2016.
 */
public class ExpressionEvaluation {
    Stack<Integer> numberStack;
    Stack<Character> operatorStack;
    ExpressionEvaluation(){
        numberStack = new Stack();
        operatorStack = new Stack();
    }

    public void evaluateString(String expression){
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)>='0' && expression.charAt(i)<='0'){

            }
        }

    }

    public int priority(char operator){
        switch (operator){
            case '/' : return 1;
            case '*' : return 2;
            case '+' : return 3;
            case '-' : return 4;

        }
        return 5;
    }

    public boolean priorityEvaluation(char c1, char c2){
        if(priority(c1)<priority(c2)){
            return true;
        }else{
            return false;
        }
    }
}
