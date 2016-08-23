package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AMAN on 8/17/2016.
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        if(n<=0){
            return result;
        }
        String str ="";
        backtrack(result,str,0,0,n);

        return result;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max){

        if(str.length() == max*2){
            list.add(str);
            return;
        }

        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }


    public static void main(String[] args){
        GenerateParenthesis p = new GenerateParenthesis();
        p.generateParenthesis(3);
    }
}
