package Strings;

/**
 * Created by AMAN on 6/18/2016.
 */
public class LongestValidParentheses {
    public int longestValid(String s){
        int[] res = new int[s.length()-1];
        int MAX= 0;
        int open =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                open++;
            }else{
                if(open>0){
                    res[i] = res[i-1]+2;
                }
                //Very important lines
                if(i>=res[i]){
                    res[i] = res[i] + res[i-res[i]];
                }
                open--;

            }
            MAX = Math.max(MAX,res[i]);
        }
        return MAX;

    }
}
